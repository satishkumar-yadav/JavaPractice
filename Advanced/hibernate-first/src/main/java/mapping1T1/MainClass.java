package mapping1T1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		//one engine
		Engine e1 = new Engine();
		e1.setEngid(1);
		e1.setType("Petrol");
		e1.setCc(1000);
		
		//save engine
		em.persist(e1);
		
		//one car
		Car c1 = new Car();
		c1.setCid(101);
		c1.setBrand("Tata");
		c1.setCost(1000000.0);
		c1.setEng(e1);
		
		//save car
		em.persist(c1);
		
		et.begin();
		et.commit();
	}

}
