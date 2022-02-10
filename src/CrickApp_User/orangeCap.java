package CrickApp_User;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class orangeCap extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orangeCap frame = new orangeCap();
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
	public orangeCap() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Player of the series");
		setClosable(true);
		setBounds(100, 100, 1434, 141);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 58, 1402, 41);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		
		try {
			String Query="select * from player;";
			ResultSet result=Database.Retrieve(Query);
			
			int[] x=new int[200];
			int[] y=new int[200];
			int i=1;
			while(result.next()) {
					x[i]= result.getInt(5);
					i++;
			}
			int max=1;
			for(int j=1;j<x.length;j++) {
				if(x[j]>x[max])
					max=j;
			}
			String Query1="select p.pname,p.role,p.age,p.season_score,p.SR,p.season_wicket,t.tname "
					+ "from player p,team t,player_of p1 "
					+ "where t.tid=p1.tid and p1.pid=p.pid and p.pid="+max+";";
			
			table.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(Query1)));
			
			JLabel lblPlayerOfThe = new JLabel("Orange Cap IPL2019");
			lblPlayerOfThe.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblPlayerOfThe.setForeground(Color.BLACK);
			lblPlayerOfThe.setBounds(510, 26, 351, 30);
			getContentPane().add(lblPlayerOfThe);
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(getParent(), e1);
		}

	}

}
