package springSecond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	Laptop lp;
	
	public void use() {
		System.out.println(lp);
		
		lp.work();
	}
}
