package com.cognixia.jump.fullstack.interfaces;

public interface Calculator {

	
	double PI = 3.14;
	
	static int sum(int... inputs) {
		int sum = 0;
		for (int i : inputs) {
			sum += i;
			
		}
		return sum;
	}
}
