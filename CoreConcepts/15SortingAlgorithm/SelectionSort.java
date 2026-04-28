import java.util.Arrays;

/* 
   int a[] =  { 9,   5,   2,   4}
               j     j+1

   Dry Run: i=0  to i<a.length   , j=0  to   j<a.length-1-i
      
      Iteration 1: 

 */

public class SelectionSort {

    static void selectionSort(int arr[]){

    // finding minimum or largest element and moving it to its correct position, here finding minimum element
    //initially supposing arr[0] to be minimum and updating minimum if found , else swaping or moving minimum element

    // {9,1,2,8,2,0,3,6,6,9,1,7}
    for (int i = 0; i < arr.length; i++) {
        int minIndex = i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]<arr[minIndex]) minIndex=j;
        }
        int temp=arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }
    }

    public static void main(String[] args) {
         int [] arr = {9,1,2,8,2,0,3,6,6,9,1,7};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
