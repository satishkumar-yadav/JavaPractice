import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation2 {
     public static void main(String[] args) {
        String exp = "(?=.*[A-Z])";  // at least one upper case letter
        String s = "ABc";    // valid
        
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

       if(m.find()) System.out.println("Valid");
       else System.out.println("Invalid");
    }
}
