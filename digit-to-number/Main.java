import java.util.StringTokenizer;
//extra todo
//TODO check stringTokenizer for more methods
//TODO check Char at and string properties for more 
//TODO check error and exception handling 
//TODO check loop iterations for better methods
//TODO try and build without sentenceArray

//standard todo
//TODO flatten fill loop and check loop
//TODO format to methods we are allowed to use
//TODO put scanner in for input 
//TODO put input file for input 
//TODO capitalize start of sentences

//add converter files


/*
can we use arrays? 
can we use tokens? 

classes:
	String
	StringBuilder
	scanner
	printWriter


Char:
	isDigit()
	Character.isDigit()
	

Allowed: 
	charAt()
	setCharAt()
	Character.isDigit()

not allowed:
	indexOf()
	replace()
	replaceAll()

Allowed StringBuilder:
constructors
replace()
charAt()
length()
length()
setValueAt()

String:
CharAt();


*/

class Main {
  public static void main(String[] args) {
		//input string
		String sentence = "I have 3 tests in 5 days and 6 tets in 10 days";

		//StringTokenizer initialization
		StringTokenizer st = new StringTokenizer(sentence, " ");
		int num = st.countTokens();

		//parallel array with desired number name
		String[] numberArray = {
			"zero",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine"
		};

		//initialize array size of tokens
		String[] sentenceArray = new String[num];

		//read sentence string into string array
		for(int i = 0; i < num; i++){
			sentenceArray[i] = st.nextToken();
		}

		//loop through sentenceArray, if length is 1 (to exclude numbers larger than 9), and if between character number values for 0-9, convert the array at i to the numberArray with the desired value
		for(int i = 0; i < sentenceArray.length; i++){
			if((sentenceArray[i].length() == 1) && ((int)sentenceArray[i].charAt(0) > 48) && ((int)sentenceArray[i].charAt(0) < 56)){
				sentenceArray[i] = numberArray[Integer.parseInt(sentenceArray[i])];
			}
		}

		//print out completed sentence
		for(int i = 0; i < sentenceArray.length; i++){
			System.out.print(sentenceArray[i] + " ");
		}
  }
}