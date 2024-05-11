package com.demonstration.study.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> future = executorService.submit(new CallableTask("Callable Thread"));  //Future is a PROMISE  that there would be a result
		System.out.print("\nCallable Executed!");
		
		String wlcMessage = future.get();
		
		System.out.print("\n"+wlcMessage);
		
		System.out.print("\nMain Completed");
		executorService.shutdown();
		
	}

}
