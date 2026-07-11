package task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public List getAL() {
		List<Integer> ls = new ArrayList<>();
		ls.add(14);
		ls.add(85);
		ls.add(14);
		ls.add(90);
		return ls;
	}
	
	@Bean
	public List getVC() {
		List<Integer> l = new Vector<>();
		l.add(4);
		l.add(8);
		l.add(1);
		l.add(15);
		return l;
	}
	
	@Bean
	public Set getHS() {
		Set<Integer> st = new HashSet<>();
		st.add(94);
		st.add(45);
		st.add(35);
		st.add(14);
		return st;
	}
	
	@Bean
	public Set getLHS() {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(94);
		s.add(45);
		s.add(35);
		s.add(14);
		return s;
	}
	
	@Bean
	public EntityManagerFactory getEMF() {
		return Persistence.createEntityManagerFactory("dbInfo");
	}
	
	@Bean
	public EntityManager getEM() {
		return getEMF().createEntityManager();
	}
	
	@Bean EntityTransaction getET() {
		return getEM().getTransaction();
	}
	
}
