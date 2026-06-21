package reqDisp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageB")
public class PageB extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Page B");
		
	//	Object name =req.getAttribute("username");   // req.getAttribute return type is obj
		String name =(String)req.getAttribute("username");
		int age =(Integer)req.getAttribute("userage");
		long phone =(Long)req.getAttribute("userphone");
		Book book =(Book)req.getAttribute("myBook");
		List<String> flowerName =(List)req.getAttribute("myList"); 
		
		String p = name+" "+age+" "+phone+" "+book+" "+flowerName;
		
		System.out.println(p);
		
		PrintWriter pw = res.getWriter();
		pw.println("Dispatched to Page B");
		pw.println("<h1>"+p+"</h1>");
		
	}

	

}
