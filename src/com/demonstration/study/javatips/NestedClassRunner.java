package com.demonstration.study.javatips;


class DefaultClass{
	
}

public class NestedClassRunner {
	
	class InnerClass{
		
	}
	static class StaticNestedClass{
		
	}
	public static void main(String[] args) {
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}

}
