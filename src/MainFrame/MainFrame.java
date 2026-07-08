package MainFrame;

import MainDriver.main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    private static final String APP_NAME = "MISAR Model Visualiser";

    private static String inputFile;
    private static String outputFile;

    private final String version;
    private final UiMetrics uiMetrics;

    private final JTextField modelPathField = new JTextField();
    private final JTextField outputPathField = new JTextField();
    private final JComboBox<String> microserviceComboBox = new JComboBox<>();
    private final JLabel statusLabel = new JLabel("Ready");

    private final List<JButton> architectureButtons = new ArrayList<>();
    private final List<JButton> microserviceButtons = new ArrayList<>();

    private boolean modelLoaded = false;
    private boolean outputSelected = false;
    private boolean microserviceSelected = false;
    private boolean busy = false;

    public static void main(String[] args) {
        String version = parseVersion(args);

        EventQueue.invokeLater(() -> {
            MainFrame frame = new MainFrame(version);
            frame.setVisible(true);
        });
    }

    public static String getFile() {
        return inputFile;
    }

    public MainFrame() {
        this(null);
    }

    public MainFrame(String version) {
        this.version = version;

        configureLookAndFeel();
        this.uiMetrics = detectUiMetrics();
        setApplicationIcon();
        setContentPane(createRootPanel());
        configureFrame();
        updateActionState();
    }

    private static String parseVersion(String[] args) {
        if (args == null) {
            return null;
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg == null) {
                continue;
            }

            if (arg.startsWith("--version=")) {
                return normaliseVersion(arg.substring("--version=".length()));
            }

            if ("--version".equals(arg) && i + 1 < args.length) {
                return normaliseVersion(args[i + 1]);
            }
        }

        return null;
    }

    private static String normaliseVersion(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }

        return value.trim();
    }

    private static UiMetrics detectUiMetrics() {
        Rectangle screenBounds = usableScreenBounds();
        double transformScale = 1.0;
        double dpiScale = 1.0;

        try {
            GraphicsConfiguration graphicsConfiguration = GraphicsEnvironment
                    .getLocalGraphicsEnvironment()
                    .getDefaultScreenDevice()
                    .getDefaultConfiguration();
            AffineTransform transform = graphicsConfiguration.getDefaultTransform();
            transformScale = Math.max(transform.getScaleX(), transform.getScaleY());
        } catch (Exception ignored) {
            transformScale = 1.0;
        }

        try {
            int dpi = Toolkit.getDefaultToolkit().getScreenResolution();
            dpiScale = dpi / 96.0;
        } catch (Exception ignored) {
            dpiScale = 1.0;
        }

        return buildUiMetrics(screenBounds, transformScale, dpiScale, osName());
    }

    static UiMetrics buildUiMetrics(Rectangle screenBounds, double transformScale, double dpiScale, String osName) {
        boolean macOs = osName != null && osName.toLowerCase().contains("mac");

        // macOS Retina reports a 2x graphics transform while Swing layout sizes are already
        // expressed in logical points. Dividing by that transform makes normal Mac screens
        // look like tiny constrained screens, so keep macOS at logical scale here.
        double displayScale = macOs ? 1.0 : clampScale(Math.max(transformScale, dpiScale));

        int effectiveWidth = (int) Math.round(screenBounds.width / displayScale);
        int effectiveHeight = (int) Math.round(screenBounds.height / displayScale);

        boolean compactLayout = effectiveWidth <= 1366
                || effectiveHeight <= 850
                || (!macOs && displayScale >= 1.25 && effectiveHeight <= 1000)
                || screenBounds.height <= 760;

        double uiScale;
        if (compactLayout && (!macOs && displayScale >= 1.5 || effectiveHeight <= 760)) {
            uiScale = 0.82;
        } else if (compactLayout) {
            uiScale = 0.88;
        } else {
            uiScale = 1.0;
        }

        return new UiMetrics(screenBounds, displayScale, effectiveWidth, effectiveHeight, compactLayout, uiScale);
    }

    private static String osName() {
        try {
            return System.getProperty("os.name", "");
        } catch (Exception ignored) {
            return "";
        }
    }

    private static Rectangle usableScreenBounds() {
        try {
            return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        } catch (Exception ignored) {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            return new Rectangle(0, 0, screenSize.width, screenSize.height);
        }
    }

    private static double clampScale(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value) || value <= 0) {
            return 1.0;
        }

        return Math.max(0.75, Math.min(value, 3.0));
    }

    private int s(int value) {
        return Math.max(1, (int) Math.round(value * uiMetrics.uiScale));
    }

    private Font uiFont(int style, int size) {
        return new Font("Segoe UI", style, s(size));
    }

    private Insets uiInsets(int top, int left, int bottom, int right) {
        return new Insets(s(top), s(left), s(bottom), s(right));
    }

    private EmptyBorder uiBorder(int top, int left, int bottom, int right) {
        return new EmptyBorder(s(top), s(left), s(bottom), s(right));
    }

    private void configureFrame() {
        Rectangle screenBounds = uiMetrics.screenBounds;

        int width = Math.min(s(1320), Math.max(screenBounds.width - s(32), s(980)));
        int height = Math.min(s(940), Math.max(screenBounds.height - s(48), s(620)));

        setTitle(version == null ? APP_NAME : APP_NAME + " " + version);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(Math.min(s(980), width), Math.min(s(620), height)));
        setPreferredSize(new Dimension(width, height));
        setResizable(true);
        pack();

        if (uiMetrics.compactLayout) {
            setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        } else {
            setLocationRelativeTo(null);
        }
    }

    private JPanel createRootPanel() {
        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(new Color(245, 247, 251));

        root.add(createSidebar(), BorderLayout.WEST);
        root.add(createMainContent(), BorderLayout.CENTER);
        root.add(createStatusBar(), BorderLayout.SOUTH);

        return root;
    }

    private JPanel createSidebar() {
        JPanel sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(s(72), 0));
        sidebar.setBackground(new Color(16, 28, 54));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBorder(uiBorder(14, 9, 14, 9));

        JLabel brunelLogo = createLogo("brunel_Logo.png", 48, 48);
        JLabel misarLogo = createLogo("MainLogo.png", 48, 48);

        sidebar.add(brunelLogo);
        sidebar.add(Box.createVerticalStrut(s(14)));
        sidebar.add(misarLogo);
        sidebar.add(Box.createVerticalGlue());

        if (version != null) {
            String versionText = version.toLowerCase().startsWith("v") ? version : "V" + version;

            JLabel versionLabel = new JLabel(versionText);
            versionLabel.setForeground(new Color(180, 190, 210));
            versionLabel.setFont(uiFont(Font.BOLD, 10));
            versionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            sidebar.add(versionLabel);
        }

        return sidebar;
    }

    private JComponent createMainContent() {
        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.setOpaque(false);
        wrapper.setBorder(uiBorder(12, 18, 10, 18));

        JPanel content = new JPanel(new GridBagLayout());
        content.setOpaque(false);

        GridBagConstraints gbc = baseConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        content.add(createHeaderPanel(), gbc);

        gbc.gridy = 1;
        gbc.insets = uiInsets(8, 0, 0, 0);
        content.add(createFileSelectionCard(), gbc);

        gbc.gridy = 2;
        gbc.insets = uiInsets(9, 0, 0, 0);
        content.add(createArchitectureCard(), gbc);

        gbc.gridy = 3;
        gbc.insets = uiInsets(9, 0, 0, 0);
        content.add(createMicroserviceCard(), gbc);

        gbc.gridy = 4;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = uiInsets(0, 0, 0, 0);
        content.add(Box.createVerticalGlue(), gbc);

        wrapper.add(content, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(wrapper);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(s(18));

        return scrollPane;
    }

    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);

        JPanel textPanel = new JPanel();
        textPanel.setOpaque(false);
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(APP_NAME);
        title.setFont(uiFont(Font.BOLD, 24));
        title.setForeground(new Color(22, 32, 55));

        JLabel subtitle = new JLabel("Translate MiSAR PIM architecture models into PlantUML diagrams and generate model metrics.");
        subtitle.setFont(uiFont(Font.PLAIN, 12));
        subtitle.setForeground(new Color(92, 104, 125));

        textPanel.add(title);
        textPanel.add(Box.createVerticalStrut(s(4)));
        textPanel.add(subtitle);

        header.add(textPanel, BorderLayout.CENTER);

        return header;
    }

    private JPanel createFileSelectionCard() {
        ShadowCard card = new ShadowCard(s(14), s(18));
        card.setLayout(new GridBagLayout());

        JLabel title = createSectionTitle("Model Setup");
        JLabel description = createSectionDescription("Select a MiSAR model and choose where generated files should be stored.");

        modelPathField.setEditable(false);
        modelPathField.setText("No model selected");
        styleTextField(modelPathField);

        outputPathField.setEditable(false);
        outputPathField.setText("No output folder selected");
        styleTextField(outputPathField);

        JButton openModelButton = createPrimaryButton("Open Model", "Opened Folder_22px.png", e -> openModelFile());
        JButton outputButton = createSecondaryButton("Output Folder", null, e -> selectOutputFolder());

        GridBagConstraints gbc = baseConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        card.add(title, gbc);

        gbc.gridy = 1;
        gbc.insets = uiInsets(3, 0, 10, 0);
        card.add(description, gbc);

        gbc.gridwidth = 1;
        gbc.insets = uiInsets(0, 0, 6, 10);
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weightx = 0;
        card.add(createFieldLabel("MiSAR PIM Model"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        card.add(modelPathField, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        card.add(openModelButton, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weightx = 0;
        card.add(createFieldLabel("Output Folder"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        card.add(outputPathField, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        card.add(outputButton, gbc);

        return card;
    }

    private JPanel createArchitectureCard() {
        ShadowCard card = new ShadowCard(s(14), s(18));
        card.setLayout(new GridBagLayout());

        addCardHeader(card, "Architecture Level", "Generate architecture-level diagrams and metrics.");

        addActionRow(
                card,
                2,
                "Architecture Metrics",
                "Export metrics for the entire architecture model.",
                new JButton[]{
                        registerArchitectureButton(createSuccessButton("Excel", "microsoft_excel_23px.png", e ->
                                runTask("Exporting architecture metrics", "Architecture metrics exported.", () -> main.excellSheet())))
                }
        );

        addActionRow(
                card,
                3,
                "Architecture Microservices",
                "Generate the complete microservices architecture view.",
                new JButton[]{
                		registerArchitectureButton(createActionButton("SVG", e ->
                        runTask("Generating architecture SVG", "Architecture SVG generated.", () -> main.MicroservicesArchitectureViewDriverSVG()))),
                        registerArchitectureButton(createActionButton("PNG", e ->
                                runTask("Generating architecture PNG", "Architecture PNG generated.", () -> main.MicroservicesArchitectureViewDriverPNG()))),
                        registerArchitectureButton(createActionButton("PlantUML", e ->
                                runTask("Generating architecture file", "Architecture file generated.", () -> main.MicroservicesArchitectureViewDriverFile())))
                }
        );

        addActionRow(
                card,
                4,
                "Dependency View",
                "Generate the dependency view for the full model.",
                new JButton[]{
                		registerArchitectureButton(createActionButton("SVG", e ->
                        runTask("Generating dependency SVG", "Dependency SVG generated.", () -> main.DepdedancyViewDriverSVG()))),
                        registerArchitectureButton(createActionButton("PNG", e ->
                                runTask("Generating dependency PNG", "Dependency PNG generated.", () -> main.DepdedancyViewDriverPNG()))),
                        registerArchitectureButton(createActionButton("PlantUML", e ->
                                runTask("Generating dependency file", "Dependency file generated.", () -> main.DepdedancyViewDriverFile())))
                }
        );

        return card;
    }

    private JPanel createMicroserviceCard() {
        ShadowCard card = new ShadowCard(s(14), s(18));
        card.setLayout(new GridBagLayout());

        addCardHeader(card, "Microservice Level", "Select a microservice before generating microservice-specific diagrams and metrics.");

        JPanel comboPanel = new JPanel(new GridBagLayout());
        comboPanel.setOpaque(false);

        JLabel comboLabel = createFieldLabel("Microservice");

        microserviceComboBox.setFont(uiFont(Font.PLAIN, 12));
        microserviceComboBox.setPreferredSize(new Dimension(s(240), s(30)));
        microserviceComboBox.addActionListener(e -> {
            Object selectedItem = microserviceComboBox.getSelectedItem();

            if (selectedItem != null) {
                String selected = selectedItem.toString();
                microserviceSelected = !selected.isBlank();

                if (microserviceSelected) {
                    main.setMicroservice(selected);
                    setStatus("Selected microservice: " + selected);
                }
            }

            updateActionState();
        });

        GridBagConstraints comboGbc = baseConstraints();

        comboGbc.gridx = 0;
        comboGbc.gridy = 0;
        comboGbc.weightx = 0;
        comboGbc.insets = uiInsets(0, 0, 0, 10);
        comboPanel.add(comboLabel, comboGbc);

        comboGbc.gridx = 1;
        comboGbc.weightx = 1;
        comboGbc.fill = GridBagConstraints.HORIZONTAL;
        comboGbc.insets = uiInsets(0, 0, 0, 0);
        comboPanel.add(microserviceComboBox, comboGbc);

        GridBagConstraints gbc = baseConstraints();

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = uiInsets(0, 0, 6, 0);
        card.add(comboPanel, gbc);

        addActionRow(
                card,
                3,
                "Microservice Metrics",
                "Export metrics for the selected microservice.",
                new JButton[]{
                        registerMicroserviceButton(createSuccessButton("Excel", "microsoft_excel_23px.png", e ->
                                runTask("Exporting microservice metrics", "Microservice metrics exported.", () -> main.excellSheetMicroLvele())))
                }
        );

        addActionRow(
                card,
                4,
                "Microservice View",
                "Generate the selected microservice view.",
                new JButton[]{
                		registerMicroserviceButton(createActionButton("SVG", e ->
                        runTask("Generating microservice SVG", "Microservice SVG generated.", () -> main.MicroservoceViewSVG()))),
                        registerMicroserviceButton(createActionButton("PNG", e ->
                                runTask("Generating microservice PNG", "Microservice PNG generated.", () -> main.MicroservoceViewPNG()))),
                        registerMicroserviceButton(createActionButton("PlantUML", e ->
                                runTask("Generating microservice file", "Microservice file generated.", () -> main.MicroservoceViewFile())))
                }
        );

        addActionRow(
                card,
                5,
                "Microservice Dependency View",
                "Generate dependency diagrams for the selected microservice.",
                new JButton[]{
                		registerMicroserviceButton(createActionButton("SVG", e ->
                        runTask("Generating micro dependency SVG", "Microservice Dependency SVG generated.", () -> main.MicroDepedancyViewSVG()))),
                		registerMicroserviceButton(createActionButton("PNG", e ->
                                runTask("Generating micro dependency PNG", "Microservice Dependency PNG generated.", () -> main.MicroDepedancyViewPNG()))),
                        registerMicroserviceButton(createActionButton("PlantUML", e ->
                                runTask("Generating micro dependency file", "Microservice Dependency file generated.", () -> main.MicroDepedancyViewFile())))
                }
        );

        return card;
    }

    private JPanel createStatusBar() {
        JPanel statusBar = new JPanel(new BorderLayout());
        statusBar.setBackground(new Color(238, 242, 248));
        statusBar.setBorder(uiBorder(7, 16, 7, 16));

        statusLabel.setFont(uiFont(Font.PLAIN, 12));
        statusLabel.setForeground(new Color(75, 85, 105));

        JLabel universityLabel = new JLabel("Brunel University London");
        universityLabel.setFont(uiFont(Font.PLAIN, 12));
        universityLabel.setForeground(new Color(110, 120, 138));

        statusBar.add(statusLabel, BorderLayout.WEST);
        statusBar.add(universityLabel, BorderLayout.EAST);

        return statusBar;
    }

    private void addCardHeader(JPanel card, String titleText, String descriptionText) {
        JLabel title = createSectionTitle(titleText);
        JLabel description = createSectionDescription(descriptionText);

        GridBagConstraints gbc = baseConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        card.add(title, gbc);

        gbc.gridy = 1;
        gbc.insets = uiInsets(3, 0, 9, 0);
        card.add(description, gbc);
    }

    private void addActionRow(JPanel card, int row, String title, String description, JButton[] buttons) {
        JPanel rowPanel = new JPanel(new GridBagLayout());
        rowPanel.setOpaque(false);

        JPanel textPanel = new JPanel();
        textPanel.setOpaque(false);
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(uiFont(Font.BOLD, 12));
        titleLabel.setForeground(new Color(34, 43, 65));

        JLabel descriptionLabel = new JLabel(description);
        descriptionLabel.setFont(uiFont(Font.PLAIN, 11));
        descriptionLabel.setForeground(new Color(102, 112, 133));

        textPanel.add(titleLabel);
        textPanel.add(Box.createVerticalStrut(2));
        textPanel.add(descriptionLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, s(6), 0));
        buttonPanel.setOpaque(false);

        for (JButton button : buttons) {
            buttonPanel.add(button);
        }

        GridBagConstraints rowGbc = new GridBagConstraints();

        rowGbc.gridx = 0;
        rowGbc.gridy = 0;
        rowGbc.weightx = 1;
        rowGbc.fill = GridBagConstraints.HORIZONTAL;
        rowGbc.anchor = GridBagConstraints.WEST;
        rowPanel.add(textPanel, rowGbc);

        rowGbc.gridx = 1;
        rowGbc.weightx = 0;
        rowGbc.fill = GridBagConstraints.NONE;
        rowGbc.anchor = GridBagConstraints.EAST;
        rowGbc.insets = uiInsets(0, 14, 0, 0);
        rowPanel.add(buttonPanel, rowGbc);

        GridBagConstraints gbc = baseConstraints();

        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.gridwidth = 3;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = uiInsets(3, 0, 3, 0);
        card.add(rowPanel, gbc);
    }

    private void openModelFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new FileNameExtensionFilter("MiSAR PIM model files (*.xmi, *.pim)", "xmi", "pim"));

        int response = fileChooser.showOpenDialog(this);

        if (response != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File selectedFile = fileChooser.getSelectedFile();
        inputFile = selectedFile.getAbsolutePath();
        modelPathField.setText(inputFile);

        runTask("Loading model", "Model loaded successfully.", () -> {
            main.setUmldraw(inputFile);
            main.main(null);

            String[] microservices = main.getMicroserviceData();

            SwingUtilities.invokeLater(() -> {
                microserviceComboBox.setModel(new DefaultComboBoxModel<>(microservices));
                microserviceSelected = microservices != null && microservices.length > 0;

                if (microserviceSelected) {
                    microserviceComboBox.setSelectedIndex(0);
                    main.setMicroservice(microservices[0]);
                }

                modelLoaded = true;
                updateActionState();
            });
        });
    }

    private void selectOutputFolder() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setDialogTitle("Select output folder");

        int response = fileChooser.showOpenDialog(this);

        if (response != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File selectedFolder = fileChooser.getSelectedFile();
        outputFile = selectedFolder.getAbsolutePath();
        outputPathField.setText(outputFile);

        main.setOutpath(outputFile);

        outputSelected = true;
        setStatus("Output folder selected.");
        updateActionState();
    }

    private JButton registerArchitectureButton(JButton button) {
        architectureButtons.add(button);
        return button;
    }

    private JButton registerMicroserviceButton(JButton button) {
        microserviceButtons.add(button);
        return button;
    }

    private void updateActionState() {
        boolean architectureReady = modelLoaded && outputSelected && !busy;
        boolean microserviceReady = architectureReady && microserviceSelected;

        for (JButton button : architectureButtons) {
            button.setEnabled(architectureReady);
        }

        for (JButton button : microserviceButtons) {
            button.setEnabled(microserviceReady);
        }

        microserviceComboBox.setEnabled(modelLoaded && !busy);
    }

    private void runTask(String runningMessage, String successMessage, BackgroundTask task) {
        if (busy) {
            return;
        }

        busy = true;
        setStatus(runningMessage + "...");
        updateActionState();

        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                task.run();
                return null;
            }

            @Override
            protected void done() {
                try {
                    get();
                    setStatus(successMessage);
                } catch (Exception exception) {
                    showError("Operation failed", exception);
                    setStatus("Operation failed.");
                } finally {
                    busy = false;
                    updateActionState();
                }
            }
        };

        worker.execute();
    }

    private JButton createPrimaryButton(String text, String iconName, ActionListener listener) {
        JButton button = createModernButton(text, new Color(37, 99, 235), Color.WHITE, listener);
        button.setIcon(loadIcon(iconName, 20, 20));
        button.setIconTextGap(7);
        return button;
    }

    private JButton createSecondaryButton(String text, String iconName, ActionListener listener) {
        JButton button = createModernButton(text, new Color(226, 232, 240), new Color(30, 41, 59), listener);

        if (iconName != null) {
            button.setIcon(loadIcon(iconName, 20, 20));
            button.setIconTextGap(7);
        }

        return button;
    }

    private JButton createSuccessButton(String text, String iconName, ActionListener listener) {
        JButton button = createModernButton(text, new Color(22, 163, 74), Color.WHITE, listener);
        button.setIcon(loadIcon(iconName, 20, 20));
        button.setIconTextGap(7);
        return button;
    }

    private JButton createActionButton(String text, ActionListener listener) {
        return createModernButton(text, new Color(37, 99, 235), Color.WHITE, listener);
    }

    private JButton createModernButton(String text, Color background, Color foreground, ActionListener listener) {
        JButton button = new RoundedButton(text, background, foreground);
        int width = Math.max(s(92), text.length() * s(9) + s(34));

        button.setFont(uiFont(Font.BOLD, 11));
        button.setPreferredSize(new Dimension(width, s(30)));
        button.setMinimumSize(new Dimension(width, s(30)));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.addActionListener(listener);

        return button;
    }

    private JLabel createLogo(String fileName, int width, int height) {
        JLabel label = new JLabel(loadIcon(fileName, s(width), s(height)));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }

    private JLabel createSectionTitle(String text) {
        JLabel label = new JLabel(text);
        label.setFont(uiFont(Font.BOLD, 16));
        label.setForeground(new Color(22, 32, 55));
        return label;
    }

    private JLabel createSectionDescription(String text) {
        JLabel label = new JLabel(text);
        label.setFont(uiFont(Font.PLAIN, 12));
        label.setForeground(new Color(100, 116, 139));
        return label;
    }

    private JLabel createFieldLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(uiFont(Font.BOLD, 12));
        label.setForeground(new Color(71, 85, 105));
        return label;
    }

    private void styleTextField(JTextField field) {
        field.setFont(uiFont(Font.PLAIN, 12));
        field.setForeground(new Color(51, 65, 85));
        field.setBackground(new Color(248, 250, 252));
        field.setPreferredSize(new Dimension(s(180), s(30)));
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 226, 235)),
                uiBorder(5, 8, 5, 8)
        ));
    }

    private GridBagConstraints baseConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = uiInsets(0, 0, 0, 0);
        return gbc;
    }

    private void configureLookAndFeel() {
        try {
            Class<?> flatLaf = Class.forName("com.formdev.flatlaf.FlatLightLaf");
            flatLaf.getMethod("setup").invoke(null);
        } catch (Exception ignored) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignoredAgain) {
            }
        }

        UIManager.put("Button.arc", 16);
        UIManager.put("Component.arc", 16);
        UIManager.put("TextComponent.arc", 12);
    }

    private ImageIcon loadIcon(String fileName, int width, int height) {
        if (fileName == null || fileName.isBlank()) {
            return new ImageIcon();
        }

        String[] resourcePaths = {
                "/" + fileName,
                "/img/" + fileName
        };

        for (String resourcePath : resourcePaths) {
            URL resource = getClass().getResource(resourcePath);

            if (resource != null) {
                Image image = new ImageIcon(resource).getImage();
                Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            }
        }

        File imageFile = new File("img", fileName);

        if (imageFile.exists()) {
            Image image = new ImageIcon(imageFile.getAbsolutePath()).getImage();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        }

        return new ImageIcon();
    }

    private void setApplicationIcon() {
        try {
            ImageIcon icon = loadIcon("MainLogo.png", 128, 128);
            Image image = icon.getImage();

            setIconImage(image);

            if (Taskbar.isTaskbarSupported()) {
                Taskbar taskbar = Taskbar.getTaskbar();

                if (taskbar.isSupported(Taskbar.Feature.ICON_IMAGE)) {
                    taskbar.setIconImage(image);
                }
            }
        } catch (Exception ignored) {
        }
    }

    private void showError(String title, Exception exception) {
        String message = exception.getMessage();

        if (message != null && message.toLowerCase().contains("psm")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Wrong model type selected.\nThis file appears to be a MiSAR PSM model. Please select a MiSAR PIM model instead.",
                    "Invalid model file",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        JOptionPane.showMessageDialog(
                this,
                message == null ? "An unexpected error occurred." : message,
                title,
                JOptionPane.ERROR_MESSAGE
        );
    }

    private void setStatus(String message) {
        statusLabel.setText(message);
    }

    private interface BackgroundTask {
        void run() throws Exception;
    }

    private static class UiMetrics {
        final Rectangle screenBounds;
        final double displayScale;
        final int effectiveWidth;
        final int effectiveHeight;
        final boolean compactLayout;
        final double uiScale;

        UiMetrics(
                Rectangle screenBounds,
                double displayScale,
                int effectiveWidth,
                int effectiveHeight,
                boolean compactLayout,
                double uiScale
        ) {
            this.screenBounds = screenBounds;
            this.displayScale = displayScale;
            this.effectiveWidth = effectiveWidth;
            this.effectiveHeight = effectiveHeight;
            this.compactLayout = compactLayout;
            this.uiScale = uiScale;
        }
    }

    private static class ShadowCard extends JPanel {
        private static final int SHADOW_SIZE = 7;
        private static final int ARC = 22;

        ShadowCard(int verticalPadding, int horizontalPadding) {
            setOpaque(false);
            setBorder(new EmptyBorder(verticalPadding, horizontalPadding, verticalPadding, horizontalPadding));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g2 = (Graphics2D) graphics.create();

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth() - SHADOW_SIZE;
            int height = getHeight() - SHADOW_SIZE;

            g2.setColor(new Color(15, 23, 42, 14));
            g2.fillRoundRect(SHADOW_SIZE, SHADOW_SIZE, width - SHADOW_SIZE, height - SHADOW_SIZE, ARC, ARC);

            g2.setColor(Color.WHITE);
            g2.fillRoundRect(0, 0, width, height, ARC, ARC);

            g2.setColor(new Color(226, 232, 240));
            g2.drawRoundRect(0, 0, width, height, ARC, ARC);

            g2.dispose();

            super.paintComponent(graphics);
        }
    }

    private static class RoundedButton extends JButton {
        private final Color normalBackground;
        private final Color foregroundColour;

        RoundedButton(String text, Color background, Color foreground) {
            super(text);
            this.normalBackground = background;
            this.foregroundColour = foreground;

            setOpaque(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setContentAreaFilled(false);
            setForeground(foreground);
            setBorder(new EmptyBorder(5, 10, 5, 10));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g2 = (Graphics2D) graphics.create();

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Color background = isEnabled()
                    ? normalBackground
                    : new Color(203, 213, 225);

            if (getModel().isPressed() && isEnabled()) {
                background = background.darker();
            } else if (getModel().isRollover() && isEnabled()) {
                background = background.brighter();
            }

            g2.setColor(background);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 17, 17);

            setForeground(isEnabled() ? foregroundColour : new Color(100, 116, 139));

            g2.dispose();

            super.paintComponent(graphics);
        }
    }
}