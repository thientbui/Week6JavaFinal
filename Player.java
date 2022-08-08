package JavaFinalProject;


import java.util.ArrayList;
import java.util.List;


public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	

	public void describe() {
		System.out.println(name + " Has the following cards");
		System.out.println(hand);
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.remove(0));
	}
	
	public void incrementScore() {
		score += 1;
	}
	
	public int getScore() {
		return score;
	}


	public String getName() {
		return name;
	}


	public List<Card> getHand() {
		return hand;
	}

}