//JAYSON CONYETTE-JAMES
//CS110A SPRING 2015
//ASSIGNMENT10: WAR GAME (FINAL HOMEWORK)
//THIS IS THE CLASS FOR GENERATING EACH CARD


public class Card {
	final String[] suits = {"s","h","d","c"};
	
	private int rank;
	private String suit;
	private String img;
	//private String[] ranks;
	
	public void setCardValue(int index){
		
		

		this.setRank(index % 13);
		this.setSuit(suits[index/13]);
		this.setImg("cardPics/" + (rank + 1) + suit + ".jpg");

		
		/*//Error handle how drawing the 13rd card would result in incorrect suit
		if (index == 13)
			tempSuit = 0;
		if(index == 26)
			tempSuit =1;
		if(index == 39)
			tempSuit = 2;
		if(index == 52)
			tempSuit = 3;
		*/
		
		
		
		
		
		
	}
	
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
/*	public void setRanks(String[] ranks) {
		this.ranks = ranks;
	}
	
	public String[] getRanks() {
		return ranks;
	}*/
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getImg() {
		return img;
	}
	
	
	
	

}
