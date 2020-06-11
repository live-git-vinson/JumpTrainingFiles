package com.cognixia.jump.fullstack.enums;

public enum Grade {

	FRESHMAN, SOPHMORE, JUNIOR, SENIOR;
	
	// an ENUM's constructor is runs once for each value.  This statement will print for
	
	Grade(){
		System.out.println("A " + this.toString() + " has been in high school for " 
				+ (this.ordinal() + 1) + " year(s)");
		
	}
	
	public void hello() {
		System.out.println("Hello this Student is a " + this.toString());
	}
	
}
