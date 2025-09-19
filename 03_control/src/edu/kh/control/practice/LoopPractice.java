package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		int num1 = 0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		
		if(num1<1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		}
		else {
			for(int i = 1; i<num1+1; i++) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	public void practice2(){
		int num1 = 0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		
		for(int i = num1; i>0; i--) {
			System.out.printf("%d ", i);
		}
	}
	
	public void practice3(){
		int num1 = 0;
		int total = 0;
		String result;
		System.out.print("정수를 하나 입력하세요 : ");
		num1 = sc.nextInt();
		
		for(int i = 1; i<num1+1; i++) {
			total += i;
			if(i==num1) {
				System.out.printf ("%d = %d" , i, total);
			}
			else {
				System.out.printf ("%d + " , i);
			}
		}
	}
	
	public void practice4(){
		int num1 = 0;
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		int num2 = 0;
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		if(num1 <=0 || num2 <=0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			if(num1<num2) {
				for(int i=num1; i<num2+1; i++) {
					System.out.print(i+" ");
				}
			}
			else {
				for(int i=num2; i<num1+1; i++) {
					System.out.print(i+" ");
				}
			}
		}
	}
	
	public void practice5(){
		int num1 = 0;
		System.out.print("숫자 : ");
		num1 = sc.nextInt();
		
		System.out.println("===== " + num1 + "단 =====");
		for(int i=1; i<10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1*i);
		}
	}
	
	public void practice6(){
		int num1 = 0;
		System.out.print("숫자 : ");
		num1 = sc.nextInt();

		if(num1<2 || num1 > 10) {
			System.out.println("2~9사이 숫자만 입력해주세요.");
		}
		else {
			for(int j=num1; j<10; j++) {
				System.out.println("===== " + num1 + "단 =====");
				for(int i=1; i<10; i++) {
					System.out.println(num1 + " * " + i + " = " + num1*i);
				}
				num1++;
			}
		}
	}
	
	public void practice7(){
		int num1 = 0;
		int cnt = 0;
		System.out.print("자연수 하나를 입력하세요 : ");
		num1 = sc.nextInt();
		
		for(int i=1; i<num1+1; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
			
			if (i%2==0 && i%3==0) {
				cnt+=1;
			}
		}
		System.out.println();
		System.out.println("count : " + cnt);
	}
}
