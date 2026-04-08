import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group4 {
    public static void main(String[] args) {
        String exp = "([a-z][a-z])\\1";
        String s = "banana";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group()); // anan
    }
}
