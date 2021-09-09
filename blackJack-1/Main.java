import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		
		int deckSize = 52;
		int index = 0;
		int[] playerHand = new int[deckSize];
		int[] dealerHand = new int[deckSize];
		
		
		
		//initialize deck
		Deck one = new Deck();
				
		System.out.println("Welcome to blackjack: ");
		
		System.out.println("Cards on the table are: ");
		System.out.println(one.getCard(0));
		
		System.out.println(one.getCard(1));
		
		
		
		System.out.println();
		
		playerHand[0] = 2;
		playerHand[1] = 3;
		
		

		
		
		
		//
		
		
		
		//validation loop
		//if(index == 0 && index+1 != 0){}
		
		
	}

}
