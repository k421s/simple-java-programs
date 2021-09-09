//TODO check validity of the compareTo methods and related 
/**
 * This class holds card constructor with related card data:
 * numeric value, face, suit, dealt state, faceup state
 *
 * @author Karlton Suits
 * @version 11/6/2018
 */
 public class Card{

	//private fields for card class
  private int value;					//numeric value of card 
  private String face;				//face value of card 
  private String suit;				//suit name of card
	private boolean isDealt;		//labels card as dealt or in deck
	private boolean isFaceUp;		//labels card if face up or face down

  /**
   * args constructor sets value, face, and suit to corresponding values
	 * sets faceup and isdealt state to false
	 * calls assignValue to assign numeric value based on face value
	 * @param String inFace - the face value argument to be set 
	 * @param String inSuit - the suit value arguemnt to be set
   */
   public Card(String inFace, String inSuit){
     this.face = inFace;				//face value
     this.suit = inSuit;				//suit value 
		 this.isFaceUp = false;		//set card face down by default
		 this.isDealt = false;			//set card not dealt by default
		 this.value = this.assignValue(this.face);				//assign card value based on face value
  }

	/**
   * Default constructor sets value, face, and suit to zero, "",and ""
	 * sets card face down and not dealt by default
	 * sets numeric value of card to zero through assignValue in the called 
	 * args constructor
   */
   public Card(){
		 this("","");		//sets blank values for face and suit
   }

  /**
   * copy constructor copies all fields of the card Object
   * @param Card inCard -Card object to copy from
   */
  public Card(Card inCard){
    this.value = inCard.value;						//numeric value copied
    this.face = inCard.face;							//face value copied
    this.suit = inCard.suit;							//suit value copied
		this.isDealt = inCard.isDealt;				//dealt status copied
		this.isFaceUp = inCard.isFaceUp;			//face up status copied
  }

	//getter and setter methods
	
	/**
	 * This method returns numeric value of the card
	 * @return int value - the objects card value
	 */
	public int getValue(){
		return this.value;
	}

	/**
	 * This method returns face value of card
	 * @return String face - the string face value
	 */
	public String getFace(){
		return this.face;
	}

	/**
	 * This method returns the name of the cards suit
	 * @return String suit - the string for the name
	 */
	public String getSuit(){
		return this.suit;
	}

	/**
	 * This method returns if the card is face up or not
	 * @return boolean isFaceUp - boolean value for face up or down
	 */
	public boolean getIsFaceUp(){
		return this.isFaceUp;
	}

	/**
	 * This method returns if the card has been dealt or not
	 * @return boolean isFaceUp - boolean value for face up or down
	 */
	public boolean getIsDealt(){
		return this.isDealt;
	}

	/** 
	 * This method sets the value for isFaceUp
	 * @param boolean inIsFaceUp - the value to change isFaceUp field to
	 */
	public void setIsFaceup(boolean inIsFaceUp){
		this.isFaceUp = inIsFaceUp;
	}

	/** 
	 * This method sets the value for isDealt
	 * @param boolean inIsDealt - the value to change isDealt field to
	 */
	public void setIsDealt(boolean inIsDealt){
		this.isDealt = inIsDealt;
	}

	//other methods

	/**
	 * This method assigns the numeric value of the card 
	 * based on the face value
	 * @return int - assigned value based on the face value
	 */
	public int assignValue(String inFace){
		switch(inFace){
			case "1": 		//return parsed int if string is a number 
			case "2":			//between 1 and 10 
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10": 		return Integer.parseInt(this.face);

			case "Jack": 	return 11;  //else return the assigned values to face
			case "Queen": return 12;
			case "King": 	return 13;
			case "Ace": 	return 14; 
			default:			return 0;		//default return 0 
		}
	}

	/**
	 * This method compares the value of cards numerically
	 * negative number if less than, 0 if equal, positive if greater than
	 * @param Card inCard - card object to compare to
	 * @return int - comparison result
	 */
	public int compareTo(Card inCard){
		return this.value - inCard.value;
	}

	/**
 	 * This method compares the face value and suit value of cards
	 * @return boolean - result of the card comparison
	 */
	public boolean equals(Card inCard){
		return (this.face.equals(inCard.face) && this.suit.equals(inCard.suit));
	}

	/**
	* This method returns the string value of the object
	* @param inCard -Card object passed in to convert to string
	* @return String -the string state of the object
	*/
	public String toString(){
		return this.face + " of " + this.suit;
	}

/*shortened toString method for debugging and submission
	public String toString(){

		//conditional for 10 face value
		if(this.face.equals("10")){
			return this.face + this.suit.substring(0,1);
		}
		return this.face.substring(0,1) + this.suit.substring(0,1);
	}
	*/
}

  
  
  
  