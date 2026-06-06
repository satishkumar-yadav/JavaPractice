package servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	int num1 = Integer.parseInt(req.getParameter("num1"));
    	int num2 = Integer.parseInt(req.getParameter("num2"));
    	double num3 = Double.parseDouble(req.getParameter("num3"));
    	
    	double res = num1+num2+num3;
    	
    	String p = num1+"+"+num2+"+"+num3+" = "+res;
    	System.out.println(p);
    	
    	PrintWriter pw = resp.getWriter();
    	pw.print("<h1>"+p+"</h1>");
    }
}
