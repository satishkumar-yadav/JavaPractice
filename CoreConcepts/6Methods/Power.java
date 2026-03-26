

public class Power {
    public static int calPower(int num, int l){
        int prod=1;
       for(int i=1; i<=l; i++){
        prod*=num;
       }
       return prod;
    } 
    
}
