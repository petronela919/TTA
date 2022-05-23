package week8;

public class Part2 {

	public static void main(String[] args) {
		String[] wordList= {"Stressed", "Parts", "Straw", "Keep", "Wolf"};
		String reverseWord;
		
		for (int i = 0; i < wordList.length; i++) {
			//	print the initial word
			System.out.print(wordList[i] + " ");
			
			//	initialise reverseWord with an empty string on every itineration
			reverseWord = "";
			
			//	build the backword read word
			for (int j = 0; j < wordList[i].length(); j++) 
				reverseWord = wordList[i].charAt(j) + reverseWord;
			
			//	modify the word so the first letter will be upper case, and the last one lower case
			reverseWord = reverseWord.substring(0,1).toUpperCase() + reverseWord.substring(1, reverseWord.length()).toLowerCase();
			
			//	print the new word
			System.out.println(reverseWord);
		}
		

	}

}
