package com.demonstration.study.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
	/*
	 * Atomic Integer makes the integer thread safe
	 */
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	
	public int getI() {
		return i.get();
	}
	
	public void incrementI() {		//Only one thread is allowed per time to execute this method
		i.incrementAndGet(); 
	}	
	
	public int getJ() {
		return j.get();
	}
	
	public void incrementJ() {		//Only one thread is allowed per time to execute this method
		j.incrementAndGet(); 
	}
}
