package mappingMtM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task1 {

	// Task 1: add new student and set old course core java, sql
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();

			Query q = em.createQuery("select cour from Course cour");
			List<Course> ls = q.getResultList();
			List<Course> courseList = new ArrayList<>();
			for(Course c: ls) {
				if(c.getName().equalsIgnoreCase("Core Java") || c.getName().equalsIgnoreCase("SQL") ) courseList.add(c);
			}
			
			//System.out.println(courseList);

			Student s1 = new Student();
			s1.setSname("Tom");
			s1.setPhono(6245521632L);
			s1.setCourseList(courseList);
			
			//save Students
			em.persist(s1);
			
			et.begin();
			et.commit();
	}

}
