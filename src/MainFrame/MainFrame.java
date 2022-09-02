package MainFrame;

import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import MainDriver.main;
import java.awt.*;
import java.awt.Component;
import java.awt.Window.Type;

public class MainFrame extends JFrame {
	private JTextField txtPleaseSelectA;
	private static String inputFile;
	private static String outputFile;
	String[] selectedMicroservice = {};
	private JButton Button_Microservice_View_SVG1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					MainFrame frame = new MainFrame();

					frame.setResizable(false);
					frame.setPreferredSize(new Dimension(883, 705));
					frame.pack();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setUndecorated(true);

				}

				catch (Exception e) {

				}
			}
		});
	}

	public static String getFile() {
		return inputFile;
	}

	public MainFrame() {
		getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setUndecorated(false);
		setType(Type.NORMAL);
		getContentPane().setForeground(SystemColor.controlShadow);
		setResizable(false);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 47, 90));
		panel_1.setBounds(63, 247, 804, 421);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(106, 116, 145));
		panel_3.setBounds(31, 64, 753, 42);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblMicroserviceView = new JLabel("Microservice View");
		lblMicroserviceView.setBounds(10, 11, 113, 19);
		panel_3.add(lblMicroserviceView);
		lblMicroserviceView.setForeground(Color.WHITE);
		lblMicroserviceView.setIcon(null);
		lblMicroserviceView.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(133, 6, 245, 32);
		panel_3.add(comboBox);
		comboBox.setBackground(new Color(0, 0, 128));

		JButton Button_Microservice_View_PNG = new JButton("Downlaod PNG");
		Button_Microservice_View_PNG.setBounds(388, 6, 117, 32);
		panel_3.add(Button_Microservice_View_PNG);
		Button_Microservice_View_PNG.setBackground(SystemColor.textHighlight);

		Button_Microservice_View_SVG1 = new JButton("Downlaod SVG");
		Button_Microservice_View_SVG1.setBounds(515, 6, 103, 32);
		panel_3.add(Button_Microservice_View_SVG1);
		Button_Microservice_View_SVG1.setBackground(SystemColor.textHighlight);

		JButton Button_Microservice_View_FILE = new JButton("Downlaod File");
		Button_Microservice_View_FILE.setBounds(640, 6, 103, 32);
		panel_3.add(Button_Microservice_View_FILE);
		Button_Microservice_View_FILE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button_Microservice_View_FILE.setBackground(SystemColor.textHighlight);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(106, 116, 145));
		panel_3_1.setBounds(31, 11, 753, 42);
		panel_1.add(panel_3_1);

		JLabel lblNewLabel = new JLabel("Architecture View");
		lblNewLabel.setBounds(10, 11, 148, 21);
		panel_3_1.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(null);

		JButton Button_Architecture_View_PNG = new JButton("Downlaod PNG");
		Button_Architecture_View_PNG.setBounds(133, 7, 103, 32);
		panel_3_1.add(Button_Architecture_View_PNG);
		Button_Architecture_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_PNG.setIcon(null);

		JButton Button_Architecture_View_File = new JButton("Download File");
		Button_Architecture_View_File.setBounds(257, 7, 103, 32);
		panel_3_1.add(Button_Architecture_View_File);
		Button_Architecture_View_File.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_File.setIcon(null);

		JButton Button_Architecture_View_SVG = new JButton("Download SVG");
		Button_Architecture_View_SVG.setBounds(370, 7, 103, 32);
		panel_3_1.add(Button_Architecture_View_SVG);
		Button_Architecture_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_SVG.setIcon(null);

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(106, 116, 145));
		panel_3_2.setBounds(31, 117, 753, 42);
		panel_1.add(panel_3_2);

		JLabel lblDependencyView = new JLabel("Dependency View");
		lblDependencyView.setBounds(10, 11, 148, 21);
		panel_3_2.add(lblDependencyView);
		lblDependencyView.setForeground(Color.WHITE);
		lblDependencyView.setIcon(null);
		lblDependencyView.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JButton Button_Dependency_View_PNG = new JButton("Downlaod PNG");
		Button_Dependency_View_PNG.setBounds(135, 7, 103, 32);
		panel_3_2.add(Button_Dependency_View_PNG);
		Button_Dependency_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_PNG.setIcon(null);

		JButton Button_Dependency_View_SVG = new JButton("Download SVG");
		Button_Dependency_View_SVG.setBounds(262, 7, 103, 32);
		panel_3_2.add(Button_Dependency_View_SVG);
		Button_Dependency_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_SVG.setIcon(null);

		JButton Button_Dependency_View_File = new JButton("Donwnload File");
		Button_Dependency_View_File.setBounds(374, 7, 105, 32);
		panel_3_2.add(Button_Dependency_View_File);
		Button_Dependency_View_File.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_File.setIcon(null);

		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBackground(new Color(106, 116, 145));
		panel_3_2_1.setBounds(31, 170, 753, 42);
		panel_1.add(panel_3_2_1);

		JLabel lblDependencyView_1 = new JLabel("Dependency View");
		lblDependencyView_1.setForeground(Color.WHITE);
		lblDependencyView_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDependencyView_1.setBounds(10, 11, 148, 21);
		panel_3_2_1.add(lblDependencyView_1);

		JButton Button_Dependency_View_PNG_1 = new JButton("Downlaod PNG");
		Button_Dependency_View_PNG_1.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_PNG_1.setBounds(135, 7, 103, 32);
		panel_3_2_1.add(Button_Dependency_View_PNG_1);

		JButton Button_Dependency_View_SVG_1 = new JButton("Download SVG");
		Button_Dependency_View_SVG_1.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_SVG_1.setBounds(262, 7, 103, 32);
		panel_3_2_1.add(Button_Dependency_View_SVG_1);

		JButton Button_Dependency_View_File_1 = new JButton("Donwnload File");
		Button_Dependency_View_File_1.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_File_1.setBounds(374, 7, 105, 32);
		panel_3_2_1.add(Button_Dependency_View_File_1);
		JScrollPane scrollPane_Microservice = new JScrollPane();
		scrollPane_Microservice.setBounds(26, 227, 305, 183);
		panel_1.add(scrollPane_Microservice);

		JLabel lblNewLabel_2 = new JLabel("");
		scrollPane_Microservice.setColumnHeaderView(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\Anti coding club\\Desktop\\Eclise Projects\\test\\Resources\\png\\brunel_Logo.png"));

		JTextArea textArea = new JTextArea("Microservices will be shown here");
		scrollPane_Microservice.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setDisabledTextColor(new Color(255, 255, 255));
		Button_Dependency_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.DepdedancyViewDriverFile();

			}
		});
		Button_Dependency_View_SVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					main.DepdedancyViewDriverSVG();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		Button_Dependency_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					main.DepdedancyViewDriverPNG();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		Button_Architecture_View_SVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					main.MicroservicesArchitectureViewDriverSVG();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		Button_Architecture_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservicesArchitectureViewDriverFile();

			}

		});

		Button_Architecture_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					main.MicroservicesArchitectureViewDriverPNG();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		Button_Microservice_View_FILE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewFile();

			}
		});
		Button_Microservice_View_SVG1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewSVG();

			}
		});
		Button_Microservice_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewPNG();

			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = comboBox.getSelectedItem().toString();
				System.out.println(selected);
				main.setMicroservice(selected);
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/cancel_25px.png")).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 64, 668);
		panel.setBackground(new Color(0, 18, 50));
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Brunel University London");
		lblNewLabel_1.setBounds(726, 460, 121, 14);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(63, 0, 804, 247);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("MiSAR  MicroserviceArchitecture V2.1");
		lblNewLabel_3.setFont(new Font("Segoe UI Historic", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(49, 55, 401, 61);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("XML to UML translating tool");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(49, 97, 401, 39);
		panel_2.add(lblNewLabel_3_1);
		Image img = new ImageIcon(this.getClass().getResource("/search_25px.png")).getImage();

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 815, 44);
		panel_2.add(desktopPane);
		desktopPane.setBackground(Color.WHITE);

		txtPleaseSelectA = new JTextField();
		txtPleaseSelectA.setBackground(Color.WHITE);
		txtPleaseSelectA.setBorder(null);
		txtPleaseSelectA.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtPleaseSelectA.setAlignmentY(Component.TOP_ALIGNMENT);
		txtPleaseSelectA.setToolTipText("");
		txtPleaseSelectA.setHorizontalAlignment(SwingConstants.LEFT);
		txtPleaseSelectA.setForeground(Color.GRAY);
		txtPleaseSelectA.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtPleaseSelectA.setText("Please select a PIM file path ONLY");
		txtPleaseSelectA.setBounds(51, 10, 514, 22);
		desktopPane.add(txtPleaseSelectA);
		txtPleaseSelectA.setColumns(10);

		JButton btnNewButton = new JButton("Open File");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\search-alt (1).png"));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setForeground(UIManager.getColor("Table.sortIconLight"));
		btnNewButton.setBounds(581, 11, 107, 22);

		desktopPane.add(btnNewButton);

		JSeparator separator = new JSeparator();
		separator.setBounds(51, 33, 514, 11);
		desktopPane.add(separator);

		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setBounds(10, 5, 31, 39);
		desktopPane.add(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setIcon(new ImageIcon(img));

		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));

		JButton btnOutput_1 = new JButton("Output");
		btnOutput_1.setBounds(699, 11, 95, 22);
		desktopPane.add(btnOutput_1);
		btnOutput_1.setForeground(Color.BLACK);
		btnOutput_1.setBackground(Color.RED);
		btnOutput_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser jfilechooser = new JFileChooser();
					// This forces the suer to chose afile not a directory

					jfilechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					// This stores the user responce
					int responce = jfilechooser.showOpenDialog(null);
					// chooser.setDialogTitle(outputFile);

					// Checking for a valid file
					if (responce == JFileChooser.APPROVE_OPTION) {
						File pimFile = new File(jfilechooser.getSelectedFile().getAbsolutePath());

						outputFile = pimFile.toString();
						main.setOutpath(outputFile);

					}
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please select a directory ", "Error", 1);
					txtPleaseSelectA.setText("Please ONLY select a directory folder to avoid error");
				}
			}
		});

		JButton Excell_Data = new JButton("Excell Data sheet");
		Excell_Data.setBounds(49, 147, 231, 32);
		panel_2.add(Excell_Data);
		Excell_Data.setBackground(new Color(34, 139, 34));
		Excell_Data.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.excellSheet();
			}

		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser jfilechooser = new JFileChooser();
					// This forces the suer to chose afile not a directory

					jfilechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					// This stores the user responce
					int responce = jfilechooser.showOpenDialog(null);

					// Checking for a valid file
					if (responce == JFileChooser.APPROVE_OPTION) {
						File pimFile = new File(jfilechooser.getSelectedFile().getAbsolutePath());
						inputFile = pimFile.toString();

						main.setUmldraw(inputFile);
						txtPleaseSelectA.setText(inputFile);
						main.main(null);

						textArea.setText(main.getMicroservices().toString());

						selectedMicroservice = main.getMicroserviceData();
						DefaultComboBoxModel MicroserviceNames = new DefaultComboBoxModel(selectedMicroservice);
						comboBox.setModel(MicroserviceNames);

					}
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please select a .PIM file ", "Error wrong file type", 1);
					txtPleaseSelectA.setText("Please ONLY select  PIM folder to avoid error");
				}
			}
		});
		// TODO Auto-generated constructor stub
	}
}