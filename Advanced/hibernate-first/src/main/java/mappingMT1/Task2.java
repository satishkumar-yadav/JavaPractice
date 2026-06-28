//package mappingMT1;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Task2 {
//
//	// Task 2: Using Account object bring first bank and update that bank address and name
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		
//		Account ac = em.find(Account.class, 1);
//		 
//		Bank b = ac.getBank();
//		
//		b.setName("Kotak");
//		b.setBranch("BTM");
//		
//		//update account
//		em.merge(ac);
//		
//		et.begin();
//		et.commit();
//
//	}
//
//}
