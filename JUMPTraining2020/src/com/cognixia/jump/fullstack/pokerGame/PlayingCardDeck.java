package com.cognixia.jump.fullstack.pokerGame;

public class PlayingCardDeck extends Deck {
	
	public  PlayingCardDeck(int decks) {
		
		String suit = "";
		
		for (int k = 1; k <= decks; k++) {
			
		
			for (int i = 1; i <= 4; i++) {
				
				switch (i) {
				case 1:
					suit = "Spades";
					break;
				case 2:
					suit = "Hearts";
					break;
				case 3:
					suit = "Clubs";
					break;
				case 4:
					suit = "Diamonds";
					break;
				}
			
				for (int j = 1; j <= 13; j++) {
					switch (j) {
					case 1:
						deck.add(new PlayingCard("Ace", suit));
						break;
					case 2:
						deck.add(new PlayingCard("Two", suit));
						break;
					case 3:
						deck.add(new PlayingCard("Three", suit));
						break;
					case 4:
						deck.add(new PlayingCard("Four", suit));
						break;
					case 5:
						deck.add(new PlayingCard("Five", suit));
						break;
					case 6:
						deck.add(new PlayingCard("Six", suit));
						break;
					case 7:
						deck.add(new PlayingCard("Seven", suit));
						break;
					case 8:
						deck.add(new PlayingCard("Eight", suit));
						break;
					case 9:
						deck.add(new PlayingCard("Nine", suit));
						break;
					case 10:
						deck.add(new PlayingCard("Ten", suit));
						break;
					case 11:
						deck.add(new PlayingCard("Jack", suit));
						break;
					case 12:
						deck.add(new PlayingCard("Queen", suit));
						break;
					case 13:
						deck.add(new PlayingCard("King", suit));
						break;
					}
				
				}
			}
			
		
		}
	}
	
	
}

