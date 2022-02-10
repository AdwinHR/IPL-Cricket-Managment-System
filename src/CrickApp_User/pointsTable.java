package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.sql.ResultSet;

public class pointsTable extends JInternalFrame {
	private JTextField textFieldt1;
	private JTextField textFieldw1;
	private JTextField textFieldl1;
	private JTextField textFields1;
	private JTextField textFieldt2;
	private JTextField textFieldw2;
	private JTextField textFieldl2;
	private JTextField textFields2;
	private JTextField textFieldt3;
	private JTextField textFieldt4;
	private JTextField textFieldt5;
	private JTextField textFieldt6;
	private JTextField textFieldt7;
	private JTextField textFieldt8;
	private JTextField textFieldw3;
	private JTextField textFieldw4;
	private JTextField textFieldw5;
	private JTextField textFieldw6;
	private JTextField textFieldw7;
	private JTextField textFieldw8;
	private JTextField textFieldl3;
	private JTextField textFieldl4;
	private JTextField textFieldl5;
	private JTextField textFieldl6;
	private JTextField textFieldl7;
	private JTextField textFieldl8;
	private JTextField textFields3;
	private JTextField textFields4;
	private JTextField textFields5;
	private JTextField textFields6;
	private JTextField textFields7;
	private JTextField textFields8;
	private JTextField txtTeamName;
	private JTextField txtWon;
	private JTextField txtLost;
	private JTextField txtPoints;
	private JTextField txtMatches;
	private JTextField textFieldm1;
	private JTextField textFieldm2;
	private JTextField textFieldm3;
	private JTextField textFieldm4;
	private JTextField textFieldm5;
	private JTextField textFieldm6;
	private JTextField textFieldm7;
	private JTextField textFieldm8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pointsTable frame = new pointsTable();
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
	public pointsTable() {
		getContentPane().setBackground(Color.WHITE);
		setClosable(true);
		setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 794, 410);
		getContentPane().setLayout(null);
		
		JLabel lblPointsTableIpl = new JLabel("POINTS TABLE IPL2019");
		lblPointsTableIpl.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPointsTableIpl.setForeground(Color.BLACK);
		lblPointsTableIpl.setBounds(178, 10, 367, 53);
		getContentPane().add(lblPointsTableIpl);
		
		textFieldt1 = new JTextField();
		textFieldt1.setForeground(Color.BLACK);
		textFieldt1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt1.setBackground(SystemColor.inactiveCaption);
		textFieldt1.setBounds(10, 88, 460, 35);
		textFieldt1.setEditable(false);
		getContentPane().add(textFieldt1);
		textFieldt1.setColumns(10);
		
		textFieldw1 = new JTextField();
		textFieldw1.setForeground(Color.BLACK);
		textFieldw1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw1.setBackground(SystemColor.inactiveCaption);
		textFieldw1.setBounds(540, 88, 78, 35);
		textFieldw1.setEditable(false);
		getContentPane().add(textFieldw1);
		textFieldw1.setColumns(10);
		
		textFieldl1 = new JTextField();
		textFieldl1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl1.setForeground(Color.BLACK);
		textFieldl1.setBackground(SystemColor.inactiveCaption);
		textFieldl1.setBounds(617, 88, 78, 35);
		textFieldl1.setEditable(false);
		getContentPane().add(textFieldl1);
		textFieldl1.setColumns(10);
		
		textFields1 = new JTextField();
		textFields1.setForeground(Color.BLACK);
		textFields1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields1.setBackground(SystemColor.inactiveCaption);
		textFields1.setBounds(695, 88, 78, 35);
		textFields1.setEditable(false);
		getContentPane().add(textFields1);
		textFields1.setColumns(10);
		
		textFieldt2 = new JTextField();
		textFieldt2.setForeground(Color.BLACK);
		textFieldt2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt2.setBackground(SystemColor.inactiveCaption);
		textFieldt2.setBounds(10, 123, 460, 35);
		textFieldt2.setEditable(false);
		getContentPane().add(textFieldt2);
		textFieldt2.setColumns(10);
		
		textFieldw2 = new JTextField();
		textFieldw2.setForeground(Color.BLACK);
		textFieldw2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw2.setBackground(SystemColor.inactiveCaption);
		textFieldw2.setBounds(540, 123, 78, 35);
		textFieldw2.setEditable(false);
		getContentPane().add(textFieldw2);
		textFieldw2.setColumns(10);
		
		textFieldl2 = new JTextField();
		textFieldl2.setForeground(Color.BLACK);
		textFieldl2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl2.setBackground(SystemColor.inactiveCaption);
		textFieldl2.setColumns(10);
		textFieldl2.setEditable(false);
		textFieldl2.setBounds(617, 123, 78, 35);
		getContentPane().add(textFieldl2);
		
