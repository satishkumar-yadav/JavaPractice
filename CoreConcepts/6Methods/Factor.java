

public class Factor {
    public static int[] calFactor(int num){
        int fact[] = new int[num/2];
        int index=0;
        for (int i = 1; i <= num/2; i++) {
            if(num % i ==  0 ){
                fact[index] = i;
                index++;
            } 
        }

        // for (int a: fact) {
        //     if (a == 0) {
                
        //     }
        // }

        return fact;
    } 
}
