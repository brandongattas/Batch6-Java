package com.noorteck.java.day13;

public class Automobile {

	
	//variables OR STATES OR PROPERTY OR DATA
	double fuel;
	double speed;
	String license;
	
	
	//methods OR BEHAVIOR
	public static void accelerate(double pedalPressure) {
		System.out.println("Accelerating.... " + pedalPressure);
	}
	
	public static void decelarate(double pedalPressure) {
		System.out.println("Decelarating... " + pedalPressure);
	}
	
}
