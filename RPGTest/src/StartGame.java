
import java.util.*;


public class StartGame {
	
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		GameInstance currentGame = welcome();
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
	
	public static GameInstance welcome(){
		System.out.println("Welcome to sample RPG! Type in your number of your selection and press enter to submit.");
		System.out.println("1. Start a new game");
		System.out.println("2. Load up a saved game");
		String sel = makeSelection().toLowerCase();
		
		
		if(sel.equals("1") || sel.equals("newgame")){
			System.out.println("New game selected");
			GameInstance currentGame = new GameInstance();
			return currentGame;
			
		}
		
		if(sel.equals("2") || sel.equals("savedgame")){
			System.out.println("Not implemented yet!");
			welcome();
			
		}
		return null;

	}

}
