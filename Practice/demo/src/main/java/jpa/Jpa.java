package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Jpa {
    public static EntityManager getEm(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoDbInfo");
        EntityManager em = emf.createEntityManager();    
        return em;
    }
}
