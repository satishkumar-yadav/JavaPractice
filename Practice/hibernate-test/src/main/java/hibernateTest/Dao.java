package hibernateTest;

import org.hibernate.Session;

import jakarta.transaction.Transaction;

public class Dao {
    Session session = HibernateUtil.getSessionFactory().openSession();
Transaction tx = session.beginTransaction();
User user = new User();
user.setName("Satish");
user.setEmail("satish@example.com");
session.save(user);
tx.commit();
session.close();

}
