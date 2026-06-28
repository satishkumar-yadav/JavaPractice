package mappingMtM;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Task4 {

	// Task 4: Find one student print his details , also fetch courses of this student and print course details, update student name
	public static void main(String[] args) {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Student s = em.find(Student.class, 1);
			
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getPhono()+" "+s.getCourseList());
			
			s.setSname("John");

			//save student
		    em.merge(s);
			
			et.begin();
			et.commit();

	}

}
