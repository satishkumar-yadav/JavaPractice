package sctask3;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	@Qualifier("getHS")
	Set<Integer> set1;
	
	@Autowired
	@Qualifier("getTS")
	Set<Integer> set2;
	
	@Autowired
	@Qualifier("hashmap")
	Map<Integer,String> map1;
	
	@Autowired
	Map<Integer,String> map2;
	
	public void use() {
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(map1);
		System.out.println(map2);
	}
}
