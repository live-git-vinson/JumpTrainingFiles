package com.cognixia.jump.fullstack.classesAndObjects;

public class AnimalRunner {

	public static void main(String[] args) {
		
		// object creation
		
		Cat cat1 = new Cat(10, "Whiskers", "Siamese");
		Cat cat2 = new Cat(11, "MeowMeow", "Siamese");
		Cat cat3 = new Cat(12, "Felix", "Siamese");
		Cat cat4 = new Cat(13, "Tom", "Siamese");
		
		Animal anim1 = new Animal();
		
		anim1.move();
		cat1.move();
		
		cat1.move(10, 50);
		
		String s1 = "";
		
		
//		int exec = cat1.noises("Meow", 16);
		
//		System.out.println(cat1.getWeight() + " " + cat1.getName() + 
//				" " + cat1.getId());
//		System.out.println(cat2.getWeight() + " " + cat2.getName()+ 
//				" " + cat2.getId());
//		System.out.println(cat3.getWeight() + " " + cat3.getName()+ 
//				" " + cat3.getId());
//		System.out.println(cat4.getWeight() + " " + cat4.getName()+ 
//				" " + cat4.getId());
//		
//		System.out.println(cat2.getName());
//		
//		Cat.printCatCount();
//		int x = Cat.getCount();
		

	}

}
