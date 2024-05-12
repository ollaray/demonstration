package com.demonstration.study.exceptions;

public class Exceptions {
	/*
	 * Error extends Throwable: Errors can be prevented but not handled
	 * Exception extends Throwable: Exceptions can be handled
	 * InterruptedException extends Exception
	 * RuntimeException extends Exception
	 * NullPointerException extends RuntimeException
	 * Any exception that isn't a subclass of a runtime exception is a compile time or checked exception and the calling method must handle it
	 * or throw it.
	 * You don't need throws at the method signature when throwing a Runtime Exception specifically. The 'throw new Exception()' syntax is assumed to be 
	 * Checked or Compile time exception and as such it would need the throws key word at the method signature. The runtime exception doesn't need that.
	 * LESSONS:
	 * -Never hide exceptions --- Log the stacktrace
	 * -Do not use it for flow control --- It is very expensive don't use it in an if---else control flow
	 * -Think about your user: what should he do about it be descriptive about the issue
	 * -Think about your support team
	 * -Think about the calling method
	 * -Have a global exception handling : No exception should go to the user
	 */
}