		textFields2 = new JTextField();
		textFields2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields2.setForeground(Color.BLACK);
		textFields2.setBackground(SystemColor.inactiveCaption);
		textFields2.setColumns(10);
		textFields2.setEditable(false);
		textFields2.setBounds(695, 123, 78, 35);
		getContentPane().add(textFields2);
		
		textFieldt3 = new JTextField();
		textFieldt3.setForeground(Color.BLACK);
		textFieldt3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt3.setBackground(SystemColor.inactiveCaption);
		textFieldt3.setColumns(10);
		textFieldt3.setEditable(false);
		textFieldt3.setBounds(10, 158, 460, 35);
		getContentPane().add(textFieldt3);
		
		textFieldt4 = new JTextField();
		textFieldt4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt4.setForeground(Color.BLACK);
		textFieldt4.setBackground(SystemColor.inactiveCaption);
		textFieldt4.setColumns(10);
		textFieldt4.setEditable(false);
		textFieldt4.setBounds(10, 193, 460, 35);
		getContentPane().add(textFieldt4);
		
		textFieldt5 = new JTextField();
		textFieldt5.setForeground(Color.BLACK);
		textFieldt5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt5.setBackground(SystemColor.inactiveCaption);
		textFieldt5.setColumns(10);
		textFieldt5.setEditable(false);
		textFieldt5.setBounds(10, 228, 460, 35);
		getContentPane().add(textFieldt5);
		
		textFieldt6 = new JTextField();
		textFieldt6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt6.setForeground(Color.BLACK);
		textFieldt6.setBackground(SystemColor.inactiveCaption);
		textFieldt6.setColumns(10);
		textFieldt6.setEditable(false);
		textFieldt6.setBounds(10, 262, 460, 35);
		getContentPane().add(textFieldt6);
		
		textFieldt7 = new JTextField();
		textFieldt7.setForeground(Color.BLACK);
		textFieldt7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt7.setBackground(SystemColor.inactiveCaption);
		textFieldt7.setColumns(10);
		textFieldt7.setEditable(false);
		textFieldt7.setBounds(10, 296, 460, 35);
		getContentPane().add(textFieldt7);
		
		textFieldt8 = new JTextField();
		textFieldt8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldt8.setForeground(Color.BLACK);
		textFieldt8.setBackground(SystemColor.inactiveCaption);
		textFieldt8.setColumns(10);
		textFieldt8.setEditable(false);
		textFieldt8.setBounds(10, 331, 460, 35);
		getContentPane().add(textFieldt8);
		
		textFieldw3 = new JTextField();
		textFieldw3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw3.setForeground(Color.BLACK);
		textFieldw3.setBackground(SystemColor.inactiveCaption);
		textFieldw3.setColumns(10);
		textFieldw3.setEditable(false);
		textFieldw3.setBounds(540, 158, 78, 35);
		getContentPane().add(textFieldw3);
		
		textFieldw4 = new JTextField();
		textFieldw4.setForeground(Color.BLACK);
		textFieldw4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw4.setBackground(SystemColor.inactiveCaption);
		textFieldw4.setColumns(10);
		textFieldw4.setEditable(false);
		textFieldw4.setBounds(540, 193, 78, 35);
		getContentPane().add(textFieldw4);
		
		textFieldw5 = new JTextField();
		textFieldw5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw5.setForeground(Color.BLACK);
		textFieldw5.setBackground(SystemColor.inactiveCaption);
		textFieldw5.setColumns(10);
		textFieldw5.setEditable(false);
		textFieldw5.setBounds(540, 228, 78, 35);
		getContentPane().add(textFieldw5);
		
		textFieldw6 = new JTextField();
		textFieldw6.setForeground(Color.BLACK);
		textFieldw6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw6.setBackground(SystemColor.inactiveCaption);
		textFieldw6.setColumns(10);
		textFieldw6.setEditable(false);
		textFieldw6.setBounds(540, 262, 78, 35);
		getContentPane().add(textFieldw6);
		
		textFieldw7 = new JTextField();
		textFieldw7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw7.setForeground(Color.BLACK);
		textFieldw7.setBackground(SystemColor.inactiveCaption);
		textFieldw7.setColumns(10);
		textFieldw7.setEditable(false);
		textFieldw7.setBounds(540, 296, 78, 35);
		getContentPane().add(textFieldw7);
		
