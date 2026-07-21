package com.first;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")  // common url for entire class
public class HomeController {

	//return any type of data
	
	// http://localhost:8081/hii
//	@RequestMapping("/hii")
	// http://localhost:8081/home/hii
	@GetMapping("/hii")  // specific
	public String sayHii() {
		return "Hii";
	}
	
	@GetMapping("/sample")
	public int sample() {
		return 5846;
	}
	
	
	@GetMapping("/list")
	public List myList() {
		return Arrays.asList(1,98,55,6,0,4);
	}
	
	@GetMapping("/book")
	public Book myBook() {
		return new Book("MahaShweta", "Sudha Murthy", 600.0);
	}
	
	// http://localhost:8081/home/read?id=101&email=tom@gmail.com
	@GetMapping("/read")
	public String readDataFromUrl(@RequestParam("id") int userId, @RequestParam("email") String userEmail) {
		System.out.println(userId + " "+userEmail);
		return "Id: "+userId+", userEmail: "+userEmail;
	}
	
	// http://localhost:8081/home/read2/101/tom@gmail.com
	@GetMapping("/read2/{userId}/{userEmail}")
	public String readDataFromUrl2(@PathVariable("userId") int userId, @PathVariable("userEmail") String userEmail) {
		System.out.println(userId + " "+userEmail);
		return "Id: "+userId+", userEmail: "+userEmail;
	}
	
	//read book obj
	// from postman -- give book json object
	// json obj has to converted to java obj : @RequestBody
	// http://localhost:8081/home/readObj
	@GetMapping("/readObj")
	public String readObj(@RequestBody Book b) {
		System.out.println(b);
		return "book received.";
	}
	
}
