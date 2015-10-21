import java.sql.*;

public class DatabaseManager {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/nbg";
	
	private static final String USER = "root";
	private static final String PASS = "password";
	
/*	private static openConn() {
		Connection conn = null;
		Statement stmt = null; 
		ResultSet results = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Esablishing database connection...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Sending statement...");
			stmt = conn.createStatement();
			results = stmt.executeQuery(query);
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static closeConn() {
		
	}*/
	
	public static ResultSet query(String query) {
		Connection conn = null;
		Statement stmt = null; 
		ResultSet results = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Esablishing database connection...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Sending statement...");
			stmt = conn.createStatement();
			results = stmt.executeQuery(query);
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if (stmt !=null)
					stmt.close();
			}
			catch (SQLException se) {
			
			}
			
			try {
				if (conn != null)
					conn.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			
			System.out.println("Database connection closed.");
		}
		
		return results;
	}
}
