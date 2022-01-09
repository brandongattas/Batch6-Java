package com.noorteck.java.day14;

public class EmployeeInfoDemo {
	
	public static void main(String[] args) {
		
		EmployeeInfo empOne = new EmployeeInfo();
		
		empOne.name="John";
		empOne.age=23;
		empOne.id=1234;
		empOne.salary=333.33;
		
		EmployeeInfo empTwo = new EmployeeInfo();
		
		empTwo.name="Cena";
		empTwo.age=43;
		empTwo.id=4567;
		empTwo.salary=888.66;
		
		//empTwo.departmentName="Hola"; //This variable cannot be accessable because it is inside a method.
	}

}
