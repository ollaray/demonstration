package com.demonstration.study.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
	/*
	 * DEMONSTRATING PROBLEMS WITH SYNCHRONIZED - LESS CONCURRENCY
	 * ---Suppose a lot of threads are executing these synchronized methods, this would significantly impact performance
	 */
	private int i = 0;
	private int j = 0;
	
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementI() {		//Only one thread is allowed per time to execute this method
		i++; 
	}	
	
	public int getJ() {
		return j;
	}
	
	synchronized public void incrementJ() {		//Only one thread is allowed per time to execute this method
		j++; 
		
	}
}
