package task1;

import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")  - maybe for creating multiple  obj
public class Employee {
    int id;
    String name;
    double salary;
   
   void print() {
	   System.out.println("Id: "+id+", Name: "+name+", salary: "+salary);
   }
  
   
   
}
