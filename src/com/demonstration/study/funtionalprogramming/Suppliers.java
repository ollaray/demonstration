package com.demonstration.study.funtionalprogramming;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Suppliers {
	/*
	 * Supplier is a functional interface; it takes no arguments and returns a result.
	 * 
	 */
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public static void locatDateTime() {
		Supplier<LocalDateTime> supplier = ()->LocalDateTime.now();
		LocalDateTime time = supplier.get();
		System.out.println(time);
		
		Supplier<String> sup = ()->dtf.format(LocalDateTime.now());
		String now = sup.get();
		System.out.println(now);
		
		System.out.println(dtf.toString());
		
	}
}
