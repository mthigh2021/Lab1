package Game;

import Fixtures.Room;
/*
 * logic for room setup in this class 
 */
public class RoomManager extends Room{
	
	
	private Room initialRoom;
	
	Room[] myRooms;
  
	
//public RoomManager(int numCount) {
////		 
////		 super(name, shortDetail,longDetail);
//	  super();
//	 myRooms = new Room[numCount];
// }
		 
	
public RoomManager( String name,  String shortDetail, String longDetail,
			Room[] exits) {
		super( name,  shortDetail, longDetail);
		myRooms = new Room[5];
		// TODO Auto-generated constructor stub
	}



public void init() {
	Room South = new Room(
							"LivingRom",
							"This Room is next to main door",
							"South Room consisits of TV and sofa and walpaper"
							);
	this.myRooms[0] = South;

	Room North = new Room(
							"MasterBedroom",
							"Next To Living room",
							"Ti has bed and table");
						this.myRooms[1] = North;

	Room East = new Room(
									"Kitchen",
									"Cooking area",
									"It has stove and dinning table ");
							this.myRooms[2] = East;

	Room West = new Room(
									"Kids Room",
									"Kids Playground",
									"It has kids toys and bed");
							this.myRooms[3] = West;

	this.initialRoom = South;

	Room[] room1Exits = {North, East};
	South.setExits(room1Exits);

	North.setExits(South, 1);
	North.setExits(West, 3);
	East.setExits(South, 0);

	West.setExits(North, 2);
}

public Room getRoom(int index) {
	return myRooms[index];
}

public Room getRoom(String roomName) {
	int index = 0;
	for (int i = 0; i < myRooms.length; i++) {
		if (roomName.toUpperCase() == myRooms[i].getName().toUpperCase()) {
			// return the room based on the index (we call the overloaded function)
			return getRoom(i);
		}
	}

	// If the for loop does NOT find a matching room name
	return null;
}

public Room getStartingRoom() {
	return this.initialRoom;
}

public void setStartingRoom(Room startingRoom) {
	this.initialRoom = startingRoom;
}

public Room[] getRooms() {
	return this.myRooms;
}

public void setRooms(Room[] rooms) {
	this.myRooms = rooms;
}
	}




//	int room;
//	Room[] ourRoom;
//	
//   ourRoom = new Room ("main", "PikuHouse", )

//	int numRooms;
//	Room[] myRoom;
//	
//	public void init() {
//	 Room livingRoom = new Room("110 main st", "PikuHouse",5, 
//			 "Living room of the house",
//			 "It has tv and sofa along some chair and wallpaper"  
//			 );
	
	
	//  Room[] allRoom = new Room[5]; ///creates array for rooms
//	  int livingRoom = 0;//set index for each room 
//	  int kitchen = 1;
//	  int MasterRoom = 2;
//	  int bathroom = 3;
//	  int childRoom =4;
//	  int guestRoom = 5;
	  
//	  Room[0] = "livingRoom";
//	  Room[1] = "kitchen";
//	  Room[2] = "MasterRoom";
//	  Room[3] = "bathroom";
//	  Room[4] = "childRoom";
//	  Room[5] = "livingRoom";
//	  
//	  
//	//method to set the object in the room	
//	public void roomSetUp(int input) {
//		
//		for (int i=0; i<5; i++) {
//			switch (input) {
//			
//			case 0:
//				System.out.println("u r in Livingroom");
//			  break;
//			case 1:
//				System.out.println("u r in kitchen");
//
//				break;
//			case 2:
//				System.out.println("u r in MasterRoom");
//
//				break;
//			case 3:
//				System.out.println("u r in bathroom");
//
//				break;
//			case 4:
//				System.out.println("u r in childRoom");
//
//				break;
//			case 5:
//				System.out.println("u r in guestRoom");
//
//				break;
//			
//			}
//			
//		}
//		
//		
//	}
//}
//}
//		
//		public void init() {
//			
//			allRoom LivingRoom = new Room(123, "DKHome",5,"Room with Tv And sofa","Room in next ro the main door");
//		}
//		
//	

	
	
	 
	

