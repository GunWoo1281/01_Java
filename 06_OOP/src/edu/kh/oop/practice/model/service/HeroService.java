package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	//변수선언
	private Hero hero1 = null;
	private Hero hero2 = null;

	public void practice() {			
		hero1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
		System.out.println(hero1);
		hero2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);
		System.out.println(hero2);
		
		System.out.println("==========이구역짱 시점==========");
			hero1.attack(100);
			hero1.attack(50.5);
			hero1.attack(49.5);
			hero1.dash();
			hero1.dash();
			hero1.dash();
			System.out.println(hero1);
			
		System.out.println("==========Zi존위자드 시점==========");
			hero2.attack(300);
			hero2.dash();
			hero2.attack(300);
			hero2.attack(300);
			System.out.println(hero2);
	}
}
