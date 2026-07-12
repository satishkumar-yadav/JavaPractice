package project;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDb {
 @Autowired
 EntityManager em;
 @Autowired
 EntityTransaction et;
 
 public void saveBook(Book b) {
	 em.persist(b);
	 et.begin();
	 et.commit();
 }
 
 public void updateBook(Book b) {
	 em.merge(b);
	 et.begin();
	 et.commit();
 }
 
 public void deleteBook(Book b) {
	 em.remove(b);
	 et.begin();
	 et.commit();
 }
 
 public Book findBookById(int bid) {
	 return em.find(Book.class, bid);
 }
 
 public List<Book> findAllBook(){
	 Query q = em.createQuery("select b from Book b");
	 return q.getResultList();
 }
 
 // below are tasks
 public List<Book> findBookByAuthor(String author) {
	 Query q = em.createQuery("select b from Book b where b.author = ?1 ");
	 q.setParameter(1, author);
	 return q.getResultList();
 }
 
 public List<Book> findBookByTitle(String title) {
	 Query q = em.createQuery("select b from Book b where b.title = ?1 ");
	 q.setParameter(1, title);
	 return q.getResultList();
 }
 
 public List<Book> findBookByAuthorAndTitle(String author, String title) {
	 Query q = em.createQuery("select b from Book b where b.title = ?1 and b.author = ?2");
	 q.setParameter(1, title);
	 q.setParameter(2, author);
	 return q.getResultList();
 }
 
 public List<Book> findBookByPriceLessThan(double price) {
	 Query q = em.createQuery("select b from Book b where b.price < ?1 ");
	 q.setParameter(1, price);
	 return q.getResultList();
 }
 
 public List<Book> findBookByPriceBetween(double p1, double p2) {
	 if(p1>p2) { double temp = p1;   p1=p2;   p2=temp;   }
	 Query q = em.createQuery("select b from Book b where b.price > ?1 and b.price < ?2");
	 q.setParameter(1, p1);
	 q.setParameter(2, p2);
	 return q.getResultList();
 }
 
}
