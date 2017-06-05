
public class BookApp {

	public static void main(String[] args) {

		BookDatabase books = new BookDatabase();
		
		System.out.println(books.getBookBySKU("Java1002").toString());
	}


}      


