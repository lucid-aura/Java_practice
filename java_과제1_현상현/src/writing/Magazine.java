package writing;

public class Magazine {
	public String isbn;
	public String title;
	public String author;
	public String publisher;
	public int year;
	public int month;
	public int price;
	public String desc;

	@Override
	public String toString() {
		return isbn + "\t| " +  title + "\t\t| " + author +" | " + publisher + " | " + price + ((desc.length() > 0)?"| " : "") + desc + "\t\t| " + year + "." + month;
	}
}
