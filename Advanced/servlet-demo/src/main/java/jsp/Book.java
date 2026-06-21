package jsp;

public class Book {
	String author;
	String title;
	double price;
	public Book(String author, String title, double price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [author="+author+", title="+title+", price="+price+"]";
	}
	
}	