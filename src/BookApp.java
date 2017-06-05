
public class BookApp {

	public static void main(String[] args) {

		BookDatabase books = new BookDatabase();
		books.saveBooks();
	//	System.out.println(books.getBookBySKU("Zombie1005").toString());
		
		for(Book book : books.getBooks()){
			
			System.out.println(book.getDisplayText());
			System.out.println();
		}
	}


}      


