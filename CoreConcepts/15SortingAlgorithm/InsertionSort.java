import java.util.Arrays;

/*
       i  
    9, 1,2,8,2,0,3,6,6,9,1,7
    j

     int a[] =  { 9,   5,   2,   4}
               j     j+1

   Dry Run: i=0  to i<a.length   , j=0  to   j<a.length-1-i
      
      Iteration 1: 


*/

public class InsertionSort {

    static void insertionSort(int arr[]){
          
    for (int i = 1; i < arr.length; i++) {   // loop for unsorted array,  assuming arr[0] to be inside sorted part
      int j=i-1;  // last index of sorted part/array
      int key = arr[i];

      //loops for sorted array ,  traversing till correct index where key should be placed and al so shifting element to make space for key
      while (j>=0 && arr[j]>key) {   // shifting element and reducing j till arr[j] is greater than key, if small then thats correct position
        arr[j+1]= arr[j];
        j--;
      }
      arr[j+1]= key;
    }
    }

    public static void main(String[] args) {
         int [] arr = {9,1,2,8,2,0,3,6,6,9,1,7};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
