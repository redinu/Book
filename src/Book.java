
public class Book {
	
	private String title;
	private String author;
	private String description;
	private boolean inStock;
	private int price;
	
	public Book(){
		
	}
	
	public Book(String titl, String writer, String dis, boolean available){
		title = titl;
		author = writer;
		description = dis;
		inStock = available;
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
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void getDisplayText(){
		System.out.println(title);
		System.out.println(author);
		System.out.println();
		System.out.println(description);
		
		if (isInStock()){
	    	   setPrice(20);
	    	   System.out.println();
	           System.out.println("Total Price: " + totalPrice(3) );
	       } else {
	    	   System.out.println();
	    	   System.out.println("Sorry! Item is currently unavailable");
	       }
		}
	
	
	public int totalPrice(int count){
		
		int totalPrice = count * price;
		
		return totalPrice;
	}
	
	

}
