import java.util.Arrays;

/* 
   int a[] =  { 9,   5,   2,   4}
               j     j+1

   Dry Run: i=0  to i<a.length   , j=0  to   j<a.length-1-i
      
      Iteration 1: 

 */

public class BubbleSort {

    static void bubbleSort(int []arr){
         
        // {9,1,2,8,2,0,3,6,6,9,1,7,9}
    for (int i = 0; i < arr.length; i++) {  // loop for passes , 1 element sorted in each pass and moved to last(larger one - bubble)
        for (int j = 0; j < arr.length-1-i; j++) {  // for swapping neighbour elements . len-1(to use j+1, prevent AIOB), len-1-i(since last element is sorted)
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    }

    public static void main(String[] args) {
        int [] arr = {9,1,2,8,2,0,3,6,6,9,1,7,9};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
