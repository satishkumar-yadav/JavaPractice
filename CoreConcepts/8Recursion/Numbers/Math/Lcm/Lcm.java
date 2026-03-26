
/*
LCM = Lowest Common Multiple or first common multiple  - finding first shared multiple

a=4 , 
multiple of 4= 4,8,(12),16,20.....
b=6
multiple of 6 = 6,(12),18,24....
LCM(4,6) = 12

Algorithm M-I(when hcf is not given, without using product formula)  - great for smaller number and simple logic
Logic: increase the multiple until it fits both
1.find max(a,b) -  max= (a>b) ? a : b
2.assign max to lcm,  lcm=max
3.Check if max is divisible by both number , if yes break else increase lcm by max
  while(true)
    if(lcm % a == 0 && lcm % b == 0 ) break; found lcm
    lcm += max;
4.print lcm

//DRY Run
a=4,   b=6
max=6,   lcm=6
check1: is divisible by a ? (6%4 == 0) false won't check other condition
increment lcm: lcm=6+6=12
check2: is divisible by a ? (12%4==0) true, is divisible by b ? (12%6==0) true
result: loops break, lcm=12

Algorithm M-II(when hcf is given, using product formula)  - faster method preferred for larger number (mostly prime)
1.find product of number    product=a*b
2.find lcm using formula   lcm = (product)/hcf

*/

public class Lcm {
    public static void main(String[] args) {
        int a=4, b=6;

        int max = (a>b) ? a : b ;
        int lcm = max;

        while (true) {
            if( ( lcm % a == 0 ) && (lcm % b == 0) ) break;
            lcm += max;
        }

        System.out.println("Lcm of "+a+" and "+b+" is : "+lcm);
    }
}
