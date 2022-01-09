package com.noorteck.java.day13;

public class DogDemo {
	
	public static void main(String[] args) {
		
		Dog neapolitan = new Dog();
		
		neapolitan.breed="Neapolitan Mastiff";
		neapolitan.size="Large";
		neapolitan.age=5;
		neapolitan.color="Black";
		
		System.out.println("Breed: " + neapolitan.breed);
		System.out.println("Size: " + neapolitan.size);
		System.out.println("Age: " + neapolitan.age + " Years");
		System.out.println("Color: " + neapolitan.color);
		
		neapolitan.eat();
		neapolitan.sleep();
		neapolitan.sit();
		neapolitan.run();
		
		System.out.println("");
		System.out.println("**********");
		System.out.println("");
		
		Dog chow = new Dog();
		
		chow.breed="Chow Chow";
		chow.size="Medium";
		chow.age=3;
		chow.color="Brown";
		
		System.out.println("Breed: " + chow.breed);
		System.out.println("Size: " + chow.size);
		System.out.println("Age: " + chow.age + " Years");
		System.out.println("Color: " + chow.color);
		
		chow.eat();
		chow.sleep();
		chow.sit();
		chow.run();
		
		System.out.println("");
		System.out.println("*************");
		System.out.println("");
		
		Dog maltese = new Dog();
		
		maltese.breed="Maltese";
		maltese.size="Small";
		maltese.age=2;
		maltese.color="White";
		
		System.out.println("Breed: " + maltese.breed);
		System.out.println("Size: " + maltese.size);
		System.out.println("Age: " + maltese.age + " Years");
		System.out.println("Color: " + maltese.color);
		
		maltese.eat();
		maltese.sleep();
		maltese.sit();
		maltese.run();
	}

}
