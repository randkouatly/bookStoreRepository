package items;

public class Book {

	private String name;
	private double price;
	
	public Book(String name, double price) {	
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("The book: " + this.name + " cost " + this.price + " Euro");
	}
	
	
}
