package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void Example1() {
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
	}
	
	public void Example2() {
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}
		
		System.out.println("\n================");
		
		for(int a = 'A'; a<='Z'; a++) {
			System.out.print((char)a);
		}
	}
	
	public void Example3() {
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		
		for(int i = 1; i<a+1; i++) {
			System.out.println(i);
		}
	}
	
	public void Example4() {
		int total = 0;
		for(int i=1; i<6; i++) {
			System.out.printf("입력 %d : ", i);
			total += sc.nextInt();
		}
		System.out.println("합계 : " + total);
	}
	
	public void Example5() {
		int a = 0;
		System.out.print("숫자 입력 : ");
		a = sc.nextInt();
		for(int i = 1; i<21; i++) {
			if(i%a==0) {
				System.out.print("("+ i + ") ");
			}
			else {
				System.out.print(i+" ");
			}
		}
	}
	
	public void Example6() {
		int a = 0;
		System.out.print("단 입력 : ");
		a = sc.nextInt();
		
		if (a<10 && a>1) {
			for(int i=1; i<10; i++) {
				System.out.println(a+"X"+i+"="+a*i);
			}
		}
		else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void Example7() {
		int a = 0;
		int cnt = 0;
		int total = 0;
		System.out.print("배수 입력 : ");
		a = sc.nextInt();
		
		for(int i = 1; i<21; i++) {
			if(i%a==0) {
				cnt++;
				total += i;
				System.out.print(i+" ");
			}
		}
		System.out.println(": " + cnt+"개");
		System.out.printf("%d의 배수 합계 : %d" , a, total);
		
	}
	
	
	public void Example8() {
		for(int i=2; i<10; i++) {
			for(int j=1; j <10; j++) {
				System.out.print(i+"X"+j+"="+i*j+" ");			
			}
			System.out.println();
		}
	}
}