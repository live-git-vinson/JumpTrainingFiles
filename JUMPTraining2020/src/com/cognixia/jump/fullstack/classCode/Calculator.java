package com.cognixia.jump.fullstack.classesAndObjects;

public class Calculator {
	
	// attributes
	int one;
	int two;
	
	// constructor
	Calculator(int one, int two) {
		
		this.one = one;
		this.two = two;
		
	}
	
	// methods
	public void sumOfTwoNumbers() {
		System.out.println(one + two);
	}
	
	// make a sum method for 2 numbers that takes them as parameters
	// and then returns the sum itself
	
	public void multiply() {
		System.out.println(one * two);
	}
	
	// the () are the parameters - which is the data in
	public double divide(double dividend, double divisor) {

		double quotient = dividend / divisor;
		// the return is the data out
		return quotient;
	}
	
	

}
