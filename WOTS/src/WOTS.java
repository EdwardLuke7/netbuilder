import java.sql.*;

public class WOTS {
	public static void main(String[] args) {
		
		Product product1 = new Product(0, "one direction gnome", 10, true, null);
		Product product2 = new Product(1, "red gnome", 10, true, null);
		Product product3 = new Product(2, "super gnome", 10, true, null);
		Product product4 = new Product(3, "fishing gnome", 10, true, null);
		Product product5 = new Product(4, "plain gnome", 10, true, null);
		
		Product products[] = {product1, product2, product3, product4, product5};
		
		for (Product product : products) {
			System.out.println(product);
		}
		
		ResultSet results = DatabaseManager.query("SELECT * FROM customer_orders");
	}
}