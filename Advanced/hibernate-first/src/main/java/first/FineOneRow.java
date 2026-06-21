package first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FineOneRow {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		
		Student s1 = em.find(Student.class, 1);
		if(s1!=null)
			System.out.println(s1.getStuname()+" "+s1.getEmail());
		else 
			System.out.println("No Sudent Found with given id");

	}

}
