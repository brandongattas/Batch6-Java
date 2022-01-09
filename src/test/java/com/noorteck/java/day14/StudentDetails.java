package com.noorteck.java.day14;

public class StudentDetails {
	
	public static void studentAge() {
	
		//age is local variable
		int age = 0;
	
		age = age + 5;
	
	}
	
	
	public static void main(String[] args) {
		
		//age is a local variable to method studentAge(), therefore we cannot access from main method
		//it is not visible
		System.out.println("Student age is: " + age); //EXPECTED ERROR
		
	}
}


/**

		LOCAL VARIABLE
		
			--> variables that are declared inside the method body
			--> local variables are only visible within that method


*/
