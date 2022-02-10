package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import CrickApp_Admin.Login;
import CrickApp_Admin.mainFrame1;

import java.awt.Insets;

public class MAINFRAME {

	private JFrame frmCrickapp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAINFRAME window = new MAINFRAME();
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
	public MAINFRAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrickapp = new JFrame();
		frmCrickapp.setForeground(Color.BLACK);
		frmCrickapp.setResizable(false);
		frmCrickapp.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmCrickapp.setFont(new Font("Dialog", Font.BOLD, 20));
		frmCrickapp.setTitle("CrickApp-USER");
		frmCrickapp.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\DBMS\\Images\\wp1894279-ab-de-villiers-wallpapers.jpg"));
		frmCrickapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.ORANGE);
		frmCrickapp.setJMenuBar(menuBar);
		
		JMenu mnTeams = new JMenu("Teams");
		mnTeams.setForeground(Color.BLACK);
		mnTeams.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnTeams);
		
		
		JMenu mnPlayerInfo = new JMenu("IPL 2019");
		mnPlayerInfo.setForeground(Color.BLACK);
		mnPlayerInfo.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnPlayerInfo);
		
		JMenu mnMatch = new JMenu("Match");
		mnMatch.setForeground(Color.BLACK);
		mnMatch.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnMatch);
		
		JMenu mnPointsTable = new JMenu("Points Table");
		mnPointsTable.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnPointsTable.setForeground(Color.BLACK);
		menuBar.add(mnPointsTable);
		
		JMenu mnPlayers = new JMenu("Players");
		mnPlayers.setForeground(Color.BLACK);
		mnPlayers.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnPlayers);
		
		JMenu mnTop = new JMenu("Top 10");
		mnTop.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnTop.setForeground(Color.BLACK);
		menuBar.add(mnTop);
		
		JMenu mnQualifierMatches = new JMenu("Qualifiers");
		mnQualifierMatches.setForeground(Color.BLACK);
		mnQualifierMatches.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnQualifierMatches);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnAbout.setForeground(Color.BLACK);
		menuBar.add(mnAbout);
		frmCrickapp.getContentPane().setLayout(new CardLayout(0, 0));

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setToolTipText("");
		desktopPane.setBackground(SystemColor.inactiveCaption);
		frmCrickapp.getContentPane().add(desktopPane, "name_385197828044751");
		
		JMenuItem mntmCrickapp = new JMenuItem("CrickApp");
		mntmCrickapp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrickApp ob =new CrickApp();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmCrickapp.setForeground(Color.BLACK);
		mntmCrickapp.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmCrickapp.setBackground(Color.PINK);
		mnAbout.add(mntmCrickapp);
		
		JMenuItem mntmRcb = new JMenuItem("RCB");
		mntmRcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamRCB ob=new teamRCB();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmRcb);
		mntmRcb.setBackground(Color.PINK);
		mntmRcb.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmRcb.setForeground(Color.BLACK);
		
		JMenuItem mntmMi = new JMenuItem("MI");
		mntmMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamMI ob=new teamMI();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmMi);
		mntmMi.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmMi.setForeground(Color.BLACK);
		mntmMi.setBackground(Color.PINK);
		
		JMenuItem mntmCsk = new JMenuItem("CSK");
		mntmCsk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamCSK ob=new teamCSK();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmCsk);
		mntmCsk.setForeground(Color.BLACK);
		mntmCsk.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmCsk.setBackground(Color.PINK);
		
		JMenuItem mntmKkr = new JMenuItem("KKR");
		mntmKkr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamKKR ob=new teamKKR();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmKkr);
		mntmKkr.setForeground(Color.BLACK);
		mntmKkr.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmKkr.setBackground(Color.PINK);
		
		JMenuItem mntmSrh = new JMenuItem("SRH");
		mntmSrh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamSRH ob=new teamSRH();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmSrh);
		mntmSrh.setForeground(Color.BLACK);
		mntmSrh.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmSrh.setBackground(Color.PINK);
		
		JMenuItem mntmDc = new JMenuItem("DC");
		mntmDc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamDC ob=new teamDC();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmDc);
		mntmDc.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmDc.setBackground(Color.PINK);
		mntmDc.setForeground(Color.BLACK);
		
		JMenuItem mntmRr = new JMenuItem("RR");
		mntmRr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamRR ob=new teamRR();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmRr);
		mntmRr.setForeground(Color.BLACK);
		mntmRr.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmRr.setBackground(Color.PINK);
		
		JMenuItem mntmKiip = new JMenuItem("KXIP");
		mntmKiip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamKXIP ob=new teamKXIP();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mnTeams.add(mntmKiip);
		mntmKiip.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmKiip.setForeground(Color.BLACK);
		mntmKiip.setBackground(Color.PINK);
		
		JMenuItem mntmFutureMatches = new JMenuItem("Match List");
		mntmFutureMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatchList ob=new MatchList();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmFutureMatches.setBackground(Color.PINK);
		mntmFutureMatches.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmFutureMatches.setForeground(Color.BLACK);
		mnMatch.add(mntmFutureMatches);
		
		JMenuItem mntmAllPlayedMatches = new JMenuItem("View match results");
		mntmAllPlayedMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatchResult ob=new MatchResult();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmAllPlayedMatches.setBackground(Color.PINK);
		mntmAllPlayedMatches.setForeground(Color.BLACK);
		mntmAllPlayedMatches.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnMatch.add(mntmAllPlayedMatches);

		JMenuItem mntmPlayerInfornation = new JMenuItem("Player Infornation");
		mntmPlayerInfornation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerInfo ob=new PlayerInfo();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmPlayerInfornation.setBackground(Color.PINK);
		mntmPlayerInfornation.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmPlayerInfornation.setForeground(Color.BLACK);
		mnPlayers.add(mntmPlayerInfornation);
		
		JMenuItem mntmPlayerOfThe = new JMenuItem("Player of the series");
		mntmPlayerOfThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerOfTheSeries ob=new PlayerOfTheSeries();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmPlayerOfThe.setBackground(Color.PINK);
		mntmPlayerOfThe.setForeground(Color.BLACK);
		mntmPlayerOfThe.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnPlayerInfo.add(mntmPlayerOfThe);
		
		JMenuItem mntmOrangeCap = new JMenuItem("Orange Cap");
		mntmOrangeCap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orangeCap ob=new orangeCap();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmOrangeCap.setBackground(Color.PINK);
		mntmOrangeCap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmOrangeCap.setForeground(Color.BLACK);
		mnPlayerInfo.add(mntmOrangeCap);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Purple Cap");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purpleCap ob=new purpleCap();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmNewMenuItem.setBackground(Color.PINK);
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmNewMenuItem.setForeground(Color.BLACK);
		mnPlayerInfo.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Super Striker of the Season");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SSS ob=new SSS();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmNewMenuItem_1.setBackground(Color.PINK);
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mnPlayerInfo.add(mntmNewMenuItem_1);
		
		JMenuItem mntmViewPointsTable = new JMenuItem("View Points Table");
		mntmViewPointsTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointsTable ob=new pointsTable();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmViewPointsTable.setBackground(Color.PINK);
		mntmViewPointsTable.setForeground(Color.BLACK);
		mntmViewPointsTable.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnPointsTable.add(mntmViewPointsTable);
		
		JMenuItem mntmBatsman = new JMenuItem("Batsman");
		mntmBatsman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Top10BT ob=new Top10BT();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmBatsman.setBackground(Color.PINK);
		mntmBatsman.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmBatsman.setForeground(Color.BLACK);
		mnTop.add(mntmBatsman);
		
		JMenuItem mntmBowlers = new JMenuItem("Bowlers");
		mntmBowlers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Top10BW ob=new Top10BW();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmBowlers.setBackground(Color.PINK);
		mntmBowlers.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmBowlers.setForeground(Color.BLACK);
		mnTop.add(mntmBowlers);
		
		JMenuItem mntmSuperStrikers = new JMenuItem("Super Strikers");
		mntmSuperStrikers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Top10SS ob=new Top10SS();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmSuperStrikers.setBackground(Color.PINK);
		mntmSuperStrikers.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmSuperStrikers.setForeground(Color.BLACK);
		mnTop.add(mntmSuperStrikers);
		
		JMenuItem mntmIpl = new JMenuItem("IPL");
		mntmIpl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutIPL ob=new aboutIPL();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmIpl.setBackground(Color.PINK);
		mntmIpl.setForeground(Color.BLACK);
		mntmIpl.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnAbout.add(mntmIpl);
		
		JMenuItem mntmQualifier = new JMenuItem("Qualifier 1");
		mntmQualifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Q1 ob=new Q1();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmQualifier.setForeground(Color.BLACK);
		mntmQualifier.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmQualifier.setBackground(Color.PINK);
		mnQualifierMatches.add(mntmQualifier);
		
		JMenuItem mntmQualifier_1 = new JMenuItem("Qualifier 2");
		mntmQualifier_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Q2 ob=new Q2();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmQualifier_1.setForeground(Color.BLACK);
		mntmQualifier_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmQualifier_1.setBackground(Color.PINK);
		mnQualifierMatches.add(mntmQualifier_1);
		
		JMenuItem mntmQualifier_2 = new JMenuItem("Qualifier 3");
		mntmQualifier_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Q3 ob=new Q3();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmQualifier_2.setForeground(Color.BLACK);
		mntmQualifier_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmQualifier_2.setBackground(Color.PINK);
		mnQualifierMatches.add(mntmQualifier_2);
		
		JMenuItem mntmFinalMatch = new JMenuItem("Final match");
		mntmFinalMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Final ob=new Final();
				desktopPane.add(ob);
				ob.show();
			}
		});
		mntmFinalMatch.setForeground(Color.BLACK);
		mntmFinalMatch.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mntmFinalMatch.setBackground(Color.PINK);
		mnQualifierMatches.add(mntmFinalMatch);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCrickapp.dispose();
				new Login().main(null);
			}
		});
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdmin.setBackground(Color.ORANGE);
		menuBar.add(btnAdmin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.ORANGE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCrickapp.dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setForeground(Color.BLACK);
		menuBar.add(btnExit);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("                   IPL CRICKET INFORMATION SYSTEM");
		mntmNewMenuItem_2.setBackground(Color.ORANGE);
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmNewMenuItem_2);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(240, 240, 240));
		label.setIcon(new ImageIcon("C:\\Users\\Sanathkumar MP\\eclipse-workspace\\DBMS\\IMAGES\\1311196.jpg"));
		label.setBounds(-212, -119, 2048, 1152);
		desktopPane.add(label);
	}
}
