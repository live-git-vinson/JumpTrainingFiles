package com.cognixia.jump.fullstack.strings;

public class StringDemo {

	public static void main(String[] args) {
	
		// String Pool Demo (Memory)
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s1";
		String s4 = new String("s1");
		String s5 = s4;
		
		// Using hashcode can't distinguish memory in String
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " "
				+ s3.hashCode() + " "+ s4.hashCode() + " "
				+ s5.hashCode());
		System.out.println();
		// == checks for the same address only
		System.out.println((s1==s2) + " " + (s1==s3) + " " + (s1==s4)
				+ " " + (s1==s5) + " " + (s4==s5));
		System.out.println();
		// .equals checks the actuals contents of the String
		System.out.println(s1.equals(s2) + " " + s1.equals(s3) + " "
				+ s1.equals(s4) + " "+ s1.equals(s5) + " "
				+ s4.equals(s5));
		System.out.println();
		// checking .contentEquals() method
		System.out.println(s1.contentEquals(s2) + " " + s1.contentEquals(s3) + " "
				+ s1.contentEquals(s4) + " "+ s1.contentEquals(s5) + " "
				+ s4.contentEquals(s5));
		
		// String instance Methods
		System.out.println();
		String testString = "someone give me a sentence here.";
		System.out.println(testString.charAt(5));
		System.out.println(testString.indexOf('e', 9));
		System.out.println(testString.substring(5, 11));
		
		// String Static Methods
		boolean b = true;
		boolean c = true;
		String s = String.valueOf(b);
		String x = String.valueOf(c);
		System.out.println(s + x);
		
		// loop through String
		for(int i = 0; i < testString.length(); i++) {
			char[] temp = testString.toCharArray();
			System.out.println(testString.charAt(i));
			System.out.println(temp[i]);
			System.out.println(testString.toCharArray()[i]);
		}
		
		System.out.println(sum(1, 2, 3, 4));
		System.out.println(sum(2, 4));
		System.out.println(sum());
		
		int[] elips = {1, 2, 3, 4};
		
		StringBuilder builder = new StringBuilder("starter String");
		StringBuilder build2 = new StringBuilder();
		
		StringBuilder buff = new StringBuilder(builder);
		
		System.out.println(builder.reverse());
		
		build2.append("Hello World");
		
		System.out.println(buff);
	}
	
	// show elipses ...
	public static int sum(int... inputs) {
		int sum = 0;
		for(int i : inputs) {
			sum+=i;
		}
		return sum;
	}
	
	

}
