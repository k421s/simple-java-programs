//todo check documentation syntax and accuracy
//todo caret for final formatting

import java.util.*;
import java.lang.*;

/**
 * This constructor class contains the data for the dice
 * @author Karlton Suits
 * @version10/17/2018
 */
public class Dice{
	
	private int sides = 0;
	private int face = 0;
	private Random rand;
	
	/**
	 * This method rolls the dice - generates random face
	 */
	public void roll(){
		rand = new Random();
		face = (rand.nextInt(sides) + 1);	//sides max, 1 min
	}

	 /**
	 * This no-args constructor contains the data for dice, set to zero
	 */
	 public Dice(){
		 sides = 6;

	  rand = new Random();								//new random
		this.roll();
	 }

	/**
	* This constructor contains the data for dice with args for side number 
	* and face value
	* @param inSides - number of sides
	*/
  public Dice(int inSides){
    sides = inSides;
    rand = new Random();     				//new random number
		this.roll();
	}

	/**
  * This method returns the number of dice sides
  * @return sides - current number of sides on dice
  */
  public int getSides(){
    return sides;
  } 
  
  /**
   * This method returns the current face value of the dice
   * @return face - current rolled number
   */
  public int getFace(){
    return face;
  }
  
  /**
   * This method changes the number of sides on dice
   * @param inSides - number to change number number of sides to
   */
  public void setSides(int inSides){
    sides = inSides;
		this.roll();
  }
  
  /**
   * This method changes the changes the current face value of dice
   * @param inFace - number to change face value to
   */
	public void setFace(int inFace){
		face = inFace;
	}

	/**
	* This method converts the object state to a string
	* @return s - string state 
	*/
	public String toString(){
		String s = 	"-----\n" +
								"| " + face + " |\n" +
								"-----\n";
		return s;
	}

	
	
	

}