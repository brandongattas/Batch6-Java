package com.noorteck.java.day13;

public class AutomobileDemo {
	
	public static void main(String[] args) {
		
		//Create an object of Automobile class
		//ClassName objectName = new ClassName();
		
		Automobile honda = new Automobile();
		
		honda.fuel=10.3;
		honda.speed=22.22;
		honda.license="123xyz";
		
		System.out.println(honda.fuel);
		System.out.println(honda.speed);
		System.out.println(honda.license);
		
		honda.accelerate(43.33);
		honda.decelarate(33.33);
		
		System.out.println("****************************");
		
		Automobile tesla = new Automobile();
		
		tesla.fuel = 44.44;
		tesla.speed = 88.88;
		tesla.license = "abcd123e5";
		
		System.out.println(tesla.fuel);
		System.out.println(tesla.speed);
		System.out.println(tesla.license);
		
		tesla.accelerate(22.1);
		tesla.decelarate(333.33);
	}

}


/**
	Class syntax of creating an OBJECT:
	
	ClassName objectName = new ClassName();


*/