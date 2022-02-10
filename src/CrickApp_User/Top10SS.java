package CrickApp_User;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.sql.ResultSet;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Top10SS extends JInternalFrame {
	private JTextField txtPlayerName;
	private JTextField txtScore;
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
	private JTextField textFieldn1;
	private JTextField textFieldn2;
	private JTextField textFieldn3;
	private JTextField textFieldn4;
	private JTextField textFieldn5;
	private JTextField textFieldn6;
	private JTextField textFieldn7;
	private JTextField textFieldn8;
	private JTextField textFieldn9;
	private JTextField textFieldn10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Top10SS frame = new Top10SS();
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
	public Top10SS() {
		setTitle("Top 10 Super Strikers");
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 866, 428);
		getContentPane().setLayout(null);
		
		JLabel lblTopBatsmans = new JLabel("Top 10 Super Strikers");
		lblTopBatsmans.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTopBatsmans.setForeground(Color.BLACK);
		lblTopBatsmans.setBounds(317, 10, 224, 36);
		getContentPane().add(lblTopBatsmans);
		
		txtPlayerName = new JTextField();
		txtPlayerName.setBackground(Color.PINK);
		txtPlayerName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPlayerName.setForeground(Color.BLACK);
		txtPlayerName.setText("                Player Name");
		txtPlayerName.setEditable(false);
		txtPlayerName.setBounds(151, 41, 375, 28);
		getContentPane().add(txtPlayerName);
		txtPlayerName.setColumns(10);
		
		txtScore = new JTextField();
		txtScore.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtScore.setForeground(Color.BLACK);
		txtScore.setBackground(Color.PINK);
		txtScore.setEditable(false);
		txtScore.setText("    Strike rate");
		txtScore.setBounds(524, 41, 152, 28);
		getContentPane().add(txtScore);
		txtScore.setColumns(10);
		
		textFields1 = new JTextField();
		textFields1.setForeground(Color.BLACK);
		textFields1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields1.setColumns(10);
		textFields1.setEditable(false);
		textFields1.setBackground(SystemColor.info);
		textFields1.setBounds(524, 67, 152, 34);
		getContentPane().add(textFields1);
		
		textFields2 = new JTextField();
		textFields2.setForeground(Color.BLACK);
		textFields2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields2.setColumns(10);
		textFields2.setEditable(false);
		textFields2.setBackground(SystemColor.info);
		textFields2.setBounds(524, 99, 152, 34);
		getContentPane().add(textFields2);
		
		textFields3 = new JTextField();
		textFields3.setForeground(Color.BLACK);
		textFields3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields3.setColumns(10);
		textFields3.setEditable(false);
		textFields3.setBackground(SystemColor.info);
		textFields3.setBounds(524, 132, 152, 34);
		getContentPane().add(textFields3);
		
		textFields4 = new JTextField();
		textFields4.setForeground(Color.BLACK);
		textFields4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields4.setColumns(10);
		textFields4.setEditable(false);
		textFields4.setBackground(SystemColor.info);
		textFields4.setBounds(524, 162, 152, 34);
		getContentPane().add(textFields4);
		
		textFields5 = new JTextField();
		textFields5.setForeground(Color.BLACK);
		textFields5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields5.setColumns(10);
		textFields5.setEditable(false);
		textFields5.setBackground(SystemColor.info);
		textFields5.setBounds(524, 193, 152, 34);
		getContentPane().add(textFields5);
		
		textFields6 = new JTextField();
		textFields6.setForeground(Color.BLACK);
		textFields6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields6.setColumns(10);
		textFields6.setEditable(false);
		textFields6.setBackground(SystemColor.info);
		textFields6.setBounds(524, 224, 152, 34);
		getContentPane().add(textFields6);
		
		textFields7 = new JTextField();
		textFields7.setForeground(Color.BLACK);
		textFields7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields7.setColumns(10);
		textFields7.setEditable(false);
		textFields7.setBackground(SystemColor.info);
		textFields7.setBounds(524, 257, 152, 34);
		getContentPane().add(textFields7);
		
		textFields8 = new JTextField();
		textFields8.setForeground(Color.BLACK);
		textFields8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields8.setColumns(10);
		textFields8.setEditable(false);
		textFields8.setBackground(SystemColor.info);
		textFields8.setBounds(524, 287, 152, 34);
		getContentPane().add(textFields8);
		
		textFields9 = new JTextField();
		textFields9.setForeground(Color.BLACK);
		textFields9.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields9.setColumns(10);
		textFields9.setEditable(false);
		textFields9.setBackground(SystemColor.info);
		textFields9.setBounds(524, 320, 152, 34);
		getContentPane().add(textFields9);
		
		textFields10 = new JTextField();
		textFields10.setForeground(Color.BLACK);
		textFields10.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFields10.setColumns(10);
		textFields10.setEditable(false);
		textFields10.setBackground(SystemColor.info);
		textFields10.setBounds(524, 353, 152, 34);
		getContentPane().add(textFields10);
		
		textFieldn1 = new JTextField();
		textFieldn1.setForeground(Color.BLACK);
		textFieldn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn1.setColumns(10);
		textFieldn1.setEditable(false);
		textFieldn1.setBackground(SystemColor.info);
		textFieldn1.setBounds(151, 67, 375, 34);
		getContentPane().add(textFieldn1);
		
		textFieldn2 = new JTextField();
		textFieldn2.setForeground(Color.BLACK);
		textFieldn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn2.setColumns(10);
		textFieldn2.setEditable(false);
		textFieldn2.setBackground(SystemColor.info);
		textFieldn2.setBounds(151, 99, 375, 34);
		getContentPane().add(textFieldn2);
		
		textFieldn3 = new JTextField();
		textFieldn3.setForeground(Color.BLACK);
		textFieldn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn3.setColumns(10);
		textFieldn3.setEditable(false);
		textFieldn3.setBackground(SystemColor.info);
		textFieldn3.setBounds(151, 132, 375, 34);
		getContentPane().add(textFieldn3);
		
		textFieldn4 = new JTextField();
		textFieldn4.setForeground(Color.BLACK);
		textFieldn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn4.setColumns(10);
		textFieldn4.setEditable(false);
		textFieldn4.setBackground(SystemColor.info);
		textFieldn4.setBounds(151, 162, 375, 34);
		getContentPane().add(textFieldn4);
		
		textFieldn5 = new JTextField();
		textFieldn5.setForeground(Color.BLACK);
		textFieldn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn5.setColumns(10);
		textFieldn5.setEditable(false);
		textFieldn5.setBackground(SystemColor.info);
		textFieldn5.setBounds(151, 193, 375, 34);
		getContentPane().add(textFieldn5);
		
		textFieldn6 = new JTextField();
		textFieldn6.setForeground(Color.BLACK);
		textFieldn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn6.setColumns(10);
		textFieldn6.setEditable(false);
		textFieldn6.setBackground(SystemColor.info);
		textFieldn6.setBounds(151, 224, 375, 34);
		getContentPane().add(textFieldn6);
		
		textFieldn7 = new JTextField();
		textFieldn7.setForeground(Color.BLACK);
		textFieldn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn7.setColumns(10);
		textFieldn7.setEditable(false);
		textFieldn7.setBackground(SystemColor.info);
		textFieldn7.setBounds(151, 257, 375, 34);
		getContentPane().add(textFieldn7);
		
		textFieldn8 = new JTextField();
		textFieldn8.setForeground(Color.BLACK);
		textFieldn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn8.setColumns(10);
		textFieldn8.setEditable(false);
		textFieldn8.setBackground(SystemColor.info);
		textFieldn8.setBounds(151, 287, 375, 34);
		getContentPane().add(textFieldn8);
		
		textFieldn9 = new JTextField();
		textFieldn9.setForeground(Color.BLACK);
		textFieldn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn9.setColumns(10);
		textFieldn9.setEditable(false);
		textFieldn9.setBackground(SystemColor.info);
		textFieldn9.setBounds(151, 320, 375, 34);
		getContentPane().add(textFieldn9);
		
		textFieldn10 = new JTextField();
		textFieldn10.setForeground(Color.BLACK);
		textFieldn10.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldn10.setColumns(10);
		textFieldn10.setEditable(false);
		textFieldn10.setBackground(SystemColor.info);
		textFieldn10.setBounds(151, 353, 375, 34);
		getContentPane().add(textFieldn10);
		
		try {
			String Query1="select * from player;";
			ResultSet rs1= Database.Retrieve(Query1);
			
			double[] a=new double[200];
			int[] b=new int[11];
			String[] n=new String[200];
			double[] s=new double[200];
			int x=1;
			int z=0;
			while(rs1.next()) {
				a[x]= rs1.getInt(6);
				n[x]= rs1.getString(2);
				s[x]= rs1.getInt(6);
				z=rs1.getInt(1);
				x++;
			}
			int y=1;
			while(y<=10) {
				int max=1;
				for(int i=1;i<=z;i++) {
					if(a[i]>a[max])
						max=i;
				}
				b[y]=max;
				a[max]=0;
				y++;
			}
			textFieldn1.setText(n[b[1]]);
			textFields1.setText(Double.toString(s[b[1]]));
			
			textFieldn2.setText(n[b[2]]);
			textFields2.setText(Double.toString(s[b[2]]));
			
			textFieldn3.setText(n[b[3]]);
			textFields3.setText(Double.toString(s[b[3]]));
			
			textFieldn4.setText(n[b[4]]);
			textFields4.setText(Double.toString(s[b[4]]));
			
			textFieldn5.setText(n[b[5]]);
			textFields5.setText(Double.toString(s[b[5]]));
			
			textFieldn6.setText(n[b[6]]);
			textFields6.setText(Double.toString(s[b[6]]));
			
			textFieldn7.setText(n[b[7]]);
			textFields7.setText(Double.toString(s[b[7]]));
			
			textFieldn8.setText(n[b[8]]);
			textFields8.setText(Double.toString(s[b[8]]));
			
			textFieldn9.setText(n[b[9]]);
			textFields9.setText(Double.toString(s[b[9]]));
			
			textFieldn10.setText(n[b[10]]);
			textFields10.setText(Double.toString(s[b[10]]));
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(getParent(), e);
		}


	}

}
