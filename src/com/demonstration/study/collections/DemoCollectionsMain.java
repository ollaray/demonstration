package com.demonstration.study.collections;

import java.util.List;

public class DemoCollectionsMain {

	public static void main(String[] args) {	
		DemoCollections.hashSet();     				//unsorted manner and unordered - uses the hashcode to iterate -- it is the most efficient
		DemoCollections.linkedHashSet();			//Iterates in the order of Insertion unsorted but ordered uses the hashcode()
		DemoCollections.treeSet();					//implements both the Set and NavigableSet interface
		
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		//System.out.println("Uniquely Sorted Characters "+DemoCollections.uniqueChars(characters));
		
		//System.out.println("Insertion order of the Characters "+DemoCollections.insertionOrder(characters));
		
		//DemoCollections.treeSetCollection();
		DemoCollections.demoQueue();
	}

}
