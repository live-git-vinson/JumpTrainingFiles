package com.cognixia.jump.fullstack.interfaces;

public class Runner implements Calculator {

	public static void main(String[] args) {
		
		WolfHybrid hybrid = new WolfHybrid();
		
		hybrid.move();
		hybrid.barker();
		
		System.out.println(Calculator.sum(1,2,3,16));

	}

}
