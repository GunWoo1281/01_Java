package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample {
	public void ex1() {
		System.out.println("잉");
	}
	public void ex2() {
		System.out.println("잉2");
	}
	
	public void testEx1() {
		int inum1 =10;
		int inum2 =10;

		inum1++;
		inum2--;
		System.out.println("inum1 : " + inum1);
		System.out.println("inum2 : " + inum2);
		
		int temp1 = 5;
		System.out.println(++temp1 + 5);
		
		int temp2 = 3;
		System.out.println(temp2-- + 2);
		System.out.println(temp2);
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		System.out.printf("%d / %d / %d" , a , b, c);
	}
	
	public void testEx2() {
		int a = 10;
		int b = 20;
		
		System.out.println((a==b)==false);
		
		int c = 4;
		int d = 5;
		
		System.out.println((++c != d) == (--c != d));
		
		System.out.println(100>99);
		System.out.println(100 >= 100);
		System.out.println(99<64);
		System.out.println(100<=99);
	}
	
	public void testEx3() {
		int a = 101;
		System.out.println((a>=100) && (a%2==0));
		
		int b = 5;
		System.out.println(b>0 && b<11);
		
		int c = 10;
		System.out.println(c>10 || (c%2==0));
	}
	
	public void testEx4() {
		int num = 30;
		System.out.println(num > 30 ? "num은 30보다 큰수 이다" : "num은 30 이하의 수이다");
	}
	
	public void testEx5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println(num1 >= 0 ? "양수입니다." : "음수입니다.");
	}
	
	public void testEx6() {
		int a = 10;
		a+=10;
		int b = 20;
		b-=10;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 5;
		System.out.println(~c);
	}
}
