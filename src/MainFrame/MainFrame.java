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

import javax.swing.filechooser.FileNameExtensionFilter;
import java.net.URL;

public class MainFrame extends JFrame {
	private JTextField txtPleaseSelectA;
	private static String inputFile;
	private static String outputFile;
	String[] selectedMicroservice = {};
	private JButton btnDownloadSvg;

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
		setTitle("Misar Graphical Model Generator");
		setApplicationIcon();
		
		// Full exit when click on exit button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
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
		panel_1.setBounds(63, 125, 804, 452);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Architecture Microservices");
		lblNewLabel.setBounds(10, 84, 186, 21);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(null);

		JButton btnDownloadPng_1 = new JButton("Download PNG");
		btnDownloadPng_1.setBounds(183, 80, 148, 32);
		panel_1.add(btnDownloadPng_1);
		btnDownloadPng_1.setBackground(SystemColor.textHighlight);
		btnDownloadPng_1.setIcon(null);

		JButton Button_Architecture_View_File = new JButton("Download File");
		Button_Architecture_View_File.setBounds(603, 80, 148, 32);
		panel_1.add(Button_Architecture_View_File);
		Button_Architecture_View_File.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_File.setIcon(null);

		JLabel lblMicroserviceView = new JLabel("Microservice Level");
		lblMicroserviceView.setBounds(11, 184, 162, 19);
		panel_1.add(lblMicroserviceView);
		lblMicroserviceView.setForeground(Color.WHITE);
		lblMicroserviceView.setIcon(null);
		lblMicroserviceView.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 0, 0));
		separator_1.setBounds(138, 123, 618, 21);
		panel_1.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.RED);
		separator_1_1.setBounds(183, 196, 575, 21);
		panel_1.add(separator_1_1);

		JButton btnDownloadFile = new JButton("Download File");
		btnDownloadFile.setBounds(603, 306, 148, 32);
		panel_1.add(btnDownloadFile);
		btnDownloadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				main.MicroservoceViewFile();
			}
		});
		btnDownloadFile.setBackground(SystemColor.textHighlight);

		JButton btnDownloadPng_2 = new JButton("Download PNG");
		btnDownloadPng_2.setBounds(183, 306, 148, 32);
		panel_1.add(btnDownloadPng_2);
		btnDownloadPng_2.setBackground(SystemColor.textHighlight);

		btnDownloadSvg = new JButton("Download SVG");
		btnDownloadSvg.setBounds(391, 306, 148, 32);
		panel_1.add(btnDownloadSvg);
		btnDownloadSvg.setBackground(SystemColor.textHighlight);

		JButton Button_Architecture_View_SVG = new JButton("Download SVG");
		Button_Architecture_View_SVG.setBounds(391, 80, 148, 32);
		panel_1.add(Button_Architecture_View_SVG);
		Button_Architecture_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Architecture_View_SVG.setIcon(null);

		JLabel lblDependencyView = new JLabel("Dependency View");
		lblDependencyView.setBounds(10, 142, 148, 21);
		panel_1.add(lblDependencyView);
		lblDependencyView.setForeground(Color.WHITE);
		lblDependencyView.setIcon(null);
		lblDependencyView.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.RED);
		separator_1_1_1.setBounds(96, 349, 655, 21);
		panel_1.add(separator_1_1_1);

		JButton btnDownloadFile_1 = new JButton("Download File");
		btnDownloadFile_1.setBounds(603, 142, 148, 32);
		panel_1.add(btnDownloadFile_1);
		btnDownloadFile_1.setBackground(SystemColor.textHighlight);
		btnDownloadFile_1.setIcon(null);

		JButton Button_Dependency_View_SVG = new JButton("Download SVG");
		Button_Dependency_View_SVG.setBounds(391, 142, 148, 32);
		panel_1.add(Button_Dependency_View_SVG);
		Button_Dependency_View_SVG.setBackground(SystemColor.textHighlight);
		Button_Dependency_View_SVG.setIcon(null);

		JButton btnDownloadPng_3 = new JButton("Download PNG");
		btnDownloadPng_3.setBounds(183, 142, 148, 32);
		panel_1.add(btnDownloadPng_3);
		btnDownloadPng_3.setBackground(SystemColor.textHighlight);
		btnDownloadPng_3.setIcon(null);

		JLabel MiroView = new JLabel("Micro Dependency View");
		MiroView.setBounds(10, 381, 158, 21);
		panel_1.add(MiroView);
		MiroView.setForeground(Color.WHITE);
		MiroView.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setForeground(Color.RED);
		separator_1_1_1_1.setBounds(96, 413, 655, 21);
		panel_1.add(separator_1_1_1_1);

		JButton Button_Micro_Dependency_View_File = new JButton("Donwnload File");
		Button_Micro_Dependency_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.MicroDepedancyViewFile();
			}
		});
		Button_Micro_Dependency_View_File.setBounds(603, 370, 148, 32);
		panel_1.add(Button_Micro_Dependency_View_File);
		Button_Micro_Dependency_View_File.setBackground(SystemColor.textHighlight);

		JButton Button_Micro_Dependency_View_SVG = new JButton("Download SVG");
		Button_Micro_Dependency_View_SVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroDepedancyViewSVG();
			}
		});
		Button_Micro_Dependency_View_SVG.setBounds(391, 370, 148, 32);
		panel_1.add(Button_Micro_Dependency_View_SVG);
		Button_Micro_Dependency_View_SVG.setBackground(SystemColor.textHighlight);

		JButton btnDownloadPng = new JButton("Download  PNG");
		btnDownloadPng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.MicroDepedancyViewPNG();
			}
		});
		btnDownloadPng.setBounds(183, 370, 148, 32);
		panel_1.add(btnDownloadPng);
		btnDownloadPng.setBackground(SystemColor.textHighlight);
		
				JButton Excell_Data = new JButton("Export to Excel Data sheet (Entire model)");
				Excell_Data.setBounds(183, 37, 286, 32);
				panel_1.add(Excell_Data);
				Excell_Data.setBackground(new Color(34, 139, 34));
				ImageIcon Excell_DataPic = loadIcon("microsoft_excel_23px.png", 23, 23);
				Excell_Data.setIcon(Excell_DataPic);
				
						JButton Excell_Data_For_Micro = new JButton("Export to Excel Data sheet (Microservice level)");
						Excell_Data_For_Micro.setBounds(183, 263, 300, 32);
						panel_1.add(Excell_Data_For_Micro);
						Excell_Data_For_Micro.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								main.excellSheetMicroLvele();
							}
						});
						Excell_Data_For_Micro.setBackground(new Color(34, 139, 34));
						Excell_Data_For_Micro.setIcon(Excell_DataPic);
						
								JComboBox comboBox = new JComboBox();
								comboBox.setBounds(10, 211, 231, 32);
								panel_1.add(comboBox);
								comboBox.setToolTipText("Please select a Microservice");
								comboBox.setBackground(new Color(255, 0, 0));
								
										JLabel lblNewLabel_2 = new JLabel(
												"** Please select a microservice before obtaining any microservice view");
										lblNewLabel_2.setBounds(252, 214, 506, 25);
										panel_1.add(lblNewLabel_2);
										lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
										lblNewLabel_2.setForeground(Color.RED);
										
										JLabel lblMiroserviceView = new JLabel("Microservice View");
										lblMiroserviceView.setForeground(Color.WHITE);
										lblMiroserviceView.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblMiroserviceView.setBounds(10, 317, 148, 21);
										panel_1.add(lblMiroserviceView);
										
										JLabel lblMiroserviceMetrics = new JLabel("Microservice Metrics");
										lblMiroserviceMetrics.setForeground(Color.WHITE);
										lblMiroserviceMetrics.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblMiroserviceMetrics.setBounds(10, 258, 148, 21);
										panel_1.add(lblMiroserviceMetrics);
										
										JLabel lblArchitectureMetrics = new JLabel("Architecture Metrics");
										lblArchitectureMetrics.setForeground(Color.WHITE);
										lblArchitectureMetrics.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblArchitectureMetrics.setBounds(10, 42, 186, 19);
										panel_1.add(lblArchitectureMetrics);
										
										JLabel lblArchitectureMicroservices = new JLabel("Architecture Level");
										lblArchitectureMicroservices.setForeground(Color.WHITE);
										lblArchitectureMicroservices.setFont(new Font("Tahoma", Font.PLAIN, 18));
										lblArchitectureMicroservices.setBounds(10, 0, 231, 26);
										panel_1.add(lblArchitectureMicroservices);
										
										JSeparator separator_1_1_2 = new JSeparator();
										separator_1_1_2.setForeground(Color.RED);
										separator_1_1_2.setBounds(183, 11, 568, 15);
										panel_1.add(separator_1_1_2);
								
								
								
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
		btnDownloadPng_3.addActionListener(new ActionListener() {
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
		btnDownloadFile_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.DepdedancyViewDriverFile();

			}
		});

		Button_Architecture_View_SVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservicesArchitectureViewDriverSVG();


			}
		});
		btnDownloadSvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewSVG();

			}
		});
		btnDownloadPng_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewPNG();

			}
		});

		btnDownloadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservoceViewFile();

			}
		});

		Button_Architecture_View_File.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				main.MicroservicesArchitectureViewDriverFile();

			}

		});

		btnDownloadPng_1.addActionListener(new ActionListener() {
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
		
		JLabel brunelLogo = new JLabel();
		brunelLogo.setIcon(loadIcon("brunel_Logo.png", 50, 50));
		brunelLogo.setBounds(7, 12, 50, 50);
		panel.add(brunelLogo);

		JLabel misarLogo = new JLabel();
		misarLogo.setIcon(loadIcon("MainLogo.png", 50, 50));
		misarLogo.setBounds(7, 72, 50, 50);
		panel.add(misarLogo);

		JLabel lblNewLabel_1 = new JLabel("Brunel University London");
		lblNewLabel_1.setBounds(726, 460, 121, 14);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);

		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("Please select a microservice FIRST");
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(63, 0, 881, 132);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		

		JLabel lblNewLabel_3_1 = new JLabel("This tool translates a MiSAR PIM architecture model into PlantUML diagrams and creates metrics of the MiSAR PIM mode");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(10, 31, 749, 32);
		panel_2.add(lblNewLabel_3_1);
		
		
		

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 62, 763, 64);
		panel_2.add(desktopPane);
		desktopPane.setBackground(Color.LIGHT_GRAY);

		txtPleaseSelectA = new JTextField();
		txtPleaseSelectA.setBackground(Color.LIGHT_GRAY);
		txtPleaseSelectA.setBorder(null);
		txtPleaseSelectA.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtPleaseSelectA.setAlignmentY(Component.TOP_ALIGNMENT);
		txtPleaseSelectA.setToolTipText("");
		txtPleaseSelectA.setHorizontalAlignment(SwingConstants.LEFT);
		txtPleaseSelectA.setForeground(Color.RED);
		txtPleaseSelectA.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtPleaseSelectA.setText("Please select a .xmi MiSAR PIM model file");
		txtPleaseSelectA.setBounds(51, 5, 482, 22);
		desktopPane.add(txtPleaseSelectA);
		txtPleaseSelectA.setColumns(10);

		JButton btn_OpenFile = new JButton("Open File");
		btn_OpenFile.setBackground(SystemColor.text);
		btn_OpenFile.setForeground(UIManager.getColor("Table.sortIconLight"));
		btn_OpenFile.setBounds(568, 6, 107, 22);
		btn_OpenFile.setIcon(loadIcon("Opened Folder_22px.png", 22, 22));

		desktopPane.add(btn_OpenFile);

		JSeparator separator = new JSeparator();
		separator.setBounds(51, 33, 482, 11);
		desktopPane.add(separator);

		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setBounds(10, 14, 31, 39);
		desktopPane.add(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setIcon(loadIcon("search_25px.png", 25, 25));

		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));

		JButton btnOutput_1 = new JButton("Output");
		btnOutput_1.setBounds(568, 39, 107, 22);
		desktopPane.add(btnOutput_1);
		btnOutput_1.setForeground(Color.BLACK);
		btnOutput_1.setBackground(new Color(0, 0, 128));
		
		JLabel lblNewLabel_2_1 = new JLabel("Please select the location on your desktop where generated files will be stored ");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_2_1.setBounds(51, 33, 561, 25);
		desktopPane.add(lblNewLabel_2_1);
		btnOutput_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser jfilechooser = new JFileChooser();

					jfilechooser.setDialogTitle("Select output folder");
					jfilechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					jfilechooser.setAcceptAllFileFilterUsed(false);
					jfilechooser.setApproveButtonText("Select Folder");

					jfilechooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
						public boolean accept(File file) {
							return file.isDirectory();
						}

						public String getDescription() {
							return "Folders only";
						}
					});

					int response = jfilechooser.showOpenDialog(null);

					if (response == JFileChooser.APPROVE_OPTION) {
						File selectedFolder = jfilechooser.getSelectedFile();

						outputFile = selectedFolder.toString();
						main.setOutpath(outputFile);
					}
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(
							null,
							"Please select a valid output folder.",
							"Invalid Output Folder",
							JOptionPane.ERROR_MESSAGE
					);
				}
			}
		});
		
		
				JLabel lblNewLabel_3 = new JLabel("MiSAR  MicroserviceArchitecture V2.1");
				lblNewLabel_3.setBounds(10, 0, 401, 39);
				panel_2.add(lblNewLabel_3);
				lblNewLabel_3.setFont(new Font("Segoe UI Historic", Font.PLAIN, 24));
		

		btn_OpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser jfilechooser = new JFileChooser();

					// Pick only XMI files 
					jfilechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					jfilechooser.setAcceptAllFileFilterUsed(false);
					jfilechooser.setFileFilter(new FileNameExtensionFilter("XMI model files (*.xmi, *.pim)", "xmi", "pim"));
					
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

					JOptionPane.showMessageDialog(
							MainFrame.this,
							"Please select a valid .xmi file which represents a MiSAR PIM Model.\n\n"
									+ "You may have selected a .xmi PSM file.\n"
									+ "PIM Model files are generated in the target folder of the TransformationEngine.",
							"Invalid MiSAR PIM Model",
							JOptionPane.ERROR_MESSAGE
					);

					txtPleaseSelectA.setText("Please select a valid .xmi MiSAR PIM model file.");
				}
			}
		});
		// TODO Auto-generated constructor stub
	}
	
	private ImageIcon loadIcon(String fileName, int width, int height) {
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
	
}