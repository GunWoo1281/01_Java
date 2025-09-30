package edu.kh.poly.ex2.model.service;

public interface Calculator {
	public static final double PI=3.14;
	static final int MAX_NUM = 10;
	public int MIN_NUM = -10;
	int ZERO = 0;
	
	public abstract int plus(int num1, int num2);
	int minus(int num1, int num2);
	public int multiple(int num1, int num2);
	public abstract int divide(int num1, int num2);
	
}
