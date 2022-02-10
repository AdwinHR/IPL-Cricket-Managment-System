package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class MatchList extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchList frame = new MatchList();
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
	public MatchList() {
		setTitle("MatchList");
		setClosable(true);
		setBounds(100, 100, 1190, 666);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 1158, 618);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setForeground(Color.BLACK);
		scrollPane.setViewportView(table);
		
		try {
			String Query="select distinct t.tname, g.score,g.result,t2.tname,g2.score,g2.result,m.date,m.stadium "
					+ "from game_played g,game_played g2,team t,team t2,cmatch m "
					+ "where m.matchid=g.matchid and g.matchid=g2.matchid and g.tid!=g2.tid and t.tid=g.tid and "
					+ "t2.tid=g2.tid;";
			
			table.setModel(DbUtils.resultSetToTableModel(Database.Retrieve(Query)));
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(getParent(), e1);
		}

	}

}
