package Fixtures;
public class Room extends Fixture {
	
	
	Room[] exits = new Room[4]; // the room adjacent to this one
	Fixture[]  listItem = new Fixture[5];

	public Room(String name, String shortDetail, String longDetail) {
		super(name, shortDetail, longDetail);
		this.exits = new Room[5];
	}
	
//	public Room() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Room[] getExist() {
		return this.exits;
	}
	
	public Room getExit(String direction) {
		
		final int  start = 0;
		
		direction = direction.toUpperCase();
		switch (start) {
		
		case 0:
			System.out.println("u r in Livingroom");
		  break;
		case 1:
			System.out.println("u r in kitchen");

			break;
		case 2:
			System.out.println("u r in MasterRoom");

			break;
		case 3:
			System.out.println("u r in bathroom");

			break;
		case 4:
			System.out.println("u r in childRoom");

			break;
		case 5:
			System.out.println("u r in guestRoom");

			break;
		
		
	}
		
		if (start >= this.exits.length || this.exits[start] == null) {
			
			System.out.println("YOU are outside of the room");
		}
	
		
		return this;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	// Overloaded setter method. Allows us to set single exit based on index...
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	
	
}
	
//	int north = 0;
//	int south = 1;
//	int east = 2;
//	int west = 3;
//	
//	Room[] myRoom = new Room[5];
//
//	public Room(int address, String name, int numberOfRooms, String shortDetail, String longDetail) {
//		super(address, name, numberOfRooms, shortDetail, longDetail);
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//
//	public Room[] getExits() {
//		return this.getExits();
//	}
//
//	//exit method to change room from user input
//	public void getExit(int input) {
//		
//		
//		switch(input) {
//		
//		case 0:
//			System.out.println("going North");
//			break;
//		case 1:
//			System.out.println("going south");			
//			break;
//		case 2:
//			System.out.println("going East");
//			break;
//		case 3:
//			System.out.println("going West");
//			break;	
//		
//		}
//		
//		
//		
//	}
	
//}
