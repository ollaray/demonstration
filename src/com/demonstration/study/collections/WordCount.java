package com.demonstration.study.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordCount {
	private static String sentence = "This is an awesome occassion. This has never happened before";
	
	public static void charOccurence() {
		Map<Character, Integer> occurence = new HashMap<>();
		
		char[] characters = sentence.toCharArray();
		
		for(char character: characters) {
			//Get the character
			Integer value = occurence.get(character);
			if(value == null) {
				//set to 1 since it is not there
				occurence.put(character, 1);
			}else {
				//if it is there increment the count
				occurence.put(character, value + 1);
			}
			
		}
		System.out.println(occurence);
		
	}
	
	public static void wordOccur() {
		Map<String, Integer> occur = new HashMap<>();
		String[] words = sentence.split(" ");
		for(String word: words) {
			//Check if the value which is an Integer already exists - it will return null if it doesn't
			Integer value = occur.get(word);
			if(value == null) {
				//Initialize to 1 if it doesn't exist already
				occur.put(word, 1);
			}else {
				//else increment the count
				occur.put(word, ++value);
			}
		}
		System.out.println(occur);
	}
}
