//package mapping1TM;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Program {
//
//	//add new books to already existed library
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//
//		//Many Book
//		Book b1 = new Book();
//		b1.setTitle("Fourth Wing");
//		b1.setAuthor("Rebecca Yaros)");
//		b1.setPrice(1200.0);
//		
//		Book b2 = new Book();
//		b2.setTitle("Onyx Storm");
//		b2.setAuthor("Rebecca Yaros)");
//		b2.setPrice(1800.0);
//		
//		//Save all book
//		em.persist(b1);
//		em.persist(b2);
//		
//		//add books to old library
//		Library oldLib = em.find(Library.class, 1);
//		//fetch oldlist of books from library
//		List<Book> oldList = oldLib.getBooklist();
//		
//		//add new books
//		oldList.add(b1);
//		oldList.add(b2);
//		
//		//set back the updated list to same library
//		oldLib.setBooklist(oldList);
//		
//		//update library
//		em.merge(oldLib);
//
//		et.begin();
//		et.commit();
//		
//		/*
//		 * Task
//		 * 1. Update Library name and phoneNumber
//		 * 2. Using library object bring first book and update that Book price
//		 * 3. Store 2 diff Library with 2 Book in each
//		 * 4. Fetch all Library and Book and display them
//		 * 5. fetch one Library along with its all Book and delete all of them.
//		 */
//	}
//
//}
