package CrickApp_Admin;


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
	public static int update(String Q) throws Exception{
		try {
			Connection conn=getConnection();
			
			PreparedStatement create= conn.prepareStatement(Q);
			create.executeUpdate();
			
			return 1;
		}catch(Exception e) {
			System.out.println(e);}
		    return 0;
		}
	
	public static int insertTable(String Query) throws Exception{
		try {
			Connection conn=getConnection();
			
			PreparedStatement insert= conn.prepareStatement(Query);
			
			insert.executeUpdate();
			
			return 1;
			
		}catch(Exception e) {
			System.out.println(e);
			return 0;
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
			System.out.println(e);
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

