package Week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("serial")
public class Deck extends ArrayList<Card> {
	//ArrayLisr for cards
	List<Card> cards = new ArrayList<Card>();
	
	//card suite from least to greatest within ArrayList
	private final List<String> suits =
			List.of("Clubs", "Diamonds", "Hearts", "Spades");
	
	//card rank from least to greatest
	private final List<String> rank =
			List.of("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
					"Nine", "Ten", "Jack", "Queen", "King","Ace");
	
	//Constructor to create card
	public Deck() {
		for(int i = 0; i < suits.size(); i++) {
			for(int j = 0; j < rank.size(); j++) {
				cards.add(new Card(rank.get(i) + " of " + suits.get(i), i+2));
			}
		}
	}
	
	//shuffle cards
	public void Shuffle() {
		Collections.shuffle(cards);
	}
	
	//draw cards
	public Card Draw() {
		Card draw = cards.get(0);
		cards.remove(0);
		return draw;
	}
	
	public List<Card> getDeck(){
		return cards;
	}
	
	

}