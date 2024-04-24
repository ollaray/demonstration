package com.demonstrations.study;
//Demonstrating Object Composition

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book(1, "Learning Java", "Main String");
		Review reviews = new Review(1, "Wonderful Book", 4);
		Review reviews2 = new Review(1, "Well Detailed Explanation", 5);
		book.addReview(reviews);
		book.addReview(reviews2);
		System.out.println(book);
	}

}
