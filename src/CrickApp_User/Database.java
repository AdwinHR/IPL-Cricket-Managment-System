package CrickApp_User;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Database {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//createTable();
		//insertTable();
		//dropTable();
		//Retrieve();

	}
	public static void createTable() throws Exception{
		try {
			Connection conn=getConnection();
			
			PreparedStatement create= conn.prepareStatement("");
			create.executeUpdate();
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("s");}
	}
	
	public static void insertTable() throws Exception{
		try {
			Connection conn=getConnection();
			
			PreparedStatement insert= conn.prepareStatement("insert into player (pname,age,role,season_score,SR,season_wicket) values('sanath',19,'bt',12,123,12);");
			
			insert.executeUpdate();
			
			//JOptionPane.showMessageDialog(CT_frame.contentPane, "Account Created");
			
		}catch(Exception e) {
			//JOptionPane.showMessageDialog(CT_frame.contentPane,"Invalid Data");}
		}
	}
	
	public static ResultSet Retrieve(String Query) throws Exception {
		ResultSet result = null;
		try {
			Connection conn = getConnection();
			
			PreparedStatement select= conn.prepareStatement(Query);
			result = select.executeQuery();
			//System.out.println(result);
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//JOptionPane.showMessageDialog(CT_frame.contentPane, "Error in db.Retrieve");;
		}
		return result;
		
	}
	
	public static Connection getConnection() throws Exception{
		try {
			String url="jdbc:mysql://127.0.0.1:3306/cricket_2019";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection(url,"sanath","2000");
			System.out.println("connected");
			return conn;
			
			}catch(Exception e) {System.out.println(e);}
		return null;
	}
	public static void dropTable() throws Exception {
		try {
			Connection conn=getConnection();
			
			PreparedStatement drop= conn.prepareStatement(" ");
			drop.executeQuery();
		}catch(Exception e1) {
			System.out.println(e1);
		}
	}

}

