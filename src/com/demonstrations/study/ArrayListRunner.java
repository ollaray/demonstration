package com.demonstrations.study;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRunner {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList();
		arraylist.add("Apple");
		arraylist.add("Orange");
		arraylist.add("Cashew");
		arraylist.add("Pawpaw");
		
		System.out.println(arraylist);
		arraylist.remove("Orange");
		System.out.println(arraylist);
		int[] arr = {10,60, 23, 45, 5, 6};
		int[] arr2 = reverseArray(arr);
		System.out.println(Arrays.toString(arr2));
		
	}
	
	//Array Reverse
	public static int[] reverseArray(int[] array) {
		
		if(array.length < 1) {
			return array;
		}
		
		int[] arrReverse = new int[array.length];
		int start = 0;
		int end = array.length - 1;
		
		while(start <= end) {
			arrReverse[start] = array[end];
			arrReverse[end] = array[start];
			start++;
			end--;
		}
		
		return arrReverse;
				
		
	}

}
