package com.demonstration.study.exceptions;

public class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void addAmount(Amount amt) throws CurrenciesDoNotMatchException {
		if(!this.currency.equals(amt.currency)) {
			throw new CurrenciesDoNotMatchException("Incompatible Currencies "+this.currency+" & "+amt.currency);
		}
		this.amount += amt.amount;
	}
	
	public String toString() {
		return this.amount+" "+this.currency;
	}
}
