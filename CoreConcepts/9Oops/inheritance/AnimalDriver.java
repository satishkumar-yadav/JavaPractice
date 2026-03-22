package com.inheritance;

// Example program for multi-level inheritance
class Animal {
	public void eat() {
		System.out.println("Animal-Eat");
		}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog-bark");
		}
}

class BabyDog extends Dog {
	public void weeping() {
		System.out.println("BabyDog is weeping..");
		}
}

public class AnimalDriver {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		// a.bark();
		System.out.println("===============");
		Dog d = new Dog();
		d.eat();
		d.bark();
		//d.weeping();
		System.out.println("===============");
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.weeping();

	}

}
