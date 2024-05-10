package com.demonstration.study.multithread;

//Implementing the Runnable Interface
public class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.print("\nTask 2 Started!");
		for(int i=201;i<=299;i++)
			System.out.print(i + " ");
		System.out.print("\nTask 2 Done ");
	}

}
