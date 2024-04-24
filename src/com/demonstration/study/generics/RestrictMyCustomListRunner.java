package com.demonstration.study.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Generics are often very important when developing utility classes that can operate on different types of objects
public class RestrictMyCustomListRunner {
	
	//Generics with method
	static <E> E doubleValue(E value) {
		return value;
	}
	
	static <E extends List> void duplicate(E list) {
		list.addAll(list);
	}
	
	//using wild cards in generic arguments: <? extends Number> = Called Upper Bounded Wildcard
	
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for(Number number: numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	//Using Lower bounded Wildcard <? super Number>
	static void addValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(2.0);
		numbers.add(2.5f);
		numbers.add(5l);
		
	}
	
	public static void main(String[] args) {
		List emptyList = new ArrayList<>();
		addValues(emptyList);
		System.out.println(emptyList);
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));
		System.out.println(sumOfNumberList(List.of(1.5,2.2,3.6,4.3,5.9)));
		
		
		String str = doubleValue(new String("String"));
		Integer number = doubleValue(Integer.valueOf(5));
		ArrayList<String> arrList = doubleValue(new ArrayList<String>(List.of("Dog","Cat")));
		
		RestrictMyCustomList<Long> list = new RestrictMyCustomList<>();
		list.addElement(5L);
		list.addElement(7L);
		list.addElement(125L);
		
		
		System.out.println(list);
		Long value = list.get(2);
		System.out.println(value);
		
		RestrictMyCustomList<Integer> list2 = new RestrictMyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		
		System.out.println(list2);
		Integer intVal = list2.get(0);
		System.out.println(intVal);
		
		
		//ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3,4));
		LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4));
		duplicate(num);
		System.out.println(num);
	}

	
}
