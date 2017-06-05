import java.util.ArrayList;

public class BookDatabase {

	private String SKU;
	private ArrayList<Book> books = new ArrayList<Book> ();
	
	public String getSKU() {
		return SKU;
	}
	
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public void saveBooks(){
		
		Book b = new Book();
		b.setTitle("Head First Java");
		b.setAuthor("Kathy Sierra and Bert Bates");
		b.setDescription("Easy to read Java workbook");
		b.setPrice(47.50);
		books.add(b);
		books.set(0, b);

		Book b1 = new Book();
		b1.setTitle("Thinking in Java");
		b1.setAuthor("Bruce Eckel");
		b1.setDescription("Details about Java under the hood");
		b1.setPrice(20.00);
		books.add(b1);
		books.set(1, b1);

		Book b2 = new Book();
		b2.setTitle("OCP: Oracle Certified Professional Java SE");
		b2.setAuthor("Jeanne Boyarsky");
		b2.setDescription("Everything you need to know in one place");
		b2.setPrice(45.00);
		books.add(b2);
		books.set(2, b2);

		Book b3 = new Book();
		b3.setTitle("Automate the Boring Stuff with Python");
		b3.setAuthor("Al Sweigart");
		b3.setDescription("Fun with Python");
		b3.setPrice(10.50);
		books.add(b3);
		books.set(3, b3);

		Book b4 = new Book();
		b4.setTitle("The Maker's Guide to the Zombie Apocalypse");
		b4.setAuthor("Simon Monk");
		b4.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi ");
		b4.setPrice(16.50);
		books.add(b4);
		books.set(4, b4);

		Book b5 = new Book();
		b5.setTitle("Raspberry Pi Projects for the Evil Genius");
		b5.setAuthor("Donald Norris");
		b5.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
		b5.setPrice(14.75);
		books.add(b5);
		books.set(5, b5);
		
		
		
	}
	public Book getBookBySKU(String sku){
		
		this.SKU = sku;
		int index=0;
		
		switch (sku){
		
		case "Java1001" : index=0;
					break;
		case "Java1002" : index=1;
					break;
		case "Orcl1003" : index=2;
					break;
		case "Python1004" : index=3; 
					break;
		case "Zombie1005" :index=4;
					break;
		case "Rasp1006" : index=5;
					break;
					
		}
		
		
		return books.get(index);
		
		
	}
	
}
