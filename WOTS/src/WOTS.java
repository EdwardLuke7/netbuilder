import java.util.ArrayList;
import java.util.Scanner;

public class WOTS {
	public static void main(String[] args) {		
		//ResultSet results = JDBCDatabaseManager.query("SELECT * FROM customer_orders");
		//JDBCDatabaseManager.update("INSERT INTO customer_orders (status, checked_out) VALUES (1, 1)");
		
		CustomerOrderDAOFactory cODAOFactory = new CustomerOrderDAOFactory();
		CustomerOrderDAO cODAO = cODAOFactory.getDAO("mysql"); 
		
		listCustomerOrders(cODAO);
	}
	
	public static void listCustomerOrders(CustomerOrderDAO dao) {
		ArrayList<CustomerOrder> customerOrders = new ArrayList<CustomerOrder>();
		customerOrders = dao.fetchAll();
		
		System.out.println("Listing customer orders...");
		System.out.println("\n"
				+ "ID\tSTATUS\tCHECKOUT");
		for (CustomerOrder order : customerOrders) {
			System.out.println(order);
		}
	}
}