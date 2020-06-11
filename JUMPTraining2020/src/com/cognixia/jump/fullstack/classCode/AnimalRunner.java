package com.cognixia.jump.fullstack.classesAndObjects;

public class AnimalRunner {

	public static void main(String[] args) {
		
		// primitive 
		int x = 4;
		
		
		// object
		
		Animal ani1 = new Animal();
		Animal ani2 = new Animal();
		Animal ani3 = new Animal(10);
		
		Cat cat = new Cat();
		Cat cat2 = new Cat();
		
		cat.move();
		
		System.out.println(ani3.weight);
		
		ani3.weight = 50;
		
		System.out.println(ani3.weight);
		
		
		

	}

}
