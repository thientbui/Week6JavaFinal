package JavaFinalProject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck extends ArrayList<Card> {
	
	List<Integer> values = List.of(2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12, 13, 14);
	
	List<String> names = List.of("Spades", "Hearts", "Clubs", "Diamonds");
	
	List<Card> cards = new ArrayList<Card>();

	public Deck() {
		for(int value : values) {
			for(String name : names) {
				Card card = new Card(value, name);
				this.add(card);
			}
		} 
	}
	
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("List of cards: ").append(System.lineSeparator());
		for(Card card : this) {
			b.append(" ").append(card).append(System.lineSeparator());
		}
		return b.toString();
	}


	public void shuffle(List<Card> cards) {
		Collections.shuffle(cards);
	}
	
	
	public Card draw(List<Card> cards) {
		return cards.remove(0);
	}

}