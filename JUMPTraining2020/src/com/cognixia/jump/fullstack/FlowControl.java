package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		
		// open scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt for an input
		System.out.println("Enter a number:");
				
		//get input
		int output = input.nextInt();
				
		
		for(int i = output; i > 20; i-=4) {
			System.out.println(i);
		}
		//flowControl demo here
		
		//conditionals ifs and switch
//		boolean condition = output >= 0;
//		if(condition) {
//			System.out.println("Your number is positive\nResting above zero\nDifferent world");
//		}
//		else {
//			System.out.print("Your number is negative\nResting below zero\nDifferent world");
//		}
		//return the user choice
		//System.out.println(output);
		
		input.close();

	}

}
