package JavaFinalProject;



    	public class App {
    		
    		static Deck deck = new Deck();
    		static int numCards = deck.size() / 2;
    			
    		public static void main(String[] args) {

    		
    			Deck deck = new Deck();
    			Player player1 = new Player("Pikachu");
    			Player player2 = new Player("Charmander");
    			deck.shuffle(deck);
    			dealTheCards(deck, player1, player2);
    			player1.describe();
    			System.out.println("\n");
    			player2.describe();
    			System.out.println("\n");
    			playWar(player1,player2);

    		}

    		private static void playWar(Player player1, Player player2) {
    			
    			for(int turn = 0; turn < numCards; turn++) {
    				System.out.println("***This is turn: " + (turn + 1) + " ***");
    				Card card1 = player1.flip();
    				Card card2 = player2.flip();
    				System.out.println(player1.getName() + " flipped: " + card1.describe() + " and " + player2.getName() + " flipped: " + card2.describe());
    				
    				if(card1.getValue() > card2.getValue()) {
    					player1.incrementScore();
    					System.out.println(player1.getName() + " score increased by 1 to: " + player1.getScore());
    					System.out.println(player2.getName() + " score remains: " + player2.getScore());
    				} else if(card2.getValue() > card1.getValue()) {
    					player2.incrementScore();
    					System.out.println(player1.getName() + " score remains: " + player1.getScore());
    					System.out.println(player2.getName() + " score increased by 1 to: " + player2.getScore());
    				} else {
    					System.out.println("This is a draw");
    					System.out.println(player1.getName() + " score remains: " + player1.getScore());
    					System.out.println(player2.getName() + " score remains: " + player2.getScore());
    				} System.out.println("\n");
    			}
    			finalScoreBoard(player1, player2);
    		}
    		
    		
    		private static void finalScoreBoard(Player player1, Player player2) {
    			
    			if (player1.getScore() > player2.getScore()) {
    				System.out.println(player1.getName() + " wins with " + player1.getScore() + " points");
    				System.out.println(player2.getName() + " lost with " + player2.getScore() + " points");
    			} else if (player2.getScore() > player1.getScore()) {
    				System.out.println(player2.getName() + " wins with " + player2.getScore() + " points");
    				System.out.println(player1.getName() + " lost with " + player1.getScore() + " points");
    			} else {
    				System.out.println(player1.getName() + " with " + player1.getScore()  + 
    						" points, draws " + player2.getName() + " with " + 
    						player2.getScore() + " points.");
    			}
    		}
    		

    		private static void dealTheCards(Deck deck, Player player1, Player player2) {
    			int deckSize = deck.size();
    			
    			for(int index = 0; index < deckSize; index++) {
    				if(index % 2 == 0) {
    					player1.draw(deck);
    				} else {
    					player2.draw(deck);
    				}
    			}
    			
    		}

    	}