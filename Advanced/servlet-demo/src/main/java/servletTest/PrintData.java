package servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class PrintData extends HttpServlet {
	static String name = "Satish";
	static int age = 21;
 	static float height = 5.3f;
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 PrintWriter pw =  resp.getWriter();
    	 String p = "Hello my name is: "+name+" , age: "+age+" , height: "+height ;
    	 System.out.println(p);
    	 pw.print("<h1> "+p+" . </h1>");
    	 
    	 // here h2 will not be identified by browser, only h1 is identified , except it for all other tag we have to explicitely set content type
    	 pw.print("<h2> "+p+" . </h2>");
    	 
    	 // now h2 will be identified
    	 resp.setContentType("text/html");
    	 pw.print("<h2> "+p+" . </h2>");
    	 
    }
}
