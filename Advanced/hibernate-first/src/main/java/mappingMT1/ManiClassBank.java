//package mappingMT1;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class ManiClassBank {
//
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		
//		Bank b = new Bank();
//		b.setName("SBI");
//		b.setBranch("Marathalli");
//		
//		em.persist(b);
//		
//		Account a1 = new Account();
//		a1.setAname("John");
//		a1.setBalance(100.0);
//		a1.setBank(b);
//		
//		Account a2 = new Account();
//		a2.setAname("Tom");
//		a2.setBalance(999.0);
//		a2.setBank(b);
//		
//		Account a3 = new Account();
//		a3.setAname("Pnky");
//		a3.setBalance(566.0);
//		a3.setBank(b);
//		
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
//		
//		
//		et.begin();
//		et.commit();
//
//	}
//
//}
