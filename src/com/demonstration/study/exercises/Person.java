package com.demonstration.study.exercises;

public class Person {
	
	private String name;
	private String height;
	private double weight;
	private int age;
	
	public Person() {}
	
	public Person(String name, String height, double weight, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eats() {
		System.out.println("Person eats");
	}
	public void walk() {
		System.out.println("Person walks");
	}
	public void see() {
		System.out.println("Person sees");
	}
}
