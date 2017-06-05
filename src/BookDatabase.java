
public class BookDatabase {

	private String SKU;
	private Book book;
	
	public String getSKU() {
		return SKU;
	}
	
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Book getBookBySKU(String sku){
		
		this.SKU = sku;
		
		switch (sku){
		
		case "Java1001" : Book b = new Book();
					b.setTitle("Head First Java");
					b.setAuthor("Kathy Sierra and Bert Bates");
					b.setDescription("Easy to read Java workbook");
					b.setPrice(47.50);
					setBook(b);
					break;
		case "Java1002" : Book b1 = new Book();
					b1.setTitle("Thinking in Java");
					b1.setAuthor("Bruce Eckel");
					b1.setDescription("Details about Java under the hood");
					b1.setPrice(20.00);
					setBook(b1) ;
					break;
		case "Orcl1003" : Book b2 = new Book();
					b2.setTitle("OCP: Oracle Certified Professional Java SE");
					b2.setAuthor("Jeanne Boyarsky");
					b2.setDescription("Everything you need to know in one place");
					b2.setPrice(45.00);
					setBook(b2) ;
					break;
		case "Python1004" : Book b3 = new Book();
					b3.setTitle("Automate the Boring Stuff with Python");
					b3.setAuthor("Al Sweigart");
					b3.setDescription("Fun with Python");
					b3.setPrice(10.50);
					setBook(b3);
					break;
		case "Zombie1005" : Book b4 = new Book();
					b4.setTitle("The Maker's Guide to the Zombie Apocalypse");
					b4.setAuthor("Simon Monk");
					b4.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi ");
					b4.setPrice(16.50);
					setBook(b4);
					break;
		case "Rasp1006" : Book b5 = new Book();
					b5.setTitle("Raspberry Pi Projects for the Evil Genius");
					b5.setAuthor("Donald Norris");
					b5.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
					b5.setPrice(14.75);
					setBook(b5);
					break;
					
		}
		
		return book;
		
		
	}
	
}
