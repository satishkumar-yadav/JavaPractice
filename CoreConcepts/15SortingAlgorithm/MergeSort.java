import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int []arr){
       if(arr.length == 1) return;

       //splitting or dividing array
       int left[] = new int[arr.length/2];
       int right [] = new int[arr.length-left.length];

       // copying elements to splitted array
       for (int i = 0; i < left.length; i++) left[i]=arr[i];
       for (int j = 0; j < right.length; j++) right[j]=arr[left.length+j];

       mergeSort(left); 
       mergeSort(right); 
       
       merge(left, right, arr);
    }

    static void merge(int []a, int []b, int []c){
        int i=0, j=0, k=0;

        while (i<a.length && j<b.length) {
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        // for remaing elements due to size variation / different size of splitted array
        while (i<a.length) c[k++]=a[i++];
        while (j<b.length) c[k++] = b[j++];
    }

    public static void main(String[] args) {
        int [] ar = {9,1,2,8,2,0,3,6,6,9,1,7};

        mergeSort(ar);

        System.out.println(Arrays.toString(ar));
    }
}
