
public class Length {
    public static int calLength(int num){
        System.out.println("From Length Class");
        int count=0;
        while (num>0) {
            num/=10;
            count++;
        }
        //System.out.println(Main.num);
        return count;
    }
}
