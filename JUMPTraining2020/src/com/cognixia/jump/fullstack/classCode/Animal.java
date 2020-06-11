package com.cognixia.jump.fullstack.classesAndObjects;

public class Animal {

	// Attributes
	int weight;
	String name;
	
	// Constructors
	Animal() {
		this.weight = 0;
	}
	
	Animal(int weight) {
		this.weight = weight;
	}
	
	Animal(String name) {
		this.name = name;
	}
	
	Animal(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	// Methods
	public void move() {
		System.out.println("The animal moves");
	}
	
	
}
