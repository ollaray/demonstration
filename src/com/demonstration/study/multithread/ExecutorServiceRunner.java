package com.demonstration.study.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));   //Task 2 gets started after task1 is completed
		
		System.out.print("\nTask 3 Started!");
		for(int i=301;i<=399;i++)
			System.out.print(i + " ");
		System.out.print("\nTask 3 Done ");
		
		System.out.print("\nMain Task Done");
		
		executorService.shutdown();
	}

}
