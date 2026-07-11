package sctask2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Books {

	@Autowired
	Person p;
	
	public void getObj() {
		System.out.println("Person : "+p);
		System.out.println("Scanner : "+p.sc);
		System.out.println("ArrayList : "+p.al);
		System.out.println("HashSet : "+p.hs);
		System.out.println("HashMap : "+p.hm);
	}
}
