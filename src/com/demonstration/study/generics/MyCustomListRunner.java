package com.demonstration.study.generics;

public class MyCustomListRunner {
	//Generics are often very important when developing utility classes that can operate on different types of objects
	
	
	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("element 1");
		list.addElement("element 2");
		list.addElement("element 3");
		list.addElement("element 4");
		
		System.out.println(list);
		String value = list.get(2);
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<Integer>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		
		System.out.println(list2);
		Integer intVal = list2.get(0);
		System.out.println(intVal);
	}

	
}
