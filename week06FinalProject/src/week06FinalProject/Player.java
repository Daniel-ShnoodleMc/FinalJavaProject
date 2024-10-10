package week06FinalProject;

import java.util.List;

public class Player {
	String name;
	List<Card> hand;
	int score;
	
	Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
	Card flipside() {
		return hand.remove(0);
	}
	
	public void drawThis(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementation() {
		this.score++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void describe() {
		System.out.println("Player: " + name + " has " + score + " points!    "
	+ name + "'s remaining cards:");
for (Card card : hand) {
			card.describe();
		}
	}
	
}
