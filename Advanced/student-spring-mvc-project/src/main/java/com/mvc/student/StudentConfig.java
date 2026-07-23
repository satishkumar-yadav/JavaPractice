package com.mvc.student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mvc.student")
public class StudentConfig {

	  @Bean
	    public EntityManager getEM() {
	    	return Persistence.createEntityManagerFactory("dbInfo").createEntityManager();
	    }

	    @Bean
	    public EntityTransaction getET() {
	    	return getEM().getTransaction();
	    }

//	    @Bean
//	    public Scanner getSC() {
//	    	return new Scanner(System.in);
//	    }

//	    @Bean
//	    public List<Student> getAL() {
//	    	return new ArrayList<>();
//	    }

}
