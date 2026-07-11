package springFirst;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile {

	@Override
	public void text() {
		System.out.println("Texting using Samsung Mobile");
		
	}

}
