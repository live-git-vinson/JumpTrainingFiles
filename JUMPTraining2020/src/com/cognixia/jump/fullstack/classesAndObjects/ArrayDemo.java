package com.cognixia.jump.fullstack.classesAndObjects;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Cat[] catArr = new Cat[5];
		
		
		Cat cat1 = new Cat(12, "Bob", "bobcat");
		
		catArr[0] = cat1;
		
		System.out.println(Arrays.toString(catArr));

	}

}
