package com.demonstration.study.newfeatures;

public class RecordsRunner {
	/*
	 * Static variables, method and initializers are allowed but not instance variables
	 * 
	 */
	record Person(String name, String email, String phoneNumber) {
//		Person(String name, String email, String phoneNumber){
//			if(name == null) {
//				throw new IllegalArgumentException("Invalid Argument");
//			}
////			this.name = name;
////			this.email = email;
////			this.phoneNumber = phoneNumber;
//		}
		//compact constructor
		Person{
			if(name == null) {
				throw new IllegalArgumentException("Invalid Argument");
			}

		}
		public String name() {
			return name;
		}
		
	}
	
	public static void main(String[] args) {
		Person person = new Person("David", "april7baby@gmail.com","123-456-789");
		System.out.println(person);
		System.out.println(person.name());
		
	}

}
