import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg11 {
    public static void main(String[] args) {
        String exp = "[^a-z]";
        String s = "a1Bf6GHft78";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group()); // 1 B 6 G H 7 8
    }
}
