package com.demonstration.study.funtionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Consumer is an in-built functional Interface in the java.util.function package. They are used to consume objects: The consumer takes an input value
 * and returns nothing: The interface has two methods:void accept(T value) and default Consumer<T> andThen(Consumer<? super T> after);
 */
public class Consumers {
	
	public static void printCities() {
		List<String> cities = new ArrayList<>();
		cities.add("Delhi");
	    cities.add("Mumbai");
	    cities.add("Goa");
	    cities.add("Pune");
	    
	    Consumer<String> printConsumer = city->System.out.println(city);
	    cities.forEach(printConsumer);
	}
}	
