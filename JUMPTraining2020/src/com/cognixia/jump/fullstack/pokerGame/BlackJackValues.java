package com.cognixia.jump.fullstack.pokerGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlackJackValues {

	static HashMap<String, Integer> deck = new HashMap<String, Integer>(); 
	
	public BlackJackValues() {
		
		
	}
	
	public static int handValue(List<PlayingCard> hand) {
		
		// Set values
				deck.put("Ace", 11);
				deck.put("King", 10);
				deck.put("Queen", 10);
				deck.put("Jack", 10);
				deck.put("Ten", 10);
				deck.put("Nine", 9);
				deck.put("Eight", 8);
				deck.put("Seven", 7);
				deck.put("Six", 6);
				deck.put("Five", 5);
				deck.put("Four", 4);
				deck.put("Three", 3);
				deck.put("Two", 2);
		
		int sum = 0;
		List<String> cardsInHand = new ArrayList<String>(); 
		//System.out.println(deck);
		for (PlayingCard card : hand) {
			
			cardsInHand.add(card.value);
			
			sum += deck.get(card.value);
			
			if(cardsInHand.contains("Ace") && sum > 21) {
				sum -= 10;
				int Ace = cardsInHand.indexOf("Ace");
				cardsInHand.remove(Ace);
			}
		}
		return sum;
	}
	
}
