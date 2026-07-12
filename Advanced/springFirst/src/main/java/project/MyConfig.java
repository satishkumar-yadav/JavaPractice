package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public EntityManager getEM() {
    	return Persistence.createEntityManagerFactory("dbInfo").createEntityManager();
    }
    
    @Bean
    public EntityTransaction getET() {
    	return getEM().getTransaction();
    }
    
    @Bean
    public Scanner getSC() {
    	return new Scanner(System.in);
    }
    
//    @Bean
//    public List getAL() {
//    	return new ArrayList<>();
//    }
}
