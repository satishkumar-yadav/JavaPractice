package mappingMtM;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
   public static void main(String[] args) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

        //Many Course
		Course c1 = new Course();
		c1.setName("Core Java");
		c1.setDuration(50);
		
		Course c2 = new Course();
		c2.setName("SQL");
		c2.setDuration(30);
		
		//Save Courses
		em.persist(c1);
		em.persist(c2);
		
		List<Course> courseList = Arrays.asList(c1,c2);
		
		//Many Students
		Student s1 = new Student();
		s1.setSname("John Doe");
		s1.setPhono(9487521632L);
		s1.setCourseList(courseList);
		
		Student s2 = new Student();
		s2.setSname("Jerry");
		s2.setPhono(6485127590L);
		s2.setCourseList(courseList);
		
		//save Students
		em.persist(s1);
		em.persist(s2);
		
		System.out.println("Creating table");
		
		et.begin();
		et.commit();

		System.out.println("Table Created");
}
}
