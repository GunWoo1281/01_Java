package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		
		int arr2[];
		int[] arr3;

		int arr[] = new int[3];
		System.out.println(arr);
		
		arr[0]=10;
		arr[1]=50;
		arr[2]=100;
		//arr[3]=100; 런타임 에러 발생
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
		System.err.println(Arrays.toString(arr));
	}
	
	public void ex2() {
		int arr[] = new int[4];
	
		for(int i = 0; i<arr.length; i++) {
			arr[i]=i*100;
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i,arr[i]);
		}
		
		int arr2[] = {1,2,3,4,5};
	}
	
	public void ex3() {
		double height[] = new double[5];
		double total=0;
		for(int i=0; i<height.length; i++) {
			System.out.printf("%d번 키 입력 : ", (i+1));
			height[i]=sc.nextDouble();
			total+=height[i];
		}
		System.out.print("평균 : " + total/height.length + "cm");
	}
	
	public void ex4() {
		System.out.print("입력 받을 인원 수 : ");
		int people = sc.nextInt();
		int score = 0;
		int total = 0;

		int arr[] = new int[people];
		for(int i=0; i<people; i++) {
			System.out.printf("%d번 점수 입력 : ", i+1);
			score = sc.nextInt();
			arr[i] = score;
			total += score;
		}
		
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.1f" , (double)total/people);
	}
	
	public void ex5() {
		String arr[] = {"김밥","서브웨이","햄버거","국밥","짜장면","햇반"};
		System.out.println(arr[(int)(Math.random()*6)]);
		
	}
	
	public void ex6() {
		int num = 0;
		int arr[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		boolean a = true;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i]) {
				System.out.println(i+"번째 인덱스에 존재");
				a=false;
			}
		}
		
		if(a) {
			System.out.println("존재하지않음");
		}
	}
	
	public void ex7() {
		String word = "";
		String arr[] = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		boolean a = true;
		
		System.out.print("과일 입력 : ");
		word = sc.next();
		for(int i=0; i<arr.length; i++) {
			if(word.equals(arr[i])) {
				System.out.println(i+"번째 인덱스에 존재");
				a=false;
			}
		}
		
		if(a) {
			System.out.println("존재하지않음");
		}
	}
	
	public void ex8() {
		String word = "";
		char ch;
		char search_word;
		boolean a = true;
		int count=0;
		
		System.out.print("문자열 입력 : ");
		word = sc.nextLine();

		char arr[] = new char[word.length()];
		
		for(int i = 0; i<word.length(); i++) {
			ch = word.charAt(i);
			arr[i]=ch;
		}
		
		System.out.print("검색할 문자 입력 : ");
		search_word = sc.next().charAt(0);
		
		for(int j = 0; j<arr.length; j++) {
			if(search_word==arr[j]) {
				count++;
				a=false;
			}
		}
		
		if(a) {
			System.out.println("존재하지 않음");
		}
		else {
			System.out.println("총" + count + "개 있음.");
		}
	}
}
