package week9;

import java.util.Scanner;

public class PacMan {
	/*
	 * Another version of Pac-Man. This game has only one ghost. At the beginning, you and the ghost will be placed randomly on the board.
	 * You can move in any of the 4 directions (north, south, east, west). When you move, the ghost will move as well (randomly);
	 * You start with 3 lives. You lose lives and points when the ghost find you. 
	 * You gain points whenever you move and the ghost isn't there.
	 * 
	 * The goal is to find the Secret Room on the map so you can hide from the ghost
	 * */

	public static void main(String[] args) {
		// Setting the Pac-Man name, number of lives, and a score to begin with
		Character pacMan = new Character("Player1", 3, 1000);
		
		// Setting the random co-ordinates for Pac-Man
		Map pacManMap = new Map(10, 10);
		pacManMap.setCurrentX((int)(Math.random()*pacManMap.getX()));
		pacManMap.setCurrentY((int)(Math.random()*pacManMap.getY()));
		
		// Setting the random co-ordinates for the ghost
		Map ghostMap = new Map(10, 10);
		ghostMap.setCurrentX((int)(Math.random()*ghostMap.getX()));
		ghostMap.setCurrentY((int)(Math.random()*ghostMap.getY()));
		
		// value to check when the game is finished
		boolean terminate = false;
		
		// value to read user input
		Scanner userInput = new Scanner(System.in);
		String direction;
		
		// direction to choose for ghost direction of movement (randomly)
		String[] directions = {"north", "south", "west", "east"};
		
		// setting Secret Room co-ordinates
		int winnerX = (int)(Math.random()*pacManMap.getX());
		int winnerY = (int)(Math.random()*pacManMap.getY());
		
		// Playing the game
		while (!terminate) {
			// Printing the position of Pac-Man and of the ghost
			System.out.println("You are the position [ " + pacManMap.getCurrentX() + ", " + pacManMap.getCurrentY() + " ]");
			System.out.println("The ghost is at the position [ " + ghostMap.getCurrentX() + ", " + ghostMap.getCurrentY() + " ]");
			
			// Prompt user for direction
			System.out.println("Enter direction");
			direction = userInput.nextLine().toLowerCase();
			
			// Set new co-ordinates for Pac-Man position
			pacManMap.move(direction);
			
			// Set random co-ordinates for ghost position
			ghostMap.move(directions[(int)(Math.random()*4)]);
			
			// Pac-Man finds the Secret Room
			if (pacManMap.getCurrentX() == winnerX && pacManMap.getCurrentY() == winnerY) {
				System.out.println("Congratulations" + pacMan.getCharacter() + ". You have found the Secret Room.");
				System.out.println("You have finished with " + pacMan.getLives() + " lives and " + pacMan.getPoints() + " points.");
				terminate = true;
				
			} else if (pacManMap.getCurrentX() == ghostMap.getCurrentX() && pacManMap.getCurrentY() == ghostMap.getCurrentY()) {
				// Ghost finds Pac-Man
				pacMan.setLives(pacMan.getLives() - 1);	// Decrement number of Pac-Man's lives
				if (pacMan.getLives() == 0) {
					// Check if there aren't any more lives
					System.out.println("Oh, no. The ghost has find you again. You have no more lives.\n Game over.");
					terminate = true;

				} else {
					// Decrementing number of lives and number of points
					System.out.println("Oh, no. The ghost has find you. You have to run away.");
					pacMan.setPoints(pacMan.getPoints() - 50);
					System.out.println("You have " + pacMan.getLives() + " lives and " + pacMan.getPoints() + " points.");
				}
				
			} else pacMan.setPoints(pacMan.getPoints() + 50); // incrementing number of points
			
		}
		
		userInput.close();
	}

}
