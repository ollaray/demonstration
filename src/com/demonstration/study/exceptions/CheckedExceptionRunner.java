package com.demonstration.study.exceptions;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
//		try {
//			exceptionMethod();
//			Thread.sleep(2000);
//		}catch(InterruptedException ie) {
//			ie.printStackTrace();
//		}
		//exceptionMethod();		Checked Exceptions are Compile time exceptions
		//exceptionMethod2();		Unchecked Exceptions are runtime execeptions
	}
	//CheckedException and must be handled - handled at compile time: using try-catch or throw again. 
	private static void exceptionMethod() throws InterruptedException {
		Thread.sleep(2000);
	}
	//This is Runtime exception - handled at runtime
	private static void exceptionMethod2() throws RuntimeException {
	
	}

}
