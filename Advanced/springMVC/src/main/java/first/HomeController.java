package first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	// Servlet methods
	
	@RequestMapping("/hii")
	public String sayHii() {
		System.out.println("sayHii() method started");
		return "hii.jsp";  // jsp file
	}
	
	@Autowired
	HttpServletRequest req;
	
	@RequestMapping("/readData1")
	public String readDataFromFormM1() {
		String name = req.getParameter("userName");
		String age = req.getParameter("userAge");
		String phone = req.getParameter("userPhone");
		System.out.println(name+" "+age+" "+phone);
		return "hii.jsp";
	}
	
	@RequestMapping("/readData2")  // read as well as auto typecast data
	public String readDataFromFormM2(@RequestParam("userName") String name, @RequestParam("userAge") int age, @RequestParam("userPhone") long phone ) {
		System.out.println(name+" "+age+" "+phone);
		return "hii.jsp";
	}
	
	/*
	 * @ModelAttribute
	 * 1. create object of User class
	 * 2. take the data given in the form and store it inside the object using setter method
	 */
	
	// reading data as obj  - M-III
	@RequestMapping("/readData3")
	public String readDataFromFormM3(@ModelAttribute User u) {
		System.out.println(u);
		System.out.println(u.getUserName()+" "+u.getUserAge()+" "+u.getUserPhone());
		return "hii.jsp";
	}
	
	@RequestMapping("/customerData")
	public String readCustomerData(@ModelAttribute Customer c) {
		System.out.println(c.getCustomerId()+" "+c.getCustomerName()+" "+c.getProductName()+" "+c.getProductPrice());
		return "hii.jsp";
	}
	
}
