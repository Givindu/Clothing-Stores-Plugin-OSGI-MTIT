package categories;

public class Products {

	private String productName;
	private double productprice;
	private int availability;
	private String productSize;
	private String productDescription;
	public Products(String productName, double productprice, int availability, String productSize,
			String productDescription) {
		super();
		this.productName = productName;
		this.productprice = productprice;
		this.availability = availability;
		this.productSize = productSize;
		this.productDescription = productDescription;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	
}
