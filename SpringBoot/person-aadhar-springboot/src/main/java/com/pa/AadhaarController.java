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
@RequestMapping("/aadhaar")
public class AadhaarController {

	@Autowired
	private AadhaarRepo adb;
	
	   //1. Create aadhaar
	   // http://localhost:8081/aadhaar/saveAadhaar
	   @PostMapping("/saveAadhaar")
	   public String saveAadhaar(@RequestBody Aadhaar a) {  
		   adb.save(a);
		   return "Aadhaar : "+a+" , Saved";
	   }
	   
	   //2.Fetch Aadhar by Id
		// http://localhost:8081/aadhaar/read?aid=1
		 @GetMapping("/read")
		 public String readAadharWithAid(@RequestParam("aid") int id) {
			 Optional<Aadhaar> op = adb.findById(id);
			 if(op.isPresent()) {
				 return "Aadhar : "+op.get()+" ";
			 }
			 return "Aadhar not found";
		 }
		
		//3.Fetch All Aadhar Records
		// http://localhost:8081/aadhaar/getAllAadhar
		 @GetMapping("/getAllAadhar")
		public List getAllAadhar() {
			List ad = adb.findAll();
			if(!ad.isEmpty()) {
			return ad;
			}
			ad.add("Aadhar not found");
			return ad;
		}
		 
		 //4.Update Aadhar
		// http://localhost:8081/aadhaar/updateAadhar/1
		 @PutMapping("/updateAadhar/{id}")
		 public String updateAadhar(@PathVariable("id") int aid, @RequestBody Aadhaar ad) {
			 Optional<Aadhaar> op = adb.findById(aid);
			 if(op.isPresent()) {
				 Aadhaar existingAdhaar = op.get();
				 existingAdhaar.setAnum(ad.getAnum());
				 existingAdhaar.setAddress(ad.getAddress());
				 adb.save(existingAdhaar);
				 return "Aadhar Updated Successfully";
			 }
			 return "aadhar not found and can't be updated";
		 }
		 
		 //5.Delete Aadhar
		// http://localhost:8081/aadhaar/deleteAadhaar/1
		 @DeleteMapping("/deleteAadhaar/{id}")
		 public String deleteAadhaar(@PathVariable("id") int aid) {
			 if(adb.existsById(aid)) {
		     adb.deleteById(aid);
		     return "Aadhaar deleted with id: " + aid;
			}
			 return "Aadhar not found with id : "+aid;
		 }
	
}
