package com.pa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person") 
public class PersonController {

	  @Autowired
	  private PersonRepo db;
	  @Autowired
	  private AadhaarRepo adb;
		
	    // http://localhost:8081/person/savePerson
		// 1. Save Person with mapping to existing Aadhaar (Pass aadhaarid as PathVariable)
		    @PostMapping("/savePerson/{aadhaarId}")
		    public String savePerson(@RequestBody Person person, @PathVariable("aadhaarId") int aadhaarId) {
		        Optional<Aadhaar> aadhaarOpt = adb.findById(aadhaarId);
		        if (aadhaarOpt.isPresent()) {
		            person.setAadhaar(aadhaarOpt.get());
		            db.save(person);
		            return "Person Saved";
		        }
		        return "Aadhaar ID " + aadhaarId + " not found!";
		    }

		 // http://localhost:8081/book/read?id=101&email=tom@gmail.com 
			 @GetMapping("/readPerson")
			 public String readDataFromUrl(@RequestParam("id") int id) {
				 System.out.println("id: "+id);
				 Optional<Person> op = db.findById(id);
				 if(op.isPresent()) {
					 return "Person : "+op.get()+" ";
				 }
				 return "Person not found";
			 }
		    
		    // 2. Fetch Person by ID
		    @GetMapping("/getPerson/{id}")
		    public Person getPersonById(@PathVariable("id") int pid) {
		        Optional<Person> optional = db.findById(pid);
		        return optional.orElse(null);
		    }

		    // 3. Fetch All Persons
		    @GetMapping("/getAllPerson")
		    public List<Person> getAllPersons() {
		        return db.findAll();
		    }

		    // 4. Update Person details
		    @PutMapping("/updatePerson/{id}")
		    public String updatePerson(@PathVariable("id") int pid, @RequestBody Person personDetails) {
		        Optional<Person> optional = db.findById(pid);
		        if (optional.isPresent()) {
		            Person existingPerson = optional.get();
		            existingPerson.setName(personDetails.getName());
		            existingPerson.setAge(personDetails.getAge());
		            existingPerson.setGender(personDetails.getGender());
		            db.save(existingPerson);
		            return "Person Updated";
		        }
		        return "Person not found";
		    }

		    // 5. Delete Person by ID
		    // http://localhost:8081/person/deletePerson/1
		    @DeleteMapping("/deletePerson/{id}")
		    public String deletePerson(@PathVariable("id") int pid) {
		        if (db.existsById(pid)) {
		        	Person p1 = db.getById(pid);
		        	int aid = p1.getAadhaar().getAid();
		        	adb.deleteById(aid);
		            db.deleteById(pid);
		            return "Person deleted successfully with ID: " + pid;
		        }
		        return "Person not found with ID: " + pid;
		    }
	
}
