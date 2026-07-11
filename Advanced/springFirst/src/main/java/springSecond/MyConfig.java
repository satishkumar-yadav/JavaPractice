package springSecond;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
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
	public ArrayList<Integer> getAL2() {
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(4);
		ls.add(59);
		ls.add(74);
		ls.add(28);
		return ls;
	}
	
	@Bean("apple")  // custom bean name
	public ArrayList<Integer> getAL3() {
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(74);
		ls.add(10);
		ls.add(38);
		ls.add(9);
		return ls;
	}
}
