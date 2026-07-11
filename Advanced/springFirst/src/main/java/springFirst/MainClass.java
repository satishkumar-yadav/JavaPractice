package springFirst;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/* fetch/get the spring Container
		 * How? 
		 * we need to create an object of inbuilt class called
		 * AnnotationConfigApplicationContext - present in org.springframework pkg
		 * ApplicationContext is a parent interface
		 */
		ApplicationContext app = new AnnotationConfigApplicationContext("springFirst");  // can be stored in AnnotationConfigApplicationContext also
		
		/*
		 * SC (Spring Container) will not know in which package component class is present
		 * we need to specify (explicitely) pkg name for SC
		 * SC will scan the given pkg, identify component class, creates object for it and keeps it
		 * 
		 * for SC i need specify to create object for a class
		 * Component Class: class for which SC creates an object and keeps it
		 * class must be annotated with @Component  ,  else obj will not be created
		 * 
		 * bean = object
		 * beanName = same as class name starts from lower case
		 * 
		 * How to check whether SC created obj or not ?
		 * getBeanDefinitionNames(): gives the name of all object created by SC
		 */
 
		String[] objNames = app.getBeanDefinitionNames();
		
		for(String obj: objNames) System.out.println(obj);
		
		System.out.println("---------------------");
		
		/*
		 * how to fetch the obj from SC ?
		 * getBean()
		 */
		
		// Case 1: getBean("beanName")  : Object
		Object obj = app.getBean("person");
		//downcasting
		Person p = (Person) obj;
		System.out.println(p);
		p.eat();
		
		//Case 2: getBean(ComponentClassName.class)  :  component object
		Person p1 = app.getBean(Person.class);
		p1.eat();
		
		// Case 3 : getBean("beanName", ComponentClassName.class)  :  component object
		Person p2 = app.getBean("person",Person.class);
		p2.eat();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p);
		
		System.out.println("------------------");
		
		/*
		 * to get obj of inbuilt class (like Scanner): create configuration class
		 */
		Scanner sc = app.getBean(Scanner.class);
		System.out.println(sc);
		
		System.out.println("------------------");
		
		//ArrayList al = app.getBean("getAL2",ArrayList.class);
		// System.out.println(al);
		
		System.out.println("------------------");
		
		// Object of Interface
		Mobile m = app.getBean("nokia", Mobile.class);  // SC smartly check for object of implementing subclass of interface, instead of direct interface object
		System.out.println(m);
		m.text();
		
		
	}

}
