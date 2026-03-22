package com.inheritance;

class Aa {
	int i=10;
}

class Bb extends Aa {
	int i=20;
	public void m1() {
		System.out.println(super.i);
		System.out.println(i);
		}
}

class Cc extends Bb{
	int i=30;
	public void m2() {
		m1();
		System.out.println(i);
		System.out.println(super.i);
		}
}

public class Demo {

	public static void main(String[] args) {
		Cc c = new Cc();
        c.m2(); 
	}

}
