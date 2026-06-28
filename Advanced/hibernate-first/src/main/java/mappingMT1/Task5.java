//package mappingMT1;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Task5 {
//
//	//Task 5: fetch 1 account .. setBank(null), update account and delete that account 
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		
//		Account ac1 = em.find(Account.class, 1);
//		ac1.setBank(null);
//		
//		em.merge(ac1);
//		
//		System.out.println("Account Updated");
//		
//		em.remove(ac1);
//		
//		System.out.println("Account deleted");
//		
//		et.begin();
//		et.commit();
//
//	}
//
//}
