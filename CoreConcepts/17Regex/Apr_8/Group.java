import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {
    public static void main(String[] args) {
        String exp ="([a-z])([a-z])\\1";
        String s = "ababbcbdghghjgd";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while(m.find()) System.out.println(m.group()); // aba  bcb  ghg
    }
}
