package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
	//실습문제1
	public void practice1(){
		int people_count;
		int candy_count;		
		
		System.out.print("인원 수 : ");
		people_count=sc.nextInt();
		System.out.print("사탕 개수 : ");
		candy_count=sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + candy_count/people_count);
		System.out.println("남는 사탕 개수 : " + candy_count%people_count);
	}
	
	//실습 문제2
	public void practice2(){
		String name;
		int grade;
		int class_num;
		int num;
		String sex;
		float score;
		
		System.out.print("이름 : ");
		name=sc.next();
		System.out.print("학년(정수만) : ");
		grade=sc.nextInt();
		System.out.print("반(정수만) : ");
		class_num=sc.nextInt();
		System.out.print("번호(정수만) : ");
		num=sc.nextInt();
		System.out.print("성별(남학생/여학생) : ");
		sex=sc.next();
		System.out.print("성적(소수점 아래 둘째 자리까지 : ");
		score=sc.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, class_num, num, name, sex, score);
	}
	
	//실습 문제3
	public void practice3(){
		int kr;
		int en;
		int math;
		float average;
		
		System.out.print("국어 : ");
		kr=sc.nextInt();
		System.out.print("영어 : ");
		en=sc.nextInt();
		System.out.print("수학 : ");
		math=sc.nextInt();
		
		average=(kr+en+math)/3f;
		
		System.out.println("합계 : " + (kr+en+math));
		System.out.printf("평균 : %.2f", average);
	}
}
