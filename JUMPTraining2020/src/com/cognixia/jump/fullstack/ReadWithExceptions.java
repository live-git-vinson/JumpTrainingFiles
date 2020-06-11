package com.cognixia.jump.fullstack;

import java.util.Scanner;


public class ReadWithExceptions {

	public static void main(String[] args) throws Exception {
		int userInput = 0;
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a number: ");
			input = new Scanner(System.in);
			boolean stop = true;
			try{
				stop = input.hasNextInt();
				userInput = input.nextInt();
			} catch(Exception e) {
				System.out.println("please enter only integers.");
			} finally {
				System.out.println("We are done.");
				if(stop) {
					assert userInput > 0: "Please not negative";
					input.close();
					return;
				}
			}
		} 
	}
}
