
import java.util.Random;


/*game instance will handle the saves of games, and will load up save information 
such as character information and make it available to the game engine

*/
public class GameInstance {
	
	private int gameID = 0;
	private static Random rand = new Random();
	private Player disPlayer = null;
	
	public GameInstance(){
		gameID = rand.nextInt(250000);
		System.out.println("Game saveID: " + gameID);
		
		
	}
	
	public Player createPlayer(String name){
		disPlayer = new Player(name);
		return disPlayer;
	}

	@Override
	public String toString() {
		return "GameInstance [gameID=" + gameID + ", disPlayer=" + disPlayer.toString()
				+ "]";
	}

	public Player getPlayer() {
		return disPlayer;
	}

	public void setPlayer(Player disPlayer) {
		this.disPlayer = disPlayer;
	}
	
	
	

}
