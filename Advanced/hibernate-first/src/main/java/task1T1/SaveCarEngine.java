package task1T1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class SaveCarEngine {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		//5 engine
//		Engine e1 = new Engine();
//		e1.setEngid(2);
//		e1.setType("Petrol");
//		e1.setCc(1000);
		
//		Engine e2 = new Engine();
//		e2.setEngid(3);
//		e2.setType("CNG");
//		e2.setCc(1000);
		
//		Engine e3 = new Engine();
//		e3.setEngid(4);
//		e3.setType("Ev");
//		e3.setCc(800);
		
//		Engine e4 = new Engine();
//		e4.setEngid(5);
//		e4.setType("Petrol");
//		e4.setCc(2000);
		
//		Engine e5 = new Engine();
//		e5.setEngid(6);
//		e5.setType("CNG");
//		e5.setCc(1200);
		
		//save engines
	//	em.persist(e1);
//		em.persist(e2);
//		em.persist(e3);
//		em.persist(e4);
//		em.persist(e5);
		
		//5 cars
//		Car c1 = new Car();
//		c1.setCid(201);
//		c1.setBrand("Tata");
//		c1.setCost(1000000.0);
//		c1.setEng(e1);
		
//		Car c2 = new Car();
//		c2.setCid(301);
//		c2.setBrand("Tata");
//		c2.setCost(5000000.0);
//		c2.setEng(e5);
//		
//		Car c3 = new Car();
//		c3.setCid(401);
//		c3.setBrand("Tata");
//		c3.setCost(8000000.0);
//		c3.setEng(e4);
//		
//		Car c4 = new Car();
//		c4.setCid(501);
//		c4.setBrand("Tata");
//		c4.setCost(2000000.0);
//		c4.setEng(e1);
//		
//		Car c5 = new Car();
//		c5.setCid(601);
//		c5.setBrand("Tata");
//		c5.setCost(3000000.0);
//		c5.setEng(e2);
		
		//save cars
	//	em.persist(c1);
//		em.persist(c2);
//		em.persist(c3);
//		em.persist(c4);
//		em.persist(c5);
		
		et.begin();
		et.commit();

	}

}
