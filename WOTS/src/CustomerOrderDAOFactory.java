public class CustomerOrderDAOFactory {
	public CustomerOrderDAO getCustomerOrderDAO(String databaseType) {
		if (databaseType == "mysql") {
			return new JDBCCustomerOrderDAO();
		}
		else if (databaseType == "file") {
			return new FileCustomerOrderDAO();
		}
	}
}