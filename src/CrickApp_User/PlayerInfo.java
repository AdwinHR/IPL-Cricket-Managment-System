package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class PlayerInfo extends JInternalFrame {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerInfo frame = new PlayerInfo();
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
	public PlayerInfo() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("PlayerInformation");
		setClosable(true);
		setBounds(100, 100, 1431, 432);
		getContentPane().setLayout(null);
		
		JLabel lblEnterPlayerName = new JLabel("Enter Player Name");
		lblEnterPlayerName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnterPlayerName.setForeground(Color.BLACK);
		lblEnterPlayerName.setBounds(412, 93, 202, 31);
		getContentPane().add(lblEnterPlayerName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBackground(Color.WHITE);
		textField.setBounds(624, 95, 490, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		Button button = new Button("Get Information");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String x=textField.getText();
					String pname=x.toLowerCase();
					String Query1="select p.pname,p.role,p.age,p.season_score,p.SR,p.season_wicket,t.tname "
									+ "from player p,team t,player_of p1 "
									+ "where t.tid=p1.tid and p1.pid=p.pid and p.pname like '%"+pname+"%';";
					table.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(Query1)));
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		button.setBackground(Color.PINK);
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setForeground(Color.BLACK);
		button.setBounds(587, 169, 175, 31);
		getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 230, 1399, 113);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
	
}
