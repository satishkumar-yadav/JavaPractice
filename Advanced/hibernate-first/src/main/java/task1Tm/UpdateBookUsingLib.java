package task1Tm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBookUsingLib {

	//Task 2. Using library object bring first book and update that Book price
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Library lb = em.find(Library.class, 1);
		
		List<Book> booklist = lb.getBooklist();
		
		//System.out.println(booklist);
		
		Book b1 = booklist.getFirst();
		b1.setPrice(3000.0);
		
		//System.out.println(b1);
		//System.out.println(booklist);
		
		//update library
		em.merge(lb);

		et.begin();
		et.commit();

	}

}
