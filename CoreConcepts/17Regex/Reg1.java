import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {
    public static void main(String[] args) {
        String exp = "ab";
        String s = "aabaab";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        System.out.println(m.find()); //true
        System.out.println(m.find()); //true
        System.out.println(m.find()); //false
    }
}
