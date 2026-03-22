package com.constructor;

public class Car {
	String color;
	static int carNum=1000;
	int rgNum;
	
	Car(String color){
		this.color=color;
		rgNum=carNum++;
	}

	
	public static void main(String[] args) {
		Car c1 = new Car("Black");
		Car c2 = new Car("White");
		
		System.out.println("Car Color: "+c1.color+"\t"+" , Car Number: "+c1.rgNum);
		System.out.println("Car Color: "+c2.color+"\t"+" , Car Number: "+c2.rgNum);
		
		c2.rgNum=1111;
		System.out.println("Car1 Reg: "+c1.rgNum+"\t"+" , Car2 Reg: "+c2.rgNum);

	}

}
