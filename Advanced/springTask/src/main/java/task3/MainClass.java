package task3;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext("task3");
		
        String[] objNames = app.getBeanDefinitionNames();
		
		for(String obj: objNames) System.out.println(obj);
		
		System.out.println("---------------------");
		
		List l1 = app.getBean("getAL",List.class);
		System.out.println(l1);
		System.out.println("------------------");
		
		List l2 = app.getBean("getVC",List.class);
		System.out.println(l2);
		System.out.println("------------------");
		
		Set s1 = app.getBean("getHS",Set.class);
		System.out.println(s1);
		System.out.println("------------------");
		
		Set s2 = app.getBean("getAL",Set.class);
		System.out.println(s2);
		System.out.println("------------------");
	
		EntityManagerFactory emf = app.getBean(EntityManagerFactory.class);
		System.out.println(emf);
		
		EntityManager em = app.getBean(EntityManager.class);
		System.out.println(em);
		
		EntityTransaction et = app.getBean(EntityTransaction.class);
		System.out.println(et);
		
        Book b1 = app.getBean(Book.class);
        b1.setTitle("Advanced Java");
        b1.setAuthor("James Gosling");
        b1.setPrice(499.0);

        //Saving book
        em.persist(b1);
        
        //Reading
		Query q = em.createQuery("select b from Book b");
		List<Book> bl = q.getResultList();
		for(Book b: bl) {
			System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());
		}
		
		System.out.println("------------------------------");

		et.begin();
		et.commit();
	}

}
