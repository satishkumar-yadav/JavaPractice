package com.inheritance;

class AAA {
   AAA(){
	   System.out.println("AAA()-Constructor");
   }
}

class BBB extends AAA {
	 BBB(){
		 super();
		   System.out.println("BBB()-Constructor");
	   }
}

class CCC extends BBB {
	 CCC(){
		 super();
		   System.out.println("CCC()-Constructor");
	   }
}

public class Demo4 {
	
	public static void main(String[] args) {
		new CCC();
	}

}
