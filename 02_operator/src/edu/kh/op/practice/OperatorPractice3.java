package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int price;
		boolean membership;
		int discount_price;
	
		System.out.print("가격을 입력 하세요 : ");
		price = sc.nextInt();
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		membership = sc.nextBoolean();
		if(membership) {
			discount_price = price -= price/10;
			System.out.print("할인을 포함한 최종금액 : " + discount_price);
		}
		else {
			discount_price = price -= price/20;
			System.out.print("할인을 포함한 최종금액 : " + discount_price);
		}
	}
	
	public void practice2() {
		int amount;
		int sinsa;
		int sejong;
		int leehwang;
		int ee;
		
		System.out.print("출금할 금액 입력 : ");
		amount = sc.nextInt();
		
		sinsa = amount / 50000;
		amount %= 50000;
		sejong = amount / 10000;
		amount %= 10000;
		leehwang = amount / 5000;
		amount %= 5000;
		ee = amount / 1000;
		
		System.out.println("50000원 : " + sinsa);
		System.out.println("10000원 : " + sejong);
		System.out.println("5000원 : " + leehwang);
		System.out.println("1000원 : " + ee);
	}
	
	public void practice3() {
		int first_num;
		int second_num;
		System.out.print("첫 번째 수 : ");
		first_num = sc.nextInt();
		System.out.print("두 번째 수 : ");
		second_num = sc.nextInt();
		
		System.out.print( first_num%second_num == 0 ? "배수입니다" : "배수가 아닙니다");
	}
}
