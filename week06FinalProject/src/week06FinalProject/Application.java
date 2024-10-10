package week06FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Deck splatAttack = new Deck();
		
		List<Card> handOne = new ArrayList<Card>();
		List<Card> handTwo = new ArrayList<Card>();
		
		Player playOne = new Player("Libby", handOne, 0);
		playOne.setHand(handOne);
		playOne.setScore(0);
		Player playTwo = new Player("Kiki", handTwo, 0);
		playTwo.setHand(handTwo);
		playTwo.setScore(0);
		
		splatAttack.shuffle();
		System.out.println("   =The Shuffled Deck=");
		splatAttack.describe();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playOne.drawThis(splatAttack);
			} else {
				playTwo.drawThis(splatAttack);
			}
		}
		playOne.describe();
		System.out.println("       ");
		playTwo.describe();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		for (int i = 0; i < 26; i++) {
			Card cardOne = playOne.flipside();
			Card cardTwo = playTwo.flipside();
			if (cardOne.getValue() > cardTwo.getValue()) {
				playOne.incrementation();
				System.out.println("Libby Gets a Point!");
				System.out.println("       ");
			} else if (cardTwo.getValue() > cardOne.getValue()) {
				playTwo.incrementation();
				System.out.println("Kiki Gets a Point!");
				System.out.println("       ");
			} else {
				System.out.println("It's a Draw!");
				System.out.println("       ");
			}
			playOne.describe();
			System.out.println("       ");
			playTwo.describe();
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
		System.out.println("Libby's score is: " + playOne.getScore());
		System.out.println("Kiki's score is: " + playTwo.getScore());
		
		if (playOne.getScore() > playTwo.getScore()) {
			System.out.println("Libby is the Winner!");
		} else if (playTwo.getScore() > playOne.getScore()) {
			System.out.println("Kiki is the Winner!");
		} else {
			System.out.println("Draw!");
		}
		
		
		
		
		
		
			
			
			
			
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