		textFieldw8 = new JTextField();
		textFieldw8.setForeground(Color.BLACK);
		textFieldw8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldw8.setBackground(SystemColor.inactiveCaption);
		textFieldw8.setColumns(10);
		textFieldw8.setEditable(false);
		textFieldw8.setBounds(540, 331, 78, 35);
		getContentPane().add(textFieldw8);
		
		textFieldl3 = new JTextField();
		textFieldl3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl3.setForeground(Color.BLACK);
		textFieldl3.setBackground(SystemColor.inactiveCaption);
		textFieldl3.setColumns(10);
		textFieldl3.setEditable(false);
		textFieldl3.setBounds(617, 158, 78, 35);
		getContentPane().add(textFieldl3);
		
		textFieldl4 = new JTextField();
		textFieldl4.setForeground(Color.BLACK);
		textFieldl4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl4.setBackground(SystemColor.inactiveCaption);
		textFieldl4.setColumns(10);
		textFieldl4.setEditable(false);
		textFieldl4.setBounds(617, 193, 78, 35);
		getContentPane().add(textFieldl4);
		
		textFieldl5 = new JTextField();
		textFieldl5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl5.setForeground(Color.BLACK);
		textFieldl5.setBackground(SystemColor.inactiveCaption);
		textFieldl5.setColumns(10);
		textFieldl5.setEditable(false);
		textFieldl5.setBounds(617, 228, 78, 35);
		getContentPane().add(textFieldl5);
		
		textFieldl6 = new JTextField();
		textFieldl6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl6.setForeground(Color.BLACK);
		textFieldl6.setBackground(SystemColor.inactiveCaption);
		textFieldl6.setColumns(10);
		textFieldl6.setEditable(false);
		textFieldl6.setBounds(617, 262, 78, 35);
		getContentPane().add(textFieldl6);
		
		textFieldl7 = new JTextField();
		textFieldl7.setForeground(Color.BLACK);
		textFieldl7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl7.setBackground(SystemColor.inactiveCaption);
		textFieldl7.setColumns(10);
		textFieldl7.setEditable(false);
		textFieldl7.setBounds(617, 296, 78, 35);
		getContentPane().add(textFieldl7);
		
		textFieldl8 = new JTextField();
		textFieldl8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldl8.setForeground(Color.BLACK);
		textFieldl8.setBackground(SystemColor.inactiveCaption);
		textFieldl8.setColumns(10);
		textFieldl8.setEditable(false);
		textFieldl8.setBounds(617, 331, 78, 35);
		getContentPane().add(textFieldl8);
		
		textFields3 = new JTextField();
		textFields3.setForeground(Color.BLACK);
		textFields3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields3.setBackground(SystemColor.inactiveCaption);
		textFields3.setColumns(10);
		textFields3.setEditable(false);
		textFields3.setBounds(695, 158, 78, 35);
		getContentPane().add(textFields3);
		
		textFields4 = new JTextField();
		textFields4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields4.setForeground(Color.BLACK);
		textFields4.setBackground(SystemColor.inactiveCaption);
		textFields4.setColumns(10);
		textFields4.setEditable(false);
		textFields4.setBounds(695, 193, 78, 35);
		getContentPane().add(textFields4);
		
		textFields5 = new JTextField();
		textFields5.setForeground(Color.BLACK);
		textFields5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields5.setBackground(SystemColor.inactiveCaption);
		textFields5.setColumns(10);
		textFields5.setEditable(false);
		textFields5.setBounds(695, 228, 78, 35);
		getContentPane().add(textFields5);
		
		textFields6 = new JTextField();
		textFields6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields6.setForeground(Color.BLACK);
		textFields6.setBackground(SystemColor.inactiveCaption);
		textFields6.setColumns(10);
		textFields6.setEditable(false);
		textFields6.setBounds(695, 262, 78, 35);
		getContentPane().add(textFields6);
		
		textFields7 = new JTextField();
		textFields7.setForeground(Color.BLACK);
		textFields7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields7.setBackground(SystemColor.inactiveCaption);
		textFields7.setColumns(10);
		textFields7.setEditable(false);
		textFields7.setBounds(695, 296, 78, 35);
		getContentPane().add(textFields7);
		
		textFields8 = new JTextField();
		textFields8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields8.setForeground(Color.BLACK);
		textFields8.setBackground(SystemColor.inactiveCaption);
		textFields8.setColumns(10);
		textFields8.setEditable(false);
		textFields8.setBounds(695, 331, 78, 35);
		getContentPane().add(textFields8);
		
		textFieldm1 = new JTextField();
		textFieldm1.setForeground(Color.BLACK);
		textFieldm1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm1.setColumns(10);
		textFieldm1.setBackground(SystemColor.inactiveCaption);
		textFieldm1.setBounds(468, 88, 74, 35);
		textFieldm1.setEditable(false);
		getContentPane().add(textFieldm1);
		
