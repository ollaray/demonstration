package com.demonstration.study.exercises;

import java.util.Arrays;

public class AnagramExercise {
	public boolean areAnagrams(String str1, String str2) {
        if(str1 == null || str2 == null){
            return false;
        }
        if(str1.length() != str2.length()){
            return false;
        }
             char[] arrStr1 = str1.toLowerCase().toCharArray();
             char[] arrStr2 = str2.toLowerCase().toCharArray();
             
             Arrays.sort(arrStr1);
             Arrays.sort(arrStr2);
             
             return Arrays.equals(arrStr1, arrStr2);
             
        }
 
}
