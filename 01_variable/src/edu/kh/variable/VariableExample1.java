package edu.kh.variable;

public class VariableExample1 {

	public static void main(String[] args) {
		
		//2ㅠr
		System.out.println(2 * 3.141592653589793 * 10);
		//ㅠr^2
		System.out.println(3.141592653589793 * 10 * 10);
		//ㅠr^2h
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		//4ㅠr^2
		System.out.println(4 * 3.141592653589793 * 10 * 10);

		//원주율
		double pi = 3.141592653589793;
		//반지름
		int r = 10;
		//높이
		int h = 20;
		
		System.out.println();
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
	}

}
