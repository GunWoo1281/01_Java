package edu.kh.variable;

public class VariableExample3 {

	public static void main(String[] args) {
		
		int num1=10;
		double num2=3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1+num2));
		
		
		int i2 = 2_100_000_000;
		long l2 = 10_000_000_000l;
		
		long result = i2+l2;
		System.out.println(result);
		
		char ch3 = 'V';
		int i3 = ch3;
		
		System.out.println(i3);
	
		char ch4 ='각';
		System.out.println((int)ch4);
		
	}

}
