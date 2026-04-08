

// filtering Indian mobile number from given string

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilteringIndianMobileNo {
    public static void main(String[] args) {
        String exp = "[9876][0-9]{9}"; // starts with either of (9/8/7/6) with length = 10;
        String s = "1.Create a page with header,footer, main(section, article, aside tag)987689054300000." 
                 + "2. Make sure the project from level 3 has correct7890654214 folder structure."
                 + "3. Create 452367890432875006groupings of multiple tags using div." 
                 + "4. Create navigation to important0008876432098 sections of your page.";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group()); // 9876890543  7890654214  6789043287  8876432098
    }
}
