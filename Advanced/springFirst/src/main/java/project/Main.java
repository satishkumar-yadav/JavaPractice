package project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
     public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext("project");
		
		Book b1 = app.getBean(Book.class);
		b1.setTitle("Harry Potter");
		b1.setAuthor("JK Rowling");
		b1.setPrice(750.0);
		
		Book b2 = app.getBean(Book.class);
		b2.setTitle("Manifest");
		b2.setAuthor("Roxie Nafousi");
		b2.setPrice(500.0);
		
		BookDb db = app.getBean(BookDb.class);
		db.saveBook(b1);
		db.saveBook(b2);
	}
}
