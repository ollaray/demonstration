package com.demonstration.study.multithread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(
				new CallableTask("Life"),
				new CallableTask("Time"),
				new CallableTask("Money"));
		String result = executorService.invokeAny(tasks);			//Returns a list of futures
		System.out.println(result);
		
		executorService.shutdown();
	}
}
