package first;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeOperation {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Details for insertion : id -> name -> salary -> phonenumber -> email -> gender");
		Employee e1 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextLong(), sc.next(), sc.next());  
		//Employee e1 = new Employee(1, "Tom", 28399.0, 9856421032L, "tom@gmail.com", "Male");  
		System.out.println("Enter Employee 2 Details for insertion : id -> name -> salary -> phonenumber -> email -> gender");
		Employee e2 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextLong(), sc.next(), sc.next());  
		//Employee e1 = new Employee(1, "Anju", 20236.25.0, 9856426458L, "anju@gmail.com", "Female");  
		System.out.println("Enter Employee 3 Details for insertion : id -> name -> salary -> phonenumber -> email -> gender");
		Employee e3 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextLong(), sc.next(), sc.next());  
		//Employee e1 = new Employee(1, "John", 29999.52, 9852348102L, "john@gmail.com", "Male");  
		
        // Inserting Employee Data 
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		
		System.out.println("All Employees Inserted Successfully");
		et.begin();
		et.commit();
		
		System.out.println("------------------------------");
		
		//findOneRow
		Employee e = em.find(Employee.class, 1);
		if(e!=null)
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getPhonenumber()+" "+e.getEmail()+" "+e.getGender());
		else 
			System.out.println("No Employee Found with given id");

		//based on salary
		System.out.println("------------------------------");
		System.out.println("Enter Salary of employee to find : ");
		Query q1 = em.createQuery("select emp from Employee emp where emp.salary> ?1");
		q1.setParameter(1, sc.nextDouble());
		List<Employee> ls1 = q1.getResultList();
		for(Employee emp: ls1) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+" "+emp.getPhonenumber()+" "+emp.getEmail()+" "+emp.getGender());
		}
		
		//based on gender
		System.out.println("------------------------------");
		System.out.println("Enter Gender of employee to find : ");
		Query q2 = em.createQuery("select emp from Employee emp where emp.gender= ?1");
		q2.setParameter(1, sc.next());
		List<Employee> ls2 = q2.getResultList();
		for(Employee emp: ls2) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+" "+emp.getPhonenumber()+" "+emp.getEmail()+" "+emp.getGender());
		}
		
		//based on salary and email
		System.out.println("------------------------------");
		System.out.println("Enter Salary and Email of employee to find : ");
		Query q3 = em.createQuery("select emp from Employee emp where emp.salary= ?1 and emp.email= ?2");
		q3.setParameter(1, sc.nextDouble());
		q3.setParameter(2, sc.next());
		List<Employee> ls3 = q3.getResultList();
		for(Employee emp: ls3) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary()+" "+emp.getPhonenumber()+" "+emp.getEmail()+" "+emp.getGender());
		}
		
		//Update 
		System.out.println("------------------------------");
		System.out.println("Enter Id of employee to update : ");
		Employee e4 = em.find(Employee.class, sc.nextInt());
		if(e4!=null)
		{
			//set new data
			System.out.println("Enter Updated Employee Name and Email ");
			e4.setName(sc.next());
			e4.setEmail(sc.next());
			
			em.merge(e4);
			 System.out.println("Employee Updated");
		}
		else 
			System.out.println("No Employee Found with given id");
		
		et.begin();
		et.commit();
		
		//Deleting Employee Details
		System.out.println("------------------------------");
		System.out.println("Enter Id of employee to delete : ");
		Employee e5 = em.find(Employee.class, sc.nextInt());
		if(e5!=null) {
			em.remove(e5);
		   System.out.println("Employee Deleted");
		}
		else 
			System.out.println("No Employee Found with given id");
		
		et.begin();
		et.commit();
		
		em.close();
		emf.close();
		
		System.out.println("Done");
	}

}
