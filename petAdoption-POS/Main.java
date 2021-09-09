import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception{
    System.out.println("List of pets: \n");

		//define constructors
		Pet petOne;
		Pet petTwo;
		Pet petThree;
		Pet petFour;
		

			File file = new File("rescue.txt"); 
			Scanner scan = new Scanner(file);

			String stringRead = scan.nextLine();
			StringTokenizer st = new StringTokenizer(stringRead, ","); 

			petOne = new Pet(st.nextToken(), st.nextToken(), Double.parseDouble(st.nextToken()));
			
			stringRead = scan.nextLine();
			st = new StringTokenizer(stringRead, ",");
			petTwo = new Pet(st.nextToken(), st.nextToken(), Double.parseDouble(st.nextToken()));

			stringRead = scan.nextLine();
			st = new StringTokenizer(stringRead, ",");
			petThree = new Pet(st.nextToken(), st.nextToken(), Double.parseDouble(st.nextToken()));

			stringRead = scan.nextLine();
			st = new StringTokenizer(stringRead, ",");
			petFour = new Pet(st.nextToken(), st.nextToken(), Double.parseDouble(st.nextToken()));

			System.out.println(petOne.toString());
			System.out.println(petTwo.toString());
			System.out.println(petThree.toString());
			System.out.println(petFour.toString());


			System.out.println();

			//equals
			System.out.println(petOne.equals(petTwo));
			System.out.println(petOne.equals(petFour));
			System.out.println(petOne.compareTo(petTwo));

			scan.hasNextline();
  }
}