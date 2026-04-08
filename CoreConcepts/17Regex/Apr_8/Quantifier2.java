import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier2 {
    public static void main(String[] args) {
        String exp = "ab{2}";  // length ==2
        String s = "ababbabbb";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group()); //  abb abb
    }
}
