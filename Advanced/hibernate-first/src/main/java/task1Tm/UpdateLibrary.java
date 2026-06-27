package task1Tm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateLibrary {
     //Task 1. Update Library name and phoneNumber
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Library lb = em.find(Library.class, 1);
		lb.setName("Satish Library");
		lb.setPhono(7689452305L);
		
		//update library
		em.merge(lb);

		et.begin();
		et.commit();
	}

}
