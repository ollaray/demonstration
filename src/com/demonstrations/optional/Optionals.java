package com.demonstrations.optional;

import java.util.List;
import java.util.Optional;

//A quick study of the Optional Class: It is majorly made to avoid the NullPointerExceptions
public class Optionals {
	
	public static void firstOptionalTest() {
		Optional<Integer> n = Optional.ofNullable(List.of(23,45,67,34).stream().filter(e -> e % 2 ==0).max( (e1,e2)->Integer.compare(e1,e2)).orElse(0));
		System.out.println(n.isPresent());
		System.out.println(n.isEmpty());
		System.out.println(n);
		System.out.println(n.get());
		
	}
	
}
