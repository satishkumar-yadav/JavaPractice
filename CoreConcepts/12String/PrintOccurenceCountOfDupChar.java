
/*
  Replace Char with its occurence count if its repeating

          1 2 1      2   3
i/p : H e l l o    W o r l d         o/p : He121 W2r3d



*/


public class PrintOccurenceCountOfDupChar {

    static void countDup(String s) {
        char c[] = s.toCharArray();
        char minEle = ' ';
        int minCount = c.length;
                                                    //     ij
        for (int i = 0; i < c.length; i++) {         // Hello World
            int count = 1;                           //   12
            // if (c[i] == '\u0000')
            //     continue;
            for (int j = i + 1; j < c.length; j++) {
                if ( (c[i]<'0' || c[i]>'9') && c[i] == c[j]) {
                    c[i] = (char) count;
                    count++;
                   // c[j] = '\u0000';
                    c[j] = (char) count;
                }
            }
            // if (count < minCount) {
            //     minCount = count;
            //     minEle = c[i];
            // }

            System.out.print(c[i]);
        }

        System.out.print(minEle + " : " + minCount);
    }

    static void countDupBuiltInFn(String st){
        String s = "javadev";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!res.contains(ch + ""))
                res += ch;
        }

        System.out.println(res);

    }


    public static void main(String[] args) {
        String s = "Hello World";


    }
}
