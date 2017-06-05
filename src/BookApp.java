
public class BookApp {

	public static void main(String[] args) {

		BookDatabase books = new BookDatabase();
	//	books.saveBooks();
		System.out.println(books.getBookBySKU("Zombie1005").toString());
	}


}      


