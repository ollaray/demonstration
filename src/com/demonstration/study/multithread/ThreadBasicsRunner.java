package com.demonstration.study.multithread;
/*Two ways of creating Threads:
 * 1. By extending the class called Thread
 * 2. By implementing the interface called Runnable
 */
public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		//task1.run(); isn't the right method to call, it should be task1.start(); task1.run(); won't run as a thread
		//Task 1
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();         				 
		
		//Task 2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		//Let's wait for task1 to complete before starting the main thread the join method throws an exception so we need to handle that
		task1.join();
		task2Thread.join();
				
		//Task 3
		System.out.print("\nTask 3 Started!");
		for(int i=301;i<=399;i++)
			System.out.print(i + " ");
		System.out.print("\nTask 3 Done ");
		
		System.out.print("\nMain Task Done");
	}

}
