import java.util.*;


public class Hand {
	ArrayList<Card> currHand = new ArrayList<Card>();
	ArrayList<Card> cardsInPlay = new ArrayList<Card>();
	
	public Hand(Card[] playerDeck){ 
		for (int i = 0; i < playerDeck.length; i++){
			currHand.add(playerDeck[i]);
		}
	}
	
	public void startTurn(){ //removes the first 2 cards of deck and puts them into cardsInPlay
		cardsInPlay.add(currHand.get(0)); 
		currHand.remove(0);
	}
	
	public int getCurrCardRank(){
		return cardsInPlay.get(0).getRank();
	}
	
	public String getCurrCardSuit(){
		return cardsInPlay.get(0).getSuit();
	}
	
	
	public ArrayList<Card> getCardsInPlay(){
		return cardsInPlay;
	}
	
	public ArrayList<Card> getCurrHand(){
		return currHand;
	}
	public void clearCardsInPlay(){
		cardsInPlay.clear();
	}
	
	public void takeCards(Hand opponent){
		currHand.addAll(opponent.getCardsInPlay());
		currHand.addAll(this.getCardsInPlay());
		opponent.clearCardsInPlay();
		this.clearCardsInPlay();
		
	}
}
