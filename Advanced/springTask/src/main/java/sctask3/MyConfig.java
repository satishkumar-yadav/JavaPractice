package sctask3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

	@Bean
	public Set<Integer> getHS() {
		Set<Integer> st = new HashSet<>();
		st.add(94);
		st.add(45);
		st.add(35);
		st.add(14);
		return st;
	}
	
	@Bean
	public Set<Integer> getTS() {
		Set<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(56);
		ts.add(94);
		ts.add(20);
		ts.add(47);
		return ts;
	}
	
	@Bean("hashmap")
	public Map<Integer,String> getHM() {
		Map<Integer,String> hm= new HashMap();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		return hm;
	}
	
	@Bean
	@Primary
	public Map<Integer,String> getLTM() {
		Map<Integer,String> tm = new TreeMap<Integer, String>();
		tm.put(12, "A");
		tm.put(24, "T");
		tm.put(18, "M");
		return tm;
	}
	
	
}
