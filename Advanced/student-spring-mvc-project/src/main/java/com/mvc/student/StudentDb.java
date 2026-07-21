package com.mvc.student;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDb {

	@Autowired
	 EntityManager em;
	 @Autowired
	 EntityTransaction et;

	 public boolean saveStudent(Student s) {
		 boolean status = true;
		 try {
			 em.persist(s);
		} catch(EntityExistsException e) {
			status = false;
			System.out.println(e.getMessage());
		}

		 finally {
			 et.begin();
			 et.commit();
		}
		 return status;
	 }

	 public void updateStudent(Student s) {
		 em.merge(s);
		 et.begin();
		 et.commit();
	 }

	 public void deleteStudent(Student s) {
		 em.remove(s);
		 et.begin();
		 et.commit();
	 }

	 public List<Student> findAllStudent(){
		// em.createQuery("select s from Student s", Student.class).getResultList();
		 Query q = em.createQuery("select s from Student s");
		 return q.getResultList();
	 }

	 public Student findStudentById(int id) {
		 return em.find(Student.class, id);
	 }

	 public List<Student> findStudentByEmail(String email) {
		 Query q = em.createQuery("select s from Student s where s.email = ?1 ");
		 q.setParameter(1, email);
		 return q.getResultList();
	 }

	 public List<Student> findStudentByEmailAndPassword(String email, String password) {
		 Query q = em.createQuery("select s from Student s where s.email = ?1 and s.password = ?2");
		 q.setParameter(1, email);
		 q.setParameter(2, password);
		 Student s1 = (Student) q.getSingleResult();
		 System.out.println("s1: "+s1);
		 return q.getResultList();
	 }

	 public List<Student> findBookByNumericalParameter(double param, String attribute) {  // age , marks
		 Query q = em.createQuery("select b from Book b where b."+attribute+" = ?1 ");
		 q.setParameter(1, param);
		 return q.getResultList();
	 }

}
