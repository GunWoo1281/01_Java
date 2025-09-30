package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		BookService bs = new BookService();
		bs.practice();
		
		System.out.println();
		HeroService he = new HeroService();
		he.practice();
	}

}
