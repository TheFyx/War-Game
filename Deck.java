
public class Deck extends Card{

	Card[] deck;
	
	
	//String[] suits = {"Spades","Hearts", "Diamonds", "Clubs"};
	//String[] ranks = {"Ace","Two","Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	
	public Deck(){
		this.deck = new Card[52];
		//System.out.print(deck[0].getRank());
		
		for ( int i = 0; i < 52; i++ ){
			System.out.println("i= " + i);
			this.deck[i] = new Card();
			this.deck[i].setCardValue(i);
			System.out.println("  rnk:"+ this.deck[i].getRank());
			System.out.println("  suit:"+ this.deck[i].getSuit());
			System.out.println("  src:"+ this.deck[i].getImg());
		}
		
	}
	
	
	
	
	public void setDeck(Card[] deck) {
		this.deck = deck;
	}
	
	public Card[] getDeck() {
		return deck;
	}
	
	
	
	public Hand[] splitDeck(){
		Card[] tempPlayer1 = new Card[26];
		Card[] tempPlayer2 = new Card[26];
		
		for (int i = 0; i < (deck.length / 2); i++){
			tempPlayer1[i] = deck[i];
			tempPlayer2[i] = deck[i + (deck.length / 2)];
		}
		
		Hand play1 = new Hand(tempPlayer1);
		Hand play2 = new Hand(tempPlayer2);
		Hand[] startDecks = {play1, play2};
		
		
	
		
		return startDecks;
	}
	
	
}
