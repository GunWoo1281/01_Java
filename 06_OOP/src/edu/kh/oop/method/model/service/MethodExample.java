package edu.kh.oop.method.model.service;

public class MethodExample {

	public void method1() {
		int result = method2(3,5);
		System.out.println(result);
	}
	
	public int method2(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
