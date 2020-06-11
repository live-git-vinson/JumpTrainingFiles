package com.cognixia.jump.fullstack.classesAndObjects;

public class CalcRunner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator(9, 7);
		
		calc.sumOfTwoNumbers();
		
		calc.multiply();
		
		double result = calc.divide(20, 6);
		
		System.out.println(result);

	}

}
