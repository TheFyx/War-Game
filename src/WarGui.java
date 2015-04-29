import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

import java.awt.event.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import WarGame.DealButtonListener;
//import WarGame.StartGameListener;

public class WarGui extends JFrame{
	
		//global card placements
		JLabel oppCard = new JLabel();
		JLabel oppHand = new JLabel();
		JLabel myHand = new JLabel();
		JLabel myCard = new JLabel();
		
		//center panel global
		JPanel center = new JPanel();  //declare&initialize jpanel
		
		
		WarGame wG = new WarGame();
		JFrame gameWar = new JFrame();
		
		public WarGui(){
		
		//wG.dealCards();
		//System.out.println((wG.getCurrHandPlayer1().getCurrHand()));
		//System.out.println((wG.getCurrHandPlayer1().getCurrCardSuit()));
		//System.out.print("Hello world");
		//System.out.println((wG.getCurrHandPlayer1().getCurrCardImg()));
		
		
			
		
		//create game window
		//jframe window length and height
		final int winh = 1200;
		final int winl = 800;	
				//initialize jframe for war game	
				
				
				//let app close on window close
				gameWar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//window size
				gameWar.setSize(winh, winl);
				
				//visibility activate! 
				gameWar.setVisible(true);
				
				//name of window
				gameWar.setTitle("War HUH What is it good for?");
	
				//validate
				gameWar.validate();
				
				
				
				
				JPanel south = new JPanel();  //declare&initialize jpanel
			     //window colour
				south.setBackground(Color.cyan);
				
			  	JButton newGame = new JButton("Start a New Game");
			  	JButton dealButton = new JButton("Deal Next Hand");   
				
			  	newGame.setSize(100,100);
				dealButton.setSize(100,100);
				
				
			
				
				south.add(newGame);
				south.add(dealButton);
				newGame.validate();
				newGame.setVisible(true);
			  	dealButton.setVisible(true);
			  	
			  	
			  
				     
				newGame.addActionListener(new StartGameListener());    //add specific listener to each button
				dealButton.addActionListener(new DealButtonListener());     
				 
			  
			
				
				
				
				
				
				gameWar.add(south, BorderLayout.SOUTH);
				
				
				
				
				south.setVisible(true);
				
				
				
				
				//JPanel board = new JPanel();
				
				
				//CENTER panel
				
				
			     //window colour
				center.setBackground(Color.yellow);
				
				//ImageIcon cardback = new ImageIcon("cardPics/back.jpg"); 
				//cardback(this.getClass().getResource("/cardPics/back.JPEG"));
				
				
			  	
				
				
				oppHand.setIcon((new ImageIcon("cardPics/back.jpg")));
				oppHand.setSize(150,150);
				
				myHand.setIcon((new ImageIcon("cardPics/back.jpg")));
				myHand.setSize(150,150);
				
				
				
				center.add(oppCard);
				center.add(oppHand);
				center.add(myHand);
				center.add(myCard);
				
				oppCard.setVisible(true);
				oppHand.setVisible(true);
				myHand.setVisible(true);
				myCard.setVisible(true);
			  	center.setVisible(true);
			  	
			  	
			  
				     
		
			  
			
				
				
				
				
				
				gameWar.add(center, BorderLayout.CENTER);
				
				
				
				
				center.setVisible(true);
				center.setSize(1200,600);
				
				
				//North panel
				
				JPanel north = new JPanel();  //declare&initialize jpanel
			     //window colour
				north.setBackground(Color.cyan);
				
			  	JLabel gameLog = new JLabel("Are you ready for WAR?!");  
				
			  	
				gameLog.setVisible(true);
			
				
				north.add(gameLog);
				//north.add();
				
				  
				 
			  
			
				
				
				gameWar.add(north, BorderLayout.NORTH);
				
				
				
				
				north.setVisible(true);
				
				
				
				
				
	   
	   
	   
	   
	} 
	
	
	
	private class StartGameListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  
	    	  
	    	  
	        
	    	  gameWar.dispose();
	    	  WarGui GuiRestart = new WarGui();
	    	  
	          
	          
	          
	          
	      }
	   }
	
	
	private class DealButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	          /*
	    	  Deck thatDeck = new Deck();
	    	  
	    	  thatDeck.splitDeck();
	    	  
	    	  
	    	  
	    	  
	    	  thatDeck.splitDeck(); */
	    	  //wG.getCurrHandPlayer1().clearCardsInPlay();
	    	 // wG.getCurrHandPlayer2().clearCardsInPlay();
	    	  wG.dealCards();
	    	  
	    	  
	    	  
	    	  //oppCard.setIcon(null);
	    	  //myCard.setIcon(null);
	    	  
	    	  
	    	  oppCard.setIcon(new ImageIcon(wG.getImgAdd1()));
	    	  oppCard.setSize(150,150);
	    	  center.add(oppCard, BorderLayout.SOUTH);
	    	  oppCard.setVisible(true);
	    	  
	    	  
	    	  
	    	  
	    	  myCard.setVisible(false);
	    	  myCard.setIcon(new ImageIcon(wG.getImgAdd2()));
	    	  myCard.setSize(150,150);
	    	  center.add(myCard, BorderLayout.SOUTH);
	    	  myCard.setVisible(true);
	    	  
	    	  //wG.getCurrHandPlayer2().getCurrCardRank();
	    	  
	    	  
	    	  
	   }
	
	   }
}
