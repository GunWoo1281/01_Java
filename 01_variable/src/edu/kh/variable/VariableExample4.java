package edu.kh.variable;

public class VariableExample4 {

	public static void main(String[] args) {
		
		double temp = 3.14;
		int num = (int)temp;
		System.out.println(num);

		int iNum= 290;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		
		char ch = 'A';
		System.out.println((int)ch);
		
		int iNum3=44085;
		System.out.println((char)iNum3);
		
		
		int iNum4=2147483647;
		System.out.println(iNum4+1);
	}

}
