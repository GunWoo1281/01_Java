package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	Scanner sc = new Scanner(System.in);
	
	void pratice1(){
		int age;

		System.out.print("당신의 나이는? : ");
		age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("저는 성인 입니다");
		}
		else {
			System.out.println("저는 미성년 입니다");
		}
		
		
		if(age>12 && age<=19) {
			System.out.println("청소년 입니까? true");
		}
		else {
			System.out.println("청소년 입니까? false");
		}
		
		
		if(age>64 && age<=12) {
			System.out.println("노인이거나 어린이 입니까? true");
		}
		else {
			System.out.println("노인이거나 어린이 입니까? false");
		}
	}

}
