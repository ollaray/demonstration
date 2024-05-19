package com.demonstration.study.newfeatures;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String str = """
				Line 1
					"Line 2"
				Line 3
				Line 4
				""";
		String textBlock = """
				Line 1: %s
				Line 2: %s
				Line 3
				Line 4
				""".formatted("Some value", "Another value");
		System.out.println(textBlock);
	}

}
