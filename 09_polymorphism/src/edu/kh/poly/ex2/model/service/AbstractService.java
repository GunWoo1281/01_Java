package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {

	public void ex1() {
		Animal a1 = new Person("인간","잡식","홍길동");
		Animal a2 = new Fish("어류","잡식");
		
		a1.breathe();
		a1.move();
		a1.eat();
		System.out.println(a1.toString());
		
		
		System.out.println("------------------");
		
		a2.breathe();
		a2.move();
		a2.eat();
		System.out.println(a2.toString());
		
	}

}
