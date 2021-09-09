/** Filename: Main.java
 *
 * This class contains the main() driver
 * It gets input from the user,
 * creates a scanner at the user specified file name,
 * reads through the input file line by line and uses converter class
 * to convert each line.
 * Then changes single digit numbers to their word equivalent.
 *
 * It then prints the output to the console and to a txt file
 * called outSentences.txt
 *
 * @author Karlton Suits
 * @version 11/25/2018
 */

import java.util.*; //imports
import java.lang.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{  //Exception for printwriter
  
		//prompt for input
		System.out.println("Enter a name for the text file: ");

		
		Scanner scan = new Scanner(System.in);//new scanner for user input
		String fileName = scan.nextLine();    //Scan for filename
		scan.close();                         //close scanner

		//create new scanner to text file
		Scanner txtScan = new Scanner(new File(fileName));
    
    //initialize required variables for the read loop
    
		StringBuilder line;                     //where each line will be stored
		Converter lineToConvert;                //converter object to change numbers
		PrintWriter pw = new PrintWriter(new File("outSentences.txt"));//printwriter to the output file

    //loop through all lines in input txt file
		while(txtScan.hasNextLine()){

		  line = new StringBuilder(txtScan.nextLine());		    //scan test
		  lineToConvert = new Converter(line);								//object test
		  System.out.println(lineToConvert.getConverted());   //print to console

		  pw.println(lineToConvert.getConverted());						//print to file
    }
			pw.close();       //close printerWriter
			txtScan.close();  //close txtscan
	}

}