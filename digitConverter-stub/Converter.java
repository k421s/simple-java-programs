/** Filename: Converter.java
 *
 * This class Holds the data for the original sentence and the converted sentence
 * It also converts the original string by replacing single digits with their
 * word equivalent and capitalizes the first letter if neccessary
 * @author Karlton Suits
 * @version 11/25/2018
 */

//imports
import java.util.*;
import java.lang.*;
import java.io.*;

class Converter{
	//fields
	private StringBuilder originalSentence;   //the original input sentence/line
	String convertedSentence;                 //sentence/line after conversion
	
  /**
   * The no-args constructor sets the value of the two String and StringBuilder
   * fields to blank.
   */
    public Converter(){
      this.originalSentence = new StringBuilder("");  //stringbuilder to convert
      this.convertedSentence = "";                    //converted sentence
    }
    

  /**This constructor takes in a StringBuilder for the original sentence
   * stores it, and then converts the original string by changing all the single
   * digits to it's letter equivalent
   * @param StringBuilder inStringBuilder the original line or sentence String
   */
	public Converter(StringBuilder inStringBuilder){
		this.originalSentence = new StringBuilder(inStringBuilder); //set stbuilder
		this.convertedSentence = scanSentence(inStringBuilder);     //call conversion
	}
  
  /**The scanSentence loops through the entire stringBuilder char by char and
   * checks for digits, if it's a single digit 0-9 it changes it to the letter
   * equivalent (one for 1 etc..)
   * It then checks to see if it's the first letter of a sentence or comes after
   * certain punctuation and capitalizes the first letter
   *
   * @param StringBuilder inStringBuilder the StringBuilder to scan and convert
   * @return String outputSentence - the converted sentence
   */
	private static String scanSentence(StringBuilder inStringBuilder){

			String outputSentence = "";       //the converted sentence
			
			//scan length of sentence
			for(int i = 0; i < inStringBuilder.length(); i++){
				//check for a digit
				if(Character.isDigit(inStringBuilder.charAt(i))){
					//if more than one consecutive digit number is larger than 9
					if((i != inStringBuilder.length()) && Character.isDigit(inStringBuilder.charAt(i+1))){
						//if it's larger than 9 copy digits into output String
						while((i != inStringBuilder.length()) && Character.isDigit(inStringBuilder.charAt(i))){	//handles varying number sizes
							outputSentence += inStringBuilder.charAt(i);
							i++;																								//keep moving index forward
						}
						if((i != inStringBuilder.length())){          //checks if the digit at end of line
						outputSentence += inStringBuilder.charAt(i);
						}
					}

					//if it's not multiple digits number is 0-9
					else{
						StringBuilder numberWord = new StringBuilder(change(inStringBuilder.charAt(i)));
						
						//if first letter of sentence capitalize or following a quotation or period or ;
						if((i == 0) ||                                    //if first char in line
							(checkCapital(inStringBuilder.charAt(i-1))) ||  //if after quotes
							(checkCapital(inStringBuilder.charAt(i-2)))){   //if after a period and space

							char capital = numberWord.charAt(0);  //char to replace
							capital -= 32;                        //capitalizing char
							numberWord.setCharAt(0, capital);     //replace first letter
						}
						//change to word format
						outputSentence += numberWord;
					}
				}

				//if not a digit nothing needs changing
				else{
				outputSentence += inStringBuilder.charAt(i);    //keep building output string
				}
			}

		return outputSentence; //return result
	}//end method


  /** The change method changes the specified digit to it's word equivalent
   * @param char inNumber - the digit to convert
   * @return String - the converted word equivalent
   */
	private static String change(char inNumber){
		switch(inNumber){
			case '0': return "zero";        //relevant numbers to words to return
			case '1': return "one";
			case '2': return "two";
			case '3': return "three";
			case '4': return "four";
			case '5': return "five";
			case '6': return "six";
			case '7': return "seven";
			case '8': return "eight";
			case '9': return "nine";
			default: return "not a number";
		}
	}//end method

  /**The checkCapital method checks to see if the digit comes after a period
   * a semi colon, or a quote
   * @param char inChar - the char to change
   * @return boolean - if it comes after a . ; or "
   */
	private static boolean checkCapital(char inChar){
		return ((inChar == '.') || inChar == ';' || (inChar == '"')); //if after . ;  or " return true
	}
	
	/**
	 * the toString method returns the state of the object in string form
	 * @return String - the string state, original string + converted string
	 */
	public String toString(){
		return "Original String: " + this.originalSentence + "\n\n" + //original string state
			"Converted String: " + this.convertedSentence + "\n";       //converted string state
	}

  /**The getOriginal method returns the original sentence
   * @return StringBuilder - originalSentence
   */
	public StringBuilder getOriginal(){
		return originalSentence;
	}
	
  /** The getConverted method returns the converted line/sentence string
   * @return String - convertedSentence the converted string
   */
	public String getConverted(){
		return convertedSentence;
	}

}//end class