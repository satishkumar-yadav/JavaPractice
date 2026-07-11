package springFirst;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
	/*
	 * create bean definition: create method which creates object of inbuilt class
	 * class also returns same object
	 * and method should be annotated with @Bean
	 * 
	 * we are trying to tell SC that object is present, take it and keep it 
	 * bean name--same as method name
	 */
	
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
}
