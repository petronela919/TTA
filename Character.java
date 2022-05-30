package week9;

public class Character {
	
	private String character;
	private int lives;
	private int points;
	
	public Character(String character, int lives, int points) {
		this.character = character;
		this.lives = lives;
		this.points = points;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getCharacter() {
		return character;
	}
	
	


}
