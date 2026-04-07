import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg3 {

     public static void main(String[] args) {
        String exp = ".";
        String s = "aabaab";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while(m.find()) System.out.println(m.group()); // a  a  b  a   a   b       
    }
} 