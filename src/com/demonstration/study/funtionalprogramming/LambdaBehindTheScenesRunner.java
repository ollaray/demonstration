package com.demonstration.study.funtionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Let's try and implement the Predicate Interface with an EvenNumber Class
class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
	
}
//Consumer Implementation
class SystemOutConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer num) {
		return num * num;
	}
	
}


public class LambdaBehindTheScenesRunner {

	public static void main(String[] args) {
		//Lambda
		System.out.println("==================LAMBDA========================");
		Predicate<? super Integer> evenPredicate = n->n%2==0;
		Predicate<? super Integer> oddPredicate = checkIfOdd();
		
		List.of(23,43,34,45,36,48)
			.stream()
			.filter(evenPredicate)
			.map(e->e * e)
			.forEach(e->System.out.println(e));
		
		
//		List.of(23,43,34,45,36,48)
//			.stream()
//			.filter(n->n%2==0)
//			.map(e->e * e)
//			.forEach(e->System.out.println(e));
		
		System.out.println("==================BEHIND THE SCENE===============");
		//Behind the scene action
		List.of(23,43,34,45,36,48)
		.stream()
		.filter(new EvenNumberPredicate())
		.map(new NumberSquareMapper())
		.forEach(new SystemOutConsumer());
		
		//All these below are all functional interfaces
		//the filter method's return type is Stream<T t>
		//The filter Method accepts a Predicate Predicate<? super T> predicate); the Predicate is a FunctionalInterface accept an input but returns a boolean
		//forEach(Consumer<? super T> action);forEach is a consumer
		//The map <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		//R apply(T t); map accepts a function and returns a stream of certain type
		
	}

	private static Predicate<? super Integer> checkIfOdd() {
		return n->n%2==1;
	}

}
