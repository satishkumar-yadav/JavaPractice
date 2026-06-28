package mappingMtM;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Task3 {

	//Task 3: add new course as html and add it to one old student
	public static void main(String[] args) {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();

			Course c = new Course();
			c.setName("html");
			c.setDuration(10);
			
			//save new course
			em.persist(c);
			
			//fetch old student
			Student s1 = em.find(Student.class, 1);
			
			List<Course> courseList = s1.getCourseList();
			courseList.add(c);
			
			s1.setCourseList(courseList);
			//System.out.println(s1);

			//save student
			em.persist(s1);
			
			et.begin();
			et.commit();

	}

}
