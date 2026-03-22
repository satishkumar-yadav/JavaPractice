package com.inheritance;

class Animal2 {
	public void sound() {
		System.out.println("Animal-Sound");
		}
}

class Dog2 extends Animal2 {
	public void sound() {
		System.out.println("Bow-Bow");
		}
}

class BabyDog2 extends Dog2 {
	public void sound() {
		System.out.println("Cute-Bark");
		}
}


class Cat extends Animal2 {
	public void sound() {
		System.out.println("Meo-Meo");
		}
}


public class AnimalDriver2 {
	public static void main(String[] args) {
		Animal2 a = new Animal2();
		a.sound();
		

	}
}
