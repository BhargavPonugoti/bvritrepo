package bean;

public class Product {

	private int ProductId;
	private String ProductName;
	private double price ;
	public Product(int ProductId, String ProductName, double price) {
		super();
		this.ProductId = ProductId;
		this.ProductName = ProductName;
		this.price = price;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return ProductId;
	}
	public void setEmployeeId(int ProductId) {
		this.ProductId = ProductId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setEmployeeName(String ProductName) {
		this.ProductName = ProductName;
	}
	public double getprice() {
		return price;
	}
	public void setSalary(double price) {
		this.price = price;
	}
	
	
}
