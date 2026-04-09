import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier8 {
    public static void main(String[] args) {
        String exp = "a+b*";
        String s = "ababba";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group());   //  ab  abb  a
    }
} 
