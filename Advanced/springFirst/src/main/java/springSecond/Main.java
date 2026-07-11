package springSecond;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app= new AnnotationConfigApplicationContext("springSecond");

//		Student s1 = app.getBean(Student.class);
//		System.out.println(s1);
		
		Person p = app.getBean(Person.class);
		p.use();
	}

}
