import javax.swing.*;
import java.awt.event.*;


public class WarGame extends Deck{
	
	
	//private static final long serialVersionUID = 1L;
	private Deck warDeck;
	private int remainingCards = 52;
	private Hand currHandPlayer1;
	private Hand currHandPlayer2;
	private String winner;
	
	public WarGame(){
		this.warDeck = new Deck();
		Hand[] temp = warDeck.splitDeck();
		this.currHandPlayer1 = temp[0];
		this.currHandPlayer2 = temp[1];
	}
	
	
	public void shuffleCards(){
		// Shuffle the cards
	    for (int i = 0; i < warDeck.getDeck().length; i++) {
	    	int index = (int)(Math.random() * warDeck.getDeck().length);
	    	Card temp = warDeck.getDeck()[i];
	    	warDeck.getDeck()[i] = warDeck.getDeck()[index];
	    	warDeck.getDeck()[index] = temp;
	    	//remainingCards--;
	    }
	}
	
	
	public void deal(){
		currHandPlayer1.startTurn();
		currHandPlayer2.startTurn();
		
		if (currHandPlayer1.getCurrCardRank() > currHandPlayer2.getCurrCardRank()){
			currHandPlayer1.takeCards(currHandPlayer2);
			checkWin();
		}
		else if (currHandPlayer1.getCurrCardRank() < currHandPlayer2.getCurrCardRank()){
			currHandPlayer2.takeCards(currHandPlayer1);
			checkWin();
		}
		else {
			currHandPlayer1.startTurn();
			currHandPlayer2.startTurn();
			deal();
		}
		
		
/*	    for (int i = 0; i < 52; i++) {
	       String suit = suits[i / 13];
	       String rank = ranks[i % 13];
	       System.out.println( rank + " of " + suit);
	       System.out.println("Remaining cards: " + remainingCards);
	       
	       
	       
	       for (int i = 0; i < 52; i++) {
		       String suit = suits[i / 13];
		       String rank = ranks[i % 13];
		       System.out.println( rank + " of " + suit);
		       System.out.println("Remaining cards: " + remainingCards);   
	       
	     }*/
	   }

	public void checkWin(){
		if (currHandPlayer1.getCurrHand().isEmpty()){
			this.winner = "Computer";
		}
		else if (currHandPlayer2.getCurrHand().isEmpty()){
			this.winner = "Player";
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
	
	
	
	
	
	public void startGame(){
		
	   
				
						
		//create game window
		//jframe window length and height
		final int winh = 800;
		final int winl = 800;	
				//initialize jframe for war game	
				JFrame gameWar = new JFrame();
				
				//let app close on window close
				gameWar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//window size
				gameWar.setSize(winh, winl);
				
				//visibility activate! 
				gameWar.setVisible(true);
				
				//name of window
				gameWar.setTitle("War HUH What is it good for?");
	
	
				
				
				
				
				JPanel south = new JPanel();  //declare&initialize jpanel
			      
			  	
			  	JButton newGame = new JButton("Start a New Game");
			  	JButton dealButton = new JButton("Deal Next Hand");   
				
			  	newGame.setSize(50,10);
				dealButton.setSize(50,50);
				
				
			
				
				south.add(newGame);
				south.add(dealButton);
				
				newGame.setVisible(true);
			  	
			  	
			  	
			  
				     
				newGame.addActionListener(new StartGameListener());    //add specific listener to each button
				dealButton.addActionListener(new DealButtonListener());     
				 
			  
			
				
				
				
				//start game panel and then button

				
				south.setSize(800, 800);
				
				
				//south.setLayout(null);
				south.setBounds(400, 400, 400, 0);
				
				gameWar.add(south);
				
				
				
				
				south.setVisible(true);
				
				
				
				
				//JPanel board = new JPanel();
				
				
				
				
				
				
				
				
				
				
				
				
				
	   
	   
	   
	   
	} 
	
	
	
	private class StartGameListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  ImageIcon cardback = new ImageIcon("cardPics/back.JPEG"); 
	    	  JLabel back = new JLabel(cardback);
	    	  
	    	  
	          JPanel deck1 = new JPanel();
	          
	         
	          deck1.add(back);
	          deck1.setVisible(true);
	          
	          
	          JPanel field1 = new JPanel();
	          field1.setVisible(true);
	          
	          
	          JPanel field2 = new JPanel();
	          field2.setVisible(true);
	          
	          JPanel deck2 = new JPanel();
	          
	          deck2.add(back);
	          deck2.setVisible(true);
	          
	      }
	   }
	
	
	private class DealButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	          
	    	  Deck thatDeck = new Deck();
	    	  
	    	  thatDeck.splitDeck();
	    	  
	    	  
	    	  
	    	  
	    	  thatDeck.splitDeck();
	    	  
	    	  
	   }
	
	   }
	
	public static void main(String[] args)
	{
		
		WarGame sG =	new WarGame();
		sG.startGame();
		
		//while (sG.getWinner().equals(null)){
			//sG.deal();
		//}
	
	
	
	
	}
	   
}
