package mappingMtM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task2 {

	// Task 2: add new student and set old course only core java
	public static void main(String[] args) {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();

			Query q = em.createQuery("select cour from Course cour");
			List<Course> ls = q.getResultList();
			List<Course> courseList = new ArrayList<>();
			for(Course c: ls) {
				if(c.getName().equalsIgnoreCase("Core Java")) courseList.add(c);
			}

			Student s1 = new Student();
			s1.setSname("Tonu");
			s1.setPhono(7456521632L);
			s1.setCourseList(courseList);
			
			//save Students
			em.persist(s1);
			
			et.begin();
			et.commit();

	}

}
