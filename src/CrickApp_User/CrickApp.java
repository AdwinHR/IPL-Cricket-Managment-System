package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class CrickApp extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrickApp frame = new CrickApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrickApp() {
		setClosable(true);
		getContentPane().setBackground(Color.PINK);
		setBounds(100, 100, 1030, 603);
		getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\DBMS\\IMAGES\\logo-demo-yellow.gif"));
		label_1.setBounds(52, 0, 900, 116);
		getContentPane().add(label_1);
		
		JLabel lblCourseDatabaseSystem = new JLabel("COURSE :- DATABASE SYSTEM LABORATORY (IS507)");
		lblCourseDatabaseSystem.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCourseDatabaseSystem.setForeground(Color.BLACK);
		lblCourseDatabaseSystem.setBounds(174, 153, 694, 57);
		getContentPane().add(lblCourseDatabaseSystem);
		
		JLabel lblTopic = new JLabel("TOPIC :- IPL(2019) CRICKET INFORMATION AND MANAGEMENT SYSTEM ");
		lblTopic.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTopic.setForeground(Color.BLACK);
		lblTopic.setBounds(52, 200, 924, 73);
		getContentPane().add(lblTopic);
		
		JLabel lblNewLabel = new JLabel("BY -");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(665, 317, 59, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSanathkumarMP = new JLabel("SanathKumar M P");
		lblSanathkumarMP.setForeground(Color.BLACK);
		lblSanathkumarMP.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSanathkumarMP.setBounds(665, 344, 181, 37);
		getContentPane().add(lblSanathkumarMP);
		
		JLabel lblSumithDB = new JLabel("Sumith D B");
		lblSumithDB.setForeground(Color.BLACK);
		lblSumithDB.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSumithDB.setBounds(665, 387, 123, 29);
		getContentPane().add(lblSumithDB);
		
		JLabel lblRajuK = new JLabel("Raju K");
		lblRajuK.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblRajuK.setForeground(Color.BLACK);
		lblRajuK.setBounds(665, 426, 80, 37);
		getContentPane().add(lblRajuK);

	}
}
