import java.sql.*;

public class JDBCDatabaseManager {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/nbg";
	
	private static final String USER = "root";
	private static final String PASS = "password";
	
	private static Connection openConn() {
		Connection conn = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Esablishing database connection...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	private static void closeConn(Connection conn, Statement stmt) {
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
	
	public static ResultSet query(String query) {
		Connection conn = openConn();
		
		Statement stmt = null;
		ResultSet results = null;
		
		try {
		stmt = conn.createStatement();
		results = stmt.executeQuery(query);
		System.out.println("Data read.");
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		closeConn(conn, stmt);
		return results;
	}
	
	public static void update(String query) {
		Connection conn = openConn();
		
		Statement stmt = null;
		
		try {
		stmt = conn.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Data updated.");
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		closeConn(conn, stmt);
	}
	
/*	public static ResultSet query(String query) {
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
	}*/
}

