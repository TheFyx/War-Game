//JAYSON CONYETTE-JAMES
//CS110A SPRING 2015
//ASSIGNMENT10: WAR GAME (FINAL HOMEWORK)
//THIS IS THE HAND THAT WILL BE EACH PLAYERS SPLIT DECK FOR THE WAR GAME

import java.util.*;


public class Hand {
	ArrayList<Card> currHand = new ArrayList<Card>();
	ArrayList<Card> cardsInPlay = new ArrayList<Card>();
	ArrayList<Card> cardsInWar = new ArrayList<Card>();
	
	
	public Hand(Card[] playerDeck){ 
		for (int i = 0; i < playerDeck.length; i++){
			currHand.add(playerDeck[i]);
		}
	}
	
	public void startTurn(){ //removes the first 2 cards of deck and puts them into cardsInPlay
		cardsInPlay.add(currHand.get(0)); 
		currHand.remove(0);
	}
	
	public void warStart(){
		cardsInWar.addAll(getCardsInPlay());
		clearCardsInPlay();
		
	}
	
	
	public void warEnd(){
		cardsInPlay.addAll(this.getCardsInWar());
		cardsInPlay.addAll(getCardsInWar());
	}
	
	
	
	
	public int getCurrCardRank(){
		return cardsInPlay.get(0).getRank();
	}
	
	public String getCurrCardSuit(){
		//System.out.print(cardsInPlay.get(0));
		return this.cardsInPlay.get(0).getSuit();
	}
	
	public String getCurrCardImg(){
		return cardsInPlay.get(0).getImg();
	}
	
	
	public ArrayList<Card> getCardsInPlay(){
		return cardsInPlay;
	}
	
	public ArrayList<Card> getCardsInWar(){
		return cardsInWar;
	}
	
	public ArrayList<Card> getCurrHand(){
		return currHand;
	}
	public void clearCardsInPlay(){
		cardsInPlay.clear();
	}
	
	public void clearCardsInWar(){
		cardsInWar.clear();
	}
	

	public void takeCards(Hand opponent){
		currHand.addAll(opponent.getCardsInPlay());
		currHand.addAll(this.getCardsInPlay());
		clearCardsInPlay();
		currHand.addAll(getCardsInWar());
		currHand.addAll(this.getCardsInWar());
		opponent.clearCardsInPlay();
		this.clearCardsInPlay();
		clearCardsInWar();
		
	}
}
