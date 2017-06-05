import java.text.NumberFormat;

public class Book {
	
	private String title;
	private String author;
	private String description;
	private boolean inStock;
	private double price;
	private String SKU;
	
	public Book(){
		
	}
	
	public Book(String titl, String writer, String dis, boolean available){
		title = titl;
		author = writer;
		description = dis;
		inStock = available;
	}
	
	public Book(String sku){
		SKU = sku;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}
	

	public String getDisplayText(){
		
		return  " Title: " + title + "\n Author: " + author + "\n Description: " + description 
				+ "\n Price: " + formatPrice(price) ;
	}
	
	
	public double totalPrice(int count){
		double totalPrice = count * price;
	
		return totalPrice;
	}
	
	public String formatPrice(double price2){
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		int count = 1;
		String priceString = currency.format(totalPrice(count));
		return priceString;
	
	}

	@Override
	public String toString() {
		return  " Title: " + title + "\n Author: " + author + "\n Description: " + description 
				+ "\n Price: " + formatPrice(price)  ;
	}
	
	
	

}
