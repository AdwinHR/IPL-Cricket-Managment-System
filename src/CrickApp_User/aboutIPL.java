package CrickApp_User;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class aboutIPL extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aboutIPL frame = new aboutIPL();
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
	public aboutIPL() {
		setTitle("About IPL");
		setClosable(true);
		getContentPane().setBackground(Color.BLUE);
		setBounds(100, 100, 1232, 679);
		getContentPane().setLayout(null);
		
		JTextArea txtrTheIndianPremier = new JTextArea();
		txtrTheIndianPremier.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 25));
		txtrTheIndianPremier.setForeground(new Color(0, 0, 0));
		txtrTheIndianPremier.setBackground(Color.PINK);
		txtrTheIndianPremier.setText(" \r\n   The Indian Premier League (IPL) is a professional Twenty20 cricket league \r\n in India contested during March or April and May of every year by eight \r\n teams representing eight different cities in India. The league was founded \r\n by the Board of Control for Cricket in India (BCCI) in 2008. IPL has an \r\n exclusive window in ICC Future Tours Programme.\r\n\r\n\r\n    On 13 September 2007, the BCCI announced the launch of a franchise-based \r\n Twenty20 cricket competition called Indian Premier League whose first season \r\n was slated to start in April 2008, in a \"high-profile ceremony\" in New Delhi. \r\n BCCI vice-president Lalit Modi, said to be the mastermind behind the idea of \r\n IPL, spelled out the details of the tournament including its format, the \r\n prize money, franchise revenue system and squad composition rules. It was \r\n also revealed that the IPL would be run by a seven-man governing council \r\n composed of former India players and BCCI officials, and that the top two \r\n teams of the IPL would qualify for that year's Champions League Twenty20. \r\n Modi also clarified that they had been working on the idea for two years and \r\n that IPL was not started as a \"knee-jerk reaction\" to the ICL. The league's \r\n format was similar to that of the Premier League of England and the NBA in \r\n the United States.\r\n");
		txtrTheIndianPremier.setBounds(10, 10, 1200, 630);
		getContentPane().add(txtrTheIndianPremier);

	}
}
