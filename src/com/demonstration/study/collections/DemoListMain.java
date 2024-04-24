package com.demonstration.study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class DemoListMain {
	
	  
	public static void main(String[] args) {
		//because it was created using "of" this list becomes immutable: you can't change it.
		//To create mutable list you use ArrayList, LinkedList or a Vector
		
		List<String> words = List.of("Apple", "Orange", "Cat", "Rat", "Dog");
		/*
		System.out.println("==========Immutable List=======");
		System.out.println(words);
		
		System.out.println(words.isEmpty());
		System.out.println(words.get(1));
		System.out.println(words.contains("Cat"));
		words.add("Lion");
		System.out.println(words);
		System.out.println(words.indexOf("Orange"));
		for(String word: words) {
			System.out.println(word);
		}
		*/
		
		//Let's create a new List that would convert words to a mutable list
		List<String> wordsArrayList = new ArrayList<>(words);
		List<String> wordsLinkedList = new LinkedList<>(words);
		List<String> wordsVector	= new Vector<>(words);
		
		//System.out.println("==========ArrayList=======");
		//System.out.println(wordsArrayList);
		//wordsArrayList.add(2, "Lion");
		//wordsArrayList.add("Elephant");
		//wordsArrayList.add("Orange");
		//System.out.println(wordsArrayList);
//		
//		System.out.println("==========LinkedList=======");
//		wordsLinkedList.add("Tiger");
//		System.out.println(wordsLinkedList);
//		
//		System.out.println("==========Vector=======");
//		wordsVector.add("Cheetar");
//		System.out.println(wordsVector);
//		
//		//Some List Operations
//		List<String> newList = List.of("Yak","Zebra");
//		wordsArrayList.addAll(newList);
//		System.out.println(wordsArrayList);
//		wordsArrayList.set(6, "Fish");
//		System.out.println(wordsArrayList);
//		wordsArrayList.remove(2);
//		wordsArrayList.remove("Dog");
//		System.out.println(wordsArrayList);
		
		//Merge List
//		List<String> list1 = new ArrayList<>();
//		list1.add("Ade");
//		list1.add("Bola");
//		list1.add("Dayo");
//		List<String> list2 = List.of("Lexus", "Toyota", "Hyundai");
//		mergeList(list1, list2);
		
		//arrayListLoop(wordsArrayList);
		//printWordsEndingWithAt(wordsArrayList);
		//modifyingListOfWordsEndingWithAt2(wordsArrayList);
		//removingIntegers();
		//sortingCollections();
		demoSet();
	}
	public static Map<String, Integer> wordCount(String sentence){
			   if(sentence == null || sentence.equalsIgnoreCase("")) {
				   return new HashMap<String, Integer>();
			   }
			   
			   String[] words = sentence.split(" ");
			   Map<String, Integer> wordMap = new HashMap<>();
			   
			   for(String word: words) {
				   Integer pos = wordMap.get(word);
				   if(pos == null) {
					   wordMap.put(word, 1);
				   }else {
					   pos += 1;
					   wordMap.put(word, pos);
				   }
			   }
			   return wordMap;
			   
			   
		   }
	public static void mergeList(List<String> oneList, List<String> twoList) {
			oneList.addAll(twoList);
			System.out.println(oneList);
		}
		
	public static void arrayListLoop(List<String> words) {
			//you can use for loop: normal and enhanced for loop or iterator
			Iterator<String> itr = words.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}

	public static void printWordsEndingWithAt(List<String> list) {

		if(!list.isEmpty()) {
			for(String str:list) {
				if(str.endsWith("at")) {
					System.out.println(str);
				}
			}
		}
			
	}

	public static void modifyingListOfWordsEndingWithAt(List<String> words) {
		//To modify collections like Arraylist sometimes can be tricky, it is always good to use Iterator to avoid ConcurrentModificationException
		Iterator<String> itr = words.iterator();
		while(itr.hasNext()) {
			if(itr.next().endsWith("at")) {
				itr.remove();
			}
		}
		System.out.println(words);
	}
	
	public static void modifyingListOfWordsEndingWithAt2(List<String> words) {
		List<String> removeItems = new ArrayList();
		for(String word: words) {
			if(word.endsWith("at")) {
				removeItems.add(word);
			}
		}
		words.removeAll(removeItems);
		System.out.println(words);
	}
	
	public static void removingIntegers() {
		List<Integer> num = List.of(101, 102, 103, 104, 105);
		List<Integer> numbers = new ArrayList(num);
		//Since it is a list of Integers, passing ordinary 101 would result in IndexOutOfBoundsException so you need to convert to the 
		//Integer value i.e Object Value that's the only way to tell Java that you are referring to the remove() with the Object parameter and not the int one
		numbers.remove(Integer.valueOf(101));
		System.out.println(numbers);
	}
	
	public static void sortingCollections() {
		List<Integer> num = List.of(123, 12, 3, 45); 
		List<Integer> numbers = new ArrayList(num);
		Collections.sort(numbers);
		System.out.println(numbers);	
	}
	
	public static void demo() {
		List<String> strList = List.of("Apple","Ball","Cat","Dog");
		List<String> words = new ArrayList(strList);
		
		Iterator<String> itr = words.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Ball")) {
				itr.remove();
			}
		}
		System.out.println(words);
	}
	
	public static void demoSet() {
		Set<String> set = Set.of("Apple","Banana", "Orange","Avocado");
		Set<String> fruits = new HashSet<>(set);
		fruits.add("Mango");
		Iterator<String> itr = fruits.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().endsWith("o")) {
				itr.remove();
			}
		}
		System.out.println(fruits);
	}
}
