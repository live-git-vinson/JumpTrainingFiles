package com.cognixia.jump.fullstack.codeChallenges;

import java.util.Arrays;

public class CheckMatchingArrays {

	public static void main(String[] args) {
		
		int[] firstArray = {3, 4, 2, 4, 3};
		int[] secondArray = {3, 4, 4, 3, 2};
		checkIntArrayEqual(firstArray, secondArray);

	}
	
	public static void checkIntArrayEqual (int[] first, int[] second) {
		Arrays.sort(first);
		Arrays.sort(second);
		System.out.println(Arrays.equals(first, second));
	}
	
	public static boolean match(int[] first, int[] second) {
		if (first.length != second.length) {
			return false;
		}
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		for(int i = 0; i< first.length; i++) {
			if (first[i] != second[i]) {
				return false;
			}
		}
		return true;
	}
}
