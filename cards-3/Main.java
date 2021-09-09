import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception{
		Card one = new Card("5", "Spades");
		Card two = new Card("5", "Spades");

		//should be 0
		System.out.println(one.compareTo(two));

		//should be false
		System.out.println(one.equals(two));

	}
}
