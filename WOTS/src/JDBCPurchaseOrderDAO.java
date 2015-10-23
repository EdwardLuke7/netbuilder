import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPurchaseOrderDAO extends JDBCDAO implements PurchaseOrderDAO {
	public void create(PurchaseOrder order) {
		update("INSERT INTO purchase_order (status, checked_out) VALUES (" + order.getStatus() + ", " + order.getCheckout() + ")");
	}

	public void update(PurchaseOrder order) {
		update("UPDATE purchase_order SET status=" + order.getStatus() + ",checked_out=" + order.getCheckout() + " WHERE (id=" + order.getID() + ")");
	}
	
	public PurchaseOrder fetch(int id) {
		ResultSet results = query("SELECT * FROM purchase_orders WHERE id = " + id);
		PurchaseOrder order = null;
				
		try {
			results.next();
			int status = results.getInt("status");
			boolean checkout = results.getBoolean("checked_out");
			order = new PurchaseOrder(id, null, checkout, status);
		} 
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return order;
	}
	
	public ArrayList<PurchaseOrder> fetchAll() {
		ArrayList<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();
		
		ResultSet results = query("SELECT * FROM purchase_orders ORDER BY timestamp asc");
		
		try {
			while (results.next()) {
				int id = results.getInt("id");
				int status = results.getInt("status");
				boolean checkout = results.getBoolean("checked_out");
				PurchaseOrder order = new PurchaseOrder(id, null, checkout, status);
				
				orders.add(order);
			}
		} 
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return orders;
	}
}
