import java.util.Arrays;
/* 
   int a[] =  { 9,   5,   2,   4}
               j     j+1

   Dry Run: i=0  to i<a.length   , j=0  to   j<a.length-1-i
      
      Iteration 1: 

 */



public class InsertionSort {
     public static void main(String args[]) { 
       int a[] = {9,5,2,5,4};
       insertionSort(a);
       System.out.println(Arrays.toString(a));
    }
    
    static void insertionSort(int[]a){
        for(int i=1; i<a.length; i++){
          int key= a[i]; 
          int j= i-1;
          while(j>=0 && a[j]>key){
             a[j+1] = a[j];
             j--;
          }
          a[j+1]= key;
        }
    
    }
}
