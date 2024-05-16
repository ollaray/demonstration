package com.demonstration.study.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	/*
	 * INTRODUCING LOCK TO SOLVE SYNCHRONIZED ISSUE
	 * ---Lock helps to break synchronized code into sets of sub codes
	 */
	
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public int getI() {
		return i;
	}
	
	public void incrementI() {		//Only one thread is allowed per time to execute this method
		//Get Lock
		lockForI.lock();
		i++; 
		//Release Lock
		lockForI.unlock();
	}	
	
	public int getJ() {
		return j;
	}
	
	public void incrementJ() {		//Only one thread is allowed per time to execute this method
		//Get Lock
		lockForJ.lock();
		j++; 
		//Release Lock
		lockForJ.unlock();
	}
}
