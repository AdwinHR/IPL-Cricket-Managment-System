package CrickApp_Admin;

import java.awt.EventQueue;
import java.sql.ResultSet;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addmatchresult extends JInternalFrame {
	private JTable table;
	private JTable table_1;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;
	private JTextField textField9;
	private JTextField textField10;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField13;
	private JTextField textField14;
	private JTextField textField15;
	private JTextField textField16;
	private JTextField textField17;
	private JTextField textField18;
	private JTextField textField19;
	private JTextField textField20;
	private JTextField textField21;
	private JTextField textField22;
	private JLabel label;
	private JTextField textFields1;
	private JTextField textFields2;
	private JTextField textFields3;
	private JTextField textFields4;
	private JTextField textFields5;
	private JTextField textFields6;
	private JTextField textFields7;
	private JTextField textFields8;
	private JTextField textFields9;
	private JTextField textFields10;
	private JTextField textFields11;
	private JTextField textFieldw1;
	private JTextField textFieldw2;
	private JTextField textFieldw3;
	private JTextField textFieldw4;
	private JTextField textFieldw5;
	private JTextField textFieldw6;
	private JTextField textFieldw7;
	private JTextField textFieldw8;
	private JTextField textFieldw9;
	private JTextField textFieldw10;
	private JTextField textFieldw11;
	private JLabel lblId;
	private JLabel lblRuns;
	private JLabel lblWickets;
	private JLabel label_1;
	private JTextField textFields12;
	private JTextField textFields13;
	private JTextField textFields14;
	private JTextField textFields15;
	private JTextField textFields16;
	private JTextField textFields17;
	private JTextField textFields18;
	private JTextField textFields19;
	private JTextField textFields20;
	private JTextField textFields21;
	private JTextField textFields22;
	private JTextField textFieldw12;
	private JTextField textFieldw13;
	private JTextField textFieldw14;
	private JTextField textFieldw15;
	private JTextField textFieldw16;
	private JTextField textFieldw17;
	private JTextField textFieldw18;
	private JTextField textFieldw19;
	private JTextField textFieldw20;
	private JTextField textFieldw21;
	private JTextField textFieldw22;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textFieldscore1;
	private JTextField textFieldscore2;
	private JTextField sr1;
	private JTextField sr2;
	private JTextField sr3;
	private JTextField sr4;
	private JTextField sr5;
	private JTextField sr6;
	private JTextField sr7;
	private JTextField sr8;
	private JTextField sr9;
	private JTextField sr10;
	private JTextField sr11;
	private JTextField sr12;
	private JTextField sr13;
	private JTextField sr14;
	private JTextField sr15;
	private JTextField sr16;
	private JTextField sr17;
	private JTextField sr18;
	private JTextField sr19;
	private JTextField sr20;
	private JTextField sr21;
	private JTextField sr22;
	private JLabel lblStrikerate;
	private JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmatchresult frame = new addmatchresult();
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
	public addmatchresult() {
		setMaximizable(true);
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setTitle("match result");
		setClosable(true);
		setBounds(100, 100, 1516, 701);
		getContentPane().setLayout(null);
		
		textFields11 = new JTextField();
		textFields11.setForeground(Color.BLACK);
		textFields11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields11.setColumns(10);
		textFields11.setBounds(447, 469, 96, 35);
		getContentPane().add(textFields11);
		
		textFields10 = new JTextField();
		textFields10.setForeground(Color.BLACK);
		textFields10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields10.setColumns(10);
		textFields10.setBounds(447, 436, 96, 32);
		getContentPane().add(textFields10);
		
		textFields9 = new JTextField();
		textFields9.setForeground(Color.BLACK);
		textFields9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields9.setColumns(10);
		textFields9.setBounds(447, 407, 96, 32);
		getContentPane().add(textFields9);
		
		textFields8 = new JTextField();
		textFields8.setForeground(Color.BLACK);
		textFields8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields8.setColumns(10);
		textFields8.setBounds(447, 372, 96, 35);
		getContentPane().add(textFields8);
		
		textFields7 = new JTextField();
		textFields7.setForeground(Color.BLACK);
		textFields7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields7.setColumns(10);
		textFields7.setBounds(447, 338, 96, 35);
		getContentPane().add(textFields7);
		
		textFields6 = new JTextField();
		textFields6.setForeground(Color.BLACK);
		textFields6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields6.setColumns(10);
		textFields6.setBounds(447, 303, 96, 35);
		getContentPane().add(textFields6);
		
		textFields5 = new JTextField();
		textFields5.setForeground(Color.BLACK);
		textFields5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields5.setColumns(10);
		textFields5.setBounds(447, 269, 96, 35);
		getContentPane().add(textFields5);
		
		textFields4 = new JTextField();
		textFields4.setForeground(Color.BLACK);
		textFields4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields4.setColumns(10);
		textFields4.setBounds(447, 235, 96, 35);
		getContentPane().add(textFields4);
		
		textFields3 = new JTextField();
		textFields3.setForeground(Color.BLACK);
		textFields3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields3.setColumns(10);
		textFields3.setBounds(447, 201, 96, 35);
		getContentPane().add(textFields3);
		
		textFields2 = new JTextField();
		textFields2.setForeground(Color.BLACK);
		textFields2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields2.setColumns(10);
		textFields2.setBounds(447, 167, 96, 35);
		getContentPane().add(textFields2);
		
		textFields1 = new JTextField();
		textFields1.setForeground(Color.BLACK);
		textFields1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields1.setColumns(10);
		textFields1.setBounds(447, 133, 96, 35);
		getContentPane().add(textFields1);
		
		JLabel lblTeam = new JLabel("");
		lblTeam.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeam.setForeground(Color.BLACK);
		lblTeam.setBounds(10, 31, 416, 35);
		lblTeam.setText("team1");
		getContentPane().add(lblTeam);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setForeground(Color.BLACK);
		label.setBounds(480, 10, 569, 59);
		getContentPane().add(label);
		
		JLabel lblTeam_1 = new JLabel("team2");
		lblTeam_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeam_1.setForeground(Color.BLACK);
		lblTeam_1.setBounds(1078, 31, 416, 35);
		getContentPane().add(lblTeam_1);
		
		int[] tid=new int[2];
		try {
			String Q1="select * from game_played where score=0";
			ResultSet rs1=Database.Retrieve(Q1);
			
			int e3=0;
			while(rs1.next()) {
				tid[e3]=rs1.getInt(2);
				e3++;
			}
			String Q2="select * from team where tid="+tid[0]+";";
			ResultSet rs2=Database.Retrieve(Q2);
			
			String tname1="",tname2="";
			while(rs2.next()) {
				tname1=rs2.getString(2);
			}
			
			if(tname1.equals(""))
				throw new Exception("no match found");
			
			String Q4="select * from team where tid="+tid[1]+";";
			ResultSet rs4=Database.Retrieve(Q4);
			
			while(rs4.next()) {
				tname2=rs4.getString(2);
			}
			
			lblTeam.setText(tname1);
			lblTeam_1.setText(tname2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(getParent(), e);
			label.setText("Currently no IPL match is going on!");
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 314, 439);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(1112, 65, 314, 439);
		getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		try {
		String Q2="select pid as Player_id,pname as Player_name,role from player where pid in (select pid from player_of where tid="+tid[0]+");";
		ResultSet rs2=Database.Retrieve(Q2);
		
		table.setModel(DbUtils.resultSetToTableModel(rs2));
		
		String Q3="select pid as Player_id,pname as Player_name,role from player where pid in (select pid from player_of where tid="+tid[1]+");";
		ResultSet rs3=Database.Retrieve(Q3);
		
		table_1.setModel(DbUtils.resultSetToTableModel(rs3));
		
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(getParent(), e1);
		}
		
		JLabel lblSelectPlayers = new JLabel("Select Players");
		lblSelectPlayers.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelectPlayers.setForeground(Color.BLACK);
		lblSelectPlayers.setBounds(659, 55, 135, 32);
		getContentPane().add(lblSelectPlayers);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField1.setForeground(Color.BLACK);
		textField1.setBounds(352, 133, 96, 35);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setForeground(Color.BLACK);
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField2.setColumns(10);
		textField2.setBounds(352, 167, 96, 35);
		getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setForeground(Color.BLACK);
		textField3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField3.setColumns(10);
		textField3.setBounds(352, 201, 96, 35);
		getContentPane().add(textField3);
		
		textField4 = new JTextField();
		textField4.setForeground(Color.BLACK);
		textField4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField4.setColumns(10);
		textField4.setBounds(352, 235, 96, 35);
		getContentPane().add(textField4);
		
		textField6 = new JTextField();
		textField6.setForeground(Color.BLACK);
		textField6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField6.setColumns(10);
		textField6.setBounds(352, 303, 96, 35);
		getContentPane().add(textField6);
		
		textField5 = new JTextField();
		textField5.setForeground(Color.BLACK);
		textField5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField5.setColumns(10);
		textField5.setBounds(352, 269, 96, 35);
		getContentPane().add(textField5);
		
		textField7 = new JTextField();
		textField7.setForeground(Color.BLACK);
		textField7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField7.setColumns(10);
		textField7.setBounds(352, 338, 96, 35);
		getContentPane().add(textField7);
		
		textField8 = new JTextField();
		textField8.setForeground(Color.BLACK);
		textField8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField8.setColumns(10);
		textField8.setBounds(352, 372, 96, 35);
		getContentPane().add(textField8);
		
		textField9 = new JTextField();
		textField9.setForeground(Color.BLACK);
		textField9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField9.setColumns(10);
		textField9.setBounds(352, 404, 96, 35);
		getContentPane().add(textField9);
		
		textField10 = new JTextField();
		textField10.setForeground(Color.BLACK);
		textField10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField10.setColumns(10);
		textField10.setBounds(352, 433, 96, 35);
		getContentPane().add(textField10);
		
		textField11 = new JTextField();
		textField11.setForeground(Color.BLACK);
		textField11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField11.setColumns(10);
		textField11.setBounds(352, 469, 96, 35);
		getContentPane().add(textField11);
		
		textField12 = new JTextField();
		textField12.setForeground(Color.BLACK);
		textField12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField12.setColumns(10);
		textField12.setBounds(739, 133, 96, 35);
		getContentPane().add(textField12);
		
		textField13 = new JTextField();
		textField13.setForeground(Color.BLACK);
		textField13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField13.setColumns(10);
		textField13.setBounds(739, 167, 96, 35);
		getContentPane().add(textField13);
		
		textField14 = new JTextField();
		textField14.setForeground(Color.BLACK);
		textField14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField14.setColumns(10);
		textField14.setBounds(739, 201, 96, 35);
		getContentPane().add(textField14);
		
		textField15 = new JTextField();
		textField15.setForeground(Color.BLACK);
		textField15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField15.setColumns(10);
		textField15.setBounds(739, 235, 96, 35);
		getContentPane().add(textField15);
		
		textField16 = new JTextField();
		textField16.setForeground(Color.BLACK);
		textField16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField16.setColumns(10);
		textField16.setBounds(739, 269, 96, 35);
		getContentPane().add(textField16);
		
		textField17 = new JTextField();
		textField17.setForeground(Color.BLACK);
		textField17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField17.setColumns(10);
		textField17.setBounds(739, 303, 96, 35);
		getContentPane().add(textField17);
		
		textField18 = new JTextField();
		textField18.setForeground(Color.BLACK);
		textField18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField18.setColumns(10);
		textField18.setBounds(739, 338, 96, 35);
		getContentPane().add(textField18);
		
		textField19 = new JTextField();
		textField19.setForeground(Color.BLACK);
		textField19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField19.setColumns(10);
		textField19.setBounds(739, 372, 96, 35);
		getContentPane().add(textField19);
		
		textField20 = new JTextField();
		textField20.setForeground(Color.BLACK);
		textField20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField20.setColumns(10);
		textField20.setBounds(739, 405, 96, 35);
		getContentPane().add(textField20);
		
		textField21 = new JTextField();
		textField21.setForeground(Color.BLACK);
		textField21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField21.setColumns(10);
		textField21.setBounds(739, 434, 96, 35);
		getContentPane().add(textField21);
		
		textField22 = new JTextField();
		textField22.setForeground(Color.BLACK);
		textField22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField22.setColumns(10);
		textField22.setBounds(739, 469, 96, 35);
		getContentPane().add(textField22);
		
		textFieldw1 = new JTextField();
		textFieldw1.setForeground(Color.BLACK);
		textFieldw1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw1.setColumns(10);
		textFieldw1.setBounds(541, 133, 86, 35);
		getContentPane().add(textFieldw1);
		
		textFieldw2 = new JTextField();
		textFieldw2.setForeground(Color.BLACK);
		textFieldw2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw2.setColumns(10);
		textFieldw2.setBounds(541, 167, 86, 35);
		getContentPane().add(textFieldw2);
		
		textFieldw3 = new JTextField();
		textFieldw3.setForeground(Color.BLACK);
		textFieldw3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw3.setColumns(10);
		textFieldw3.setBounds(541, 201, 86, 35);
		getContentPane().add(textFieldw3);
		
		textFieldw4 = new JTextField();
		textFieldw4.setForeground(Color.BLACK);
		textFieldw4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw4.setColumns(10);
		textFieldw4.setBounds(541, 235, 86, 35);
		getContentPane().add(textFieldw4);
		
		textFieldw5 = new JTextField();
		textFieldw5.setForeground(Color.BLACK);
		textFieldw5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw5.setColumns(10);
		textFieldw5.setBounds(541, 269, 86, 35);
		getContentPane().add(textFieldw5);
		
		textFieldw6 = new JTextField();
		textFieldw6.setForeground(Color.BLACK);
		textFieldw6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw6.setColumns(10);
		textFieldw6.setBounds(541, 303, 86, 35);
		getContentPane().add(textFieldw6);
		
		textFieldw7 = new JTextField();
		textFieldw7.setForeground(Color.BLACK);
		textFieldw7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw7.setColumns(10);
		textFieldw7.setBounds(541, 338, 86, 35);
		getContentPane().add(textFieldw7);
		
		textFieldw8 = new JTextField();
		textFieldw8.setForeground(Color.BLACK);
		textFieldw8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw8.setColumns(10);
		textFieldw8.setBounds(541, 372, 86, 35);
		getContentPane().add(textFieldw8);
		
		textFieldw9 = new JTextField();
		textFieldw9.setForeground(Color.BLACK);
		textFieldw9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw9.setColumns(10);
		textFieldw9.setBounds(541, 404, 86, 35);
		getContentPane().add(textFieldw9);
		
		textFieldw10 = new JTextField();
		textFieldw10.setForeground(Color.BLACK);
		textFieldw10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw10.setColumns(10);
		textFieldw10.setBounds(541, 433, 86, 35);
		getContentPane().add(textFieldw10);
		
		textFieldw11 = new JTextField();
		textFieldw11.setForeground(Color.BLACK);
		textFieldw11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw11.setColumns(10);
		textFieldw11.setBounds(541, 469, 86, 35);
		getContentPane().add(textFieldw11);
		
		lblId = new JLabel("id");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblId.setForeground(Color.BLACK);
		lblId.setBounds(386, 104, 51, 32);
		getContentPane().add(lblId);
		
		lblRuns = new JLabel("Runs");
		lblRuns.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRuns.setForeground(Color.BLACK);
		lblRuns.setBounds(458, 100, 51, 41);
		getContentPane().add(lblRuns);
		
		lblWickets = new JLabel("Wickets");
		lblWickets.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWickets.setForeground(Color.BLACK);
		lblWickets.setBounds(541, 104, 73, 32);
		getContentPane().add(lblWickets);
		
		label_1 = new JLabel("id");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(767, 104, 51, 32);
		getContentPane().add(label_1);
		
		textFields12 = new JTextField();
		textFields12.setForeground(Color.BLACK);
		textFields12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields12.setColumns(10);
		textFields12.setBounds(833, 133, 86, 35);
		getContentPane().add(textFields12);
		
		textFields13 = new JTextField();
		textFields13.setForeground(Color.BLACK);
		textFields13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields13.setColumns(10);
		textFields13.setBounds(833, 167, 86, 35);
		getContentPane().add(textFields13);
		
		textFields14 = new JTextField();
		textFields14.setForeground(Color.BLACK);
		textFields14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields14.setColumns(10);
		textFields14.setBounds(833, 201, 86, 35);
		getContentPane().add(textFields14);
		
		textFields15 = new JTextField();
		textFields15.setForeground(Color.BLACK);
		textFields15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields15.setColumns(10);
		textFields15.setBounds(833, 235, 86, 35);
		getContentPane().add(textFields15);
		
		textFields16 = new JTextField();
		textFields16.setForeground(Color.BLACK);
		textFields16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields16.setColumns(10);
		textFields16.setBounds(833, 269, 86, 35);
		getContentPane().add(textFields16);
		
		textFields17 = new JTextField();
		textFields17.setForeground(Color.BLACK);
		textFields17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields17.setColumns(10);
		textFields17.setBounds(833, 303, 86, 35);
		getContentPane().add(textFields17);
		
		textFields18 = new JTextField();
		textFields18.setForeground(Color.BLACK);
		textFields18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields18.setColumns(10);
		textFields18.setBounds(833, 338, 86, 35);
		getContentPane().add(textFields18);
		
		textFields19 = new JTextField();
		textFields19.setForeground(Color.BLACK);
		textFields19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields19.setColumns(10);
		textFields19.setBounds(833, 372, 86, 35);
		getContentPane().add(textFields19);
		
		textFields20 = new JTextField();
		textFields20.setForeground(Color.BLACK);
		textFields20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields20.setColumns(10);
		textFields20.setBounds(833, 405, 86, 35);
		getContentPane().add(textFields20);
		
		textFields21 = new JTextField();
		textFields21.setForeground(Color.BLACK);
		textFields21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields21.setColumns(10);
		textFields21.setBounds(833, 434, 86, 35);
		getContentPane().add(textFields21);
		
		textFields22 = new JTextField();
		textFields22.setForeground(Color.BLACK);
		textFields22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFields22.setColumns(10);
		textFields22.setBounds(833, 469, 86, 35);
		getContentPane().add(textFields22);
		
		textFieldw12 = new JTextField();
		textFieldw12.setForeground(Color.BLACK);
		textFieldw12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw12.setColumns(10);
		textFieldw12.setBounds(919, 133, 86, 35);
		getContentPane().add(textFieldw12);
		
		textFieldw13 = new JTextField();
		textFieldw13.setForeground(Color.BLACK);
		textFieldw13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw13.setColumns(10);
		textFieldw13.setBounds(919, 167, 86, 35);
		getContentPane().add(textFieldw13);
		
		textFieldw14 = new JTextField();
		textFieldw14.setForeground(Color.BLACK);
		textFieldw14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw14.setColumns(10);
		textFieldw14.setBounds(919, 201, 86, 35);
		getContentPane().add(textFieldw14);
		
		textFieldw15 = new JTextField();
		textFieldw15.setForeground(Color.BLACK);
		textFieldw15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw15.setColumns(10);
		textFieldw15.setBounds(919, 235, 86, 35);
		getContentPane().add(textFieldw15);
		
		textFieldw16 = new JTextField();
		textFieldw16.setForeground(Color.BLACK);
		textFieldw16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw16.setColumns(10);
		textFieldw16.setBounds(919, 269, 86, 35);
		getContentPane().add(textFieldw16);
		
		textFieldw17 = new JTextField();
		textFieldw17.setForeground(Color.BLACK);
		textFieldw17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw17.setColumns(10);
		textFieldw17.setBounds(919, 303, 86, 35);
		getContentPane().add(textFieldw17);
		
		textFieldw18 = new JTextField();
		textFieldw18.setForeground(Color.BLACK);
		textFieldw18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw18.setColumns(10);
		textFieldw18.setBounds(919, 338, 86, 35);
		getContentPane().add(textFieldw18);
		
		textFieldw19 = new JTextField();
		textFieldw19.setForeground(Color.BLACK);
		textFieldw19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw19.setColumns(10);
		textFieldw19.setBounds(919, 372, 86, 35);
		getContentPane().add(textFieldw19);
		
		textFieldw20 = new JTextField();
		textFieldw20.setForeground(Color.BLACK);
		textFieldw20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw20.setColumns(10);
		textFieldw20.setBounds(919, 405, 86, 35);
		getContentPane().add(textFieldw20);
		
		textFieldw21 = new JTextField();
		textFieldw21.setForeground(Color.BLACK);
		textFieldw21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw21.setColumns(10);
		textFieldw21.setBounds(919, 434, 86, 35);
		getContentPane().add(textFieldw21);
		
		textFieldw22 = new JTextField();
		textFieldw22.setForeground(Color.BLACK);
		textFieldw22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldw22.setColumns(10);
		textFieldw22.setBounds(919, 469, 86, 35);
		getContentPane().add(textFieldw22);
		
		label_2 = new JLabel("Runs");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(838, 100, 51, 41);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("Wickets");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(919, 104, 73, 32);
		getContentPane().add(label_3);
		
		textFieldscore1 = new JTextField();
		textFieldscore1.setBounds(417, 533, 149, 32);
		getContentPane().add(textFieldscore1);
		textFieldscore1.setColumns(10);
		
		textFieldscore2 = new JTextField();
		textFieldscore2.setColumns(10);
		textFieldscore2.setBounds(814, 533, 149, 32);
		getContentPane().add(textFieldscore2);
		
		sr1 = new JTextField();
		sr1.setBounds(625, 133, 73, 35);
		getContentPane().add(sr1);
		sr1.setColumns(10);
		
		sr2 = new JTextField();
		sr2.setColumns(10);
		sr2.setBounds(625, 167, 73, 35);
		getContentPane().add(sr2);
		
		sr3 = new JTextField();
		sr3.setColumns(10);
		sr3.setBounds(625, 201, 73, 35);
		getContentPane().add(sr3);
		
		sr4 = new JTextField();
		sr4.setColumns(10);
		sr4.setBounds(625, 235, 73, 35);
		getContentPane().add(sr4);
		
		sr5 = new JTextField();
		sr5.setColumns(10);
		sr5.setBounds(625, 269, 73, 35);
		getContentPane().add(sr5);
		
		sr6 = new JTextField();
		sr6.setColumns(10);
		sr6.setBounds(625, 303, 73, 35);
		getContentPane().add(sr6);
		
		sr7 = new JTextField();
		sr7.setColumns(10);
		sr7.setBounds(625, 338, 73, 35);
		getContentPane().add(sr7);
		
		sr8 = new JTextField();
		sr8.setColumns(10);
		sr8.setBounds(625, 372, 73, 35);
		getContentPane().add(sr8);
		
		sr9 = new JTextField();
		sr9.setColumns(10);
		sr9.setBounds(625, 404, 73, 35);
		getContentPane().add(sr9);
		
		sr10 = new JTextField();
		sr10.setColumns(10);
		sr10.setBounds(625, 436, 73, 35);
		getContentPane().add(sr10);
		
		sr11 = new JTextField();
		sr11.setColumns(10);
		sr11.setBounds(625, 469, 73, 35);
		getContentPane().add(sr11);
		
		sr12 = new JTextField();
		sr12.setColumns(10);
		sr12.setBounds(1005, 133, 73, 35);
		getContentPane().add(sr12);
		
		sr13 = new JTextField();
		sr13.setColumns(10);
		sr13.setBounds(1005, 167, 73, 35);
		getContentPane().add(sr13);
		
		sr14 = new JTextField();
		sr14.setColumns(10);
		sr14.setBounds(1005, 201, 73, 35);
		getContentPane().add(sr14);
		
		sr15 = new JTextField();
		sr15.setColumns(10);
		sr15.setBounds(1005, 235, 73, 35);
		getContentPane().add(sr15);
		
		sr16 = new JTextField();
		sr16.setColumns(10);
		sr16.setBounds(1005, 269, 73, 35);
		getContentPane().add(sr16);
		
		sr17 = new JTextField();
		sr17.setColumns(10);
		sr17.setBounds(1005, 303, 73, 35);
		getContentPane().add(sr17);
		
		sr18 = new JTextField();
		sr18.setColumns(10);
		sr18.setBounds(1005, 338, 73, 35);
		getContentPane().add(sr18);
		
		sr19 = new JTextField();
		sr19.setColumns(10);
		sr19.setBounds(1005, 372, 73, 35);
		getContentPane().add(sr19);
		
		sr20 = new JTextField();
		sr20.setColumns(10);
		sr20.setBounds(1005, 407, 73, 35);
		getContentPane().add(sr20);
		
		sr21 = new JTextField();
		sr21.setColumns(10);
		sr21.setBounds(1005, 436, 73, 35);
		getContentPane().add(sr21);
		
		sr22 = new JTextField();
		sr22.setColumns(10);
		sr22.setBounds(1005, 469, 73, 35);
		getContentPane().add(sr22);
		
		Button button = new Button("Add result");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int p1=Integer.parseInt(textField1.getText());
				int p2=Integer.parseInt(textField2.getText());
				int p3=Integer.parseInt(textField3.getText());
				int p4=Integer.parseInt(textField4.getText());
				int p5=Integer.parseInt(textField5.getText());
				int p6=Integer.parseInt(textField6.getText());
				int p7=Integer.parseInt(textField7.getText());
				int p8=Integer.parseInt(textField8.getText());
				int p9=Integer.parseInt(textField9.getText());
				int p10=Integer.parseInt(textField10.getText());
				int p11=Integer.parseInt(textField11.getText());
				int p12=Integer.parseInt(textField12.getText());
				int p13=Integer.parseInt(textField13.getText());
				int p14=Integer.parseInt(textField14.getText());
				int p15=Integer.parseInt(textField15.getText());
				int p16=Integer.parseInt(textField16.getText());
				int p17=Integer.parseInt(textField17.getText());
				int p18=Integer.parseInt(textField18.getText());
				int p19=Integer.parseInt(textField19.getText());
				int p20=Integer.parseInt(textField20.getText());
				int p21=Integer.parseInt(textField21.getText());
				int p22=Integer.parseInt(textField22.getText());
				int s1=Integer.parseInt(textFields1.getText());
				int s2=Integer.parseInt(textFields2.getText());
				int s3=Integer.parseInt(textFields3.getText());
				int s4=Integer.parseInt(textFields4.getText());
				int s5=Integer.parseInt(textFields5.getText());
				int s6=Integer.parseInt(textFields6.getText());
				int s7=Integer.parseInt(textFields7.getText());
				int s8=Integer.parseInt(textFields8.getText());
				int s9=Integer.parseInt(textFields9.getText());
				int s10=Integer.parseInt(textFields10.getText());
				int s11=Integer.parseInt(textFields11.getText());
				int s12=Integer.parseInt(textFields12.getText());
				int s13=Integer.parseInt(textFields13.getText());
				int s14=Integer.parseInt(textFields14.getText());
				int s15=Integer.parseInt(textFields15.getText());
				int s16=Integer.parseInt(textFields16.getText());
				int s17=Integer.parseInt(textFields17.getText());
				int s18=Integer.parseInt(textFields18.getText());
				int s19=Integer.parseInt(textFields19.getText());
				int s20=Integer.parseInt(textFields20.getText());
				int s21=Integer.parseInt(textFields21.getText());
				int s22=Integer.parseInt(textFields22.getText());
				int w1=Integer.parseInt(textFieldw1.getText());
				int w2=Integer.parseInt(textFieldw2.getText());
				int w3=Integer.parseInt(textFieldw3.getText());
				int w4=Integer.parseInt(textFieldw4.getText());
				int w5=Integer.parseInt(textFieldw5.getText());
				int w6=Integer.parseInt(textFieldw6.getText());
				int w7=Integer.parseInt(textFieldw7.getText());
				int w8=Integer.parseInt(textFieldw8.getText());
				int w9=Integer.parseInt(textFieldw9.getText());
				int w10=Integer.parseInt(textFieldw10.getText());
				int w11=Integer.parseInt(textFieldw11.getText());
				int w12=Integer.parseInt(textFieldw12.getText());
				int w13=Integer.parseInt(textFieldw13.getText());
				int w14=Integer.parseInt(textFieldw14.getText());
				int w15=Integer.parseInt(textFieldw15.getText());
				int w16=Integer.parseInt(textFieldw16.getText());
				int w17=Integer.parseInt(textFieldw17.getText());
				int w18=Integer.parseInt(textFieldw18.getText());
				int w19=Integer.parseInt(textFieldw19.getText());
				int w20=Integer.parseInt(textFieldw20.getText());
				int w21=Integer.parseInt(textFieldw21.getText());
				int w22=Integer.parseInt(textFieldw22.getText());
				double r1=Integer.parseInt(sr1.getText());
				double r2=Integer.parseInt(sr2.getText());
				double r3=Integer.parseInt(sr3.getText());
				double r4=Integer.parseInt(sr4.getText());
				double r5=Integer.parseInt(sr5.getText());
				double r6=Integer.parseInt(sr6.getText());
				double r7=Integer.parseInt(sr7.getText());
				double r8=Integer.parseInt(sr8.getText());
				double r9=Integer.parseInt(sr9.getText());
				double r10=Integer.parseInt(sr10.getText());
				double r11=Integer.parseInt(sr11.getText());
				double r12=Integer.parseInt(sr12.getText());
				double r13=Integer.parseInt(sr13.getText());
				double r14=Integer.parseInt(sr14.getText());
				double r15=Integer.parseInt(sr15.getText());
				double r16=Integer.parseInt(sr16.getText());
				double r17=Integer.parseInt(sr17.getText());
				double r18=Integer.parseInt(sr18.getText());
				double r19=Integer.parseInt(sr19.getText());
				double r20=Integer.parseInt(sr20.getText());
				double r21=Integer.parseInt(sr21.getText());
				double r22=Integer.parseInt(sr22.getText());
				
				int[] a=new int[23];
				int[] c=new int[23];
				int[] d=new int[23];
				double[] r=new double[23];
				a[0]=0;a[1]=p1;a[2]=p2;a[3]=p3;a[4]=p4;a[5]=p5;a[6]=p6;a[7]=p7;a[8]=p8;a[9]=p9;a[10]=p10;a[11]=p11;a[12]=p12;a[13]=p13;
				a[14]=p14;a[15]=p15;a[16]=p16;a[17]=p17;a[18]=p18;a[19]=p19;a[20]=p20;a[21]=p21;a[22]=p22;
				
				c[0]=0;c[1]=s1;c[2]=s2;c[3]=s3;c[4]=s4;c[5]=s5;c[6]=s6;c[7]=s7;c[8]=s8;c[9]=s9;c[10]=s10;c[11]=s11;
				c[12]=s12;c[13]=s13;c[14]=s14;c[15]=s15;c[16]=s16;c[17]=s17;c[18]=s18;c[19]=s19;c[20]=s19;c[21]=s21;c[22]=s22;
				
				d[0]=0;d[1]=w1;d[2]=w2;d[3]=w3;d[4]=w4;d[5]=w5;d[6]=w6;d[7]=w7;d[8]=w8;d[9]=w9;d[10]=w10;d[11]=w11;
				d[12]=w12;d[13]=w13;d[14]=w14;d[15]=w15;d[16]=w16;d[17]=w17;d[18]=w18;d[19]=w19;d[20]=w20;d[21]=w21;d[22]=w22;
				
				r[0]=0;r[1]=r1;r[2]=r2;r[3]=r3;r[4]=r4;r[5]=r5;r[6]=r6;r[7]=r7;r[8]=r8;r[9]=r9;r[10]=r10;r[11]=r11;
				r[12]=r12;r[13]=r13;r[14]=r14;r[15]=r15;r[16]=r16;r[17]=r17;r[18]=r18;r[19]=r19;r[20]=r20;r[21]=r21;r[22]=r22;
				
				for(int j=0;j<23;j++)
					if(a[j]<0 | c[j]<0 | d[j]<0 | r[j]<0)
						throw new Exception("negetive value!");
				for(int i=0;i<23;i++) 
					for(int j=i+1;j<23;j++) 
						if(a[i]==a[j]) { 
							throw new Exception("Duplicate Entry found!"); 
							}
				String Q5="select * from player_of where tid ="+tid[0]+";";
				ResultSet rs5=Database.Retrieve(Q5);
				
				int[] b=new int[25];
				int i=1;
				while(rs5.next()) {
					b[i]=rs5.getInt(1);
					i++;
				}
				
				String Q6="select * from player_of where tid ="+tid[1]+";";
				ResultSet rs6=Database.Retrieve(Q6);
				
				int[] m=new int[25];
				int i3=1;
				while(rs6.next()) {
					m[i3]=rs6.getInt(1);
					i3++;
				}
			
				for(int i1=1;i1<12;i1++) {
					int count=0;
					for(int j=1;j<25;j++) {
						if(b[j]==a[i1]) {
							count=1;
					 		break;
					    }
					}
					if(count==0) {
						throw new Exception("Player id "+a[i1]+" is Invalid in team1!");
					}
				}
				
				for(int i1=12;i1<23;i1++) {
					int count=0;
					for(int j=1;j<25;j++) {
						if(m[j]==a[i1]) {
							count=1;
					 		break;
					    }
					}
					if(count==0) {
						throw new Exception("Player id "+a[i1]+" is Invalid in team2!");
					}
				}
				
				int cout=0,cin=0;
				for(int i2=1;i2<12;i2++) {
					if(c[i2]>199) {
						throw new Exception("Run 200+ is Out of Range from team1!");
					}
					cin+=c[i2];
					cout+=d[i2];
				}
				if(cout>10) {
					throw new Exception("Wickets Out of Range from team1!");
				}
				if(cin>250) {
					throw new Exception("Runs Out of Range from team1!");
				}
				int cout1=0,cin1=0;
				for(int i2=12;i2<23;i2++) {
					if(c[i2]>199) {
						throw new Exception("Run 200+ is Out of Range from team2!");
					}
					cin1+=c[i2];
					cout1+=d[i2];
				}
				if(cout1>10) {
					throw new Exception("Wickets Out of Range from team2!");
				}
				if(cin1>250) {
					throw new Exception("Runs Out of Range from team2!");
				}
				textFieldscore1.setText(Integer.toString(cin)+"/"+Integer.toString(cout1));
				textFieldscore2.setText(Integer.toString(cin1)+"/"+Integer.toString(cout));
				
				String Q1="select * from game_played where score=0";
				ResultSet rs1=Database.Retrieve(Q1);
				int matchid=0;
				while(rs1.next()) {
					matchid=rs1.getInt(1);
				}
				
				if(matchid==0) {
					throw new Exception("Results already added!");
				}
				int w=10;
				for(int u=1;u<23;u++) {
					String Q7="insert into played values("+matchid+","+a[u]+","+c[u]+","+d[u]+","+r[u]+");";
					w=Database.insertTable(Q7);
					
					if(w==0)
						throw new Exception("Error!");
				}
				String res="",res1="";
				if(cin>cin1) {
					res="WON";
					res1="LOST";
				}
				else {
					res1="WON";
					res="LOST";
				}
				
				String Q8="update game_played set score="+cin+" where tid="+tid[0]+";";
				String Q9="update game_played set result='"+res+"' where tid="+tid[0]+";";
				int w111=Database.update(Q8);
				int w221=Database.update(Q9);
				
				String Q10="update game_played set score="+cin1+" where tid="+tid[1]+";";
				String Q11="update game_played set result='"+res1+"' where tid="+tid[1]+";";
				int w112=Database.update(Q10);
				int w222=Database.update(Q11);
				int l=updatePlayer.UpdatePlayer(a,c,d,r);
				
				if(w111==1 & w221==1 &w112==1 &w222==1 && l==1)
					JOptionPane.showMessageDialog(getParent(), "Done");
				else {
					throw new Exception("Error");
				}
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "Invalid Data!");
				}
	
			}
		});
		button.setBackground(Color.PINK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setForeground(Color.BLACK);
		button.setBounds(606, 601, 206, 41);
		getContentPane().add(button);
		
		lblStrikerate = new JLabel("strike_rate");
		lblStrikerate.setForeground(Color.BLACK);
		lblStrikerate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStrikerate.setBounds(625, 104, 86, 32);
		getContentPane().add(lblStrikerate);
		
		label_4 = new JLabel("strike_rate");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(1005, 104, 86, 32);
		getContentPane().add(label_4);
		

	}
}
