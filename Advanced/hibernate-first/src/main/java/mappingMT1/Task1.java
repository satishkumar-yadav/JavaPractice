//package mappingMT1;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Task1 {
//
//	//Task 1: update any one Account balance
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//
//		Account ac = em.find(Account.class, 1);
//		ac.setBalance(1000.0);
//		
//		//update a/c balance
//		em.merge(ac);
//
//		et.begin();
//		et.commit();
//
//	}
//
//}
