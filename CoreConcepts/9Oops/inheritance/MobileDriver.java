package com.inheritance;

class Phone{
	String name;
	String color;
	double price;
	Phone(){
		
	}
	Phone(String name, String color, double price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
}

class SmartPhone extends Phone{
	int ram;
	int rom;
	int pxl;
	SmartPhone(String name, String color, double price, int ram, int rom, int pxl){
		super(name,color,price);
		this.ram=ram;
		this.rom=rom;
		this.pxl=pxl;
	}
	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(pxl);
	}
}

public class MobileDriver {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("Oppo","Blue",20000,8,512,32);
		s.display();
	}

}
