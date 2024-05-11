package com.demonstration.study.multithread;

public class Task extends Thread {
	private int num;
	public Task(int num) {
		this.num = num;
	}
	
	public void run() {
		System.out.print("\nTask "+num+ " Starts!");
		for(int i=num * 100;i<=num * 199 + 99;++i)
			System.out.print(i + " ");
		System.out.print("\nTask "+num+" is Done!");
	}
}
