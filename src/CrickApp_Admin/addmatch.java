package CrickApp_Admin;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class addmatch extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmatch frame = new addmatch();
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
	public addmatch() {
		setBackground(Color.PINK);
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblTeam = new JLabel("Team 1");
		lblTeam.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeam.setForeground(Color.BLACK);
		lblTeam.setBounds(110, 65, 84, 36);
		getContentPane().add(lblTeam);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox1.setForeground(Color.BLACK);
		comboBox1.setBounds(193, 65, 351, 36);
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
		
		JLabel lblTeam_1 = new JLabel("Team 2");
		lblTeam_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeam_1.setForeground(Color.BLACK);
		lblTeam_1.setBounds(110, 130, 84, 36);
		getContentPane().add(lblTeam_1);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox2.setForeground(Color.BLACK);
		comboBox2.setBounds(193, 130, 351, 36);
		comboBox2.addItem("Royal Challengers Bangalore Cricket Team (RCB)");
		comboBox2.addItem("Chennai Super Kings Cricket Team (CSK)");
		comboBox2.addItem("Mumbai Indians Cricket Team (MI)");
		comboBox2.addItem("Delhi Capitals Cricket Team (DC)");
		comboBox2.addItem("Kings XI Punjab Cricket Team (KXIP)");
		comboBox2.addItem("Rajasthan Royals Cricket Team (RR)");
		comboBox2.addItem("Sunrisers Hyderabad Cricket Team (SHR)");
		comboBox2.addItem("Kolkata Knight Riders Cricket Team (KKR)");
		comboBox2.setSelectedItem(null);
		getContentPane().add(comboBox2);
		
		JLabel lblStadium = new JLabel("Stadium");
		lblStadium.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStadium.setForeground(Color.BLACK);
		lblStadium.setBounds(110, 195, 70, 36);
		getContentPane().add(lblStadium);
		
		JComboBox comboBox3 = new JComboBox();
		comboBox3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox3.setForeground(Color.BLACK);
		comboBox3.addItem("chinnaswamy stadium, Bengaluru");
		comboBox3.addItem("Wankhede Stadium, mumbai");
		comboBox3.addItem("M. A. Chidambaram Stadium, chennai");
		comboBox3.addItem("Eden Gardens, kolkata");
		comboBox3.addItem("RajivGandhi International Stadium, Hyderabad");
		comboBox3.addItem("Punjab Cricket Association IS Bindra Stadium, punjab");
		comboBox3.addItem("Feroz Shah Kotla Stadium, delhi");
		comboBox3.addItem("Sawai Mansingh Stadium, jaipur");
		comboBox3.setSelectedItem(null);
		comboBox3.setBounds(193, 197, 351, 36);
		getContentPane().add(comboBox3);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setForeground(Color.BLACK);
		lblDate.setBounds(110, 266, 90, 36);
		getContentPane().add(lblDate);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setForeground(Color.BLACK);
		textField.setBounds(193, 269, 351, 36);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblYyyymmdd = new JLabel("YYYY-MM-DD");
		lblYyyymmdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblYyyymmdd.setForeground(Color.DARK_GRAY);
		lblYyyymmdd.setBounds(554, 272, 84, 27);
		getContentPane().add(lblYyyymmdd);
		
		Button button = new Button("add match");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String team1=(String)comboBox1.getSelectedItem();
				String team2=(String)comboBox2.getSelectedItem();
				String stadium=(String)comboBox3.getSelectedItem();
				String date=textField.getText();
				int year=Integer.parseInt(date, 0, 4, 10);
				int month=Integer.parseInt(date, 5, 7, 10);
				int day=Integer.parseInt(date, 8, 10, 10);
				
				String Q10="select * from cmatch;";
				ResultSet rs10=Database.Retrieve(Q10);
				while(rs10.next()) {
					if(rs10.getString(2).equals(date)) {
						throw new Exception("match Exists on This date!");
					}
				}
				
				String Q11="select * from game_played;";
				ResultSet rs11=Database.Retrieve(Q11);
				while(rs11.next()) {
					if(rs11.getInt(3)==0) {
						throw new Exception("previous match is not finished!");
					}
				}
				
				if(team1==team2)
					throw new Exception("Invalid Team!");
				if(year!=2019)  {
					
					throw new Exception("Year should be 2019!");
				}
				if(month!=4 & month!=5){
					
					throw new Exception("month should be 4 or 5 in date!");
				}
				if(month==4 & day<21) {
				
					throw new Exception("Invalid day in date!(>21)");
				}
				
				if(team1.isEmpty() | team2.isEmpty() | stadium.isEmpty() | date.isEmpty())
					throw new Exception("Invalid Data!");
				
				String Q1="select * from team where tname='"+team1+"';";
				ResultSet rs1=Database.Retrieve(Q1);
				
				int tid1=0;
				while(rs1.next()) 
					tid1=rs1.getInt(1);
				
				String Q2="select * from team where tname='"+team2+"';";
				ResultSet rs2=Database.Retrieve(Q2);
				
				int tid2=0;
				while(rs2.next()) 
					tid2=rs2.getInt(1);
				
				String Q3="select * from cmatch";
				ResultSet rs3=Database.Retrieve(Q3);
				
				int matchid=0;
				while(rs3.next()) 
					matchid=rs3.getInt(1);
				
				String Q7="select * from game_played where tid in("+tid1+","+tid2+");";
				ResultSet rs7=Database.Retrieve(Q7);
				int[] p=new int[54];
				int[] q=new int[54];
				int r=0;
				while(rs7.next()) {
					if(r>54 | r==54)
						break;
					p[r]=rs7.getInt(1);
				    q[r]=rs7.getInt(2);
				    r++;
				}
				int count=0;
				for(int i=0;i<54;i++) {
					if(p[i]==0|q[i]==0)
						break;
					for(int j=0;j<54;j++) {
						if(p[j]==0|q[j]==0)
							break;
						if(q[i]!=q[j] & p[i]==p[j])
							count+=1;
					}
						
				}
				
				if(count>2) {
					
					throw new Exception("both teams are played their 2 matches on each other!");
				}
				
				String Q8="select * from cmatch where stadium='"+stadium+"';";
				ResultSet rs8=Database.Retrieve(Q8);
				
				int[] id=new int[2];
				while(rs8.next()) {
					String Q9="select tid from game_played where matchid="+rs8.getInt(1)+";";
					ResultSet rs9=Database.Retrieve(Q9);
					int e3=0;
					while(rs9.next()) {
						id[e3]=rs9.getInt(1);
						e3++;
					}
				}
					
				if((id[0]==tid1 & id[1]==tid2) | (id[0]==tid2 & id[1]==tid1)) {
					throw new Exception("both teams have already played match in this stadium!");
				}
				String Q4="insert into cmatch values("+(matchid+1)+",'"+date+"','"+stadium+"');";
				int x=Database.insertTable(Q4);
				
				String Q5="insert into game_played(matchid,tid) values("+(matchid+1)+","+tid1+");";
				String Q6="insert into game_played(matchid,tid) values("+(matchid+1)+","+tid2+");";
				int z=Database.insertTable(Q6);
				int y=Database.insertTable(Q5);
				
				if(x==1 & y==1 & z==1) 
					JOptionPane.showMessageDialog(button, "match added");
				else
					JOptionPane.showMessageDialog(button, "Invalid data!");
				
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(button, "Invalid Data!");
				}
			}
		});
		button.setBackground(Color.PINK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setForeground(Color.BLACK);
		button.setBounds(286, 359, 159, 36);
		getContentPane().add(button);
		setBounds(100, 100, 691, 485);

	}
}
