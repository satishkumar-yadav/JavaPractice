import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier {
    public static void main(String[] args) {
        String exp = "ab{1,}";  // min: 1, max : any length
        String s = "ababbabbb";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group());  // ab abb abbb 
    } 
}
