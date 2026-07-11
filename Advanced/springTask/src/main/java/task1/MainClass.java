package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext("task1");

		Employee e1 = app.getBean(Employee.class);
		e1.id = 1;
		e1.name = "Satish";
		e1.salary = 28934.0;
		e1.print();
		
		//Task 2
		/*
		 * Create method for ArrayList object, add some data to it give it to SC
		 * get ArrayList object from SC and print it
		 */
		
		ArrayList ls = app.getBean(ArrayList.class);
		ls.add(12);
		ls.add(18);
		ls.add(94);
		ls.add(12);
		ls.add(10);
		ls.add(18);
		
		System.out.println(ls);
		System.out.println("----------");
		
		HashSet hs = app.getBean(HashSet.class);
		hs.add(45);
		hs.add(12);
		hs.add(18);
		hs.add(94);
		
		System.out.println(hs);
		System.out.println("----------");
		
		HashMap hm = app.getBean(HashMap.class);
		hm.put('A', 65);
		hm.put('B', 66);
		hm.put('C', 67);
		hm.put('D', 68);
		hm.put('E', 69);
		
		System.out.println(hm);
		System.out.println("----------");
	}

}
