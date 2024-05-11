package com.demonstration.study.exceptions;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		try {
			strLen(null);
		}catch(NullPointerException npe) {
			System.out.println("Null values are not accepted");
		}
	}
	
	public static int strLen(String str) throws NullPointerException{
		return str.length();
	}

}
