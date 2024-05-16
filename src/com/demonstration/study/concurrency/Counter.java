package com.demonstration.study.concurrency;

public class Counter {
	private int i = 0;
	
	public int getI() {
		return i;
	}
	//This method is not thread-safe: Thread-safety is when a method can be safely run by multiple threads at the same time. 
	//In this method, an update to i may be lost. If this method is called over 2 threads; given that the initial value of i is zero; if both threads
	//call the increment() they would both have incremented i once though it was called twice making the value of i incremented to 1 in both threads;
	//Information has therefore been lost
	//To prevent this, we use the synchronized keyword so that only one thread per time would be running the increment method
	public void increment() {
		i++; //This operation is not actually atomic therefore not thread-safe: it is i = i + 1, assigns i, increments i by 1. 
	}	
}
