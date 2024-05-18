package com.demonstration.study.javatips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>(List.of("Ant","Ball","Cat","Elephant"));
		//Collections.sort(animals, new LengthComparator());
		//Using Anonymous class
		Comparator<String> lengthComparator = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
			
		};
		Collections.sort(animals, lengthComparator);
		
		System.out.println(animals);
	}

}
