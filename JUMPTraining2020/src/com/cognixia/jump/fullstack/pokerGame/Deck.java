package com.cognixia.jump.fullstack.pokerGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	// create a couple lists
	public static List<Card> deck = new ArrayList<Card>();
	static List<Card> discard = new ArrayList<Card>();
	// Constructor
	public Deck() {

	}
	
	
	public void shuffle() {
		// Make a shuffling list
		List<Card> shuffling = new ArrayList<Card>();
		Random rand = new Random();
		// While there is cards in the deck, choose a random card and put it in the 
		do {
			int shuffleIndex = rand.nextInt(deck.size());
			shuffling.add(deck.get(shuffleIndex));
			deck.remove(shuffleIndex);
			
		} while (!deck.isEmpty());
		
		deck = shuffling;
		
	}
	
	public void printDeck() {
		for(Card card : deck) {
			System.out.println(card.getName());
		}
	}
	
	public Card drawACard() {
		Card draw = deck.get(0);
		deck.remove(0);
		return draw;
	}
	
	public void discardACardFaceDown(Card discardCard) {
		discard.add(discardCard);
	}
	
	public void discardACardFaceUp(Card discardCard) {
		discard.add(discardCard);
		System.out.println("Discarded card is: " + discardCard.name);
	}
}
