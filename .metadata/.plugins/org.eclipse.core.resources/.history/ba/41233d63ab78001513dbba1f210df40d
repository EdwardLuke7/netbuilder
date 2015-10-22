public class CustomerOrderDAOFactory {
	public CustomerOrderDAO getDAO() {
		return this.getDAO("mysql");
	}
	
	public CustomerOrderDAO getDAO(String databaseType) {
		if (databaseType == "mysql") {
			System.out.println("Factory instancing JDBCCustomerOrderDAO.");
			return new JDBCCustomerOrderDAO();
		}
		else if (databaseType == "file") {
			System.out.println("Factory instancing FileCustomerOrderDAO.");
			//TODO return new FileCustomerOrderDAO();
			return null;
		}
		else {
			System.out.println("CustomerOrderDAOFactory error.");
			return null;
		}
	}
}