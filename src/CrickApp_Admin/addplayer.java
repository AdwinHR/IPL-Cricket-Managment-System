package CrickApp_Admin;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Choice;
import java.awt.TextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class addplayer extends JInternalFrame {
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addplayer frame = new addplayer();
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
	public addplayer() {
		setTitle("add player");
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblPlayerName = new JLabel("Player Name");
		lblPlayerName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlayerName.setForeground(Color.BLACK);
		lblPlayerName.setBounds(98, 45, 125, 29);
		getContentPane().add(lblPlayerName);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField1.setForeground(Color.BLACK);
		textField1.setBounds(233, 42, 309, 36);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAge.setForeground(Color.BLACK);
		lblAge.setBounds(98, 97, 125, 29);
		getContentPane().add(lblAge);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField2.setForeground(Color.BLACK);
		textField2.setBounds(233, 94, 309, 36);
		getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRole.setForeground(Color.BLACK);
		lblRole.setBounds(98, 150, 125, 29);
		getContentPane().add(lblRole);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setForeground(Color.BLACK);
		comboBox.addItem("Batsman");
		comboBox.addItem("Bowler");
		comboBox.addItem("Bating-Allrounder");
		comboBox.addItem("Bowling-Allrounder");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(233, 146, 307, 36);
		getContentPane().add(comboBox);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(233, 219, 309, 36);
		comboBox1.addItem("Royal Challengers Bangalore Cricket Team (RCB)");
		comboBox1.addItem("Chennai Super Kings Cricket Team (CSK)");
		comboBox1.addItem("Mumbai Indians Cricket Team (MI)");
		comboBox1.addItem("Delhi Capitals Cricket Team (DC)");
		comboBox1.addItem("Kings XI Punjab Cricket Team (KXIP)");
		comboBox1.addItem("Rajasthan Royals Cricket Team (RR)");
		comboBox1.addItem("Sunrisers Hyderabad Cricket Team (SHR)");
		comboBox1.addItem("Kolkata Knight Riders Cricket Team (KKR)");
		comboBox1.setSelectedItem(null);
		getContentPane().add(comboBox1);
		setBounds(100, 100, 672, 394);
		
		Button button = new Button("Add Player");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{String name=textField1.getText();
				int age = Integer.parseInt(textField2.getText());
				String role=(String)comboBox.getSelectedItem();
				String team=(String)comboBox1.getSelectedItem();
				String Q2="select * from player where pname='"+name+"';";
				ResultSet rs=Database.Retrieve(Q2);
				while(rs.next()) {
					if(rs.getString(2).isEmpty())
						continue;
					else {
						JOptionPane.showMessageDialog(button, "player Exist!");
						throw new NullPointerException();
					}
				}
				
				if(age<17 ) {
					JOptionPane.showMessageDialog(button, "Age cannot be lessthan 17!");
					throw new Exception("hi");
				}
				else if(name.isEmpty() | role.isEmpty()) {
					throw new NullPointerException();
				}
				
				String Q3="select * from player where pid=(select max(pid) from player);";
				ResultSet rs1=Database.Retrieve(Q3);
				int m=0;
				while(rs1.next()) {
					m=rs1.getInt(1);
				}
				String Q1="insert into player values("+(m+1)+",'"+name+"',"+age+",'"+role+"',0,0,0);";
				String Q4="select * from team where tname='"+team+"';";
				ResultSet rs2=Database.Retrieve(Q4);
				int tid=0;
				while(rs2.next()) {
					tid=rs2.getInt(1);
				}
				System.out.println(tid);
				
				String Q5="insert into player_of values("+(m+1)+","+tid+");";
				int x=Database.insertTable(Q1);
				int y=Database.insertTable(Q5);
				if(x==1 & y==1)
					JOptionPane.showMessageDialog(button, "Player additon successful");
				else
					JOptionPane.showMessageDialog(button, "player Exist!");
			}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(button, "Invalid Data!");
				}
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(Color.PINK);
		button.setBounds(246, 287, 197, 44);
		getContentPane().add(button);
		
		JLabel lblTeam = new JLabel("Team");
		lblTeam.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeam.setForeground(Color.BLACK);
		lblTeam.setBounds(98, 213, 130, 29);
		getContentPane().add(lblTeam);
		

	}
}
