package Fixtures;

public class  Fixture {

	  

	//int Address; // address of the house
	   protected String name;//name of the house
	   //int numberOfRooms; // number of rooms in the house
	   protected String shortDetail; // contains short details of inside
	   protected String longDetail; // contains long details of inside
	   
	   //constructor initialization
	public Fixture(String name, String shortDetail, String longDetail) {
		super();
		//Address = address;
		this.name = name;
		//this.numberOfRooms = numberOfRooms;
		this.shortDetail = shortDetail;
		this.longDetail = longDetail;
	}
	//getting setters and getters method
	
	
//	public int getAddress() {
//		return Address;
//	}

//	public void setAddress(int address) {
//		Address = address;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public int getNumberOfRooms() {
//		return numberOfRooms;
//	}
//
//	public void setNumberOfRooms(int numberOfRooms) {
//		this.numberOfRooms = numberOfRooms;
//	}

	public String getShortDetail() {
		return shortDetail;
	}

	public void setShortDetail(String shortDetail) {
		this.shortDetail = shortDetail;
	}

	public String getLongDetail() {
		return longDetail;
	}

	public void setLongDetail(String longDetail) {
		this.longDetail = longDetail;
	}
	   
	   
	
	 @Override
		public String toString() {
			return "Fixture [name=" + name + ",  shortDetail="
					+ shortDetail + ", longDetail=" + longDetail + "]";
		}
	
	
	
}
