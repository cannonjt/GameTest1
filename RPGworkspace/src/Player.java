
public class Player {
	
	private String playerName;
	private int health;
	private int level;
	private int experience;
	
	
	
	
	public Player(String name){
		playerName = name;
		health = 100;
		level = 1;
		experience = 0;
		
		System.out.println("Welcome " + playerName);
	}
	



	public String getPlayerName() {
		return playerName;
	}




	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}




	public int getHealth() {
		return health;
	}




	public void setHealth(int health) {
		this.health = health;
	}




	public int getLevel() {
		return level;
	}




	public void setLevel(int level) {
		this.level = level;
	}

	public void gainLevel(){
		this.level++;
		System.out.println("Congratulations! You are now level " + this.level + "!");
	}


	public int getExperience() {
		return experience;
	}




	public void giveExperience(int experience) {
		int refLev = this.level;
		
		System.out.println("You've earned " + experience + " experience.");
		
		do{
		
		if((this.experience + experience) >= (this.level * 100)){
			System.out.println("New xp: " + (this.experience + experience));
			gainLevel();
			experience = experience - ((this.level - 1) * 100);
		}
		else {
			refLev = this.level;
			this.experience += experience;
		}
			
		}while(refLev != this.level);
	}




	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", health=" + health
				+ ", level=" + level + ", experience=" + experience + "]";
	}
	
	
}
