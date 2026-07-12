package project;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
     public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext("project");
		Scanner sc = app.getBean(Scanner.class);
		
//		Book b1 = app.getBean(Book.class);
//		b1.setTitle("Harry Potter");
//		b1.setAuthor("JK Rowling");
//		b1.setPrice(750.0);
		
//		Book b2 = app.getBean(Book.class);
//		b2.setTitle("Manifest");
//		b2.setAuthor("Roxie Nafousi");
//		b2.setPrice(500.0);
		
		BookDb db = app.getBean(BookDb.class);
//		db.saveBook(b1);
//		db.saveBook(b2);
		
//		Book b2 = db.findBookById(1);
//		System.out.println(b2);
		
		//b2.setPrice(755.0);
		
		//db.updateBook(b2);
		
//		List<Book> b = db.findAllBook();
//		System.out.println(b);
		
		/////////////////Task
		
		System.out.println("Enter Author Name : ");
		List<Book> b3 = db.findBookByAuthor(sc.nextLine());  // "JK Rowling"
		System.out.println(b3);
//		
//		List<Book> b4 = db.findBookByTitle("Manifest");
//		System.out.println(b4);
//		
//		List<Book> b5 = db.findBookByAuthorAndTitle("JK Rowling", "Harry Potter");
//		System.out.println(b5);
//		
//		System.out.println("Enter Price : ");
//		List<Book> b6 = db.findBookByPriceLessThan(sc.nextDouble());
//		System.out.println(b6);
		
//		List<Book> b7 = db.findBookByPriceBetween(800.0, 400.0);
//		System.out.println(b7);
		
	}
}
