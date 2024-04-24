package com.demonstration.study.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollections {
	
	public static void hashSet() {
		Set<Integer> numbers = new HashSet();
		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		System.out.println("HashSet Doesn't store in any order "+numbers);
		
	}
	public static void linkedHashSet() {
		Set<Integer> numbers = new LinkedHashSet();
		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		System.out.println("LinkedHashSet stores in the order of insertion "+numbers);
	}
	
	public static void treeSet() {
		Set<Integer> numbers = new TreeSet();
		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		numbers.add(23);
		System.out.println("TreeSet stores in ascending order sorted order "+numbers);
	}
	
	public static Set<Character> uniqueChars(List<Character> chars) {
		Set<Character> uniqItems = new TreeSet<>(chars);
		return uniqItems;
	}
	
	public static Set<Character> insertionOrder(List<Character> chars) {
		Set<Character> uniqItems = new LinkedHashSet<>(chars);
		return uniqItems;
	}
	//TreeSet
	public static void treeSetCollection() {
		TreeSet<Integer> numbers = new TreeSet<Integer>(Set.of(65, 54, 34, 12, 99));
		//let's check numbers lower than 40
		System.out.println(numbers.floor(40));      //<= 40
		System.out.println(numbers.floor(34));		//<=34
		System.out.println(numbers.lower(34));		//<34
		System.out.println(numbers.ceiling(36));
		System.out.println(numbers.higher(40));
		
		System.out.println(numbers.subSet(20, 80));
		System.out.println(numbers.subSet(34,false, 65,false));				//don't include upper and lower limit
		System.out.println(numbers.subSet(34, true, 65, true));				//include upper and lower limit
		
		System.out.println(numbers.headSet(50));
		System.out.println(numbers.tailSet(50));
		
		
		
	}
	
	//Queue
	public static void demoQueue() {
		Queue<String> queue = new PriorityQueue<>();
		queue.offer("Apple");
		queue.addAll(List.of("Banana","Orange","Cashew","Tangerine"));
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
	}
	
}
