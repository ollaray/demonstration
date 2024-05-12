package com.demonstration.study.exceptions;

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amt1 = new Amount("USD", 10);
		Amount amt2 = new Amount("EUR", 20);
		amt1.addAmount(amt2);
		System.out.println(amt1);
	}

}
