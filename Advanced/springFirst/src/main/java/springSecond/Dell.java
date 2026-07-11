package springSecond;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   // when multiple Class of same type are present autowired get confused throw exception , so using this we give instruction  that this class is important create obj for this
public class Dell implements Laptop {
    @Override
    public void work() {
    	System.out.println("Working with Dell laptop");
    } 

}
