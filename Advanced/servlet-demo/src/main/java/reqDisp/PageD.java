package reqDisp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageD")
public class PageD extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
        System.out.println("Page D");
		
		PrintWriter pw = res.getWriter();
		pw.println("Page D");
		//pw.println("<h1>"+p+"</h1>");
		
		RequestDispatcher rd = req.getRequestDispatcher("test.html");
		//rd.forward(req, res);
		rd.include(req, res);
	}

	

}
