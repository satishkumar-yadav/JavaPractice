import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{4,6}";
        System.out.println("Enter Password : ");
        String s = "R@m123";  // valid
        // String s = sc.next();

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

       if(m.matches()) System.out.println("Valid Password");
       else System.out.println("Invalid Password");
    }
}
