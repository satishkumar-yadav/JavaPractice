package springFirst;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   // if not annoted then obj will not be created
//@Scope(value="prototype")  // create new obj instead of reusing single obj, each time getBean() is called
public class Person {
   public void eat() {
	   System.out.println("Person is eating");
   }
}
