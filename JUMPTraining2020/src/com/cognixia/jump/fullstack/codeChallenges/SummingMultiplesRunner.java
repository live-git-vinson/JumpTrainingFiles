package com.cognixia.jump.fullstack.codeChallenges;


public class SummingMultiplesRunner {

	//This is the main function works with
	public static void main(String[] args) {
		
		boolean cont = true;
		//creates a new summing object
		CalculateMultipleSum sum = new CalculateMultipleSum();
		//creates a new integer calling object
		GetInteger yesOrNo = new GetInteger();
		
		//This loops until the user doesn't input
		do {
			sum.MultipleSum();
			
			System.out.println("Enter 1 to continue:");
			
			int userInput = yesOrNo.getInt();
			
			if(userInput != 1) {
				cont = false;
			}
		}while(cont);
	}
}
