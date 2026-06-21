package first;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select stu from Student stu");
		List<Student> ls = q.getResultList();
		for(Student s: ls) {
			System.out.println(s.getStuid()+" "+s.getStuname()+" "+s.getMarks());
		}
		
		System.out.println("------------------------------");
		Query q2 = em.createQuery("select stu from Student stu where stu.marks>79.0");
		List<Student> ls2 = q2.getResultList();
		for(Student s: ls2) {
			System.out.println(s.getStuid()+" "+s.getStuname()+" "+s.getMarks());
		}
		
		System.out.println("------------------------------");
		Query q3 = em.createQuery("select stu from Student stu where stu.marks> ?1");
		q3.setParameter(1, 86.0);
		List<Student> ls3 = q3.getResultList();
		for(Student s: ls3) {
			System.out.println(s.getStuid()+" "+s.getStuname()+" "+s.getMarks());
		}
		
		System.out.println("------------------------------");
		Query q4 = em.createQuery("select stu from Student stu where stu.stuname= ?1 and stu.email= ?2");
		q4.setParameter(1, "John");
		q4.setParameter(2, "john@gmail.com");
		List<Student> ls4 = q4.getResultList();
		for(Student s: ls4) {
			System.out.println(s.getStuid()+" "+s.getStuname()+" "+s.getMarks());
		}
		
	}

}
