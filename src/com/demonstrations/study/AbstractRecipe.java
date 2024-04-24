package com.demonstrations.study;

public abstract class AbstractRecipe {
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();
	
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
	
}
