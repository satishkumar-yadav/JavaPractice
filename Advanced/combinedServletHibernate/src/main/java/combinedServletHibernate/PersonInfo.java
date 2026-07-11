package combinedServletHibernate;

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
		//person-details
		//int personId = Integer.parseInt(req.getParameter("user-id"));
    	String personName = req.getParameter("user-name");
    	long personPhono = Long.parseLong( req.getParameter("user-phone"));
    	String personEmail = req.getParameter("user-email");
    	
    	//address-details
    	int housenumber = Integer.parseInt(req.getParameter("housenumber"));
    	String area = req.getParameter("area");
    	String city = req.getParameter("city");
    	int pincode = Integer.parseInt(req.getParameter("pincode"));
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Address ad = new Address();
		ad.setHousenumber(housenumber);
		ad.setArea(area);
		ad.setCity(city);
		ad.setPincode(pincode);
		
		//Save Address
		em.persist(ad);
		
		Person p = new Person();  
		p.setPersonname(personName);
		p.setPhone(personPhono);
		p.setEmail(personEmail);
		p.setAddress(ad);
		
		//Save person
		em.persist(p);
		
		System.out.println("Person Details Saved Successfully");
		et.begin();
		et.commit();
    	
    	PrintWriter pw = res.getWriter();
    	pw.print("<h1>Person Saved Successfully</h1>");
	}

}

