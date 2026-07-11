package springSecond;

import org.springframework.stereotype.Component;

@Component
public class Hp implements Laptop {
    @Override
    public void work() {
    	System.out.println("Working with hp laptop");
    }
}
