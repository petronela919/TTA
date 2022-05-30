package week9;

import java.util.HashMap;

public class Task1 {

	public static void main(String[] args) {
		HashMap<String, String> catchphrases = new HashMap<String, String>();
		catchphrases.put("Sheldon Cooper", "Bazinga!");
		catchphrases.put("Del Boy", "Lovely jubbly");
	    catchphrases.put("Doctor Who", "Allons-y!");
	    catchphrases.put("Michael Scott", "That's what she said");
	    
	    	// Print keys and values
	    for (String i : catchphrases.keySet()) {
	      System.out.println("Character: " + i + "       Catchphrase: " + catchphrases.get(i));
	    }

	}

}
