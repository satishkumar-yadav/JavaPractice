import java.util.Arrays;

public class QuickSort {

    static void quickSort(int arr[], int st, int end){
        if(st>=end) return;
        int i= st, j= end;
        int pivot = (st+end)/2;  // can be any element

        if(i<j){
        while(arr[i]<arr[pivot]) i++;
        while(arr[j]>arr[pivot]) j--;
        }

        if(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        
        quickSort(arr, st, j);
        quickSort(arr, i, end);
    }

    public static void main(String[] args) {
        int [] ar = {9,1,2,8,2,0,3,6,6,9,1,7};

        quickSort(ar,0,ar.length-1);

        System.out.println(Arrays.toString(ar));
    }
}
