import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg12 {
    public static void main(String[] args) {
        String exp = "[^a-zA-z0-9]";
        String s = "@$ab2cnBtU#";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group()); // @ $ #
    }
}
