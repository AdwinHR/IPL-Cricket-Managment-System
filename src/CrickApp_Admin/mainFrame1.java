package CrickApp_Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;

import CrickApp_User.CrickApp;
import CrickApp_User.MAINFRAME;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class mainFrame1 {

	private JFrame frmCrickapp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame1 window = new mainFrame1();
					window.frmCrickapp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainFrame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrickapp = new JFrame();
		frmCrickapp.setForeground(Color.BLACK);
		frmCrickapp.setFont(new Font("Dialog", Font.BOLD, 20));
		frmCrickapp.setTitle("CrickApp-Admin");
		frmCrickapp.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\DBMS\\Images\\wp1894279-ab-de-villiers-wallpapers.jpg"));
		frmCrickapp.setBounds(100, 100, 1174, 664);
		frmCrickapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrickapp.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmCrickapp.setResizable(false);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 204, 0));
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.setForeground(Color.BLACK);
		frmCrickapp.setJMenuBar(menuBar);
		
		JMenu mnTeams = new JMenu("Match");
		mnTeams.setForeground(Color.BLACK);
		mnTeams.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnTeams);
		
		JMenu mnPlayers = new JMenu("Players");
		mnPlayers.setForeground(Color.BLACK);
		mnPlayers.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnPlayers);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.ORANGE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCrickapp.dispose();
			}
		});
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCrickapp.dispose();
				new MAINFRAME().main(null);
			}
		});
		btnUser.setForeground(Color.BLACK);
		btnUser.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUser.setBackground(Color.ORANGE);
		menuBar.add(btnUser);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setForeground(Color.BLACK);
		menuBar.add(btnExit);
		frmCrickapp.getContentPane().setLayout(new CardLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setToolTipText("");
		desktopPane.setBackground(SystemColor.inactiveCaption);
		frmCrickapp.getContentPane().add(desktopPane, "name_385197828044751");
		
		JMenuItem mntmPlayerInfornation = new JMenuItem("Add Player");
		mntmPlayerInfornation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addplayer ob =new addplayer();
				desktopPane.add(ob);
				ob.show();
			}
		});
		
		JMenuItem mntmLogos = new JMenuItem("Add match");
		mntmLogos.setForeground(Color.BLACK);
		mntmLogos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addmatch ob =new addmatch();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmLogos.setBackground(Color.PINK);
		mntmLogos.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnTeams.add(mntmLogos);
		
		JMenuItem mntmUpdateMatchResult = new JMenuItem("Add match result");
		mntmUpdateMatchResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addmatchresult ob=new addmatchresult();
				desktopPane.add(ob);
				ob.show();	
			}
		});
		mntmUpdateMatchResult.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmUpdateMatchResult.setBackground(Color.PINK);
		mntmUpdateMatchResult.setForeground(Color.BLACK);
		mnTeams.add(mntmUpdateMatchResult);
		
		mntmPlayerInfornation.setBackground(Color.PINK);
		mntmPlayerInfornation.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmPlayerInfornation.setForeground(Color.BLACK);
		mnPlayers.add(mntmPlayerInfornation);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("                                              IPL CRICKET MANAGEMENT SYSTEM");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 25));
		mntmNewMenuItem.setBackground(Color.ORANGE);
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmNewMenuItem);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\DBMS\\IMAGES\\dhoni.jpg"));
		label.setBounds(0, 0, 1579, 888);
		desktopPane.add(label);
	}
}
