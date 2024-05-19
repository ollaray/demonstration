package com.demonstration.study.modularization;

import java.util.List;

public class MySortingUtil {
	public List<String> sort(List<String> names){
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
}
