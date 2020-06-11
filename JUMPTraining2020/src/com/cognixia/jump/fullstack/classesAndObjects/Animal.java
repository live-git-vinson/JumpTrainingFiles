package com.cognixia.jump.fullstack.classesAndObjects;

public class Animal {

	// Attributes and access modifiers
	
	// top down least restrictive / most available to least available.
	private int publicAt;
	private int weight;
	private int defaultAt; // this is default access
	private String name;
	
	// Constructors
	public Animal() {
		super();
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
	// We'll use this for overriding, this will be the original
	public void move() {
		System.out.println("The animal moves");
	}
	
	public int noises(String sound, int volume) {
		System.out.println("The animal makes a " + sound + "at volume "
				+ volume);
		return volume;
	}
	
	public void copyPaste() {System.out.println("original");}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
