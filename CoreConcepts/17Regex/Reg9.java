import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg9 {
    public static void main(String []args){
        String exp ="[ab].";
        String s ="adbcaabccdbe";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while(m.find()) System.out.println(m.group());  //  ad   bc   aa   bc  be  
    }
}
