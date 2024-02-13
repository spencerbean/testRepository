package finalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}

	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand: ");
		for (Card card : hand) {
			card.describe();
		}
	}

	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		} else {
			System.out.println("Hand is empty.");
			return null;
		}
	}
	
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}

	public void incrementScore() {
		score++;
	}

	public int getScore() {
	    return score;
	}


}
