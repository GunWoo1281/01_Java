package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		int num1;
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num1 = sc.nextInt();
		
		if(num1>=0) {
			if(num1%2==0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice2(){
		int kr;
		int math;
		int en;
		double average;
		
		System.out.print("국어점수 : ");
		kr = sc.nextInt();
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		System.out.print("영어점수 : ");
		en = sc.nextInt();
		
		average = (kr + math + en)/3;
		
		if ((kr >= 40 && math >= 40 && en >= 40)&& average >= 60) {
			System.out.println("국어 : " + kr);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + en);
			System.out.println("합계 : " + (kr+math+en));
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice3(){
		int month;

		System.out.print("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1, 3, 5, 7, 9, 11 : 
			System.out.printf("%d월은 31일까지 있습니다." , month); break;
		case 4, 6, 8, 10, 12:
			System.out.printf("%d월은 30일까지 있습니다." , month); break;
		case 2 : 
			System.out.printf("%d월은 28일까지 있습니다." , month); break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.", month); break;
		}
	}
	
	public void practice4(){
		double height;
		double weight;
		double bmi;
		
		System.out.print("키(m)를 입력해 주세요 : ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		bmi = weight/(height*height);
		
		if(bmi >= 30) {
			System.out.println("과체중");
		}
		else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		}
		else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}
		else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		}
		else if(bmi<18.5) {
			System.out.println("저체중");
		}
		else {
			System.out.println("에러입니다.");
		}
	}
	
	public void practice5(){
		double middle;
		double last;
		double quiz;
		int daily;
		double total;
		
		System.out.print("중간 고사 점수 : ");
		middle = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		last = sc.nextDouble();
		System.out.print("과제 점수 : ");
		quiz = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		daily = sc.nextInt();
		
		if(daily < 15 ) {
			System.out.println("================= 결과 =================");
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", daily);
		}
		else {
			total= (middle/5)+(last/10*3)+(quiz/10*3)+daily;
			System.out.println("================= 결과 =================");
			System.out.println("중간 고사 점수(20) : " + (middle/5));
			System.out.println("기말 고사 점수(30) : " + (last/10*3));
			System.out.println("과제 점수	(30) : " + (quiz/10*3));
			System.out.println("출석 점수	(20) : " + (double)daily);
			System.out.println("총점 : " + total);
			if(total>70) {
				System.out.println("PASS");
			}
			else {
				System.out.println("Fail [점수 미달]");
			}
		}
	}
}
