package com.demonstrations.study;

public class StringBuilderExercise {
	
	public static String str = "The Lord is Good";
	public static String wordStr = "Activate Champion Soccer Gramophone Education Market";
	
	public static void appendString() {
		StringBuilder sb = new StringBuilder(str);
		sb.append(", ");
		sb.append("All the time");
		sb.append(" . ");
		System.out.println(sb.toString());
	}
	
	public static void reverseWordsInString() {
		String[] words = wordStr.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word:words) {
			StringBuilder stringBuilder = new StringBuilder(word).reverse();
			sb.append(stringBuilder);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	
	public String reverseWordsInSentence(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String word:words) {
			StringBuilder stringBuilder = new StringBuilder(word).reverse();
			sb.append(stringBuilder);
			sb.append(" ");
		}
		return sb.toString();
	}
}
