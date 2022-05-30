package week9;

import java.util.Arrays;

public class Map {
	private int x, y, currentX, currentY;
	
	
	
	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}


	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}


	public int getCurrentX() {
		return currentX;
	}


	public int getCurrentY() {
		return currentY;
	}


	public Map(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}
	
	public void move(String direction) {
		String[] north = {"north", "up", "n"};
		String[] south = {"south", "down", "s"};
		String[] west = {"west", "left", "w"};
		String[] east = {"east", "right", "e"};
		
		if (Arrays.asList(north).contains(direction)) {
			if (getCurrentX() == 0)
				setCurrentX(getX() - 1);
			else setCurrentX(getCurrentX() - 1);
			
		} else if (Arrays.asList(south).contains(direction)) {
			if (getCurrentX() == getX() - 1)
				setCurrentX(0);
			else setCurrentX(getCurrentX() + 1);
			
		} else if (Arrays.asList(west).contains(direction)) {
			if (getCurrentY() == 0)
				setCurrentY(getY() - 1);
			else setCurrentY(getCurrentY() - 1);
			
		} else if (Arrays.asList(east).contains(direction)) {
			if (getCurrentY() == getY() - 1)
				setCurrentY(0);
			else setCurrentY(getCurrentY() + 1);
			
		} else {
			System.out.println("I don't know what you are saying. Try again.");
		}
	}
	
	
	
	

}
