package com.demonstrations.study;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal{
	@Override
	void bark() {
		System.out.println("WOOF WOOF");
	}
	
}

class Cat extends Animal{
	@Override
	void bark() {
		System.out.println("MEOW MEOW");
	}
	
}

public class AbstractAnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog()};
	
		for(Animal animal: animals) {
			animal.bark();
		}
	}
	

}
