package com.demonstrations.study;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("Line 1 for home", "Lagos", "101232");
		Address workAddress = new Address("Line 1 for work", "Lagos", "101200");
		Customer customer = new Customer("Dayo", homeAddress);
		
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
		
	}

}
