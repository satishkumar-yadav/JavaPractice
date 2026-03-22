package com.inheritance;

class AAAAAA{
	{
		System.out.println("Non-Static-Block-A");
	}
	AAAAAA(){
		this(20);
		System.out.println("A()-const");
	}
	AAAAAA(int i)
	{
		System.out.println("A(int i)-cons : "+i);
	}
}

class BBBBBB extends AAAAAA{
	{
		System.out.println("Non-Static-Block-B");
	}
	BBBBBB(){
		System.out.println("B()-const");
	}
	BBBBBB(int i)
	{
		this();
		System.out.println("B(int i)-cons : "+i);
	}
}

public class Test {

	public static void main(String[] args) {
		new BBBBBB(10);

	}

}
