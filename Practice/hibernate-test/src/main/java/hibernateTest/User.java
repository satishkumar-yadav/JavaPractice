package hibernateTest;

import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
}


/*
 * Schema Updates: Use hibernate.hbm2ddl.auto=update only for development;
 * switch to validate or none in production.
 * 
 * Explore logging with hibernate.show_sql=true to see SQL queries.
 * 
 */