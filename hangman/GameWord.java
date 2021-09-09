/**
 *  Ths class defines the constructors for the game word * 
 * @author karlton Suits
 * @version 10/17/2018
 */

public class GameWord
{
   private String phrase = "";							//phrase to guess for the game
   private StringBuilder inProgress;	//string that holds the phrased with filled in correct guesses
   private int numberWrongGuesses;		//number of wrong guesses
   private StringBuilder state;				//hangman text drawing 
   private boolean gameOver;					//game over condition, false until game over
   
	 /**The no-args constructor sets strings and stringbuilders to zero or blank, sets wrong guesses to zero and gameover state to false
    */
   public GameWord( )
   {
       inProgress = new StringBuilder( );		//new string builder
       phrase = new String( );							//new string
       numberWrongGuesses = 0;							//set number of guesses to 0
       state = new StringBuilder( );				//new string builder
       gameOver = false;										//game state set 
    }
    
		/**This constructor takes in user input phrase and sets that as the phrase to guess and fills an "in progress" string with
		 *blanks accordingly
     *@param phraseToGuess - the user input phrase to guess
     */
    public GameWord(String phraseToGuess)
    {
        phrase = new String(phraseToGuess);
        state = new StringBuilder( );
        inProgress = new StringBuilder( );
        for(int k = 0; k < phrase.length( ); k++)	//inProgress is the phrase but with underlines instead
        {
					if(phrase.charAt(k) == ' '){
						inProgress.append( "  ");
					}
					else{
            inProgress.append( "_ ");
					}
				}
        numberWrongGuesses = 0;
        gameOver = false;
    }

		/**The setPhrase method takes in a user defined string and creates a new string replacing the letters with blanks
     *@param phraseToGuess - String representing the correct answer used to build the blank guess phrases
     */
    public void setPhrase(String phraseToGuess)
    {
        phrase = new String(phraseToGuess);				//sets correct phrase to input string
        state = new StringBuilder( );							//resets state of hangman to nothing
        inProgress = new StringBuilder( );	

        for(int k = 0; k < phrase.length( ); k++)	//inProgress is the phrase but with underlines instead
        {
					if(phrase.charAt(k) == ' '){
						inProgress.append( "  ");
					}
					else{
            inProgress.append( "_ ");
					}
        }
				
        numberWrongGuesses = 0;										//sets wrong guesses to 0
        state = new StringBuilder( );							//sets state to new again for some reason
        gameOver = false;													//gameOver set to false if game was previously over
    }		
    
		/**The getGameOver method sets the Game over contitions to true to end the loops in main method 
    */
    public boolean getGameOver()
    {
			return gameOver;
    }

		/**The setPhrase method takes in a user defined string and creates a new string replacing the letters with blanks
     *@param phraseToGuess - String representing the correct answer used to build the blank guess phrases
     */
    public void find(char symbol)
    {
        int count = 0;
        int pos = 0;                    //pos
        pos = phrase.indexOf(symbol);   //position of the character in the phrase
        while(pos != -1)                //while theres a character in phrase
        { 
          count++;
          inProgress.setCharAt(pos*2,symbol);       //each underscore also contains a space so it's twice as long
          pos = phrase.indexOf(symbol, pos + 1);    //increment position
        }
        if(count == 0)                  //if no characters 
        {
            numberWrongGuesses++;       //guess is wrong  
            updateState( );             //add hangman noodle
        }
    }
    
  /**The checkWin method  checks to see in progress matches the phrase
    *@return match  - boolean value, true if win
    */  
  public boolean checkWin()
   {
      boolean match = true;
			//loop that checks to see if all characters have been guessed
      for(int i = 0; i < inProgress.length() - 1; i++){
				if(inProgress.charAt(i) == '_'){	//if there is an underscore the game hasn't been won yet
						match = false;
				}
      }

      return match;
    }

    /**The updateState method udates the stick figure text drawing
     *@return match  - boolean value, true if win
     */ 
   private void updateState( )
   { 
         
       switch(numberWrongGuesses)
       {
           case 1: state.append("\n\t\t\t\t\t 0");
                   break;
           case 2: state.append( "\n\t\t\t\t       /");
                   break;
           case 3: state.append(" |");
                   break;
           case 4: state.append( " \\");
                   break;
           case 5: state.append("\n\t\t\t\t         |");
                   break;
           case 6: state.append("\n\t\t\t\t        /");
                   break;
           case 7: state.append(" \\\n\n\t\t\t\t      OH NO!!\n");    //if 7 wrong guesses, game over
                   gameOver = true;
      }
      
  }
  
  /**The toString method returns the stick figure text drawing and the in progress phrase
    */ 
  public String toString()
  {
      return new String("\n***************************************\n" 
            + inProgress + "\n" + state.toString( ));
  }
}