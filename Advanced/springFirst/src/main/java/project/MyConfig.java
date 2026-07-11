package project;

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
}
