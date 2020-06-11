package com.cognixia.jump.fullstack.codeChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.cognixia.jump.fullstack.pokerGame.PlayingCard;


public class CollectionsPractice {

	public static void main(String[] args) {
		
//		listsPractice();
//		setsPractice();
//		hashMapsPractice();
//		queuesPractice();
		

	}
	
	public static void listsPractice() {
		// Create my list
		List<PlayingCard> card = new ArrayList<PlayingCard>(); 
		// creates some object to put in the list
		PlayingCard aceOfHearts = new PlayingCard("aceOfHearts");
		PlayingCard aceOfDiamonds = new PlayingCard("aceOfDiamonds");
		PlayingCard aceOfSpades = new PlayingCard("aceOfSpades");
		PlayingCard aceOfClubs = new PlayingCard("aceOfClubs");
		// Add some objects to the list
		card.add(new PlayingCard("sevenOfHearts"));
		card.add(aceOfClubs);
		card.add(aceOfHearts);
		card.add(aceOfDiamonds);
		card.add(aceOfSpades);
		// Print the list
		System.out.println("List Practice{");
		System.out.println("Deck: ");
		for(PlayingCard deck : card) {
			System.out.println(deck.getName());
		}
		// Remove an item
		System.out.println("Removing " + card.get(1).getName());
		card.remove(1);
		// change and item
		System.out.println("Changeing " + card.get(2).getName() + " to the 2 of spades");
		card.get(2).setName("twoOfSpades");
		// Print the changes
		System.out.println("Cards Left");
		for(PlayingCard deck : card) {
			System.out.println(deck.getName());
		}
		System.out.println("}List Practice");
		System.out.println();
		
		
	}
	public static void setsPractice() {
		// create
		Set<PlayingCard> deck = new HashSet<PlayingCard>(); 
		// create some objects like in the list
		PlayingCard aceOfHearts = new PlayingCard("aceOfHearts");
		PlayingCard aceOfDiamonds = new PlayingCard("aceOfDiamonds");
		PlayingCard aceOfSpades = new PlayingCard("aceOfSpades");
		PlayingCard aceOfClubs = new PlayingCard("aceOfClubs");
		// Added objects, specifically more than one of a couple type
		deck.add(new PlayingCard("sevenOfHearts"));
		deck.add(aceOfClubs);
		deck.add(aceOfHearts);
		deck.add(aceOfDiamonds);
		deck.add(aceOfSpades);
		deck.add(aceOfHearts);
		deck.add(aceOfDiamonds);
		deck.add(aceOfSpades);
		//removed
		deck.remove(aceOfDiamonds);
		
		//print
		System.out.println("Set Practice{");
		System.out.println("Deck: ");
		for (PlayingCard card : deck) {
			System.out.println(card.getName());
		}
		// Change
		System.out.println("Deck changed to Jokers: ");
		for (PlayingCard card : deck) {
			card.setName("Joker");
			System.out.println(card.getName());
		}
		System.out.println("}List Practice");
	}


	public static void queuesPractice() {
		// Create
		LinkedList<String> rules = new LinkedList<String>();
		// Add
		rules.add("Pair");
		rules.add("Two Pair");
		rules.add("Three of a Kind");
		rules.add("Flush");
		rules.add("Straight");
		rules.add("Straight Flush");
		// Remove
		rules.remove(2);
		// change
		rules.set(3, "Full House");
		// print
		System.out.println(rules);
	}
	
	public static void dequesPractice() {
		
	}
	
	public static void hashMapsPractice() {
		// Create
		HashMap<String, Integer> deck = new HashMap<String, Integer>(); 
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
		// print
		System.out.println(deck);
		System.out.println(deck.get("Six"));
		// change
		deck.put("Six", 12);
		System.out.println(deck);
		// remove
		deck.remove("Two");
		System.out.println(deck);
	}
}
