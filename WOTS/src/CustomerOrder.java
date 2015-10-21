import java.util.ArrayList;

public class CustomerOrder extends Order {
	private enum Status { PENDING, PICKED, PACKED, DISPATCHED };
	private Status status = Status.PENDING;
		
	public CustomerOrder(int ID, ArrayList<OrderLine> orderLines, boolean checkout, Status status) {
		super(ID, orderLines, checkout);
		this.status = status;
		this.DBTable = "customer_order";
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus (Status status) {
		this.status = status;
	}
}
