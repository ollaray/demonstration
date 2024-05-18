package com.demonstration.study.enums;

public enum Season {
	WINTER(1), SPRING(2), SUMMER(3), FALL(5);
	
	private int value;
	private Season(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
}
