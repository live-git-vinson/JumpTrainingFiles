package com.cognixia.jump.fullstack.codeChallenges;

import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {
		// open scanner
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		boolean valid;
		boolean restart = false;
		float balance = 17.02f;
		
		do {			
			System.out.println("1: Withdrawls\n2: Deposits\n3: Balance");

			restart = false;
			do {
				// Prompt the User for input
				System.out.println("Please enter a number: ");
		
				// re-initialize the scanner
				input = new Scanner(System.in);
				
				// verify the right kind of input
				valid = input.hasNextInt();
				
				// we only Read the user input if it is valid
				if(valid) {
					// this is the actual reading
					userInput = input.nextInt();
					//valid = input.hasNextInt();
				}
			} while (!valid);
			
			
			switch (userInput) {
				case 1:
					System.out.println("Withdrawls");
					System.out.println("Enter Withdrawl Amount");
					System.out.println("Available Balance: " + balance);
					
					//float userWithdraw = getUserWithdraw(balance); call for a user input
					balance -= 12;
					//print out balance
					
					break;
				case 2:
					System.out.println("Deposits");
					System.out.println("Enter Deposit Amount");
					
					Deposit deposit = new Deposit();
//					Deposit deposit2 = new Deposit();
//					Deposit deposit3 = new Deposit();
//					Deposit deposit4 = new Deposit();
					
					
					float availBalance = deposit.callDeposit(balance);
					
					System.out.println(availBalance);
					
					break;
					
				case 3:
					System.out.println("Balance: " + balance);
					break;
				default:
					restart = true;
					System.out.println("Not a valid option\nRestarting...");
			}
		
		}while(restart);
		
		
		//Close the scanner
		input.close();

	}

}
