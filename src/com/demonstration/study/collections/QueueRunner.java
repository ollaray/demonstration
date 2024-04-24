package com.demonstration.study.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//let's create a comparator to adjust the custom processing order
class StringLengthComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o2.length(), o1.length());
	}
}

public class QueueRunner {

	public static void main(String[] args) {
		//It is using normal order FIFO to process
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.offer("Banana");
		queue.addAll(List.of("Apple","Orange","Tangerine","Cashew"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
