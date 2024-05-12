package com.demonstration.study.exceptions;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Input and Integer");
			int number = Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Scanner closes here!");
			if(scanner != null) {
				scanner.close();
			}
		}


	}

}
