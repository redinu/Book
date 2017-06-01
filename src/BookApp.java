
public class BookApp {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.setAuthor("Author: Sydney Sheldon");
		b.setTitle("Title : If tomorrow comes");
		
		b.setDescription("This mini-series focuses on two people, Tracy Whitney and Jeff Stevens."
				+ "\nIn the beginning, Tracy was an innocent, who was in love and pregnant, \n"
				+ "with the son of an affluent family. She is sent to prison for a crime she didn't commit...");
        b.setInStock(true);
        
        b.getDisplayText();
	}

}
