//package mappingMT1;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//public class Task4 {
//
//	// Fetch all account and banks and display them
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//
//		Query q = em.createQuery("select ac from Account ac");
//		List<Account> ls = q.getResultList();
//		for(Account ac: ls) {
//			System.out.println(ac.getAname()+" "+ac.getBalance()+" "+ac.getBank());
//		}
//
//	}
//
//}
