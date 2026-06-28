package mappingMtM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Task7 {

	// Task 7: fetch one student setCourses(null), update student and delete that student.
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = em.find(Student.class, 4);
		s1.setCourseList(null);
		
		em.merge(s1);
		
		System.out.println("Student Updated");
		
		em.remove(s1);
		
		System.out.println("Student deleted");
		
		et.begin();
		et.commit();

	}

}