		textFieldm2 = new JTextField();
		textFieldm2.setForeground(Color.BLACK);
		textFieldm2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm2.setColumns(10);
		textFieldm2.setEditable(false);
		textFieldm2.setBackground(SystemColor.inactiveCaption);
		textFieldm2.setBounds(468, 123, 74, 35);
		getContentPane().add(textFieldm2);
		
		textFieldm3 = new JTextField();
		textFieldm3.setForeground(Color.BLACK);
		textFieldm3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm3.setColumns(10);
		textFieldm3.setEditable(false);
		textFieldm3.setBackground(SystemColor.inactiveCaption);
		textFieldm3.setBounds(468, 158, 74, 35);
		getContentPane().add(textFieldm3);
		
		textFieldm4 = new JTextField();
		textFieldm4.setForeground(Color.BLACK);
		textFieldm4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm4.setColumns(10);
		textFieldm4.setEditable(false);
		textFieldm4.setBackground(SystemColor.inactiveCaption);
		textFieldm4.setBounds(468, 193, 74, 35);
		getContentPane().add(textFieldm4);
		
		textFieldm5 = new JTextField();
		textFieldm5.setForeground(Color.BLACK);
		textFieldm5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm5.setColumns(10);
		textFieldm5.setEditable(false);
		textFieldm5.setBackground(SystemColor.inactiveCaption);
		textFieldm5.setBounds(468, 228, 74, 35);
		getContentPane().add(textFieldm5);
		
		textFieldm6 = new JTextField();
		textFieldm6.setForeground(Color.BLACK);
		textFieldm6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm6.setColumns(10);
		textFieldm6.setEditable(false);
		textFieldm6.setBackground(SystemColor.inactiveCaption);
		textFieldm6.setBounds(468, 262, 74, 35);
		getContentPane().add(textFieldm6);
		
		textFieldm7 = new JTextField();
		textFieldm7.setForeground(Color.BLACK);
		textFieldm7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm7.setColumns(10);
		textFieldm7.setEditable(false);
		textFieldm7.setBackground(SystemColor.inactiveCaption);
		textFieldm7.setBounds(468, 296, 74, 35);
		getContentPane().add(textFieldm7);
		
		textFieldm8 = new JTextField();
		textFieldm8.setForeground(Color.BLACK);
		textFieldm8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldm8.setColumns(10);
		textFieldm8.setEditable(false);
		textFieldm8.setBackground(SystemColor.inactiveCaption);
		textFieldm8.setBounds(468, 331, 74, 35);
		getContentPane().add(textFieldm8);
		
