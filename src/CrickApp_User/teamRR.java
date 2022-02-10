package CrickApp_User;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class teamRR extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamRR frame = new teamRR();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn;

	/**
	 * Create the frame.
	 */
	public teamRR() {
		getContentPane().setBackground(new Color(255, 51, 204));
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 1210, 657);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\DBMS\\IMAGES\\ipl-rajasthan-royals-logo-F69DDCEF15-seeklogo.com.png"));
		label.setBounds(10, 149, 300, 260);
		getContentPane().add(label);
		
		JLabel lblRoyalChallengersBangalore = new JLabel("RAJASTHAN ROYALS");
		lblRoyalChallengersBangalore.setBackground(new Color(240, 240, 240));
		lblRoyalChallengersBangalore.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRoyalChallengersBangalore.setForeground(Color.BLACK);
		lblRoyalChallengersBangalore.setBounds(32, 400, 260, 50);
		getContentPane().add(lblRoyalChallengersBangalore);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(320, 36, 868, 582);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		Button button = new Button("TEAM PLAYERS");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String Query="select p.pname,p.role,p.age,p.season_score,p.SR,p.season_wicket from player "
							+ "p,player_of s where p.pid=s.pid and s.tid=6";
					
					table.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(Query)));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(button, e1);
				}
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBackground(Color.PINK);
		button.setBounds(546, 0, 160, 32);
		getContentPane().add(button);
		
		Button button_1 = new Button("MATCHES");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String Query="select t.tname, g.score,g.result,t2.tname,g2.score,g2.result,m.date,m.stadium "
							+ "from game_played g,game_played g2,team t,team t2,cmatch m "
							+ "where m.matchid=g.matchid and g.matchid=g2.matchid and g.tid!=g2.tid and t.tid=g.tid and "
							+ "t2.tid=g2.tid and g.tid=6;";					
					
					table.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(Query)));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(button, e1);
				}
			}
		});
		button_1.setBackground(Color.PINK);
		button_1.setFont(new Font("Dialog", Font.BOLD, 15));
		button_1.setBounds(820, 0, 183, 32);
		getContentPane().add(button_1);


	}

}
