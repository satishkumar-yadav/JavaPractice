package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
//	@Bean
//	public Scanner getScanner() {
//		return new Scanner(System.in);
//	}
	
	@Bean
	public ArrayList getArrayList() {
		return new ArrayList();
	}
	
	@Bean
	public HashSet getHashSet() {
		return new HashSet();
	}
	
	@Bean
	public HashMap getHashMap() {
		return new HashMap();
	}
}
