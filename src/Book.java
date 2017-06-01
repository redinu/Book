
public class Book {
	
	private String title;
	private String author;
	private String description;
	private boolean inStock;
	
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
	
	public void getDisplayText(){
		System.out.println(title);
		System.out.println(author);
		System.out.println();
		System.out.println(description);
	}
	
	

}
