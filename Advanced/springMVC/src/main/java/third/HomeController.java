package third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@Autowired
	HttpServletRequest req;
	
	@RequestMapping("/verifyEmail")
	public String emailVerification() {
		String email = req.getParameter("email");
		
		//check if email is present in db
		//if present display takeNewPassword.jsp
		//else Invalid EmailId or Register First
		
		return "hii.jsp";
	}

	@RequestMapping("/changePassword")
	public String changePassword(@RequestParam("newPassword") String password, @RequestParam("id") int id) {
		// update password in db display login page
		
		return "hii.jsp";
	}
	
	
	

	//@RequestMapping("/readData3")
//	public String readDataFromFormM3(@ModelAttribute User u) {	System.out.println(u.getUserName()+" "+u.getUserAge()+" "+u.getUserPhone());
//		return "hii.jsp";
//	}
	

	
}

