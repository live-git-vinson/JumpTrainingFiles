package com.cognixia.jump.fullstack;

import java.math.BigInteger;

public class LoopPractice {

	public static void main(String[] args) {

		boolean condition = true;
		BigInteger bd;
		for(bd = new BigInteger("1"); condition; bd = bd.multiply(new BigInteger("5")))
		{
			if (bd.mod(new BigInteger("3")) == new BigInteger("0")) {
				condition = false;
			}
			System.out.println(bd);
		}
	}

}
