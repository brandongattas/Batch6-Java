package com.noorteck.java.day13;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		Employee empOne = new Employee();
		
		empOne.id=123;
		empOne.firstName="Brandon";
		empOne.salary=100000;
		
		System.out.println("ID: " + empOne.id);
		System.out.println("First Name: " + empOne.firstName);
		System.out.println("Salary: " + empOne.salary);
		
		empOne.work();
		empOne.breaking();
		
		System.out.println("");
		System.out.println("**********");
		System.out.println("");
		
		Employee empTwo = new Employee();
		
		empTwo.id=456;
		empTwo.firstName="John";
		empTwo.salary=88000;
		
		System.out.println("ID: " + empTwo.id);
		System.out.println("First Name: " + empTwo.firstName);
		System.out.println("Salary: " + empTwo.salary);
		
		empTwo.work();
		empTwo.breaking();
	}

}
