
import java.util.*;


public class StartGame {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static GameInstance currentGame = null;
	
	
	public static void main(String[] args) {
		currentGame = welcome();
		System.out.println(currentGame.toString());
		
		for(int i = 0; i < 15; i++){
			currentGame.getPlayer().giveExperience(80);
			System.out.println(currentGame.getPlayer().getExperience());
		}
	}
	
	public static String makeSelection(){
		String response = null;
		System.out.print("Enter your choice: ");
		while(response == null){
			try{response = keyboard.nextLine().toLowerCase().replaceAll("\\s+", "");
				
				
				if (response.toLowerCase().equals("exit")){
					System.out.println("Exiting...");
					System.exit(0);
				}
				return response;
			}
			catch(Exception e ){
				System.out.print("Incorrect format, please type the number of your choice and press enter.");
				
			}
			
			
		}
		
		return "System Failure! Somebody set us up the bomb";
	}
	
	//Welcome screen, asks player if they want to start a new game or load up an old game, 
	//returns a gameInstance created based on what the user selects
	public static GameInstance welcome(){
		System.out.println("Welcome to sample RPG! Type in your number of your selection and press enter to submit.");
		System.out.println("1. Start a new game");
		System.out.println("2. Load up a saved game");
		String sel = makeSelection().toLowerCase();
		
		
		if(sel.equals("1") || sel.equals("newgame")){
			System.out.println("New game selected");
			
			currentGame = newGame();
			return currentGame;
			
			
		}
		
		if(sel.equals("2") || sel.equals("savedgame")){
			System.out.println("Not implemented yet!");
			welcome();
			
		}
		return null;

	}
	
	//Method to ask the player what they want as game options (eg. name) and create new GameInstance
	public static GameInstance newGame(){
		GameInstance newGameInst = new GameInstance();
		System.out.println("Please enter a character name (and then press enter): ");
		newGameInst.createPlayer(keyboard.nextLine());
		
		return newGameInst;
	}

}
