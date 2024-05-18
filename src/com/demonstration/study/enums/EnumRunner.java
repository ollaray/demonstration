package com.demonstration.study.enums;

import java.util.Arrays;

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.WINTER;
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		
		System.out.println(season1.WINTER);
		System.out.println(season1.ordinal());
		System.out.println(season1.SPRING.ordinal());
		System.out.println(Arrays.toString(season.values()));
		//---------------------------------------------------
		
		System.out.println(season.SPRING.getValue());
		System.out.println(season.getValue());
		
	}

}
