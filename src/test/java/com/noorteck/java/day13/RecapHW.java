package com.noorteck.java.day13;

public class RecapHW {
	
	public static void main(String[] args) {
		System.out.println(isTrue(1,-2,false));
		System.out.println(isTrue(-1,1,false));
		System.out.println(isTrue(-4,-5,true));
	}
	
	
	public static boolean posNeg(int n1, int n2, boolean status) {
		boolean result = false;
		
		if((n1<0) && (n2>0) && (status == false)) {
			result=true;
		} else if ((n2<0) && (n1>0) && (status==false)) {
			result=true;
		} else if ((n1<0) && (n2<0) && (status==true)) {
			result=true;
		} else {
			result=false;
		}
		
		return result;
	}
	
	
	
	//HOW I DID IT ON HOMEWORK:
	public static boolean isTrue(int valueOne, int valueTwo, boolean valueTrueFalse) {
		boolean result=false;
		
		if(valueOne<0 && valueTwo>=0 && valueTrueFalse==false) {
			result=true;
		} else if (valueOne>=0 && valueTwo<0 && valueTrueFalse==false) {
			result=true;			
		} else if (valueOne<0 && valueTwo<0 && valueTrueFalse==true){
			result=true;
		} else {
			result=false;
		}
		
		return result;
	}

}


/**

1) Given 2 int values and 1 boolean value, return true if one is negative and one is positive and
boolean value is false. Except if the boolean parameter is true, then return true only if both
are negative.
posNeg (1, -1, false) ---  true
posNeg (-1, 1, false) ---  true
posNeg (-4, -5, true) ---  true


*/