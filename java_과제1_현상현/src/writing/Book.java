package writing;

public class Book {
	public String isbn;
	public String title;
	public String author;
	public String publisher;
	public int price;
	public String desc;

	@Override
	public String toString() {
		return isbn + "\t| " + title + " \t\t| " + author +" | " + publisher +  (publisher.length() <15 ?" \t | " : " | ") + price + " \t" + (desc.length() > 0?"| " : "") + desc;
	}
	
}
