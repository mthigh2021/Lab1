package com.developer.app;

import com.developer.models.Planet;

public class OuterSpace {
 public static void main(String[] args) {
	 
	 Planet mars = new Planet("Mars", 55555, 888884888, false);
	 
	 System.out.println(mars);
	 System.out.println(mars.calculateSurfaceGravity());
	 
 }
}
