package task1Tm;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Store2LibWith2Books {

	//Task 3. Store 2 diff Library with 2 Book in each
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
		
		//Save all book
		em.persist(b1);
		em.persist(b2);
	
		//Create list for bookb
		List<Book> ls = Arrays.asList(b1,b2);
		
		//Two Library
		Library l1 = new Library();
		l1.setName("CS Lib");
		l1.setPhono(6874751283L);
		l1.setBooklist(ls);  // set list of books to library
		
		Library l2 = new Library();
		l2.setName("Gov. Library");
		l2.setPhono(9684751283L);
		l2.setBooklist(ls);
		
		//Save the library
		em.persist(l1);
		em.persist(l2);
		
		
		System.out.println("Creating table or saving data");
		
		et.begin();
		et.commit();

		System.out.println("Table Created or data saved");
	}

}
