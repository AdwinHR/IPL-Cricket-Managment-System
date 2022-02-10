package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.ResultSet;

public class PlayerOfTheSeries extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerOfTheSeries frame = new PlayerOfTheSeries();
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
	public PlayerOfTheSeries() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Player of the series");
		setClosable(true);
		setBounds(100, 100, 1434, 141);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 58, 1402, 41);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setForeground(Color.BLACK);
		scrollPane.setViewportView(table);
		
		try {
			String Query="select * from player;";
			ResultSet result=Database.Retrieve(Query);
			
			int[] x=new int[200];
			int[] y=new int[200];
			int[] z=new int[200];
			int i=1;
			while(result.next()) {
					x[i]= result.getInt(5);
					y[i]=result.getInt(7);
					i++;
			}
			for(int j=1;j<x.length;j++)
				z[j]=x[j]*2+y[j]*20;
			int max=1;
			for(int j=1;j<x.length;j++) {
				if(z[j]>z[max])
					max=j;
			}
			String Query1="select p.pname,p.role,p.age,p.season_score,p.SR,p.season_wicket,t.tname "
					+ "from player p,team t,player_of p1 "
					+ "where t.tid=p1.tid and p1.pid=p.pid and p.pid="+max+";";
			
			table.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(Query1)));
			
			JLabel lblPlayerOfThe = new JLabel("Player of the series IPL2019");
			lblPlayerOfThe.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblPlayerOfThe.setForeground(Color.BLACK);
			lblPlayerOfThe.setBounds(510, 26, 351, 30);
			getContentPane().add(lblPlayerOfThe);
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(getParent(), e1);
		}
	}
}
