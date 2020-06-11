package com.cognixia.jump.fullstack.codeChallenges;

public class GetMultipleSum {

	public int DisplayMultiples (int userInput, int startRange, int endRange) {
		int sum = 0;
		//loops through adding the amount input to a variable Sum
		for (int i = startRange; i <= endRange; i++) {
			
			if(i % userInput == 0) {
				sum += i;
			}
				
		}
		return sum;
	}
	
}
