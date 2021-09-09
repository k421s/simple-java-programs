import java.util.*;

//TODO add javadoc here 
public class Deck {

	//initialize deck size
	private int deckSize = 52;
	private Card[] cardArray = new Card[deckSize];
	
	int[] valueArray = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	private final String[] faceArray = {"2","3","4","5","6","7","8","9","10","Jack", "Queen","King","Ace"};
	private final String[] suitArray = {"Dimonds", "Hearts","Spades","Clubs"};

	//implementing dealt
	//TODO is dealt to card class 
	boolean[] dealtArray = new boolean[deckSize];

	//initialize array of objects to whatever
	//face = 1 2 3 4 5 6 7 8 9 10 11 12 13 14
	public Deck(){
		for(int i = 0; i < deckSize; i++){
			cardArray[i] = new Card(faceArray[i % faceArray.length], suitArray[i % suitArray.length]);
		}
		//this.shuffle();
	}

	//shuffle method
	public void shuffle(){
		
		//random numbers for two values to swap indexes of
		for(int i = 0; i < 1000; i++){
			
			Random rand = new Random();
			int  a = rand.nextInt(deckSize);
			int b = rand.nextInt(deckSize);
			
			Card temp = new Card(cardArray[a]);
			cardArray[a] = new Card(cardArray[b]);
			cardArray[b] = new Card(temp);
		}
	}
	
	//possibly add here
	public void sort(){
	}
	
	public String toString(){
		String deckString = "\nNon Dealt Cards\n\n";
		for (int i = 0; i < cardArray.length; i++) {
			if(!(dealtArray[i])){
							deckString = deckString + cardArray[i].toString() + "\n";
			}
		}

		//loop through again for dealt cards pile
		deckString += "\nDealt cards: \n\n";
		for (int i = 0; i < cardArray.length; i++) {
			if(dealtArray[i]){
				deckString = deckString + cardArray[i].toString() + "\n";
			}
		}
		return deckString;
	}	
	
	public Card getCard(int index){
		return cardArray[index];
	}

	public void dealCard(int index){
		dealtArray[index] = true;
	}

	//loops though and checks number of true booleans in dealt array
	public int cardsLeft(){
		int count = 0;

		//loop through dealt deck length
		for(int i = 0; i < dealtArray.length; i++){
			if (dealtArray[i]) { count++;} //if true(dealt) increment
		}
		//return length - total
		return dealtArray.length - count;
	}

}