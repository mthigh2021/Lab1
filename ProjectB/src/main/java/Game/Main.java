package Game;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RoomManager roomManager = new RoomManager();
		
	//	RoomManager  myBoss = new RoomManager;
		Player myPlayer = new Player();
		
		 boolean running = true;
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for next room");
		int request = input.nextInt();
		 if (request > 0 && request < 5) {
			 System.out.println("You are inside the house select "
			 		+ "from 0 to 4 to proceed to rooms");
		 }
		 
		// myBoss.init();
		// myPlayer.setCurrentRoom(myBoss.getStartingRoom());
		 
		 while(running) {
			 
			 printRoom(myPlayer);
			 
			//String[] input = collectInput();
		//	parse(input,myPlayer);
			 
			 
			 
		 }
		 
		 //System.out.println("Instructions\n" +"Select the number from 0 to 4 to move" +"\n");
		
	}
	private static void printRoom(Player player) {
		System.out.println(":::: CURRENT ROOM ::::");
		System.out.println("Name: " + player.getCurrentRoom().getName());
		System.out.println("Short Desc: " + player.getCurrentRoom().getShortDetail());
		System.out.println("Long Desc: " + player.getCurrentRoom().getLongDetail());
		// You can also print information about connecting rooms here...
	}
	
	
}
