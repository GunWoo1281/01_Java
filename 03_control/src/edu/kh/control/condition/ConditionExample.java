package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		int num1;
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		
		if(num1 > 0 ) {
			System.out.print("양수입니다");
		}
		
		if(num1 <= 0) {
			System.out.print("양수가 아닙니다.");
		}
	}
	
	public void ex2() {
		int num1;
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		
		if(num1 != 0) {
			if(num1 % 2 == 0) {
				System.out.print("짝수입니다");
			}
			else if(num1 % 2 == 1){
				System.out.print("홀수입니다");
			}
		}
		else {
			System.out.print("0입니다");
		}
	}
	
	public void ex3() {
		int num1;
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		
		if(num1 > 0 ) {
			System.out.print("양수입니다");
		}
		else if(num1 < 0) {
			System.out.print("음수입니다.");
		}
		else {
			System.out.print("0입니다.");
		}
	}
	
	public void ex4() {
		int month;
		int temerature=0;
		String season;
		
		System.out.print("달 입력 : ");
		month = sc.nextInt();
		
		if (month == 1 || month == 2 || month == 12) {
			season="겨울";
			System.out.print("온도 입력 : ");
			temerature = sc.nextInt();
		}
		else if (month >= 3 && month <= 5) {
			season="봄";
		}
		else if (month >= 6 && month <= 8) {
			season="여름";
			System.out.print("온도 입력 : ");
			temerature = sc.nextInt();
		}
		else if (month >= 9 && month <= 11) {
			season="가을";
		}
		else {
			season="해당하는 계절이 없습니다.";
		}

		if(season.equals("겨울")) {
			if(temerature <= -15){
				season += " 한파 경보";
			}
			else if(temerature <= -12) {
				season += " 한파 주의보";
			}
		}
		else if(season.equals("여름")) {
			if(temerature >= 35){
				season += " 폭염 경보";
			}
			else if(temerature >= 33) {
				season += " 폭염 주의보";
			}
		}

		System.out.println(season);
	}
	
	public void ex5() {
		int age;
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age < 14) {
			System.out.print("어린이입니다.");
		}
		else if(age>13 || age<20) {
			System.out.print("청소년입니다.");
		}
		else if(age>19) {
			System.out.print("성인입니다.");
		}
		else {
			System.out.print("잘못된 숫자입니다.");
		}
	}
	
	public void ex6() {
		int score;
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못 입력하셨습니다");
		}
		else if(score>=90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
	
	public void ex7() {
		int age;
		double height;
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age<0 || age>100) {
			System.out.println("잘못 입력하셨습니다");
		}
		else {
			System.out.print("키 입력 : ");
			height = sc.nextDouble();
			
			if(age<12) System.out.println("적정 연령이 아닙니다");
			
			else if(height < 140) System.out.println("적정 키가 아닙니다");
			
			else System.out.println("탑승 가능");
		}
	}
	
	public void ex8() {
		int age;
		double height;
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age<0 || age>100) {
			System.out.println("나이를 잘못 입력하셨습니다");
		}
		else {
			System.out.print("키 입력 : ");
			height = sc.nextDouble();
			
			if(height<0 || height>250) {
				System.out.println("키를 잘못 입력하셨습니다");
			}
			else {
				if (age >= 12 && height<140) System.out.println("나이는 적절하나, 키가 적절치 않음");
				else if(age < 12 && height>=140) System.out.println("키는 적절하나, 나이가 적절치 않음");
				else if(age < 12 && height<140)	System.out.println("나이와 키 모두 적절치 않음");				
				else System.out.println("탑승 가능!!!");
			}
		}
	}
	
	public void ex9() {
		int yoil;
		String day;
		System.out.print("요일 입력 : ");
		yoil = sc.nextInt();
		
		switch(yoil) {
		case 1:
			day = "월요일"; break;
		case 2:
			day = "화요일"; break;
		case 3:
			day = "수요일"; break;
		case 4:
			day = "목요일"; break;
		case 5:
			day = "금요일"; break;
		case 6:
			day = "토요일"; break;
		case 7:
			day = "일요일"; break;
		default :
			day = "잘못된 숫자입니다."; break;
		}
		
		System.out.println(day);
	}
	
	public void ex10() {
		int score;
		System.out.print("정수 입력 : ");
		score = sc.nextInt();

		switch(score/10) {
			case 10, 9 :
				System.out.println("학점 A"); break;
			case 8 :
				System.out.println("학점 B"); break;
			case 7 :
				System.out.println("학점 C"); break;
			case 6 :
				System.out.println("학점 D"); break;
			case 5,4,3,2,1,0 :
				System.out.println("학점 F"); break;
			default :
				System.out.println("잘못된 숫자 입니다."); break;
		}
	}
}
