package com.inheritance;

class AA {
  static int i=10;
  public static void m1() {
	  System.out.println("m1()-A");
  }
}

class BB extends AA {
	static int i=20;
	public static void m2() {
		System.out.println(i);
		System.out.println(AA.i);
		//System.out.println(super.i); // CTE
		}
}

public class Demo2 {

	public static void main(String[] args) {
		BB.m2(); 
	}

}
