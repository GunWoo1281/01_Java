package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		Book b = new Book();
		System.out.println(b.toString());
		System.out.println(new Book("자바의정석",30000,0.2,"남궁성").toString());
		System.out.println("=============================");
		System.out.println("수정된 결과 확인");
		b.setTitle("C언어");
		b.setPrice(30000);
		b.setDiscountRate(0.1);
		b.setAuthor("홍길동");
		System.out.println(b.toString());
		System.out.println("=============================");
		
		System.out.println("도서명 = " + b.getTitle());
		b.setPrice((int) (30000-30000*0.1));
		System.out.println("할인된 가격 = " + b.getPrice() + "원");
	
		b.setTitle("자바의정석");
		System.out.println("도서명 = " + b.getTitle());
		b.setPrice((int) (30000-30000*0.2));
		System.out.println("할인된 가격 = " + b.getPrice() + "원");
	
	}
}
