import java.util.ArrayList;

public interface CustomerOrderDAO {
//	public void create(CustomerOrder order);
	public void update(CustomerOrder order);
	public ArrayList<CustomerOrder> fetchAll();
}
