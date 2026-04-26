public class P2 {
    public static void main(String[] args) {
        int []a = {1,2,3};
        try{
            System.out.println(a[a.length]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handled");
        }
    }
}
