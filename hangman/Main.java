import java.util.*;
/**
 * This class is a basic game of hangman
 * @author Karlton Suits
 * @version10/17/2018
 */
public class Main
{
	 /**The main method drives the game and calls the constructors and methods from GameWorld
    */
   public static void main(String[ ] args)
   {
       Scanner in = new Scanner(System.in);
       char guess;

			 //improve the code 
			 //print menu 
			 //1 college life
			 //2 fictional characters
			 //3 landmarks 
			 //4 occupations
			 //5 rhymes

			 System.out.println("1. College Life");
			 System.out.println("2. Fictional Characters");
			 System.out.println("3. Landmarks");
			 System.out.println("4. Occupations");
			 System.out.println("5. Rhymes");
			 
       GameWord myPhrase = new GameWord("one day at a time" );
       boolean [ ] used = new boolean[255];				//array of booleans to check if guessed 
       
       System.out.println("\n" + myPhrase.toString( ));

			 //while you haven't won or lost
       while(!myPhrase.checkWin( ) && !myPhrase.getGameOver())
       {
         do{
           System.out.print("\nEnter your character: ");		//character guess
           guess = in.nextLine( ).charAt(0);
           if(used[guess]) System.out.println("That letter already guessed.");  //checks if letter has been guessed before
        }while (used[guess]);		//input validation loop
         used[guess] = true;		//updates guess array 
         myPhrase.find(guess);	//changes matching underscores to guessed letter
         System.out.println("\n" + myPhrase.toString( ));
       }
	
				//if winstate is true
       if(myPhrase.checkWin( ))
       {
         System.out.println("You got it!");
       }
      
			//farewell message
       System.out.println("Game Over");
       System.out.println("Game Over");
       System.out.println("Game Over");
       System.out.println("Game Over");
    }
}
