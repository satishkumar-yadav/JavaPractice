package com.blocks;

public class NonStaticA {

	static {
		new NonStaticA();
		System.out.println("Static Block 1");
	}
	{
		System.out.println("Non-Static Block 1");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		new NonStaticA();
		System.out.println("Main Ends");
	}

	static {
		System.out.println("Static Block 2");
	}
	{
		System.out.println("Non-Static Block 2");
	}
}
