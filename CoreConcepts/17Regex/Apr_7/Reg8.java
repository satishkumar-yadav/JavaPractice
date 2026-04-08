import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg8 {

     public static void main(String[] args) {
        String exp = "[ab]";  // one char set either a or b
        String s = "abcdefaghi";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while(m.find()) System.out.println(m.group()); // a  b   a
    }
} 