package springFirst;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile {
	@Override
	public void text() {
		System.out.println("Texting using Nokia Mobile");
		
	}
}
