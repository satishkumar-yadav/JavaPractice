public class TestRunner{

    //Random Input Generator
    static int[] generate(int n){
        Random r = new Random();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=r.nextInt(100000);
        }
        return arr;
    }

    public static void main(String args[]){
        Solution s = new Solution();

        int [][] testCases = {
             {1,2,3},
             {3,2,1},
             {},
             {5},
             {1,1,1,1}
        };

        for(int i=0; i<testCases.length; i++){
            System.out.println("Test "+(i+1));
            s.solve(testCases[i]);
        }

    }
}