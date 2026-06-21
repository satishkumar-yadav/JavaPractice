package combinedTask;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personInfo")
public class PersonInfo extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int personId = Integer.parseInt(req.getParameter("user-id"));
    	String personName = req.getParameter("user-name");
    	long personPhono = Long.parseLong( req.getParameter("user-phone"));
    	String personEmail = req.getParameter("user-email");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p1 = new Person(personId,personName,personPhono,personEmail);  
		
		 // Inserting Employee Data 
		em.persist(p1);
		
		System.out.println("Person Details Saved Successfully");
		et.begin();
		et.commit();
    	
    	PrintWriter pw = res.getWriter();
    	pw.print("<h1>Person Saved Successfully</h1>");
	}

	

}
