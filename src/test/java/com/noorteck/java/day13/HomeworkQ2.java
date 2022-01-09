package com.noorteck.java.day13;

public class HomeworkQ2 {
	
	public static void main(String[] args) {
		System.out.println(comparison(-5));
		System.out.println(multipleOf(3));
		System.out.println(comparison(8));
	}
	
	
	public static boolean multipleOf(int num) {
		boolean result=false;
		
		if((num>0) && (num%3==0 || num%5==0)) {
			result=true;
		} else {
			result=false;
		}
		
		return result;
	}
	
	
	//HOW I DID IT ON HOMEWORK:
	public static boolean comparison(int number) {
		boolean result=false;
		
		if(number>=0) {
			if ((number%3)==0 || (number%5)==0) {
				result=true;
			} else {
				result=false;
			}
		} else {
			result=false;
		}
		
		return result;
	}

}
