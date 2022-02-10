package CrickApp_Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frmAdminLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmAdminLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setFont(new Font("Dialog", Font.BOLD, 15));
		frmAdminLogin.setTitle("Admin Login");
		frmAdminLogin.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmAdminLogin.getContentPane().setLayout(null);
		frmAdminLogin.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\DBMS\\IMAGES\\Admin-icon.png"));
		label.setBounds(177, 125, 512, 512);
		frmAdminLogin.getContentPane().add(label);
		
		JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setForeground(Color.BLACK);
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAdminLogin.setBounds(920, 125, 207, 38);
		frmAdminLogin.getContentPane().add(lblAdminLogin);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setBounds(775, 285, 126, 32);
		frmAdminLogin.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setForeground(Color.BLACK);
		textField.setBounds(920, 285, 241, 38);
		frmAdminLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(775, 367, 126, 32);
		frmAdminLogin.getContentPane().add(lblPassword);
		
		Button button = new Button("LOGIN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String uname=textField.getText();
					String pasw=passwordField.getText();
					
					if(uname.equals("admin") && pasw.equals("admin123")) {
						frmAdminLogin.dispose();
						//mainFrame1 ob=new mainFrame1();
						//ob.initialize();
						mainFrame1.main(null);
						
					}else {
						JOptionPane.showMessageDialog(frmAdminLogin, "Invalid User Name or Password");
					}
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frmAdminLogin, e1);
				}
			}
		});
		button.setBackground(Color.PINK);
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setForeground(Color.BLACK);
		button.setBounds(805, 491, 151, 38);
		frmAdminLogin.getContentPane().add(button);
		
		Button button_1 = new Button("CANCEL");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdminLogin.dispose();
			}
		});
		button_1.setBackground(Color.PINK);
		button_1.setFont(new Font("Dialog", Font.BOLD, 15));
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(1042, 491, 151, 38);
		frmAdminLogin.getContentPane().add(button_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(920, 367, 241, 38);
		frmAdminLogin.getContentPane().add(passwordField);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\javadb\\images\\3Jz1MKq-mount-everest-wallpaper.jpg"));
		label_1.setBounds(-19, 0, 1920, 1200);
		frmAdminLogin.getContentPane().add(label_1);
		frmAdminLogin.setBounds(100, 100, 1424, 927);
		frmAdminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
