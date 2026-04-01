import java.util.Arrays;

public class BinarySearchRecursion {
    
    static int binarySearchRecursion(int a[],int key, int st, int end){
        if(st>end) return -1;
        int mid = (st+end )/2;
        if (key == a[mid]) return mid;
        else if(key<a[mid]) return binarySearchRecursion(a, key, st, mid-1);
        else return binarySearchRecursion(a, key, mid+1, end);
    }
 
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6,8};
        int key = 6;
        int indx= binarySearchRecursion(a,key,0,a.length-1);
        
        if(indx!=(-1)) System.out.println(key+" is found in "+Arrays.toString(a)+" at index : "+(indx+1));
        else System.out.println(key+" Not found in array "+Arrays.toString(a));
    }

}
