package week8;

public class Main {

	public static void main(String[] args) {
		String sentence = "Are you excited as I am?";
		
	//  without assigning a value to the reverseSentence, the code doesn't run
		String reverseSentence = "";
		
	//	printing the sentence
		System.out.println(sentence);
		
	//  split the string into individual words using space " " as the splitter
		String[] words = sentence.split(" ");
		
	//	moving the punctuation mark from the last word to the first word
		char last_chr = sentence.charAt(sentence.length() - 1);
		words[0] = words[0].toLowerCase() + last_chr;
		
	//	handle the capital letters from first and last word when read backwords
		String first_word = words[words.length - 1];
		first_word = first_word.charAt(0) + first_word.substring(1, first_word.length() - 1);
		words[words.length - 1] = first_word.substring(0,1).toUpperCase() + first_word.substring(1, first_word.length());
		
	//	create the reverseSentence
		for(int i = words.length-1; i > -1; i--) {
			reverseSentence += (words[i] + " ");
		}
	
	//	print the backword sentence
		System.out.println(reverseSentence);

	}

}
