//package mappingMT1;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class Task3 {
//
//	//Task 3: Store 3 different banks with 2 different accounts each one by one 
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		
//		Bank b1 = new Bank();
//		b1.setName("SBI");
//		b1.setBranch("Marathalli");
//
//		em.persist(b1);
//		
//		Bank b2 = new Bank();
//		b2.setName("ICICI");
//		b2.setBranch("Sarjapur");
//
//		em.persist(b2);
//		
//		Bank b3 = new Bank();
//		b3.setName("Axis");
//		b3.setBranch("ITPL");
//
//		em.persist(b3);
//		
//		Account a1 = new Account();
//		a1.setAname("Ram");
//		a1.setBalance(1245.0);
//		a1.setBank(b1);
//		
//		Account a2 = new Account();
//		a2.setAname("Shyam");
//		a2.setBalance(120.0);
//		a2.setBank(b1);
//		
//		Account a3 = new Account();
//		a3.setAname("Sheela");
//		a3.setBalance(12.0);
//		a3.setBank(b2);
//		
//		Account a4 = new Account();
//		a4.setAname("Mukesh");
//		a4.setBalance(754.0);
//		a4.setBank(b2);
//		
//		Account a5 = new Account();
//		a5.setAname("Sk");
//		a5.setBalance(2999.0);
//		a5.setBank(b3);
//		
//		Account a6 = new Account();
//		a6.setAname("Nk");
//		a6.setBalance(1566.0);
//		a6.setBank(b3);
//		
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
//		em.persist(a4);
//		em.persist(a5);
//		em.persist(a6);
//		
//		
//		et.begin();
//		et.commit();
//
//	}
//
//}
