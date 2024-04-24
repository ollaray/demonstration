package com.demonstration.study.exercises;

public class WordReverserExercise {

	
	public String reverseWordsInSentence(String sentence) {
		
		if(sentence == null) {
			return "INVALID";
		}
		if(sentence.equals("")) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(String word: sentence.split(" ")) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			sb.append(reversedWord).append(" ");
		}
		
		return sb.toString().trim();
	}
	
}
