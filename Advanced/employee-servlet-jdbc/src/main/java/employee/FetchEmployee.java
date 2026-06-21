package employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchEmployee")
public class FetchEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection con = JdbcConnection.connect();
        try {
			
        	String q = "SELECT * FROM employee";
			Statement st = con.createStatement();
			
	        st.execute(q);
			
			 ResultSet rs = st.getResultSet();

	            req.setAttribute("emp", rs); 
	    		
	    		//RequestDispatcher rd = req.getRequestDispatcher("displayEmployee");
	    		RequestDispatcher rd = req.getRequestDispatcher("displayEmp.jsp");
	    		rd.forward(req, res);
	            
			st.close();
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
    	
    	
	}

	

}
