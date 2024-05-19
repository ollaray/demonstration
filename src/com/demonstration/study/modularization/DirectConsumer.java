package com.demonstration.study.modularization;


import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {
	
	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
	
	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Samuel","Thompson","Wale","Stanley","Eve"));
		logger.info(sorted.toString());
	}
}
