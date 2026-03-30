import java.util.Arrays;
/* 
   int a[] =  { 9,   5,   2,   4}
               j     j+1

   Dry Run: i=0  to i<a.length   , j=0  to   j<a.length-1-i
      
      Iteration 1: 

 */






public class BubbleSort {
    public static void main(String args[]) { 
       int a[] = {9,5,2,5,4};
       bubbleSort(a);
       System.out.println(Arrays.toString(a));
    }
    
    static void bubbleSort(int[]a){
        for(int i=0; i<a.length; i++){
           for(int j=0; j<a.length-1-i; j++){  
              if(a[j]>a[j+1]){ 
                int temp = a[j];
                 a[j] = a[j+1];
                 a[j+1] = temp;
              }
           }
        }
    
    }
}   
