package com.demonstration.study.exceptions;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input and Integer");
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println(number);
		}catch(Exception e) {
			System.out.println("There was a problem "+e.getMessage());
		}
		
//		try {
//			
//		}catch(IOException | SQLException e) {
//			e.printStackTrace();
//		}
	}


	}

