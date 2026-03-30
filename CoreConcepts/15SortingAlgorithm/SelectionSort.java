
import java.util.Arrays;
/* 
   int a[] =  { 9,   5,   2,   4}
               j     j+1

   Dry Run: i=0  to i<a.length   , j=0  to   j<a.length-1-i
      
      Iteration 1: 

 */



public class SelectionSort {
     public static void main(String args[]) { 
       int a[] = {9,5,2,5,4};
       selectionSort(a);
       System.out.println(Arrays.toString(a));
    }
    
    static void selectionSort(int[]a){
        for(int i=0; i<a.length; i++){
           int minIndex= i;
           for(int j=i+1; j<a.length; j++){
               if(a[j]<a[minIndex]) minIndex = j;
           }
           int temp = a[i];
           a[i] = a[minIndex];
           a[minIndex]=temp;
        }
    
    }
}
