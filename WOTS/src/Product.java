public class Product {
	private final int ID;
	private String name;
	private int stock;
	private boolean porouswear;
	private int[] location;
	
	public Product(int ID, String name, int stock, boolean porouswear, int[] location) {
		this.ID = ID;
		this.name = name;
		this.stock = stock;
		this.porouswear = porouswear;
		this.location = location;
	}
	
	public String toString() {
		String str = ID + " " + name + " " + stock + " " + porouswear + " " + location;
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getLocation() {
		return location;
	}

	public void setLocation(int[] location) {
		this.location = location;
	}

	public int getID() {
		return ID;
	}
	
	public void addStock(int num) {
		this.stock += num;
	}
	
	public void removeStock (int num) {
		this.stock -= num;
	}
}
