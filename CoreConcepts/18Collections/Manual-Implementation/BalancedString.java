import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
       // String s = "{{()}}}";
       // String s = "}";
        //String s = "";
        String s = "";
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<Character>();

       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(') st.push(ch);
            else if(ch=='}' || ch==']' || ch==')') {
                if(!st.isEmpty()) {
                    char c1 = st.pop();
                    if (!isPair(c1, ch))
                        return false;
                }
                else return false;
            } 
        }
        return st.isEmpty();
    }

    public static boolean isPair(char ch1, char ch2){
        if((ch1=='(' && ch2==')') || (ch1=='[' && ch2==']') || (ch1=='{' && ch2=='}')) return true;
        else return false;
    }
}
