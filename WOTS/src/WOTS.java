import java.sql.*;
import java.util.ArrayList;

public class WOTS {
	public static void main(String[] args) {		
		ResultSet results = JDBCDatabaseManager.query("SELECT * FROM customer_orders");
		JDBCDatabaseManager.update("INSERT INTO customer_orders (status, checked_out) VALUES (1, 1)");
		
		ArrayList<CustomerOrder> CustomerOrders = new ArrayList<CustomerOrder>();
		
		JDBCCustomerOrderDAO cDAO = new JDBCCustomerOrderDAO();
		
		CustomerOrders = cDAO.fetchAll();
	}
}