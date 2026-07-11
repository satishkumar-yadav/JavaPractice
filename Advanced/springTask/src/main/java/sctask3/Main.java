package sctask3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app= new AnnotationConfigApplicationContext("sctask3");
		
		Person p = app.getBean(Person.class);
		p.use();
	}
}
