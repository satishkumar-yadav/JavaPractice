package mappingMtM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Task5 {

	// Task 5: Using student object bring first one course and update the course duration
	public static void main(String[] args) {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Student s = em.find(Student.class, 1);
			
			Course c = s.getCourseList().getFirst();
			c.setDuration(60);
			
			//System.out.println(c);
			
			//update course
		    em.merge(c);
			
			et.begin();
			et.commit();

	}

}
