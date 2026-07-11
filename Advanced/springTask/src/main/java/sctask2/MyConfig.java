package sctask2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean
	public ArrayList<Integer> getAL() {
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(14);
		ls.add(85);
		ls.add(14);
		ls.add(90);
		return ls;
	}
	
	@Bean
	public HashSet<Integer> getHS() {
		HashSet<Integer> st = new HashSet<>();
		st.add(94);
		st.add(45);
		st.add(35);
		st.add(14);
		return st;
	}
	
	@Bean
	public HashMap<Integer,String> getLHM() {
		HashMap<Integer,String> hm= new HashMap();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		return hm;
	}
}
