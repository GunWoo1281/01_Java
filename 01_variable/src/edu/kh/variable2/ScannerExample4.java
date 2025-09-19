package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nextInt() 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("nextLine() 입력 : ");
		String input2 = sc.nextLine();
		
		System.out.println(input1);
		System.out.println(input2);		
	}

}
