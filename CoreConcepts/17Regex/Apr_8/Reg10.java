import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg10 {
    public static void main(String[] args) {
        String exp = "[a-zA-z0-9]";
        String s = "a1Bf6GHft78*&";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

       while(m.find()) System.out.println(m.group()); // a 1 B f 6 G H f t 7 8 
    }
}
