package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.SwingConstants;

public class Final extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final frame = new Final();
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
	public Final() {
		setTitle("Final Match");
		getContentPane().setBackground(Color.WHITE);
		setClosable(true);
		setBounds(100, 100, 952, 378);
		getContentPane().setLayout(null);
		
		JLabel lblQualifier = new JLabel("Final Match");
		lblQualifier.setHorizontalAlignment(SwingConstants.CENTER);
		lblQualifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQualifier.setForeground(Color.BLACK);
		lblQualifier.setBounds(271, 10, 309, 56);
		getContentPane().add(lblQualifier);
		
		JLabel l1 = new JLabel("TBC");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setForeground(Color.BLACK);
		l1.setBounds(10, 116, 434, 47);
		getContentPane().add(l1);
		
		JLabel lblNewLabel = new JLabel("V/S");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(440, 116, 56, 47);
		getContentPane().add(lblNewLabel);
		
		JLabel l2 = new JLabel("TBC");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setBounds(496, 116, 434, 47);
		getContentPane().add(l2);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResult.setBounds(263, 215, 56, 47);
		getContentPane().add(lblResult);
		
		JLabel l3 = new JLabel("TBC");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("Tahoma", Font.BOLD, 15));
		l3.setBounds(329, 215, 434, 47);
		getContentPane().add(l3);
		
		try {
			String Q1="select tid,result from game_played where matchid=60";
			ResultSet rs1=Database.Retrieve(Q1);
			
			int[] t=new int[2];
			int i=0;
			String[] r=new String[2];
			while(rs1.next()) {
				t[i]=rs1.getInt(1);
				r[i]=rs1.getString(2);
				i++;
			}
			if(t[0]==0 || t[1]==0)
				throw new Exception("invalid tid!");
			
			String Q2="select tname from team where tid in ("+t[0]+","+t[1]+");";
			ResultSet rs2=Database.Retrieve(Q2);
			
			String[] tn=new String[2];
			int j=0;
			while(rs2.next()) {
				tn[j]=rs2.getString(1);
				j++;
			}
			if(tn[0]==null || tn[1]==null)
				throw new Exception("invalid tid!");
			
			l1.setText(tn[0]);
			l2.setText(tn[1]);
			
			if(r[0].equals("WON"))
				l3.setText(tn[0]+"  Won the match");
			else
				l3.setText(tn[1]+"  Won the match");

			}catch(Exception e1) {
				JOptionPane.showMessageDialog(getParent(), "Data unavailable!");
				l1.setText("TBH");
				l2.setText("TBH");
			}

	}
}
