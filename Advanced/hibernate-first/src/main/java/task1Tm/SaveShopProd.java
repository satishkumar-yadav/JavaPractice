package task1Tm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveShopProd {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p1 = new Product();
		p1.setPid(1);
		p1.setPname("Apple");
		p1.setPrice(180);
		p1.setQty("30 Kg");
		
		Product p2 = new Product();
		p2.setPid(2);
		p2.setPname("Banana");
		p2.setPrice(80);
		p2.setQty("20 Dozen");
		
		//save products
		em.persist(p1);
		em.persist(p2);
		
		//Shops
		Shop s1 = new Shop();
		s1.setId(201);
		s1.setName("A Fruit Shop");
		s1.setAddress("xy1 Colony");
		s1.setProd(p1);
		s1.setProd(p2);
		
		Shop s2 = new Shop();
		s2.setId(301);
		s2.setName("B Fruit Shop");
		s2.setAddress("ab2 Colony");
		s2.setProd(p1);
		s2.setProd(p2);
		
		Shop s3 = new Shop();
		s3.setId(401);
		s3.setName("C Fruit Shop");
		s3.setAddress("pq3 Colony");
		s3.setProd(p1);
		s3.setProd(p2);
		
		//save Shops
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		
		et.begin();
		et.commit();

	}

}
