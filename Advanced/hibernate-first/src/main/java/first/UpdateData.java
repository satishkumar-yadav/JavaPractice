//package first;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class UpdateData {
//
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		
//		Student s1 = em.find(Student.class, 1);
//		if(s1!=null)
//		{
//			//set new data
//			s1.setStuname("Jerry");
//			s1.setEmail("jerry@gmail.com");
//			
//			em.merge(s1);
//		}
//		else 
//			System.out.println("No Sudent Found with given id");
//		
//		et.begin();
//		et.commit();
//		
//		em.close();
//		emf.close();
//
//	}
//
//}
