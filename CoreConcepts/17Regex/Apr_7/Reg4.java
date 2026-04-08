import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg4 {

     public static void main(String[] args) {
        String exp = "a.";
        String s = "aabbacbad";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while(m.find()) System.out.println(m.group()); // aa  ac   ad
    }
} 