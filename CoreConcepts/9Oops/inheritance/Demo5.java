package com.inheritance;

class AAAAA{
	{
		System.out.println("Non-Static-Block-1-A");
	}
	AAAAA(){
		System.out.println("A()-const");
	}
	{
		System.out.println("Non-Static-Block-2-A");
	}
}

class BBBBB extends AAAAA{
	{
		System.out.println("Non-Static-Block-1-B");
	}
	BBBBB(){
		System.out.println("B()-const");
	}
	{
		System.out.println("Non-Static-Block-2-B");
	}
}

public class Demo5 {

	public static void main(String[] args) {
		new BBBBB();

	}

}