		try {
			String Query1="select * from team;";
			ResultSet rs1= Database.Retrieve(Query1);
			
			String[] t=new String[9];
			int x=1;
			while(rs1.next()) {
				t[x]= rs1.getString(2);
				x++;
			}
		
			int[] w=new int[15];
			int[] l=new int[15];
			int m=1;
			
			/*ResultSet rs3= Database.Retrieve("select distinct tid from game_played;");
			int p = 0;
			while(rs3.next()) {
				p= rs3.getInt(1);
			}
			
			ResultSet rs4= Database.Retrieve("select distinct matchid from game_played;");
			int q = 0;
			while(rs4.next()) {
				q= rs4.getInt(1);
			}*/
			int p=8,q=8;
			
			for(int i=1;i<=p;i++) {
				ResultSet rs2= Database.Retrieve("select * from game_played where tid="+m+";");
				int y=1;
				
				String[] a=new String[17];
				while(rs2.next()) {
					a[y]= rs2.getString(4);
					y++;
				}
				int count_won=0;
				int count_lost=0;
				for(int j=1;j<q;j++) {
					if(a[j]==null) 
						break;
					else if(a[j].equals("WON")) 
						count_won++;
					else if(a[j].equals("LOST")) 
						count_lost++;
					else 
						break;
				}
				w[m]=count_won;
				l[m]=count_lost;
				m++;
			}
			int max=1;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max])
					max=i;
			}
			textFieldt1.setText(t[max]);
			textFieldw1.setText(Integer.toString(w[max]));
			textFieldl1.setText(Integer.toString(l[max]));
			textFields1.setText(Integer.toString(w[max]*2));
			textFieldm1.setText(Integer.toString(w[max]+l[max]));
			w[max]=-1;
			
			int max1=2;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max1])
					max1=i;
			}
			textFieldt2.setText(t[max1]);
			textFieldw2.setText(Integer.toString(w[max1]));
			textFieldl2.setText(Integer.toString(l[max]));
			textFields2.setText(Integer.toString(w[max1]*2));
			textFieldm2.setText(Integer.toString(w[max1]+l[max1]));
			w[max1]=-1;
			
			int max2=3;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max2])
					max2=i;
			}
			textFieldt3.setText(t[max2]);
			textFieldw3.setText(Integer.toString(w[max2]));
			textFieldl3.setText(Integer.toString(l[max2]));
			textFields3.setText(Integer.toString(w[max2]*2));
			textFieldm3.setText(Integer.toString(w[max2]+l[max2]));
			w[max2]=-1;
			
			int max3=4;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max3])
					max3=i;
			}
			textFieldt4.setText(t[max3]);
			textFieldw4.setText(Integer.toString(w[max3]));
			textFieldl4.setText(Integer.toString(l[max3]));
			textFields4.setText(Integer.toString(w[max3]*2));
			textFieldm4.setText(Integer.toString(w[max3]+l[max3]));
			w[max3]=-1;
			
			int max4=5;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max4])
					max4=i;
			}
			textFieldt5.setText(t[max4]);
			textFieldw5.setText(Integer.toString(w[max4]));
			textFieldl5.setText(Integer.toString(l[max4]));
			textFields5.setText(Integer.toString(w[max4]*2));
			textFieldm5.setText(Integer.toString(w[max4]+l[max4]));
			w[max4]=-1;
			
			int max5=6;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max5])
					max5=i;
			}
			textFieldt6.setText(t[max5]);
			textFieldw6.setText(Integer.toString(w[max5]));
			textFieldl6.setText(Integer.toString(l[max5]));
			textFields6.setText(Integer.toString(w[max5]*2));
			textFieldm6.setText(Integer.toString(w[max5]+l[max5]));
			w[max5]=-1;
			
			int max6=7;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max6])
					max6=i;
			}
			textFieldt7.setText(t[max6]);
			textFieldw7.setText(Integer.toString(w[max6]));
			textFieldl7.setText(Integer.toString(l[max6]));
			textFields7.setText(Integer.toString(w[max6]*2));
			textFieldm7.setText(Integer.toString(w[max6]+l[max6]));
			w[max6]=-1;
			
			int max7=8;
			for(int i=1;i<=t.length;i++) {
				if(w[i]>w[max7])
					max7=i;
			}
			textFieldt8.setText(t[8]);
			textFieldw8.setText(Integer.toString(w[max7]));
			textFieldl8.setText(Integer.toString(l[max7]));
			textFields8.setText(Integer.toString(w[max7]*2));
			textFieldm8.setText(Integer.toString(w[max7]+l[max7]));
			w[max7]=-1;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(getParent(),e);
		}
		
		txtTeamName = new JTextField();
		txtTeamName.setText("                                      TEAM NAME");
		txtTeamName.setForeground(Color.BLACK);
		txtTeamName.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTeamName.setColumns(10);
		txtTeamName.setBackground(Color.YELLOW);
		txtTeamName.setEditable(false);
		txtTeamName.setBounds(10, 55, 460, 35);
		getContentPane().add(txtTeamName);
		
		txtWon = new JTextField();
		txtWon.setText("    WON");
		txtWon.setForeground(Color.BLACK);
		txtWon.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtWon.setColumns(10);
		txtWon.setBackground(Color.YELLOW);
		txtWon.setEditable(false);
		txtWon.setBounds(540, 56, 78, 35);
		getContentPane().add(txtWon);
		
		txtLost = new JTextField();
		txtLost.setText("    LOST");
		txtLost.setForeground(Color.BLACK);
		txtLost.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtLost.setColumns(10);
		txtLost.setBackground(Color.YELLOW);
		txtLost.setEditable(false);
		txtLost.setBounds(617, 56, 78, 35);
		getContentPane().add(txtLost);
		
		txtPoints = new JTextField();
		txtPoints.setText("   POINTS");
		txtPoints.setForeground(Color.BLACK);
		txtPoints.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPoints.setColumns(10);
		txtPoints.setEditable(false);
		txtPoints.setBackground(Color.YELLOW);
		txtPoints.setBounds(695, 56, 78, 35);
		getContentPane().add(txtPoints);
		
		txtMatches = new JTextField();
		txtMatches.setText("MATCHES");
		txtMatches.setForeground(Color.BLACK);
		txtMatches.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtMatches.setColumns(10);
		txtMatches.setEditable(false);
		txtMatches.setBackground(Color.YELLOW);
		txtMatches.setBounds(468, 55, 74, 35);
		getContentPane().add(txtMatches);

	}
}
