package com.developer.models;

public class Planet {
 // Static variable - specific to the class - same for every instances of the class
//Final means once instantiated no longer be changed	
	public static final double G = 6.673E-11;
	
	// Instant variable
	
	private String name;
	private double mass;
	private double radius;
	private Boolean atmoshpher;
	//default constructure
	public Planet() {
		super();
	}
	//constructure with argument
	public Planet(String name, double mass, double radius, Boolean atmoshpher) {
		super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.atmoshpher = atmoshpher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		if (name == null) {
			System.out.println("please input a valid name");
		}
		this.name = name;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Boolean getAtmoshpher() {
		return atmoshpher;
	}
	public void setAtmoshpher(Boolean atmoshpher) {
		this.atmoshpher = atmoshpher;
	}
	public static double getG() {
		return G;
	}
	
	// Methods 
	public double calculateSurfaceGravity() {
		return(this.mass * G) / (Math.pow(this.radius, 2));
	}
	
	/// we need to override because other wise it will only give the hascode , implicity from the object class
	@Override
	public String toString() {
		return "Planet [name=" + name + ", mass=" + mass + ", radius=" + radius + ", atmoshpher=" + atmoshpher + "]";
	}
	
	
	
}
