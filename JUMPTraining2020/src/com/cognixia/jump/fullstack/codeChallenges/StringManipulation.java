package com.cognixia.jump.fullstack.codeChallenges;

public class StringManipulation {

	public static void main(String[] args) {


		String abs = "aaabababbabbcbcbbabab";
		char[] absArr = abs.toCharArray();
		String endString = "";
		
		for (int i = 0; i < absArr.length - 1; i++) {
			if (absArr[i] != absArr[i+1]) {
				endString = endString + absArr[i];
			}
		}
		
		endString = endString + absArr[absArr.length-1];
		
		
		System.out.println(endString);

	}

}
