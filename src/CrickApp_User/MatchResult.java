package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class MatchResult extends JInternalFrame {
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchResult frame = new MatchResult();
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
	public MatchResult() {
		setTitle("MatchPlayed");
		setClosable(true);
		setBounds(100, 100, 1190, 666);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 579, 349);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblTeam = new JLabel("Team 1");
		lblTeam.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeam.setForeground(Color.BLACK);
		lblTeam.setBounds(159, 10, 73, 36);
		getContentPane().add(lblTeam);
		
		JComboBox c1 = new JComboBox();
		c1.setBounds(226, 12, 287, 36);
		c1.addItem("Royal Challengers Bangalore Cricket Team (RCB)");
		c1.addItem("Chennai Super Kings Cricket Team (CSK)");
		c1.addItem("Mumbai Indians Cricket Team (MI)");
		c1.addItem("Delhi Capitals Cricket Team (DC)");
		c1.addItem("Kings XI Punjab Cricket Team (KXIP)");
		c1.addItem("Rajasthan Royals Cricket Team (RR)");
		c1.addItem("Sunrisers Hyderabad Cricket Team (SHR)");
		c1.addItem("Kolkata Knight Riders Cricket Team (KKR)");
		c1.setSelectedItem(null);
		getContentPane().add(c1);
		
		JLabel lblTeam_1 = new JLabel("Team 2");
		lblTeam_1.setForeground(Color.BLACK);
		lblTeam_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeam_1.setBounds(613, 10, 73, 36);
		getContentPane().add(lblTeam_1);
		
		JComboBox c2 = new JComboBox();
		c2.setBounds(686, 12, 287, 36);
		c2.addItem("Royal Challengers Bangalore Cricket Team (RCB)");
		c2.addItem("Chennai Super Kings Cricket Team (CSK)");
		c2.addItem("Mumbai Indians Cricket Team (MI)");
		c2.addItem("Delhi Capitals Cricket Team (DC)");
		c2.addItem("Kings XI Punjab Cricket Team (KXIP)");
		c2.addItem("Rajasthan Royals Cricket Team (RR)");
		c2.addItem("Sunrisers Hyderabad Cricket Team (SHR)");
		c2.addItem("Kolkata Knight Riders Cricket Team (KKR)");
		c2.setSelectedItem(null);
		getContentPane().add(c2);
		
		JLabel lblStadium = new JLabel("Date");
		lblStadium.setForeground(Color.BLACK);
		lblStadium.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStadium.setBounds(403, 58, 50, 36);
		getContentPane().add(lblStadium);
		
		JTextField c3 = new JTextField();
		c3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c3.setForeground(Color.BLACK);
		c3.setText("2019-04-");
		c3.setBounds(454, 58, 287, 36);
		getContentPane().add(c3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(600, 170, 568, 349);
		getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel l1 = new JLabel("");
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setForeground(Color.BLACK);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(10, 136, 579, 36);
		getContentPane().add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setForeground(Color.BLACK);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setBounds(599, 136, 579, 36);
		getContentPane().add(l2);
		
		JLabel lr = new JLabel("");
		lr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lr.setForeground(Color.BLACK);
		lr.setHorizontalAlignment(SwingConstants.CENTER);
		lr.setBounds(279, 544, 677, 49);
		getContentPane().add(lr);
		
		
		Button button = new Button("Get Results");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String team1=(String) c1.getSelectedItem();
					String team2=(String) c2.getSelectedItem();
					if(team1==team2) 
						throw new Exception("same team");
					String date=c3.getText();
					
					String q1="select * from team";
					ResultSet rs1=Database.Retrieve(q1);	
					
					int tid1=0,tid2=0;
					while(rs1.next()) {
						if(team1.equals(rs1.getString(2)))
							tid1=rs1.getInt(1);
						if(team2.equals(rs1.getString(2)))
							tid2=rs1.getInt(1);
					}
					
					if(tid1==0 && tid2==0) 
						throw new Exception("invalid tid");
					
					String q2="select c.matchid,g.result from game_played g,cmatch c where c.matchid=g.matchid and g.tid="+tid1+" and c.date='"+date+"';";
					ResultSet rs2=Database.Retrieve(q2);
					
					int matchid=0;
					String r=null;
					while(rs2.next()) {
						matchid=rs2.getInt(1);
						r=rs2.getString(2);
					}
					if(matchid==0)
						throw new Exception("invalid match id");
					
					String q3="select p.pid as player_id,p1.pname as player,p.pscore as score,p.pwicket as wickets,p.SR as strike_rate "
							+ "from played p,player_of t,player p1"
							+ " where p.pid=t.pid and t.tid="+tid1+" and p.matchid="+matchid+" and p1.pid=t.pid";
					l1.setText(team1);
					table.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(q3)));
					
					String q4="select p.pid as player_id,p1.pname as player,p.pscore as score,p.pwicket as wickets,p.SR as strike_rate "
							+ "from played p,player_of t,player p1"
							+ " where p.pid=t.pid and t.tid="+tid2+" and p.matchid="+matchid+" and p1.pid=t.pid;";
					l2.setText(team2);
					table_1.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(q4)));
				
					if(r.equals("WON"))
						lr.setText("Result :-  "+team1+"  WON");
					else
						lr.setText("Result :-  "+team2+"  WON");
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(getParent(), "Match not found!");
				}
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(525, 100, 126, 36);
		getContentPane().add(button);

	}
}
