package springSecond;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	//direct initialisation 
//   @Value("12")
//   private int id;
//   @Value("abc")
//   private String name;
//   @Value("89.0")
//   private double marks;
   
   private int id;
   private String name;
   private double marks;
   
   //using constructor
//   public Student(@Value("14") int id, @Value("xyz") String name,@Value("86.8") double marks) {
//	this.id = id;
//	this.name = name;
//	this.marks = marks;
//}

   //using setter method
   
   @Value("17")
   public void setId(int id) {
	this.id = id;
}

   @Value("pqr")
   public void setName(String name) {
	this.name = name;
   }

   @Value("79.0")
   public void setMarks(double marks) {
	this.marks = marks;
   }

   @Override
   public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
   }
   
   
   
}
