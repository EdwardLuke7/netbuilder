import java.util.ArrayList;

public class JDBCCustomerOrderDAO implements CustomerOrderDAO {
	public void save(CustomerOrder order) {
		JDBCDatabaseManager.update("INSERT INTO customer_orders (status, checked_out) VALUES (" + order.getStatus() + " " + order.getCheckout() + ")");
	}
	
	public void update(CustomerOrder order) {
		//TODO Save changes method
	}
	
	public CustomerOrder fetchByID(int ID) {
		CustomerOrder order = null;
		
		return order;
	}
	
	public void delete(CustomerOrder order) {
		
	}
	
	public ArrayList<CustomerOrder> fetchAll() {
		ArrayList<CustomerOrder> orders = null;
		
		return orders;
	}
}
