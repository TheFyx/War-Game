//JAYSON CONYETTE-JAMES
//CS110A SPRING 2015
//ASSIGNMENT10: WAR GAME (FINAL HOMEWORK)
//THIS IS THE GENERATOR OF THE PROGRAM, THE GUTS OF THE GAME

import javax.swing.*;

import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class WarGame extends Deck{
	
	
	//private static final long serialVersionUID = 1L;
	private Deck warDeck;
	private int remainingCards = 52;
	private Hand currHandPlayer1;
	private Hand currHandPlayer2;
	private String winner;
	private String imgAdd1;
	private String imgAdd2;
	public boolean War = false;		
	
	
	
	//global card placements
	JLabel oppCard = new JLabel();
	JLabel oppHand = new JLabel();
	JLabel myHand = new JLabel();
	JLabel myCard = new JLabel("myCard");
	
	//center panel global
	JPanel center = new JPanel();  //declare&initialize jpanel
	
	public WarGame(){
		this.warDeck = new Deck();
		shuffleCards();
		
		Hand[] temp = warDeck.splitDeck();
		this.currHandPlayer1 = temp[0];
		this.currHandPlayer2 = temp[1];
		
		
		
		
		
		//System.out.println((getCurrHandPlayer1().getCurrCardRank()));
		//System.out.print("Hello world");
		//System.out.println((getCurrHandPlayer1().getCurrCardImg()));
		
		
		//startGame();
		/*
		currHandPlayer1.startTurn();
		currHandPlayer2.startTurn();
		
		
		System.out.println("Deck 1 has " + currHandPlayer1.getCurrHand());
		System.out.println("Deck 2 has " + currHandPlayer2.getCurrHand());
		
		
		System.out.print(currHandPlayer1.getCurrCardImg());
		System.out.print(currHandPlayer2.getCurrCardImg());
		*/
		
	}
	
	
	
	
	
	
	public void setImgAdd1(String imgAdd1) {
		this.imgAdd1 = imgAdd1;
	}
	
	public void setImgAdd2(String imgAdd2) {
		this.imgAdd2 = imgAdd2;
	}
	
	public String getImgAdd1() {
		return imgAdd1;
	}
	
	public String getImgAdd2() {
		return imgAdd2;
	}
	
	
	public void shuffleCards(){
		// Shuffle the cards
	    for (int i = 0; i < warDeck.getDeck().length; i++) {
	    	int index = (int)(Math.random() * warDeck.getDeck().length);
	    	Card temp = warDeck.getDeck()[i];
	    	warDeck.getDeck()[i] = warDeck.getDeck()[index];
	    	warDeck.getDeck()[index] = temp;
	    	
	    }
	}
	
	
	public void deal(){
		currHandPlayer1.startTurn();
		currHandPlayer2.startTurn();
		
		
		setImgAdd1(currHandPlayer1.getCurrCardImg());
		setImgAdd2(currHandPlayer2.getCurrCardImg());
		
		//System.out.println("TESTING " + currHandPlayer1.getCurrCardImg());
		//System.out.println("TESTING " + currHandPlayer2.getCurrCardImg());
		
		System.out.println("Card COMPUTER has " + currHandPlayer1.getCurrCardRank()+ currHandPlayer1.getCurrCardSuit());
		System.out.println("Card PLAYER has " + currHandPlayer2.getCurrCardRank()+ currHandPlayer2.getCurrCardSuit());
		
		
		if (currHandPlayer1.getCurrCardRank() > currHandPlayer2.getCurrCardRank()){
			currHandPlayer1.takeCards(currHandPlayer2);
			
			currHandPlayer1.warEnd();
			//currHandPlayer2.warEnd();
			War = false;
			System.out.println("Deck COMPUTER has " + currHandPlayer1.getCurrHand().size() +" cards left.");
			System.out.println("Deck PLAYER has " + currHandPlayer2.getCurrHand().size() +" cards left.");
			checkWin();
		}
		else if (currHandPlayer1.getCurrCardRank() < currHandPlayer2.getCurrCardRank()){
			currHandPlayer2.takeCards(currHandPlayer1);
			
			currHandPlayer1.warEnd();
			//currHandPlayer2.warEnd();
			War = false;
			System.out.println("Deck COMPUTER has " + currHandPlayer1.getCurrHand().size() +" cards left.");
			System.out.println("Deck PLAYER has " + currHandPlayer2.getCurrHand().size() +" cards left.");
			checkWin();
		}
		else {
			War = true;
			System.out.println("WAR!!!");
			while (War == true){
				
				currHandPlayer1.warStart();
				currHandPlayer2.warStart();
				currHandPlayer1.clearCardsInPlay();
				currHandPlayer2.clearCardsInPlay();
				System.out.println("Let's deal again!");
				deal();
				currHandPlayer1.clearCardsInPlay();
				currHandPlayer2.clearCardsInPlay();
				
			}
			
			War = false;
			
		}
		
		
		currHandPlayer1.clearCardsInPlay();
		currHandPlayer2.clearCardsInPlay();
		

	   }

	public void checkWin(){
		if (currHandPlayer1.getCurrHand().isEmpty()){
			this.winner = "Computer";
			System.out.print("Computer Wins!");
			System.exit(1);
		}
		else if (currHandPlayer2.getCurrHand().isEmpty()){
			this.winner = "Player";
			System.out.print("Player Wins!");
			System.exit(1);
		}
	}
	
	public String getWinner(){
		return winner;
	}
	public void dealCards(){
		
		shuffleCards();
		splitDeck();
		deal();
		
		
	}
	
	public void setRemainingCards(int remainingCards) {
		this.remainingCards = remainingCards;
	}
	
	public int getRemainingCards() {
		return remainingCards;
	}
	
	
	
	
	
	
		
		
				
						
		
	   
}
