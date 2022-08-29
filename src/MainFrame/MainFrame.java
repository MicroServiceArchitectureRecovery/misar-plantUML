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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import MainDriver.main;

public class MainFrame extends JFrame {
	private JTextField txtPleaseSelectA;
	private static String inputFile;
	private static String outputFile;
	String[] selectedMicroservice = {};
	private JButton Button_Microservice_View_SVG1;
	private JTextField txtPleaseSelectA_SelectPath;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					MainFrame frame = new MainFrame();

					frame.setVisible(true);

					frame.setResizable(false);
					frame.setPreferredSize(new Dimension(730, 615));
					frame.pack();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);

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

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 141, 576);
		panel.setBackground(new Color(0, 51, 102));
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Brunel University London");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 551, 121, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\brunel-3_1.png"));
		lblNewLabel_2.setBounds(0, 374, 141, 177);
		panel.add(lblNewLabel_2);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.activeCaptionBorder);
		desktopPane.setBounds(141, 0, 580, 44);
		getContentPane().add(desktopPane);

		txtPleaseSelectA = new JTextField();
		txtPleaseSelectA.setForeground(new Color(112, 128, 144));
		txtPleaseSelectA.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtPleaseSelectA.setText("Please select a PIM file path ONLY");
		txtPleaseSelectA.setBounds(10, 10, 435, 22);
		desktopPane.add(txtPleaseSelectA);
		txtPleaseSelectA.setColumns(10);

		JButton btnNewButton = new JButton("Open File");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\search-alt (1).png"));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setForeground(UIManager.getColor("Table.sortIconLight"));
		btnNewButton.setBounds(455, 10, 107, 22);

		desktopPane.add(btnNewButton);

		JButton Button_Architecture_View_PNG = new JButton("Downlaod PNG");
		Button_Architecture_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_PNG.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\picture.png"));
		Button_Architecture_View_PNG.setBounds(183, 185, 145, 32);
		getContentPane().add(Button_Architecture_View_PNG);

		JSeparator separator = new JSeparator();
		separator.setBounds(183, 242, 514, 11);
		getContentPane().add(separator);

		JLabel lblNewLabel = new JLabel("Architecture View");
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\bank.png"));
		lblNewLabel.setBounds(151, 142, 148, 32);
		getContentPane().add(lblNewLabel);

		JButton Button_Architecture_View_SVG = new JButton("Download SVG");
		Button_Architecture_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_SVG
				.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\folder-download.png"));
		Button_Architecture_View_SVG.setBounds(371, 185, 145, 32);
		getContentPane().add(Button_Architecture_View_SVG);

		JButton Button_Architecture_View_File = new JButton("Download File");
		Button_Architecture_View_File.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_File
				.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\file-invoice.png"));
		Button_Architecture_View_File.setBounds(552, 185, 145, 32);
		getContentPane().add(Button_Architecture_View_File);

		JLabel lblDependencyView = new JLabel("Dependency View");
		lblDependencyView.setForeground(new Color(0, 51, 102));
		lblDependencyView.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\link-alt.png"));
		lblDependencyView.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDependencyView.setBounds(151, 242, 148, 32);
		getContentPane().add(lblDependencyView);

		JButton Button_Dependency_View_PNG = new JButton("Downlaod PNG");
		Button_Dependency_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_PNG.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\picture.png"));
		Button_Dependency_View_PNG.setBounds(183, 273, 145, 32);
		getContentPane().add(Button_Dependency_View_PNG);

		JButton Button_Dependency_View_SVG = new JButton("Download SVG");
		Button_Dependency_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_SVG
				.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\folder-download.png"));
		Button_Dependency_View_SVG.setBounds(371, 273, 145, 32);
		getContentPane().add(Button_Dependency_View_SVG);

		JButton Button_Dependency_View_File = new JButton("Donwnload File");
		Button_Dependency_View_File.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_File.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\file-invoice.png"));
		Button_Dependency_View_File.setBounds(552, 273, 145, 32);
		getContentPane().add(Button_Dependency_View_File);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 128));
		separator_1.setBounds(183, 326, 514, 11);
		getContentPane().add(separator_1);

		JLabel lblMicroserviceView = new JLabel("Microservice View");
		lblMicroserviceView.setForeground(new Color(0, 51, 102));
		lblMicroserviceView.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\search.png"));
		lblMicroserviceView.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMicroserviceView.setBounds(151, 338, 148, 32);
		getContentPane().add(lblMicroserviceView);
		JScrollPane scrollPane_Microservice = new JScrollPane();
		scrollPane_Microservice.setBounds(408, 384, 305, 183);
		getContentPane().add(scrollPane_Microservice);
		
				JTextArea textArea = new JTextArea("Microservices will be shown here");
				scrollPane_Microservice.setViewportView(textArea);
				textArea.setEditable(false);
				textArea.setDisabledTextColor(new Color(255, 255, 255));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 0, 128));
		comboBox.setBounds(151, 381, 231, 32);
		getContentPane().add(comboBox);
		
		JButton Button_Microservice_View_PNG = new JButton("Downlaod PNG");
		Button_Microservice_View_PNG.setBackground(SystemColor.textHighlight);
		Button_Microservice_View_PNG.setBounds(151, 427, 165, 32);
		getContentPane().add(Button_Microservice_View_PNG);
		
		Button_Microservice_View_SVG1 = new JButton("Downlaod SVG");
		Button_Microservice_View_SVG1.setBackground(SystemColor.textHighlight);
		Button_Microservice_View_SVG1.setBounds(151, 470, 167, 32);
		getContentPane().add(Button_Microservice_View_SVG1);
		
		JButton Button_Microservice_View_FILE = new JButton("Downlaod File");
		Button_Microservice_View_FILE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button_Microservice_View_FILE.setBackground(SystemColor.textHighlight);
		Button_Microservice_View_FILE.setBounds(151, 513, 167, 32);
		getContentPane().add(Button_Microservice_View_FILE);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.activeCaptionBorder);
		desktopPane_1.setBounds(141, 44, 580, 44);
		getContentPane().add(desktopPane_1);
		
		txtPleaseSelectA_SelectPath = new JTextField();
		txtPleaseSelectA_SelectPath.setText("Please select a file path to store");
		txtPleaseSelectA_SelectPath.setForeground(new Color(112, 128, 144));
		txtPleaseSelectA_SelectPath.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtPleaseSelectA_SelectPath.setColumns(10);
		txtPleaseSelectA_SelectPath.setBounds(10, 10, 435, 22);
		desktopPane_1.add(txtPleaseSelectA_SelectPath);
		
		JButton btnSelectPath = new JButton("Select Path");
		btnSelectPath.setForeground(Color.BLACK);
		btnSelectPath.setBackground(Color.WHITE);
		btnSelectPath.setBounds(455, 10, 107, 22);
		desktopPane_1.add(btnSelectPath);
		comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = comboBox.getSelectedItem().toString();
                System.out.println(selected);
                main.setMicroservice(selected);
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
		Button_Dependency_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.DepdedancyViewDriverFile();

			}
		});
		Button_Microservice_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewPNG();

			}
		});
		Button_Microservice_View_SVG1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewSVG();

			}
		});
		
		Button_Microservice_View_FILE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewSVG();

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
						DefaultComboBoxModel MicroserviceNames  = new DefaultComboBoxModel(selectedMicroservice);
						comboBox.setModel(MicroserviceNames);
						
						
						
					}
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please select a .PIM file ", "Error wrong file type", 1);
					txtPleaseSelectA.setText("Please ONLY select  PIM folder to avoid error");
				}
			}
		});
		btnSelectPath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfilechooser = new JFileChooser();
				// This forces the suer to chose afile not a directory

				jfilechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int responce = jfilechooser.showOpenDialog(null);
				
				txtPleaseSelectA_SelectPath.setText(inputFile);
			}
		});
		// TODO Auto-generated constructor stub
	}
}