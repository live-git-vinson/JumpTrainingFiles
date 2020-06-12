package com.cognixia.jump.fullstack.pokerGame;

public class PlayingCard extends Card {

	String name;
	String suit;
	String value;
	
	public PlayingCard(String name){
		this.name = name;
	}
	
	public PlayingCard(String value, String suit){
		this.name = value + " of " + suit;
		this.suit = suit;
		this.value = value;
	}

//	public String getName() {
//		return name;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public String getValue() {
		return value;
	}
	
}
