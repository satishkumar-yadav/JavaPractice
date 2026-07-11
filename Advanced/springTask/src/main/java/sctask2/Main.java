package sctask2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app= new AnnotationConfigApplicationContext("sctask2");
		
		Books b = app.getBean(Books.class);
		b.getObj();

	}
			
}
