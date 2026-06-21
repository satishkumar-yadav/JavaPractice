package reqDisp;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		String username = "Admin";
		String pwd = "Admin@123";
		
		PrintWriter pw = res.getWriter();
		
		if(user.equals(username) && pass.equals(pwd)) {
			pw.print("<h1>Login Success</h1>");
		}
		else {
			pw.print("<h1>Login Failed</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		
	}

}
