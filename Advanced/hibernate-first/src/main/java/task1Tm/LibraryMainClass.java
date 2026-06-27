package task1Tm;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LibraryMainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		//Many Book
		Book b1 = new Book();
		b1.setTitle("Harry Potter 1");
		b1.setAuthor("JK Rowling)");
		b1.setPrice(800.0);
		
		Book b2 = new Book();
		b2.setTitle("Harry Potter 1");
		b2.setAuthor("JK Rowling)");
		b2.setPrice(850.0);
		
		Book b3 = new Book();
		b3.setTitle("Harry Potter 1");
		b3.setAuthor("JK Rowling)");
		b3.setPrice(900.0);;
		
		//Save all book
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		
		//Create list for bookb
		List<Book> ls = Arrays.asList(b1,b2,b3);
		
		//One Library
		Library l1 = new Library();
		l1.setName("Gov. Library");
		l1.setPhono(9684751283L);
		l1.setBooklist(ls);  // set list of books to library
		
		//Save the library
		em.persist(l1);
		
		System.out.println("Creating table or saving data");
		
		et.begin();
		et.commit();

		System.out.println("Table Created or data saved");

	}

}
