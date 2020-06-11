package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class FlowControlClassMadePage {

	public static void main(String[] args) {

		// Start UserInput

		// We need to make a Scanner tool to get input
		Scanner input; 
		boolean valid;

		do {
			// Prompt the User for input
			System.out.println("Please enter a number: ");
	
			// re-initialize the scanner
			input= new Scanner(System.in);
			
			// verify the right kind of input
			valid = input.hasNextInt();
			System.out.println(valid);
			
			// we only Read the user input if it is valid
			if(valid) {
				// this is the actual reading
				
				//int userInput = input.nextInt();
				//valid = input.hasNextInt();
			}
		} while (!valid);

		// Flow Control Demo Starts here:

		// Conditionals (Ifs and Switch)

//				boolean condition = userInput >= 0;
//				
//				if (condition) {
//					System.out.println("Your number is positive.");
//				}
//				else if (userInput > 50) {
//					System.out.println("You're in the magic range.");
//				}
//				else {
//					System.out.println("Your number is negative");
//				}

		// Switch

//		switch (userInput) {
//		case "a":
//		case "A":
//			System.out.println("User Settings");
//			break;
//		case "b":
//		case "B":
//			System.out.println("Home Menu");
//			break;
//		default:
//			System.out.println("No options valid");
//		}

		// similar code with if
//		if (userInput <= 5) {
//			if (userInput >1) {
//				if(userInput % 2 == 0) {
//					System.out.println("Target Range.");
//				}
//			}
//		}
//				if (userInput == 2) {
//					System.out.println("User Settings");
//				}
		
		// Loops
		// While loop
		
		//int counter = 0;
		
//		while (counter < 10) {
//			System.out.println(counter);
//			counter++;
//		}
		
//		while (userInput < 0) {
//			// re-prompt
//			System.out.println("Enter a number:");
//			// re-read user input
//			userInput = input.nextInt();
//			System.out.println(userInput);
//		}
		
//		do {
//			
//			System.out.println("Enter a positive number only: ");
//			userInput = input.nextInt();
//			System.out.println("Iterating through do-while.");	
//		} while(userInput < 0);
		

		// print the input to show that we stored / received it
//		System.out.println(userInput);

		// print demo

//				System.out.print("New line after here \nnew line started.");
//				System.out.print("New conetent \tthis is a tab.");
//				System.out.println("\nI want to print \\");
//				System.out.println("Printing quotes: \"Quote\" ");
		 
		// For loop
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}		
		
//		for(int i = 9; i >= 0; i-=2) {
//			System.out.println(i);
//		}

		// the example from the slides
//		boolean condition = true;
//		for (int i = 1; condition; i += 4){
//		     if (i % 3 == 0){
//		          condition = false;
//		     }
//		     System.out.println(i);
//		}
		
		// Nested for loop
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
			}
		}

		
		// close the input
		input.close();

	}

}