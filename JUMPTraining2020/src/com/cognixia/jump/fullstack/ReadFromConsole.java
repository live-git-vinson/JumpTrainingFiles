package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadFromConsole {

	static Scanner input = new Scanner(System.in);
	
	public static String getInput() {
				
		//get input
		String output = input.nextLine();
					
//		//return the user choice
//		System.out.println(output);
				
		
				
		return output;
	}

	public static void closeScanner() {
		//close scanner
		input.close();
	}
}
