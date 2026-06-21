package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/displayEmployee")
public class DisplayEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ResultSet rs =(ResultSet)req.getAttribute("emp"); 
		 
        try {
			while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String password = rs.getString(4);
			double salary = rs.getDouble(5);
			
			String p ="Emp Id:"+id+", Name:"+name+", Email:"+email+", Password:"+password+", Salary:"+salary;
			System.out.println(p);
			
			PrintWriter pw = res.getWriter();
	    	pw.print("<h1>Employee Details are :</h1>");
	    	pw.print("<h1>"+p+"</h1>");
			
   }
		} catch (SQLException e) {
	
			e.printStackTrace();
		} 
		
		
	}

	

}
