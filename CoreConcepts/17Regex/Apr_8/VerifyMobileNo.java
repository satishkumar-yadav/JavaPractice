import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyMobileNo {
    public static void main(String[] args) {
        String exp = "[9876][0-9]{9}";
        String s= "8937682391";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        if(m.matches()) System.out.println("Valid Mobile Number");
        else System.out.println("Invalid Mobile Number");
    }
}
