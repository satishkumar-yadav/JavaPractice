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
 
}
