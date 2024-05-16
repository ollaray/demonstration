package com.demonstration.study.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	//most useful when far less write operations are involved and more reads operations.
	
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();		//It only synchronizes the add operations not the get
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		for(String element:list) {
			System.out.println(element);
		}
	}

}
