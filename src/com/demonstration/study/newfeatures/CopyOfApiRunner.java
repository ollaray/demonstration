package com.demonstration.study.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ade");
		names.add("Semi");
		names.add("Thompson");
		names.add("Dayo");
		
		//Create a static list; it is unmodifiable if you don't want a list changed using List.of()
		//or List.copyOf()
		List<String> copyOfNames = List.copyOf(names);
		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
	}

	private static void doNotChange(List<String> names) {
		names.add("NotAllowed");
	}

	

}
