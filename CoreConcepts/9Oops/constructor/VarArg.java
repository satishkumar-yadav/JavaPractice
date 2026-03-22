package com.constructor;

public class VarArg {

	public static void m2(int... a) {
		System.out.println("M2 executed");
	}
	
	public static void main(String[] args) {
		m2();
		m2(10);
		m2(10,20);
		m2(10,20,30);
	}

}
