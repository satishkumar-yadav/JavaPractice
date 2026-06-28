//package task1Tm;
//
//import java.util.List;
//
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//public class DisplayAllBooks {
//
//	//Task  4. Fetch all Library and Book and display them
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//	//	EntityTransaction et = em.getTransaction();
//
//		Query q = em.createQuery("select lib from Library lib");
//		List<Library> ls = q.getResultList();
//		for(Library l: ls) {
//			System.out.println(l.getName()+" "+l.getPhono()+" "+l.getBooklist());
//		}
//		
////		int id=1;
////		while(true) {
////			Library lb = em.find(Library.class, id);
////			System.out.println(lb);
////			if(lb==null) break;
////			id++;
////		}
//		
//		
//	} 
//
//}
