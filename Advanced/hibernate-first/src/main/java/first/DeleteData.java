package first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = em.find(Student.class, 1);
		if(s1!=null)
			em.remove(s1);
		else 
			System.out.println("No Sudent Found with given id");
		
		et.begin();
		et.commit();
		
		em.close();
		emf.close();

	}

}
