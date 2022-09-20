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
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import MainDriver.main;
import java.awt.*;
import java.awt.Component;

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
					frame.setPreferredSize(new Dimension(883, 640));
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
		setTitle("Misar Tool");
     
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
		panel_1.setBounds(63, 247, 804, 330);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Architecture View");
		lblNewLabel.setBounds(10, 21, 148, 21);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(null);

		JButton Button_Architecture_View_PNG = new JButton("Downlaod PNG");
		Button_Architecture_View_PNG.setBounds(183, 21, 123, 32);
		panel_1.add(Button_Architecture_View_PNG);
		Button_Architecture_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_PNG.setIcon(null);

		JButton Button_Architecture_View_File = new JButton("Download File");
		Button_Architecture_View_File.setBounds(603, 21, 123, 32);
		panel_1.add(Button_Architecture_View_File);
		Button_Architecture_View_File.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_File.setIcon(null);

		JLabel lblMicroserviceView = new JLabel("Microservice View");
		lblMicroserviceView.setBounds(10, 83, 113, 19);
		panel_1.add(lblMicroserviceView);
		lblMicroserviceView.setForeground(Color.WHITE);
		lblMicroserviceView.setIcon(null);
		lblMicroserviceView.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 0, 0));
		separator_1.setBounds(96, 64, 618, 21);
		panel_1.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.RED);
		separator_1_1.setBounds(96, 131, 618, 21);
		panel_1.add(separator_1_1);

		JButton Button_Microservice_View_FILE = new JButton("Downlaod File");
		Button_Microservice_View_FILE.setBounds(603, 83, 123, 32);
		panel_1.add(Button_Microservice_View_FILE);
		Button_Microservice_View_FILE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button_Microservice_View_FILE.setBackground(SystemColor.textHighlight);

		JButton Button_Microservice_View_PNG = new JButton("Downlaod PNG");
		Button_Microservice_View_PNG.setBounds(183, 83, 123, 32);
		panel_1.add(Button_Microservice_View_PNG);
		Button_Microservice_View_PNG.setBackground(SystemColor.textHighlight);

		Button_Microservice_View_SVG1 = new JButton("Downlaod SVG");
		Button_Microservice_View_SVG1.setBounds(391, 83, 123, 32);
		panel_1.add(Button_Microservice_View_SVG1);
		Button_Microservice_View_SVG1.setBackground(SystemColor.textHighlight);

		JButton Button_Architecture_View_SVG = new JButton("Download SVG");
		Button_Architecture_View_SVG.setBounds(391, 21, 123, 32);
		panel_1.add(Button_Architecture_View_SVG);
		Button_Architecture_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_SVG.setIcon(null);

		JLabel lblDependencyView = new JLabel("Dependency View");
		lblDependencyView.setBounds(10, 153, 148, 21);
		panel_1.add(lblDependencyView);
		lblDependencyView.setForeground(Color.WHITE);
		lblDependencyView.setIcon(null);
		lblDependencyView.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.RED);
		separator_1_1_1.setBounds(96, 198, 618, 21);
		panel_1.add(separator_1_1_1);

		JButton Button_Dependency_View_File = new JButton("Donwnload File");
		Button_Dependency_View_File.setBounds(603, 149, 123, 32);
		panel_1.add(Button_Dependency_View_File);
		Button_Dependency_View_File.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_File.setIcon(null);

		JButton Button_Dependency_View_SVG = new JButton("Download SVG");
		Button_Dependency_View_SVG.setBounds(391, 149, 123, 32);
		panel_1.add(Button_Dependency_View_SVG);
		Button_Dependency_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_SVG.setIcon(null);

		JButton Button_Dependency_View_PNG = new JButton("Downlaod PNG");
		Button_Dependency_View_PNG.setBounds(183, 149, 123, 32);
		panel_1.add(Button_Dependency_View_PNG);
		Button_Dependency_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_PNG.setIcon(null);

		JLabel MiroView = new JLabel("Miro Dependency View");
		MiroView.setBounds(10, 219, 148, 21);
		panel_1.add(MiroView);
		MiroView.setForeground(Color.WHITE);
		MiroView.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setForeground(Color.RED);
		separator_1_1_1_1.setBounds(96, 262, 618, 21);
		panel_1.add(separator_1_1_1_1);

		JButton Button_Micro_Dependency_View_File = new JButton("Donwnload File");
		Button_Micro_Dependency_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.MicroDepedancyViewFile();
			}
		});
		Button_Micro_Dependency_View_File.setBounds(603, 219, 123, 32);
		panel_1.add(Button_Micro_Dependency_View_File);
		Button_Micro_Dependency_View_File.setBackground(SystemColor.textHighlight);

		JButton Button_Micro_Dependency_View_SVG = new JButton("Download SVG");
		Button_Micro_Dependency_View_SVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroDepedancyViewSVG();
			}
		});
		Button_Micro_Dependency_View_SVG.setBounds(391, 219, 123, 32);
		panel_1.add(Button_Micro_Dependency_View_SVG);
		Button_Micro_Dependency_View_SVG.setBackground(SystemColor.textHighlight);

		JButton Button_Micro_Dependency_View_PNG = new JButton("Downlaod PNG");
		Button_Micro_Dependency_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.MicroDepedancyViewPNG();
			}
		});
		Button_Micro_Dependency_View_PNG.setBounds(183, 219, 123, 32);
		panel_1.add(Button_Micro_Dependency_View_PNG);
		Button_Micro_Dependency_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.DepdedancyViewDriverPNG();

			}
		});
		Button_Dependency_View_SVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.DepdedancyViewDriverSVG();

				// TODO Auto-generated catch block

			}
		});
		Button_Dependency_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.DepdedancyViewDriverFile();

			}
		});

		Button_Architecture_View_SVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservicesArchitectureViewDriverSVG();


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

		Button_Microservice_View_FILE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewFile();

			}
		});

		Button_Architecture_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservicesArchitectureViewDriverFile();

			}

		});

		Button_Architecture_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservicesArchitectureViewDriverPNG();

				// TODO Auto-generated catch block

			}
		});
		

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
		panel_2.setToolTipText("Please select a microservice FIRST");
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
		lblNewLabel_3_1.setBounds(49, 102, 401, 39);
		panel_2.add(lblNewLabel_3_1);
		
		
		

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
		txtPleaseSelectA.setBounds(51, 10, 482, 22);
		desktopPane.add(txtPleaseSelectA);
		txtPleaseSelectA.setColumns(10);

		JButton btn_OpenFile = new JButton("Open File");
		btn_OpenFile.setBackground(SystemColor.text);
		btn_OpenFile.setForeground(UIManager.getColor("Table.sortIconLight"));
		btn_OpenFile.setBounds(568, 11, 107, 22);
		Image imgOpenFile = new ImageIcon(this.getClass().getResource("/Opened Folder_22px.png")).getImage();
		btn_OpenFile.setIcon(new ImageIcon(imgOpenFile));

		desktopPane.add(btn_OpenFile);

		JSeparator separator = new JSeparator();
		separator.setBounds(51, 33, 482, 11);
		desktopPane.add(separator);

		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setBounds(10, 5, 31, 39);
		desktopPane.add(lblNewLabel_3_1_1);
		Image imgSearch = new ImageIcon(this.getClass().getResource("/search_25px.png")).getImage();
		lblNewLabel_3_1_1.setIcon(new ImageIcon(imgSearch));

		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));

		JButton btnOutput_1 = new JButton("Output");
		btnOutput_1.setBounds(685, 11, 95, 22);
		desktopPane.add(btnOutput_1);
		btnOutput_1.setForeground(Color.BLACK);
		btnOutput_1.setBackground(new Color(0, 0, 128));
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

		JButton Excell_Data = new JButton("Excell Data sheet ( Entire model )");
		Excell_Data.setBounds(290, 200, 241, 32);
		panel_2.add(Excell_Data);
		Excell_Data.setBackground(new Color(34, 139, 34));
		Image Excell_DataPic = new ImageIcon(this.getClass().getResource("/microsoft_excel_23px.png")).getImage();
		Excell_Data.setIcon(new ImageIcon(Excell_DataPic));

		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Please select a Microservice");
		comboBox.setBounds(49, 200, 231, 32);
		panel_2.add(comboBox);
		comboBox.setBackground(new Color(255, 0, 0));

		JLabel lblNewLabel_2 = new JLabel(
				"**Please select a microservice before selecting a micro view or excell micro view data ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(49, 174, 506, 25);
		panel_2.add(lblNewLabel_2);

		JButton Excell_Data_For_Micro = new JButton("Micro Excell Data sheet ( Micro level ) ");
		Excell_Data_For_Micro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.excellSheetMicroLvele();
			}
		});
		Excell_Data_For_Micro.setBounds(553, 200, 241, 32);
		panel_2.add(Excell_Data_For_Micro);
		Excell_Data_For_Micro.setBackground(new Color(34, 139, 34));
		Excell_Data_For_Micro.setIcon(new ImageIcon(Excell_DataPic));
		
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = comboBox.getSelectedItem().toString();
				System.out.println(selected);
				main.setMicroservice(selected);
			}
		});
		Excell_Data.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.excellSheet();
			}

		});
		

		btn_OpenFile.addActionListener(new ActionListener() {
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

						// textArea.setText(main.getMicroservices().toString());

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