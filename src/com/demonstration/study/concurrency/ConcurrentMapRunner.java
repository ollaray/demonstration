package com.demonstration.study.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
	
	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occur = new ConcurrentHashMap<>();
		
		String str = "ABCD ABCD ABCD";
		for(char character:str.toCharArray()) {
			occur.computeIfAbsent(character, ch -> new LongAdder()).increment();
			
//			LongAdder longAdder = occur.get(character);
//			if(longAdder == null) {
//				longAdder = new LongAdder();
//			}
//			longAdder.increment();
//			occur.put(character, longAdder);
		}
		System.out.println(occur);
		
	}
}
