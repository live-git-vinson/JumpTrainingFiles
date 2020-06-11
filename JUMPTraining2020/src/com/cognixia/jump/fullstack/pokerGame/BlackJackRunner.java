package com.cognixia.jump.fullstack.pokerGame;

import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.fullstack.ReadFromConsole;
import com.cognixia.jump.fullstack.codeChallenges.GetInteger;

public class BlackJackRunner {

	//create some collections and our game specific variables
	static PlayingCardDeck deck;
	static int numberOfPlayers = 2;
	static List<PokerPlayer> playersInGame = new ArrayList<PokerPlayer>();
	static GetInteger scanner = new GetInteger();
	static int dealersHandValue = 0;
	
	
	public static void main(String[] args) {
		
		
		// Ask for Number of Players
		getPlayers();
		// Create the deck
		if (numberOfPlayers > 10 && numberOfPlayers < 30) {
			deck = new PlayingCardDeck(3);
		}
		else if(numberOfPlayers >= 30) {
			deck = new PlayingCardDeck(6);
		}
		else{
			deck = new PlayingCardDeck(1);
		}
		// Shuffle
		System.out.println("Shuffling");
		deck.shuffle();
		// Deal to all players
		deal(numberOfPlayers);
		// show the players hand and ask them to hit or stand
		// looping through the non dealer players
		for(int i = 0; i < numberOfPlayers - 1; i++) {
			System.out.println("Player " + (i + 1));
			revealHand(playersInGame.get(i));
			System.out.println();
			System.out.println("Dealers revealed card");
			// reveals the dealers second card dealt
			revealDealerCard(playersInGame.get(numberOfPlayers - 1));
			// Hit or stay
			hitOrStay(playersInGame.get(i));
			System.out.println();
		}
		
		//Dealers turn
		dealerAI();
		revealHand(playersInGame.get(numberOfPlayers - 1));
		System.out.println();
		// Check each hands value
		for(int i = 0; i < numberOfPlayers - 1; i++) {
			System.out.println();
			checkVictory(playersInGame.get(i));
		}
		
		// close scanner
		GetInteger.closeScanner();
	}
	
	
	public static void deal(int players) {
		//for each player deal them a card twice
		for (int i = 0; i < playersInGame.size(); i++) {
			 playersInGame.get(i).hand.add((PlayingCard) deck.drawACard());
		}
		for (int i = 0; i < playersInGame.size(); i++) {
			 playersInGame.get(i).hand.add((PlayingCard) deck.drawACard());
		}
	}

	public static void getPlayers() {
		// asks how many players, get an input, populates the list of players
		
		
		do {
			System.out.println("Getting Players");
			System.out.println("How Many Players Not Including the Dealer?"); 
			numberOfPlayers = scanner.getInt() + 1;
			if (numberOfPlayers > 30) {
				System.out.println("Please use less than 30 players.");
			}
		} while(numberOfPlayers > 30);
		
		int i = 0;
		while (i < numberOfPlayers) {
			i++;
			playersInGame.add(new PokerPlayer());
		}
	}
	
	public static void doubleDownCheck() {
		// not yet implemented
	}

	public static void hitOrStay(PokerPlayer player) {
		
		// Asks players if they want another card.
		boolean stop = false;
		int sum = 0;
		do {
			System.out.println("Would you like to hit or stand?");
			String playerChoice = ReadFromConsole.getInput();
			switch (playerChoice) {
			case "hit":
			case "Hit":
				player.hand.add((PlayingCard) deck.drawACard());
				revealHand(player);
				break;
			case "stand":
			case "Stand":
				stop = true;
				break;
			default:
				System.out.println("Sorry not an option");
				break;
			}
			// Checks if the player has gone over 21, stops if they have
			sum = BlackJackValues.handValue(player.hand); 
		} while(!stop && sum <= 21);
		
	}
	
	public static void revealHand(PokerPlayer player) {
		// Method just prints out the hand of the player passed to it
		for (PlayingCard card : player.hand) {
			System.out.println(card.name);
		}
	}
	
	public static void revealDealerCard(PokerPlayer player) {
		// reveals the second card in the dealers hand
		System.out.println(player.hand.get(1).getName());
	}
	
	public static void dealerAI() {
		
		// on the dealers turn they must follow these actions
		
		dealersHandValue = BlackJackValues.handValue(playersInGame.get(numberOfPlayers - 1).hand);
		boolean repeat = true;
		do {
			dealersHandValue = BlackJackValues.handValue(playersInGame.get(numberOfPlayers - 1).hand);
			if (dealersHandValue > 21) {
				System.out.println("Dealer Busts");
			}
			if(dealersHandValue == 21) {
				System.out.println("House Wins");
			}
			if(dealersHandValue <= 16) {
				playersInGame.get(numberOfPlayers - 1).hand.add((PlayingCard) deck.drawACard());
			}
			else {
				if(dealersHandValue <= 21) {
					System.out.println("Dealer Stands");
				}
				repeat = false;
			}
		} while (repeat == true);
	}
	
	public static void checkVictory(PokerPlayer player) {
		// player is passed in
		// This variable is just made to display the corresponding player number
		int playerName = playersInGame.indexOf(player) + 1;
		// The rest of this simply compares the players score
		// to the dealer and relative to 21.
		// Also displays victory or loss message
		int playerSum = BlackJackValues.handValue(player.hand);
		int dealerSum = BlackJackValues.handValue(playersInGame.get(playersInGame.size() -1).hand);
		boolean dealerBusts = false;
		boolean playerBusts = false;
		
		System.out.println("Player " + playerName);
		System.out.println("You have " + playerSum);
		System.out.println("Dealer has " + dealerSum);
		if (dealerSum > 21) {
			dealerBusts = true;
		}
		if (playerSum > 21) {
			playerBusts = true;
		}
		
		if (playerBusts) {
			System.out.println("You Bust.");
		}
		if(playerSum == 21) {
			System.out.println("BlackJack!");
		}
		if(playerSum <= 21 && (playerSum > dealersHandValue || dealerBusts)) {
			System.out.println("You win!");
		}
		else if (playerSum <= dealersHandValue && !dealerBusts){
			
			System.out.println("You lose!");
		}
		
	}
}
