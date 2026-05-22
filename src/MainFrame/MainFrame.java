package MainFrame;

import MainDriver.main;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private static String inputFile;
	private static String outputFile;

	private JTextField txtPimFile;
	private JTextField txtOutputFolder;
	private JComboBox<String> comboBox;
	private String[] selectedMicroservice = {};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setResizable(false);
					frame.setPreferredSize(new Dimension(850, 615));
					frame.pack();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
	}

	public static String getFile() {
		return inputFile;
	}

	public MainFrame() {
		setTitle("MISAR Model Visualiser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(850, 615));
		setResizable(false);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setType(Type.NORMAL);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException exception) {
			exception.printStackTrace();
		}

		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		getContentPane().setForeground(SystemColor.controlShadow);
		getContentPane().setLayout(null);

		createHeaderPanel();
		createSidePanel();
		createMainActionPanel();
	}

	private void createHeaderPanel() {
		JPanel headerPanel = new JPanel();
		headerPanel.setToolTipText("Select a MiSAR PIM model and output folder.");
		headerPanel.setBackground(Color.LIGHT_GRAY);
		headerPanel.setBounds(63, 0, 804, 132);
		headerPanel.setLayout(null);
		getContentPane().add(headerPanel);

		JLabel titleLabel = new JLabel("MiSAR Graphical Model Generator");
		titleLabel.setBounds(10, 0, 520, 39);
		titleLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 22));
		headerPanel.add(titleLabel);

		JLabel descriptionLabel = new JLabel(
				"Generate PlantUML diagrams and Excel metrics from a MiSAR PIM architecture model.");
		descriptionLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		descriptionLabel.setBounds(10, 31, 760, 32);
		headerPanel.add(descriptionLabel);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 62, 763, 64);
		desktopPane.setBackground(Color.LIGHT_GRAY);
		headerPanel.add(desktopPane);

		JLabel searchIconLabel = new JLabel("");
		searchIconLabel.setBounds(10, 14, 31, 39);
		ImageIcon searchIcon = loadIcon("/search_25px.png");
		if (searchIcon != null) {
			searchIconLabel.setIcon(searchIcon);
		}
		desktopPane.add(searchIconLabel);

		txtPimFile = createPathField("Please select a .xmi MiSAR PIM model file", 51, 5, 482, 22);
		desktopPane.add(txtPimFile);

		JSeparator pimSeparator = new JSeparator();
		pimSeparator.setBounds(51, 33, 482, 11);
		desktopPane.add(pimSeparator);

		txtOutputFolder = createPathField("Please select the folder where generated PlantUML files will be stored", 51,
				33, 482, 25);
		desktopPane.add(txtOutputFolder);

		JButton openFileButton = new JButton("Open File");
		openFileButton.setBackground(SystemColor.text);
		openFileButton.setForeground(UIManager.getColor("Table.sortIconLight"));
		openFileButton.setBounds(568, 6, 107, 22);
		ImageIcon openFileIcon = loadIcon("/Opened Folder_22px.png");
		if (openFileIcon != null) {
			openFileButton.setIcon(openFileIcon);
		}
		openFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				selectPimModelFile();
			}
		});
		desktopPane.add(openFileButton);

		JButton outputButton = new JButton("Output");
		outputButton.setForeground(Color.BLACK);
		outputButton.setBackground(new Color(0, 0, 128));
		outputButton.setBounds(568, 39, 107, 22);
		outputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				selectOutputFolder();
			}
		});
		desktopPane.add(outputButton);
	}

	private void createSidePanel() {
		JPanel sidePanel = new JPanel();
		sidePanel.setBounds(0, 0, 64, 668);
		sidePanel.setBackground(new Color(0, 18, 50));
		sidePanel.setLayout(null);
		getContentPane().add(sidePanel);

		JLabel brunelLogo = new JLabel("");
		brunelLogo.setBounds(8, 20, 48, 48);
		ImageIcon brunelIcon = loadIcon("/brunel_Logo.png");
		if (brunelIcon != null) {
			brunelLogo.setIcon(scaleIcon(brunelIcon, 48, 48));
		}
		sidePanel.add(brunelLogo);

		JLabel misarLogo = new JLabel("");
		misarLogo.setBounds(8, 90, 48, 48);
		ImageIcon misarIcon = loadIcon("/MainLogo.png");
		if (misarIcon != null) {
			misarLogo.setIcon(scaleIcon(misarIcon, 48, 48));
		}
		sidePanel.add(misarLogo);
	}

	private void createMainActionPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(32, 47, 90));
		mainPanel.setBounds(63, 125, 804, 452);
		mainPanel.setLayout(null);
		getContentPane().add(mainPanel);

		JLabel architectureLevelLabel = createSectionLabel("Architecture Level", 10, 0, 231, 26, 18);
		mainPanel.add(architectureLevelLabel);

		JSeparator architectureSeparator = createSeparator(183, 11, 568, 15);
		mainPanel.add(architectureSeparator);

		JLabel architectureMetricsLabel = createRowLabel("Architecture Metrics", 10, 42, 186, 19);
		mainPanel.add(architectureMetricsLabel);

		JButton exportArchitectureExcelButton = createExcelButton("Export to Excel Data sheet (Entire model)", 183, 37,
				286, 32);
		exportArchitectureExcelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.excellSheet();
			}
		});
		mainPanel.add(exportArchitectureExcelButton);

		JLabel architectureMicroservicesLabel = createRowLabel("Architecture Microservices", 10, 84, 186, 21);
		mainPanel.add(architectureMicroservicesLabel);

		JButton architecturePngButton = createDownloadButton("Download PNG", 183, 80, 148, 32);
		architecturePngButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroservicesArchitectureViewDriverPNG();
			}
		});
		mainPanel.add(architecturePngButton);

		JButton architectureSvgButton = createDownloadButton("Download SVG", 391, 80, 148, 32);
		architectureSvgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroservicesArchitectureViewDriverSVG();
			}
		});
		mainPanel.add(architectureSvgButton);

		JButton architectureFileButton = createDownloadButton("Download File", 603, 80, 148, 32);
		architectureFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroservicesArchitectureViewDriverFile();
			}
		});
		mainPanel.add(architectureFileButton);

		JSeparator architectureRowSeparator = createSeparator(138, 123, 618, 21);
		mainPanel.add(architectureRowSeparator);

		JLabel dependencyViewLabel = createRowLabel("Dependency View", 10, 142, 148, 21);
		mainPanel.add(dependencyViewLabel);

		JButton dependencyPngButton = createDownloadButton("Download PNG", 183, 142, 148, 32);
		dependencyPngButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.DepdedancyViewDriverPNG();
			}
		});
		mainPanel.add(dependencyPngButton);

		JButton dependencySvgButton = createDownloadButton("Download SVG", 391, 142, 148, 32);
		dependencySvgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.DepdedancyViewDriverSVG();
			}
		});
		mainPanel.add(dependencySvgButton);

		JButton dependencyFileButton = createDownloadButton("Download File", 603, 142, 148, 32);
		dependencyFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.DepdedancyViewDriverFile();
			}
		});
		mainPanel.add(dependencyFileButton);

		JLabel microserviceLevelLabel = createSectionLabel("Microservice Level", 10, 184, 162, 19, 18);
		mainPanel.add(microserviceLevelLabel);

		JSeparator microserviceLevelSeparator = createSeparator(183, 196, 575, 21);
		mainPanel.add(microserviceLevelSeparator);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 211, 231, 32);
		comboBox.setToolTipText("Please select a microservice");
		comboBox.setBackground(Color.WHITE);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Object selectedItem = comboBox.getSelectedItem();

				if (selectedItem != null) {
					main.setMicroservice(selectedItem.toString());
				}
			}
		});
		mainPanel.add(comboBox);

		JLabel selectMicroserviceWarningLabel = new JLabel(
				"** Please select a microservice before obtaining any microservice view");
		selectMicroserviceWarningLabel.setBounds(252, 214, 506, 25);
		selectMicroserviceWarningLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		selectMicroserviceWarningLabel.setForeground(Color.RED);
		mainPanel.add(selectMicroserviceWarningLabel);

		JLabel microserviceMetricsLabel = createRowLabel("Microservice Metrics", 10, 258, 148, 21);
		mainPanel.add(microserviceMetricsLabel);

		JButton exportMicroserviceExcelButton = createExcelButton("Export to Excel Data sheet (Microservice level)",
				183, 263, 278, 32);
		exportMicroserviceExcelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.excellSheetMicroLvele();
			}
		});
		mainPanel.add(exportMicroserviceExcelButton);

		JLabel microserviceViewLabel = createRowLabel("Microservice View", 10, 317, 148, 21);
		mainPanel.add(microserviceViewLabel);

		JButton microservicePngButton = createDownloadButton("Download PNG", 183, 306, 148, 32);
		microservicePngButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroservoceViewPNG();
			}
		});
		mainPanel.add(microservicePngButton);

		JButton microserviceSvgButton = createDownloadButton("Download SVG", 391, 306, 148, 32);
		microserviceSvgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroservoceViewSVG();
			}
		});
		mainPanel.add(microserviceSvgButton);

		JButton microserviceFileButton = createDownloadButton("Download File", 603, 306, 148, 32);
		microserviceFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroservoceViewFile();
			}
		});
		mainPanel.add(microserviceFileButton);

		JSeparator microserviceViewSeparator = createSeparator(96, 349, 655, 21);
		mainPanel.add(microserviceViewSeparator);

		JLabel microDependencyViewLabel = createRowLabel("Micro Dependency View", 10, 381, 158, 21);
		mainPanel.add(microDependencyViewLabel);

		JButton microDependencyPngButton = createDownloadButton("Download PNG", 183, 370, 148, 32);
		microDependencyPngButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroDepedancyViewPNG();
			}
		});
		mainPanel.add(microDependencyPngButton);

		JButton microDependencySvgButton = createDownloadButton("Download SVG", 391, 370, 148, 32);
		microDependencySvgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroDepedancyViewSVG();
			}
		});
		mainPanel.add(microDependencySvgButton);

		JButton microDependencyFileButton = createDownloadButton("Download File", 603, 370, 148, 32);
		microDependencyFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				main.MicroDepedancyViewFile();
			}
		});
		mainPanel.add(microDependencyFileButton);

		JSeparator microDependencySeparator = createSeparator(96, 413, 655, 21);
		mainPanel.add(microDependencySeparator);
	}

	private void selectPimModelFile() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Select MiSAR PIM model");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fileChooser.setAcceptAllFileFilterUsed(false);
		fileChooser.setFileFilter(new FileNameExtensionFilter("MiSAR PIM model files (*.xmi, *.pim)", "xmi", "pim"));

		int response = fileChooser.showOpenDialog(MainFrame.this);

		if (response != JFileChooser.APPROVE_OPTION) {
			return;
		}

		File selectedFile = fileChooser.getSelectedFile();
		inputFile = selectedFile.getAbsolutePath();

		try {
			main.setUmldraw(inputFile);
			txtPimFile.setText(inputFile);
			txtPimFile.setToolTipText(inputFile);

			main.main(null);

			selectedMicroservice = main.getMicroserviceData();
			DefaultComboBoxModel<String> microserviceNames = new DefaultComboBoxModel<String>(selectedMicroservice);
			comboBox.setModel(microserviceNames);

			if (selectedMicroservice.length > 0) {
				comboBox.setSelectedIndex(0);
				main.setMicroservice(selectedMicroservice[0]);
			}
		} catch (Exception exception) {
			exception.printStackTrace();

			inputFile = null;
			selectedMicroservice = new String[] {};
			comboBox.setModel(new DefaultComboBoxModel<String>());

			txtPimFile.setText("Please select a valid .xmi MiSAR PIM model file.");
			txtPimFile.setToolTipText(null);

			JOptionPane.showMessageDialog(
					MainFrame.this,
					"Please select a valid .xmi file which represents a MiSAR PIM Model.\n\n"
							+ "You may have selected a .xmi PSM file.\n"
							+ "PIM Model files are generated in the target folder of the TransformationEngine.",
					"Invalid MiSAR PIM Model",
					JOptionPane.ERROR_MESSAGE
			);
		}
	}

	private void selectOutputFolder() {
		JFileChooser folderChooser = new JFileChooser();
		folderChooser.setDialogTitle("Select PlantUML output folder");
		folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		folderChooser.setAcceptAllFileFilterUsed(false);

		int response = folderChooser.showOpenDialog(MainFrame.this);

		if (response != JFileChooser.APPROVE_OPTION) {
			return;
		}

		File selectedDirectory = folderChooser.getSelectedFile();

		if (selectedDirectory == null || !selectedDirectory.isDirectory()) {
			JOptionPane.showMessageDialog(
					MainFrame.this,
					"Please select a valid output folder.",
					"Invalid Output Folder",
					JOptionPane.ERROR_MESSAGE
			);
			return;
		}

		outputFile = selectedDirectory.getAbsolutePath();
		main.setOutpath(outputFile);

		txtOutputFolder.setText(outputFile);
		txtOutputFolder.setToolTipText(outputFile);
	}

	private JTextField createPathField(String placeholder, int x, int y, int width, int height) {
		JTextField field = new JTextField();
		field.setBackground(Color.LIGHT_GRAY);
		field.setBorder(null);
		field.setAlignmentX(Component.LEFT_ALIGNMENT);
		field.setAlignmentY(Component.TOP_ALIGNMENT);
		field.setHorizontalAlignment(SwingConstants.LEFT);
		field.setForeground(Color.RED);
		field.setFont(new Font("Tahoma", Font.ITALIC, 13));
		field.setText(placeholder);
		field.setBounds(x, y, width, height);
		field.setEditable(false);
		field.setColumns(10);
		return field;
	}

	private JLabel createSectionLabel(String text, int x, int y, int width, int height, int fontSize) {
		JLabel label = new JLabel(text);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		label.setBounds(x, y, width, height);
		return label;
	}

	private JLabel createRowLabel(String text, int x, int y, int width, int height) {
		JLabel label = new JLabel(text);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(x, y, width, height);
		return label;
	}

	private JSeparator createSeparator(int x, int y, int width, int height) {
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.RED);
		separator.setBounds(x, y, width, height);
		return separator;
	}

	private JButton createDownloadButton(String text, int x, int y, int width, int height) {
		JButton button = new JButton(text);
		button.setBounds(x, y, width, height);
		button.setBackground(SystemColor.textHighlight);
		button.setIcon(null);
		return button;
	}

	private JButton createExcelButton(String text, int x, int y, int width, int height) {
		JButton button = new JButton(text);
		button.setBounds(x, y, width, height);
		button.setBackground(new Color(34, 139, 34));

		ImageIcon excelIcon = loadIcon("/microsoft_excel_23px.png");
		if (excelIcon != null) {
			button.setIcon(excelIcon);
		}

		return button;
	}

	private ImageIcon loadIcon(String resourcePath) {
		if (getClass().getResource(resourcePath) == null) {
			return null;
		}

		return new ImageIcon(getClass().getResource(resourcePath));
	}

	private ImageIcon scaleIcon(ImageIcon icon, int width, int height) {
		Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(image);
	}
}