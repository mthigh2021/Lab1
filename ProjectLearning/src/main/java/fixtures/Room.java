package fixtures;

public class Room extends Fixture {
	private Room[] exits = new Room[4];

	// If you want extra knick-knacks in your rooms...
	private Fixture[] items = new Fixture[5];

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}

	public Room[] getExits() {
		return this.exits;
	}

	public Room getExit(String direction) { 
		int index = 0;
		direction = direction.toUpperCase();
		switch (direction) {
		case "NORTH":
			index = 0;
			break;
		case "SOUTH":
			index = 1;
			break;
		case "WEST":
			index = 2;
			break;
		case "EAST":
			index = 3;
			break;			
		}

		// If statement checks if there is actually a room in certain direction
		if (index >= this.exits.length || this.exits[index] == null) {
			System.out.println("There is no room in that direction");

			// Return the current room is there is not a room in that direction
			return this;
		}

		return this.exits[index];
	}

	// setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	// Overloaded setter method. Allows us to set single exit based on index...
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
}
