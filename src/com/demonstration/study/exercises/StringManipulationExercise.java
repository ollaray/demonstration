package com.demonstration.study.exercises;

public class StringManipulationExercise {
	public String str;
	
	public StringManipulationExercise(String str) {
		this.str = str;
	}
	
	public boolean isHexadecimalChar(char ch) {
		char chr = Character.toLowerCase(ch);
		return (chr >= 'a' && chr<='f');
	}
	
	public boolean isHexadecimal() {
		if(str == null || str.equals("")) {
			return false;
		}
		
		for(char ch: str.toCharArray()) {
			if(!isHexadecimalChar(ch) && !Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}
	
}
