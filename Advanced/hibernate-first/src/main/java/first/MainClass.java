package first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//create entity object - provide data using parameterised constructor or getter/setter methods
		Student s1 = new Student(1, "Tom", 90.0, "tom@gmail.com");  
		Student s2 = new Student(2, "John", 80.0, "john@gmail.com");
		Student s3 = new Student(3, "Doe", 87.0, "doe@gmail.com");
		
		//save - persist
		//em.persist(s1);  //inserting single value at once
		em.persist(s2);
		em.persist(s3);
		
		et.begin();
		et.commit();
		
		em.close();
		emf.close();
		
		System.out.println("Done");
		

	}

}
