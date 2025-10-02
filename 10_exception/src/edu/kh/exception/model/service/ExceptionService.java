package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		int num1 = 1;
		int num2 = 1;
		
		try {
			System.out.print("숫자 1 입력 : ");
			num1 = sc.nextInt();
			System.out.print("숫자 2 입력 : ");
			num2  = sc.nextInt();
			
			if(num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			else {
				System.out.print("결과 : " + num1 / num2);
			}
			
		}
		catch(InputMismatchException ime) {
			System.out.println("정수만 입력 가능합니다.");
			ime.printStackTrace();
		}
	}
	public void ex2() {
		try {
			System.out.print("숫자 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("숫자 2 입력 : ");
			int num2  = sc.nextInt();
			try {
				System.out.print("결과 : " + num1 / num2);
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능합니다.");
		}
		
		try {
			String str = null;
			System.out.println(str.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("null은 표기할 수 없습니다.");
		}
		
	}
	
	public void ex3() {
		try {
			System.out.print("숫자 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("숫자 2 입력 : ");
			int num2  = sc.nextInt();
			System.out.print("결과 : " + num1 / num2);
		}
		catch(Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("안녕~ " + name);
		}
		catch(Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}
	}
	
	public void ex4() {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("메소드 C에서부터 발생한 예외를 ex4에서 잡아 처리함");
			e.printStackTrace();
		}
	}
	
	public void methodA() throws Exception{
		methodB();
	}
	
	public void methodB() throws IOException{
		methodC();
	}
	public void methodC() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	public void ex5() throws UserException {
		throw new UserException("에러발생");
	}
}
