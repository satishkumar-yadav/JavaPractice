 import java.util.regex.Pattern;
 import java.util.regex.Matcher;
 import java.util.Scanner;
 
 class RegexInput {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);

        while (true) {
             System.out.print("Enter Regular Expression : ");
             String exp = s.next();

             System.out.print("\n Enter String : ");
             String str = s.next();
             System.out.println("\n Matching Characters are : ");

             Pattern p = Pattern.compile(exp);
             Matcher m = p.matcher(str);

             while(m.find()) System.out.println(m.group());

             System.out.print("Do You want to continue : y/n ");
             char ch = s.next().charAt(0);

            if(ch=='n') {s.close(); return; }
        }
    }
 }