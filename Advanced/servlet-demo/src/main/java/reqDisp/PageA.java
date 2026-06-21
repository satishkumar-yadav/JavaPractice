package reqDisp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageA")
public class PageA extends HttpServlet {
  
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setAttribute("username", "Satish");
		req.setAttribute("userage", 24); 
		req.setAttribute("userphone", 9856741235L);
		
		Book b = new Book("Jk Rowling","Harry Potter",800.0);
		
		req.setAttribute("myBook", b);
		
		List<String> ls =Arrays.asList("Rose","Lily","Tulip");
		req.setAttribute("myList", ls);
		
		
		System.out.println("Page A");
		RequestDispatcher rd = req.getRequestDispatcher("pageB");
		rd.forward(req, res);
		System.out.println("Page B - A");
	}

}

class Book {
	String author;
	String title;
	double price;
	public Book(String author, String title, double price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [author="+author+", title="+title+", price="+price+"]";
	}
	
}
