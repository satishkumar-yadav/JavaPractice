package com.second;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")  
public class HomeController {
	
	   @Autowired
	   BookJPA db;
	   
	// http://localhost:8081/book/saveBook
	   @PostMapping("/saveBook")
	   public String saveBook(@RequestBody Book b) {  // json obj has to converted to java obj : @RequestBody
		   db.save(b);
		   return "Book : "+b+" , Saved";
	   }
	   
		// http://localhost:8081/book/read?id=101&email=tom@gmail.com // from json
		 @GetMapping("/readBook")
		 public String readDataFromUrl(@RequestParam("id") int id) {
			 System.out.println("id: "+id);
			 Optional<Book> op = db.findById(id);
			 if(op.isPresent()) {
				 return "Book : "+op.get()+" ";
			 }
			 return "Book not found";
		 }
		
		// http://localhost:8081/home/read2/101/tom@gmail.com
//		@GetMapping("/read2/{userId}/{userEmail}")
//		public String readDataFromUrl2(@PathVariable("userId") int userId, @PathVariable("userEmail") String userEmail) {
//			
//			return "";
//		}
		 
		 @DeleteMapping("/deleteBook/{id}")
		 public String deleteBook(@PathVariable int id) {
		     db.deleteById(id);
		     return "Book deleted with id: " + id;
		 }

		 
}
