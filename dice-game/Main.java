//test dice constructor 

import java.util.*;
import java.lang.*;

/**
* This class  
* @author Karlton Suits
* @version10/17/2018
*/

class Main {
  public static void main(String[] args) {
		
    System.out.println("Test roll for part 1");		

		//craps game
		Dice diceOne = new Dice();
		Dice diceTwo = new Dice();

		//Roll Dice
		diceOne.roll();		//default constructor rolls but 
		diceTwo.roll();		//feels more honest this way
		
		System.out.println("roll 2 dice: \n\n");

		
		//display dice rolls
		System.out.print(diceOne.toString());
		System.out.print(diceTwo.toString());
		System.out.println();


	//getters 
	System.out.println("Number of sides on Dice One: " + diceOne.getSides());
	System.out.println("Number of sides on Dice Two: " + diceTwo.getSides());
	System.out.println("Dice one face value: " + diceOne.getFace());
	System.out.println("Dice two face value: " + diceTwo.getFace());
	
	//setters
	System.out.println("\n\n");
	System.out.println("changing dice values to snake eyes \n");
	diceOne.setFace(1);
	diceTwo.setFace(1);
	System.out.println(diceOne.toString() + diceTwo.toString() + "\n");

	System.out.println("New Dice one face value: " + diceOne.getFace());
	System.out.println("New Dice two face value: " + diceTwo.getFace());

	System.out.println("\n\n");
	System.out.println("changing number of dice sides to 2");
	
	//change sides
	diceOne.setSides(2);
	diceTwo.setSides(2);
	
	//display result
	System.out.print("New number of sides: ");
	System.out.print(diceOne.getSides() + "," + diceTwo.getSides());
	System.out.println("\n");


	//reset dice sides
	diceOne.setSides(6);
	diceTwo.setSides(6);


  System.out.println("Starting craps game...\n\n");
	System.out.println("Would you like to play a game of craps? (y/n)");

	Scanner scan = new Scanner(System.in);		//scan values
	String answer = scan.nextLine();

	//if answer is yes play game
	boolean play = (answer.equalsIgnoreCase("y")) ? true: false;
	int sum = 0;			//sum of dice rolled

	//main game loop
	while(play){
		diceOne.roll();
		diceTwo.roll();

		System.out.println("Your roll the dice: ");
		System.out.println(diceOne.toString());
		System.out.println(diceTwo.toString());

		sum = diceOne.getFace() + diceTwo.getFace();
		System.out.println("The sum of the dice are: " + sum + "\n");

		boolean win = false;
		int point = 1;

			switch(sum){
				case 7:
				case 11:
					win = true;
					break;

				case 2:
				case 3:
				case 12:
					win = false;
					break;

				case 4:
				case 5:
				case 6:
				case 8: 
				case 9:
				case 10:
					System.out.println("Since you rolled a " + sum + " You must roll another " + sum + " to win.");

					point = sum;
					while(point != 0){
						diceOne.roll();
						diceTwo.roll();
						System.out.println(diceOne.toString() + diceTwo.toString());
						sum = diceOne.getFace() + diceTwo.getFace();
						System.out.println("You rolled a " + sum + ".\n");
						scan.nextLine();
						if(sum == point){
							win = true;
							System.out.println("You made your point.\n");
							point = 0;
						}
						if(sum == 7){
							System.out.println("You rolled a 7\n");
							win = false;
							point = 0;
						}
					}
				break;
					
				default: 
					System.out.println("Something went wrong with the sum");
					break;

			}//case statement
			if(win == true){
				System.out.println("Congradulations, you win!\n");
			}
			if(win == false){
				System.out.println("Sorry, you lose.\n");
			}

			System.out.println("Would you like to play again?");
			answer = scan.nextLine();
			play = (answer.equalsIgnoreCase("y")) ? true: false;
	}
		System.out.println("Goodbye.");
  }
}