package com.demonstrations.study;

import java.util.Arrays;
import java.util.Collections;


public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday"};
		//find the day with the longest characters
		dayWithLongestStr(daysOfWeek);
		System.out.println("==========================================");
		reverseEachStringInArr(daysOfWeek);
	}
	public static void dayWithLongestStr(String... dayArr) {
		String dayWithMostCharacter = "";
		for(String day:dayArr) {
			if(day.length()>dayWithMostCharacter.length()) {
				dayWithMostCharacter = day;
			}
		}
		System.out.println(dayWithMostCharacter);
	}
	
	public static void reverseEachStringInArr(String... arrs) {
		for(String arr:arrs) {
			String rev = new StringBuilder(arr).reverse().toString();
			System.out.println(arr+" is reversed to "+rev);
		}
		
		//String reverse = new StringBuilder(string).reverse().toString();
	}
	
    public String findLongestWord(String sentence) {
        String longestWord = "";
        if(sentence.length() > 0 ){
            String[] words = sentence.split(" ");
            
            for(String word: words){
                if(word.length() > longestWord.length()){
                    longestWord = word;
                }
            }
        }
        return longestWord;
        
    }
    
  
}
