package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	List<Animal> animals = new ArrayList<Animal>();

	Scanner sc = new Scanner(System.in);

	public Zoo() {
		// TODO Auto-generated constructor stub
	}
	
	public void showAniamls() {
		System.out.println("동물들의 울음소리를 들어보세요:");
		for(Animal animals : animals) {
			animals.sound();
		}
	}
	
	public void displayMenu() {
		int answer = 0;
		
		do {
			try {
				System.out.println("****** KH 동물원 ******");
				System.out.println("원하는 작업을 선택하세요 : ");
				System.out.println("1. 동물들의 울음소리 듣기");
				System.out.println("2. 종료");
				System.out.print("선택 : ");
				
				answer = sc.nextInt();
			
				switch(answer) {
					case 1 : this.showAniamls(); break;
					case 2 : System.out.println("프로그램을 종료합니다."); break;
					default : System.out.println("메뉴안의 숫자만 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				sc.nextLine();
			}
		}while(answer != 2);
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
}
