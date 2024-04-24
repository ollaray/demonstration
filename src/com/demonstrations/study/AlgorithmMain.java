package com.demonstrations.study;

public class AlgorithmMain {

	public static void main(String[] args) {
		//ComplexAlgorithm ca = new DummyAlgorithm();
		ComplexAlgorithm ca = new RealAlgorithm();
		System.out.println(ca.complexAlgorithm(10, 40));
	}
}
