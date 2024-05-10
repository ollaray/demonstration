package com.demonstration.study.multithread;

//Extending the Thread
public class Task1 extends Thread{
	public void run() {
		System.out.print("\nTask 1 Started!");
		for(int i=101;i<=199;i++)
			System.out.print(i + " ");
		
//		Thread.yield();  							//This is to yield the cpu for other thread executions
//		try {
//			Thread.sleep(10000);					//it is to wait for certain milliseconds
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.print("\nTask 1 Done ");
	}
}

