import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    
    //part 1
		System.out.println("Part 1: Spaces are delimiter.");
    System.out.println("Enter a sentence: ");
    String sentence = scan.nextLine();
    
    StringTokenizer st = new StringTokenizer(sentence, " "); 
    System.out.println("Number of tokens: " + st.countTokens());
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
    
    //part 2
		System.out.println("Part 2: commas are delimiter.");
    System.out.println("Enter a new sentence: ");
    sentence = scan.nextLine();
    st = new StringTokenizer(sentence, ",");
    System.out.println("Number of tokens: " + st.countTokens());    
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
    
    //part 3
		System.out.println("Part 3: commas displayed.");
    System.out.println("Enter a new sentence (pt3)");
    sentence = scan.nextLine();
    st = new StringTokenizer(sentence, ",", true);
    System.out.println("Number of tokens: " + st.countTokens()); 
    
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
    
    //part 4
		System.out.println("Part 4: multiple delimiters.");
    System.out.println("Enter a new sentence (pt4)");
    sentence = scan.nextLine();
    st = new StringTokenizer(sentence, ",| ", true);
    System.out.println("Number of tokens: " + st.countTokens()); 
    
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
    
    //part 5
		System.out.println("Part 5: StringTokenizer from a txt file. ");
    File file = new File("students.txt"); 
    scan = new Scanner(file);
    while(scan.hasNextLine()){
         sentence = scan.nextLine();
         st = new StringTokenizer(sentence, ",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println();
    }
        }
}