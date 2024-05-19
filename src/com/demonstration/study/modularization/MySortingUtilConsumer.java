package com.demonstration.study.modularization;


import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer {
	
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
	
	public static void main(String[] args) {
		MySortingUtil mySortingUtil = new MySortingUtil();
		List<String> sorted = mySortingUtil.sort(List.of("Samuel","Thompson","Wale","Stanley","Eve"));
		logger.info(sorted.toString());
	}
}
