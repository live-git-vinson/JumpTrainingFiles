package com.cognixia.jump.fullstack.classesAndObjects;

public class Calculator {
	
	// attributes
	int one;
	int two;
	static int opsCount = 0;
	
	static {
		System.out.println("This is the static block");
	}
	

	
	
	// constructor
	Calculator(){
		System.out.println("This is our constructor");
	}
	
	Calculator(int one, int two) {
		
		this.one = one;
		this.two = two;
		System.out.println("This is our constructor");
		
	}
	
	// methods
	public static void sumOfTwoNumbers(int one, int two) {
		System.out.println(one + two);
		opsCount++;
	}
	
	// make a sum method for 2 numbers that takes them as parameters
	// and then returns the sum itself
	
	public static void multiply(int one, int two) {
		System.out.println(one * two);
		System.out.println("This is our static method");
		opsCount++;
	}
	
	// the () are the parameters - which is the data in
	public static double divide(double dividend, double divisor) {

		double quotient = dividend / divisor;
		
		opsCount++;
		// the return is the data out
		return quotient;
	}
	
	// code block - instance
	{
		System.out.println("This is the code block");
	}

}
