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
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
	private JTextField txtPleaseSelectA;
	private static String file;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					MainFrame frame = new MainFrame();

					frame.setVisible(true);

					frame.setResizable(false);
					frame.setPreferredSize(new Dimension(730, 460));
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
		return file;
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
		panel.setBounds(0, 0, 141, 419);
		panel.setBackground(new Color(0, 51, 102));
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Brunel University London");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 384, 121, 14);
		panel.add(lblNewLabel_1);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(141, 0, 572, 44);
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
		Button_Architecture_View_PNG.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\picture.png"));
		Button_Architecture_View_PNG.setBounds(183, 77, 145, 32);
		getContentPane().add(Button_Architecture_View_PNG);

		JSeparator separator = new JSeparator();
		separator.setBounds(183, 129, 514, 11);
		getContentPane().add(separator);

		JLabel lblNewLabel = new JLabel("Architecture View");
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\bank.png"));
		lblNewLabel.setBounds(151, 43, 148, 32);
		getContentPane().add(lblNewLabel);

		JButton Button_Architecture_View_SVG = new JButton("Download SVG");
		Button_Architecture_View_SVG
				.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\folder-download.png"));
		Button_Architecture_View_SVG.setBounds(371, 77, 145, 32);
		getContentPane().add(Button_Architecture_View_SVG);

		JButton Button_Architecture_View_File = new JButton("Download File");
		Button_Architecture_View_File
				.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\file-invoice.png"));
		Button_Architecture_View_File.setBounds(552, 77, 145, 32);
		getContentPane().add(Button_Architecture_View_File);

		JLabel lblDependencyView = new JLabel("Dependency View");
		lblDependencyView.setForeground(new Color(0, 51, 102));
		lblDependencyView.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\link-alt.png"));
		lblDependencyView.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDependencyView.setBounds(151, 129, 148, 32);
		getContentPane().add(lblDependencyView);

		JButton Button_Dependency_View_PNG = new JButton("Downlaod PNG");
		Button_Dependency_View_PNG.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\picture.png"));
		Button_Dependency_View_PNG.setBounds(183, 161, 145, 32);
		getContentPane().add(Button_Dependency_View_PNG);

		JButton Button_Dependency_View_SVG = new JButton("Download SVG");
		Button_Dependency_View_SVG
				.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\folder-download.png"));
		Button_Dependency_View_SVG.setBounds(371, 161, 145, 32);
		getContentPane().add(Button_Dependency_View_SVG);

		JButton Button_Dependency_View_File = new JButton("Donwnload File");
		Button_Dependency_View_File.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\file-invoice.png"));
		Button_Dependency_View_File.setBounds(552, 161, 145, 32);
		getContentPane().add(Button_Dependency_View_File);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(183, 204, 514, 11);
		getContentPane().add(separator_1);

		JLabel lblMicroserviceView = new JLabel("Microservice View");
		lblMicroserviceView.setForeground(new Color(0, 51, 102));
		lblMicroserviceView.setIcon(new ImageIcon("C:\\Users\\Anti coding club\\Downloads\\search.png"));
		lblMicroserviceView.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMicroserviceView.setBounds(151, 204, 148, 32);
		getContentPane().add(lblMicroserviceView);

		JTextArea textArea = new JTextArea("Microservice");
		JScrollPane scrollPane_Microservice = new JScrollPane(textArea);
		scrollPane_Microservice.setBounds(392, 215, 305, 183);
		getContentPane().add(scrollPane_Microservice);
		Button_Architecture_View_PNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					main.MicroservicesArchitectureViewDriver();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

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
					file = pimFile.toString();

					main.setUmldraw(file);
					txtPleaseSelectA.setText(file);
					main.main(null);
					textArea.setText(main.getMicroservices().toString());
				}
				}
				catch(Exception exception) {
					JOptionPane.showMessageDialog(null,"Wrong File type Please select a PIM file ","Error",1);
					txtPleaseSelectA.setText("Please ONLY select  PIM folder to avoid error");
				}
			}
		});
		// TODO Auto-generated constructor stub
	}
}