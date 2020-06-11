package com.cognixia.jump.fullstack.codeChallenges;

public class ReversingStrings {

	public static void main(String[] args) {
		
		String str1 = "Constitutional";
		String str2 = "I am Iron Man";
		
		singleWordReverse(str1);
		System.out.println();
		singleWordReverse2(str1);
		multiWordReverse(str2);

	}
	
	public static void singleWordReverse(String str) {
		StringBuilder builder = new StringBuilder(str);
		
		System.out.print(builder.reverse());
	}
	
	public static void singleWordReverse2(String str) {
		int j = 0;
		char[] backWord = new char[str.length()];
		for (int i = str.length() - 1; i >= 0 ; i--) {
			backWord[j] = str.charAt(i);
			j++;
		}
		System.out.println(backWord);
	}
	
	public static void multiWordReverse(String str) {
		
		String word = "";
		for ( int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				word += str.charAt(i);
			}
			if(str.charAt(i)== ' ' || i == str.length()-1) {
				singleWordReverse(word);
				System.out.print(" ");
				word = "";
			}
		}
		
		
	}

}
