package week8;

public class Task2 {

	public static void main(String[] args) {
		
		//	Uncomment the sentence you want to use
		
		//String sentence = "Sixty zippers were quickly picked from the woven jute bag.";
		//String sentence = "A wizard's job is to vex chumps quickly in fog.";
		//String sentence = "Brown jars prevented the mixture from freezing too quickly.";
		String sentence = "I once went to a quiet place in the Bahamas to see a very dodgy taxman.";
		//String sentence = "We promptly judged antique ivory buckles for the next prize."
		
		String letters = "abcdefghijklmnopqrstuvwxyz";	// String with all the letters of the alphabet
		int[] pos_letter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};	//	Count the number of letter appearances
		
		//	Build a new sentence with all the special characters removed and only lower case letters
		String newSentence = sentence.toLowerCase();
		if (!(newSentence.charAt(newSentence.length() - 1) > 'a' && newSentence.charAt(newSentence.length() - 1) < 'z'))
			newSentence = newSentence.substring(0, newSentence.length() - 1).replace(" ", "");
		
		//the bellow statement is for when the second sentence is being used
		//newSentence = newSentence.replace("'", "");
		
		//	Read the letter from position "i" in newSentence
		//	Then we find the letter possition in the alphabet
		//	Then we assigned to the corresponding possition in the counting array an increased value of +1
		for (int i = 0; i < newSentence.length(); i++) 
			pos_letter[letters.indexOf(newSentence.charAt(i))] += 1;
		
		//	check if there is any missing letter
		boolean notFoundLetter = false;
		
		//	printing the missing letters
		for (int i = 0; i < 26; i++)
			if(pos_letter[i] == 0) {
				System.out.print(letters.charAt(i) + "   ");
				notFoundLetter = true;
			}
		
		if (!notFoundLetter)
			System.out.print("The sentence: '" + sentence + "' is a pangram.");
		else
			System.out.print("\nThe sentence: '" + sentence + "' is not a pangram. You are missing the above letters.");
	}

}
