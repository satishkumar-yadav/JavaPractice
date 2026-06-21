package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/validate")
public class Validate extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String user= req.getParameter("username");
		String pass = req.getParameter("password");
		
		//Actual Credential
		 String username = "";
		 String pwd = "";
		
		Connection con = JdbcConnection.connect();
        try {
			
        	String q = "SELECT * FROM employee WHERE email = ?";
			PreparedStatement ps = con.prepareStatement(q);
			
			ps.setString(1, user);
			
	        ps.execute();
			
			 ResultSet rs = ps.getResultSet();

			 while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					username = rs.getString(3);
					pwd = rs.getString(4);
					double salary = rs.getDouble(5);
		   }
		
				PrintWriter pw = res.getWriter();
				
				if(user.equals(username) && pass.equals(pwd)) {
					pw.print("<h1>Login Success</h1>");
				}
				else {
					pw.print("<h1>Login Failed</h1>");
					RequestDispatcher rd = req.getRequestDispatcher("login.html");
					rd.include(req, res);
				}
	           
			ps.close();
			
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	

}
