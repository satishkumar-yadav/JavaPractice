
public class Main {
    //public  static int num;
    public static void main(String[] args) {
        System.out.println("Main Class");
       int num= 12;

       int l= Length.calLength(num);
      // int l = new Length().calLength(num);
       System.out.println(l);

       int p=Power.calPower(num, l);
       System.out.println(p);

       int rev = Reverse.reverseDigit(num);
       System.out.println(rev);

       int factor [] = Factor.calFactor(num) ;
       System.out.println("Size of factor array is : "+factor.length);
       for(int i=0; i<factor.length; i++){
        System.out.print(factor[i]+" ");
       } 

    } 
}
