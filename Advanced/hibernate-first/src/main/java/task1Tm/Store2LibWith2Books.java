//package task1Tm;
//
//import java.util.Arrays;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Store2LibWith2Books {
// 
//	//Task 3. Store 2 diff Library with 2 Book in each
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//
//		//Many Book
//		Book b1 = new Book();
//		b1.setTitle("Programming in C");
//		b1.setAuthor("Dennis Ritchie");
//		b1.setPrice(670.0);
//		
//		Book b2 = new Book();
//		b2.setTitle("Baics of DAA");
//		b2.setAuthor("Rheema Tharega");
//		b2.setPrice(920.0);
//		
//		Book b3 = new Book();
//		b3.setTitle("Basic Mathematics");
//		b3.setAuthor("RS Agrawal");
//		b3.setPrice(320.0);
//		
//		Book b4 = new Book();
//		b4.setTitle("Advanced Mathematics");
//		b4.setAuthor("RD Sharma");
//		b4.setPrice(520.0);
//		
//		//Save all book
//		em.persist(b1);
//		em.persist(b2);
//		em.persist(b3);
//		em.persist(b4);
//	
//		//Create list for books
//		List<Book> ls1 = Arrays.asList(b1,b2);
//		List<Book> ls2 = Arrays.asList(b3,b4);
//		
//		//Two Library
//		Library l1 = new Library();
//		l1.setName("CS Lib1");
//		l1.setPhono(7654751283L);
//		l1.setBooklist(ls1);  // set list of books to library
//		
//		Library l2 = new Library();
//		l2.setName("CS Lib2");
//		l2.setPhono(7423751283L);
//		l2.setBooklist(ls2);
//		
//		//Save the library
//		em.persist(l1);
//		em.persist(l2);
//		
//		
//		System.out.println("Creating table or saving data");
//		
//		et.begin();
//		et.commit();
//
//		System.out.println("Table Created or data saved");
//	}
//
//}
