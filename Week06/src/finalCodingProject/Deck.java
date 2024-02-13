package finalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	public Deck () {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		for (String suit : suits) {
			for (int value = 2; value <= 14; value++) {
				String name = getValueName(value) + " of " + suit;
				cards.add(new Card(name, value));
			
			}
	}
		
	}
	
	// method to shuffle the deck 
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	
	// method to determine "face" of cards valued 11 - 14
	private String getValueName(int value) {
		switch (value) {
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		case 14:
			return "Ace";
		default:
			return String.valueOf(value);
		}
	}
	
	// method for drawing 
	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		} else {
			return null;
		}
	}

}
