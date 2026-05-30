import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader("C:\\Users\\Satish Kumar Yada\\Desktop\\MergeSort.java");
        BufferedReader bf = new BufferedReader(fr);
        String s = bf.readLine();
        String str="";
        while(s!=null){
           
          //  System.out.print(s);
          str += s;
            s=bf.readLine();
        }
        //System.out.print(str);

        FileWriter f = new FileWriter("C:\\Users\\Satish Kumar Yada\\Desktop\\A.txt");
        BufferedWriter bw = new BufferedWriter(f);
        bw.write(str);

        bf.close();
        bw.close();
        
    }
}
