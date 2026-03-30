import java.util.Arrays;
public class LinearSearch {

    static int linearSearch(int[]a, int key){
        for(int i=0;i<a.length;i++){
            if(key==a[i]) return i;
        }
        return -1;
    }

    public static void main(String [] args){
        int a[] = {2,5,75,85,4,47,10};
        int target= 85;
        int indx= linearSearch(a,target) ;
        if(indx != -1) System.out.println("Element "+target+" found at index : "+(indx+1)+" in array "+Arrays.toString(a));
        else System.out.println("Element "+target+" not found in array "+Arrays.toString(a));
    }
}
