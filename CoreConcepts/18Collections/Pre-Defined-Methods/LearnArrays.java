import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("index of element 4 is : "+index);

        Integer[] nums = {10,2,32,12,15,76,17,48,79};
        Arrays.sort(nums);

        Arrays.fill(nums, 100);  // fill each element with 100

        for (int i : nums) {
            System.out.print(i+" ");
        }

        System.out.println();

       
    }
}
