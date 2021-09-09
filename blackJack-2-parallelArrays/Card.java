import java.util.*;
import java.lang.*;
import java.io.*;

//TODO test methods

/**
 * This class holds card constructor with related card data:
 * value, face, and suit
 * @author Karlton Suits
 * @version 11/6/2018
 */
public class Card{

	

	//fields
  private int value;
  private String face;
  private String suit;
  
	//parallel arrays
  int[] valueArray = {2,3,4,5,6,7,8,9,10,11,12,13,14};
  String[] faceArray = {"2","3","4","5","6","7","8","9","10","Jack", "Queen","King","Ace"};
  String[] suitArray = {"Dimonds", "Hearts","Spaces","Clubs"};
	
	//deck shuffle
	//deck draw
	
	

  
  /**
   * Default constructor sets value, face, and suit to zero, "",and ""
   * respectively
   */
  public Card(){
    this.value = 0;
    this.face = "";
    this.suit = "";
  }
  
  /**
   * overloaded constructor sets value, face, and suit to
   * face string and suit string input
   */
  public Card(String inFace, String inSuit){
    this.face = inFace;
    this.suit = inSuit;
	this.setValue(inFace);						//sets value based on the face param
  }

	/*
	 *Overloaded constructor for value and suit
	 *@param inValue input value
	 *@param inSuit input suit value
	 *@overload
	public Card(int inValue, String inSuit){
		this.value = inValue;
		this.suit = inSuit;
		this.face = faceArray[inValue-2];
	}
  
  /**
   * copy constructor copies all elements
   * @param inCard -Card object to copy from
   */
  public Card(Card inCard){
    this.value = inCard.value;
    this.face = inCard.face;
    this.suit = inCard.suit;
  }

	/**
	 * This method sets the value based on user input
	 * @param inValue The value to be changed to
	 */
	public void setValue(int inValue){
		this.value = inValue;
		this.face = faceArray[inValue -2];

	}

	/**
	 * This method is the overloaded setValue that takes in a
	 * string parameter and finds the associated value using parallel
	 * arrays
	 * @param inFace the string value to compare to
	 */
	public void setValue(String inFace){
		for(int i = 0; i < faceArray.length; i++){
			if(faceArray[i].equals(inFace)){
				value = valueArray[i];
				i = faceArray.length;
			}
		}//for
	}
	
	
	/**
	 * This method returns numeric value of the card
	 * @return value the objects card value
	 */
	public int getValue(){
		return this.value;
	}

	/**
	 * This method returns face value of card
	 * @return face the string face value
	 */
	public String getFace(){
		return this.face;
	}

	/**
	 * This method returns the name of the cards suit
	 * @return suit the string for the name
	 */
	public String getSuit(){
		return this.suit;
	}

	/**
	* This method compares the value two cards numerically
	* negative number if less than, 0 if equal, positive if greater than
	* @param inCard card object to compare to
	* @return int comparison result
	*/
	public int compareTo(Card inCard){
		return this.value - inCard.value;
	}

	/**
	* This method compares the face value of the cards
	* @return
	*/
	public boolean equals(Card inCard){
 		boolean result = (this.face.equals(inCard.face) && this.suit.equals(inCard.suit)) ? true : false;
		
		return result;
	}

	/**
	* This method returns the string value of the object
	* @param inCard -Card object passed in to convert to string
	* @return String -the string state of the object
	*/
	public String toString(){
		return this.face + " of " + this.suit;
	}

	/**
	 * This method sets the suit
	 * @param inSuit - suit to change to
	 */
	public void setSuit(String inSuit){
		this.suit = inSuit;
	}

}

  
  
  
  