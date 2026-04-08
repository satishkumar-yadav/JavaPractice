import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier3 {
    public static void main(String[] args) {
        String exp = "ab{2,4}";  // min: 2, max: 4
        String s = "ababbabbbabbbbbabbbbbbabbbbbbbbb";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group()); // abb abbb abbbb abbbb abbbb
    }
}
