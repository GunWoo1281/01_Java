package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public void ex1() {
	int num1=5;
	
		while(num1!=0) {
			System.out.println();
			System.out.println("=====메뉴 선택=====");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쫄면");
			System.out.println("4. 순대");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			
			num1 = sc.nextInt();
			switch(num1) {
				case 1 : System.out.println("떡볶이을 주문했다"); break;
				case 2 : System.out.println("김밥을 주문했다"); break;
				case 3 : System.out.println("쫄면을 주문했다"); break;
				case 4 : System.out.println("순대를 주문했다"); break;
				default : System.out.println("프로그램을 종료합니다."); break;
			}
		}
	}
	
	public void ex2() {
		int num1 = 0;
		int total = 0;
		
		do {
			System.out.print("정수 입력 : ");
			num1 = sc.nextInt();
			total += num1;
		}while(num1!=0);
		System.out.println("총합 : " + total);
	}
}
