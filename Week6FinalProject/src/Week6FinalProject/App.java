package Week6FinalProject;

public class App {

	public static void main(String[] args) {

		//Instantiate a deck and two players
		Deck deck = new Deck();
		Player player1 = new Player("Confederte Army");
		Player player2 = new Player("Union Army");
		
		System.out.println("There are two players in this game: " + "\n" + "Player 1: " + player1.getName() + "\n" + "Player 2: " + player2.getName() );
		
		//call shuffle method on the deck
		deck.Shuffle(); 
		
		//Traditional loop used to iterate through 52 times through the deck 
		for(int i = 0; i < 52; i++) { 
			if(i % 2 == 0) {
				player1.draw(deck); 
			}else {
				player2.draw(deck);
			}
		}
		
		//prints out each players hand
		player1.describe();
		player2.describe();
		
		
		System.out.println("------------------------------");
		System.out.println("         HAND RESULTS         ");
		
		//Traditional loop used to divide deck evenly, with each player receiving 26 cards using flip method
		for(int j = 0; j<26; j++) {
			Card player1Cards = player1.flip(); //flip method for player 1
			Card player2Cards = player2.flip(); //flip method for player 2
			
			//calls increments method for player with higher score
			if(player1Cards.getValue() > player2Cards.getValue()) {
				player1.incrementScore();
				
				System.out.println("------------------------------");
				System.out.println( j+1 +": " + player1.getName() + " wins this hand");
				System.out.println("The updated score is: " + "\n" + player1.getName() + ": " + player1.getScore() + "\n" + player2.getName() + ": " + player2.getScore());
				System.out.println("------------------------------");
			}else{
				player2.incrementScore();
				System.out.println("------------------------------");
				System.out.println(j+1 +": " + player2.getName() + " wins this hand");
				System.out.println("The updated score is: " + "\n" + player2.getName() + ": " + player2.getScore() + "\n" + player1.getName() + ": " + player1.getScore());
			}
			
		}
		
		
		
		System.out.println("-----------------------" + "FINAL SCORE" + "---------------------------");
		System.out.println("-------------------------------------------------------------");
		
		
		//Compared score for each player. This will print winner, loser, or draw
		if(player1.getScore()> player2.getScore()) {
			System.out.println(player1.getName()+ " wins with a final score of " + player1.getScore() + "\n" + player2.getName() + " loses with a final score of " + player2.getScore());
		}else if(player1.getScore()< player2.getScore()) {
			System.out.println(player2.getName()+ " wins with a final score of " + player2.getScore()+"\n" + player1.getName() + " loses with a final score of " + player1.getScore());
		}else {
			System.out.println("The game is a tie. Each player has a final score of " + player1.getScore() + " and " + player2.getScore());
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");

	}

}
