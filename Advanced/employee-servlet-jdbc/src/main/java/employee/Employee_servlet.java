package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class Employee_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Connection con = JdbcConnection.connect();
		try {
			
			Statement st = con.createStatement();
			
			String query = "CREATE TABLE employee(id int PRIMARY KEY, name VARCHAR(15) , email VARCHAR(30), password VARCHAR(15), salary DECIMAL(5,2))";
			
			st.execute(query);
			
			st.close();
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		PrintWriter pw = res.getWriter();
		pw.println("Table Created");
		
	}


}


