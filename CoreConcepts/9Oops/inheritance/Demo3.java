package com.inheritance;

class Aaa {
 static {
	 System.out.println("Static-Block-A");
 }
}

class Bbb extends Aaa {
	static int i=10;
	 static {
		 System.out.println("Static-Block-B");
	 }
}

public class Demo3 {
	static {
		 System.out.println(Bbb.i);
		 System.out.println("Static-Block-Demo");
	 }  
	public static void main(String[] args) {
		 System.out.println("Main Starts");
		 System.out.println("Main Ends");
	}

}
