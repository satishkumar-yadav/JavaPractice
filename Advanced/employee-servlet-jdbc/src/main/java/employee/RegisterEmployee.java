package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg-employee")
public class RegisterEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
    	String name = req.getParameter("name");
    	String email = req.getParameter("email");
    	String password = req.getParameter("password");
    	double salary = Double.parseDouble(req.getParameter("salary"));
    	
    	System.out.println(salary);
    	//System.out.println(salary);
    //	System.out.println(salary);
    	
    	
    	Connection con = JdbcConnection.connect();
        try {
			
        	String q = "INSERT INTO employee VALUES(?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(q);
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setDouble(5, salary);
			
			ps.execute();
			
			ps.close();
			System.out.println("Data inserted");
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
    	
    	PrintWriter pw = res.getWriter();
    	pw.print("<h1>Employee Registered Successfully</h1>");
	}

	

}
