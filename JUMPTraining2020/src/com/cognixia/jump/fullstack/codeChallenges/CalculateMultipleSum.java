package com.cognixia.jump.fullstack.codeChallenges;

public class CalculateMultipleSum {

	
	public void MultipleSum() {
		
		GetInteger input = new GetInteger();
		int increment;
		int startRange;
		int endRange;
		int sum;
		
		GetMultipleSum summation = new GetMultipleSum();
		
		do { 
			System.out.println("Please enter an increment to sum");
			increment = input.getInt();
			
			do {
				System.out.println("Please enter a starting integer");
				startRange = input.getInt();
				System.out.println("Please enter an ending integer");
				endRange = input.getInt();
			}while(endRange < startRange);
			
			//Calls method that adds multiples passing it the userInput
			sum = summation.DisplayMultiples(increment, startRange, endRange);
			
			if(increment == sum)
			{
				System.out.println("your increment needs to be less than or equal to half your range");
			}
		
		}while(increment == sum);
		
		//displays the output
		System.out.print("The Sum of multples of " + increment + " from " + startRange);
		System.out.println(" to " + endRange + " is: " + sum);
	}
}
