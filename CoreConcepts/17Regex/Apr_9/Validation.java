import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
     public static void main(String[] args) {
        String exp = "(?=.*[a-z])";  // at least one lower case letter
        String s = "ABc";    // valid
        
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

       if(m.find()) System.out.println("Valid");
       else System.out.println("Invalid");
    }
}
