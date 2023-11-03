package inventory;

public class Product {
	private String name;
	private int id;
	private int stock;
	private int price;
	
	public Product() {
		
	}

	public Product (String name, int id, int stock, int price) {
		this.name = name;
		this.id = id;
		this.stock = stock;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return  "\nItem number: " + id + 
				"\nName: " + name + 
				"\nQuantity in stock: " + stock + 
				"\nPrice: " + price ;
	}
	
	
	
}
