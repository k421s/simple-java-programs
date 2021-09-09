import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *This driver class scans a text file for things and puts them into an object array
 *@version 11/1/2018
 *@author karlton Suits
 *
 */

class Main {
  public static void main(String[] args) throws Exception{		

		//input file
    System.out.println("Enter an input file Name: "); 
		Scanner userInputOne = new Scanner(System.in);
		String fileName = userInputOne.nextLine();					
		File file = new File(fileName);											 
		Scanner bookScan = new Scanner(file);

		//output file
		System.out.println("Enter an output file name: ");
		Scanner userOutput = new Scanner(System.in);
		String outputFile = userOutput.nextLine();
		File fileOut = new File(outputFile);

		//write to new file
		/*try{
			PrintWriter bookOutPrinter = new PrintWriter(fileOut);

			while (bookScan.hasNextLine()) {
            String line = bookScan.nextLine();
						bookOutPrinter.println(line);
        }

			bookOutPrinter.close();

		}

		catch(Exception e){
			System.out.println("An error occured");
		}

		*/
		

		//scan to book object

		Book[] bookOne = new Book[5];
		boolean[] duplicate = new boolean[5];
		StringTokenizer st1;
		String isbn;
		String title;
		String author;
		double price;


		for(int i = 0; i < 5; i++){

			//scan line 
			String line = bookScan.nextLine();
			st1 = new StringTokenizer(line, ",");

			//isbn, title, author, price
			isbn = st1.nextToken();
			title = st1.nextToken();
			author = st1.nextToken();
			price = Double.parseDouble(st1.nextToken());

			bookOne[i] = new Book(isbn, title, author, price);
			System.out.println(bookOne[i]);

		}
		System.out.println();



	//ask for method of sortment
	System.out.println("Enter a for ascending sort by price");
	System.out.println("Enter d for descending sort by price");
	System.out.println("Enter a letter(a/d): ");
	
	//Scanner sortInput = new Scanner(System.in);
	//String sortString = sortInput.nextLine();

	}
}