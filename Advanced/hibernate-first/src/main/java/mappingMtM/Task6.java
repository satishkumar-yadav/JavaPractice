package mappingMtM;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task6 {

	// Task 6: Fetch all student and course and display them
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select stu from Student stu");
		List<Student> ls = q.getResultList();
		for(Student s: ls) {
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getPhono()+s.getCourseList());
		}

	}

}
