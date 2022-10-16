package Week6FinalProject;

import java.util.ArrayList;


public class Player {
	
	//ArrayList of card 
	ArrayList<Card> hand = new ArrayList<Card>();
	
	private int score;
	private String name;
	
	
	//score (set to 0 in the constructor)
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	//Print out info about player and card
	public void describe() {
		
		System.out.println("----------------------------------------------------------");
		System.out.println(name + " has the following cards: ");
		System.out.println("----------------------------------------------------------");
		for(int i = 0; i < hand.size(); i++) {
			System.out.println(i+1 + ": " +  ((Card) hand.get(i)).describe());
		}
	}
	//flip though deck(removes and returns the top card of the Hand)
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	//Takes deck as argument and calls draw method on deck, adding the returned card from hand
	public void draw(Deck deck) {
		hand.add(deck.Draw());
	}
	
	//increment score
	public void incrementScore() {
		//score += 1;
		setScore(getScore() + 1);
	}
	
	//Getter and Setter methods

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}