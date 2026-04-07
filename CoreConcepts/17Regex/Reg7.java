import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg7 {

     public static void main(String[] args) {
        String exp = "a..";
        String s = "abcdefaghi";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while(m.find()) System.out.println(m.group()); // abc  agh
    }
} 