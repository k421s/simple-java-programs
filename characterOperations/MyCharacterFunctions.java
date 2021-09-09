import java.util.*;

/**
 * This class does operations on characters using static methods
 * 
 * @karlton Suits
 * @version v1
 */

public class MyCharacterFunctions{

	public static int compareTo(char charOne, char charTwo){
		//if char1 == char2
		int result = charOne - charTwo;
		return result;
	}

	public static int digit(char charOne){
		return Character.getNumericValue(charOne);
	}

	public static boolean isAlphabetic(char charOne){
		if(((charOne >= 65) && (charOne <= 98)) || ((charOne >= 97) && (charOne <= 122))){
			return true;
		}

		return false;
	}
	public static boolean isDigit(char charOne){
		if((charOne >= 48) && (charOne <= 57)){
			return true;
		}
		return false;
	}

	public static boolean isLetterOrDigit(char charOne){
		return MyCharacterFunctions.isAlphabetic(charOne) || MyCharacterFunctions.isDigit(charOne);

	}

	public static boolean isLowerCase(char charOne){
		if((charOne >= 97) && (charOne <= 122)){
			return true;
		}
		return false;
	}

	public static boolean isSpace(char charOne){
		if(((int)charOne == 32)){ return true;}
		return false;
	}

	public static char toLowerCase(char charOne){
		return (char) (charOne + 32);
	}
	public static char toUpperCase(char charOne){
		return (char) (charOne - 32);
	}
	
}