import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumber {
    public static void main(String[] args) {
        String exp = "[0-9]";
        String s = "Ram@123";
        int sum =0;

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find()) sum += Integer.parseInt(m.group());

        System.out.println(sum);
            
    }
}
