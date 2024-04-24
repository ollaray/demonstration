package com.demonstrations.study;

import java.util.ArrayList;
import java.util.List;

public class Book extends Object {
	//Object composition
	
	//state
	private int id;
	private String name;
	private String author;
	private List<Review> reviews = new ArrayList<>();
	
	//creating
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	//Behavior
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("Id = %d, Name = %s, Author = %s, Reviews = [%s]", id,name,author,reviews);
	}
}
