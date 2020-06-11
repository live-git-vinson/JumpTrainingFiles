package com.cognixia.jump.fullstack.classesAndObjects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// declaring array
		int[] intArr1;
		//int intArr2[];
		
		Cat[] cats;
		
		// initializing
			// this makes a new array of size 5, with def values = 0;
		intArr1 = new int[5];
		cats = new Cat[5];
		// intArr2 = {50, 40, 35, 45, 10}; <- not valid
		
		// declare and initialize
		int[] intArr3 = {50, 40, 35, 45, 10};
		
		Cat[] litter = {new Cat(10, "Mittens", "Tabby"), 
				new Cat(), new Cat()};
		
		// initial values
		
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(cats));
		
		// reading / writing / accessing array
		System.out.println(litter[0]);
		intArr1[2] = 100;
		
//		litter[2] = null;
		
		// out of bounds
		//System.out.println(litter[10]);
		
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(litter));
		
		// iterating / looping through array
		
			// traditional for loop
			// start at beginning go through each till end
			for(int i = 0; i < intArr3.length; i++) {
				System.out.println(intArr3[i]);
			}
			System.out.println();
				// Goes backwards though each element
			for(int i = litter.length-1; i >=0; i--) {
				System.out.println(litter[i]);
			}
		System.out.println("For Each loops \n");
			// for each loop
				// primitive array
			for(int elem : intArr3) {
				if (elem == 40) { 
					elem = 50;
				}
				System.out.println(elem);
			}
			
			//test the write of for each loop with prim
			System.out.println(Arrays.toString(intArr3));
				// array of objects
			for(Cat cat : litter) {
				if(cat.getName().equals("Mittens")) {
//					cat = new Cat(10, "Overridden", "New Cat");
//					cat = null;
					cat.setName("Override"); // special case, where write works
				}
				System.out.println("inside of for each loop");
				System.out.println(cat);
			}
			System.out.println("\noutside for each loop");
			System.out.println(Arrays.toString(litter));
		
		// Homogenous and Hetrogenous Arrays (Inherritence)
			
			Animal[] animals = new Animal[3];
//			cats[0] = new Animal();
			
			animals[0] = new Animal();
			animals[1] = new Cat();
		
		// Array class static methods
			
			Array.getInt(intArr3, 3);
			
		
		// Utility class - Arrays
			
			String output = Arrays.toString(litter);
			System.out.println(output);
			
			// code challenge
			int[] arr1 = {1, 3, 5, 0};
			int[] arr2 = {0, 5, 1, 3};
			int[] arr3 = {3, 5, 4, 0};
			
			Arrays.parallelSort(arr1);
			Arrays.parallelSort(arr2);
			Arrays.parallelSort(arr3);
			boolean areEqual = Arrays.equals(arr1, arr2);
			System.out.println(areEqual);
			
			// pass by ref and pass by value
			
			int a = 4;
			int b = 10;
			int[] ints = new int[2];
			ints [0] = a;
			ints [1] = b;
			swapInts(a,b);
			swapInts2(ints);
			System.out.println("In main method");
			System.out.println(ints[0] + " " + ints[1]);
			System.out.println(a + " " + b);
			
	}
	
	public static void swapInts2(int[] ints) {
		int temp = ints[0];
		ints[0] = ints[1];
		ints[1] = temp;
		System.out.println("In swap 2 method");
		System.out.println(ints[0] + " " + ints[1]);
		
	}
	
//	public static void swapInts(int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("In swap 1 method");
//		System.out.println(a + " " + b);
//		
//	}

	public static int[] swapInts(int a, int b) {
		
		int[] arr = {b, a};
		
		
		return arr;
	}
}
