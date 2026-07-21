package com.mvc.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

	@Autowired
	HttpServletRequest req;
	@Autowired
	HttpServletResponse res;
	@Autowired
	StudentDb db;
	@Autowired
	List<Student> ls ;

	@RequestMapping("/register")  //reading into java obj
	public String readDataFromRegForm(@ModelAttribute Student s) {
		System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getMarks()+" "+s.getEmail()+" "+s.getPassword());
		boolean status = db.saveStudent(s);  // insert data to table
		if(status) {
			req.setAttribute("msg", "Student Registered Successfully");
			return "Status.jsp";
		}
		else {
			req.setAttribute("msg", "Failed to Register Student");
			return "Status.jsp";
		}
	}

	@RequestMapping("/login")   // reading and auto typecasting
	public String readDataFromFormM2(@RequestParam("email") String email, @RequestParam("password") String password ) {
		System.out.println(email+" "+password);
		ls = db.findStudentByEmailAndPassword(email, password);
		if(!ls.isEmpty()) 	{
			req.setAttribute("msg", "Login Successful");
			return "success.jsp";
		}
		else {
			req.setAttribute("msg", "Login Failed");
			return "failure.jsp";
		}
	}


	@RequestMapping("/verifyEmail")
	public String emailVerification() {
		String email = req.getParameter("email");
		List<Student> ls2= db.findStudentByEmail(email);
		if(!ls2.isEmpty()) {
			int id = ls2.get(0).getId();
			req.setAttribute("id", id);
			return "takeNewPassword.jsp";
		}else {
		  req.setAttribute("msg", "Invalid Email ID Or Register First");
		  return "status.jsp";
		}
	}

	@RequestMapping("/changePassword")
	public String changePassword() {
		String newPassword = req.getParameter("newPassword");
		int id = Integer.parseInt(req.getParameter("id"));
		Student st = db.findStudentById(id);
		st.setPassword(newPassword);
		db.updateStudent(st);
		req.setAttribute("msg", "Password Changed Successfully");
		return "status.jsp";
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("id") int id) {
		// delete student with given id
		Student s = db.findStudentById(id);
		db.deleteStudent(s);
		req.setAttribute("msg", "Student Deleted Successfully");
		return "status.jsp";
	}

	@RequestMapping("/students")
	public String showStudents() {
		// fetch all data from table and give it to jsp , display all data in jsp
		List<Student> students = db.findAllStudent();
		req.setAttribute("students", students);
		return "showData.jsp";
	}

}
