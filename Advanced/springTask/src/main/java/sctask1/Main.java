package sctask1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app= new AnnotationConfigApplicationContext("sctask1");

		Student s1 = app.getBean(Student.class);
		System.out.println(s1);

	}

}
