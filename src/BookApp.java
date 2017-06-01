
public class BookApp {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.setAuthor("Author: Sydney Sheldon");
		b.setTitle("Title : If tomorrow comes");
		
		b.setDescription("\t This mini-series focuses on two people, Tracy Whitney and Jeff Stevens."
				+ "\n\t In the beginning, Tracy was an innocent, who was in love and pregnant, \n"
				+ "\t with the son of an affluent family. She is sent to prison for a crime she didn't commit...");
        b.setInStock(false);
        
       b.getDisplayText();
      
       
	}      

}
