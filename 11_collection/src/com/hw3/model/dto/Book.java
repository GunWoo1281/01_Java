package com.hw3.model.dto;

public class Book {
	private int num;
	private String name;
	private String writer;
	private int price;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int num, String name, String writer, int price, String publisher) {
		super();
		this.num = num;
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "\n" + num + "번 도서 : [도서제목 : " + name + " / 도서저자 : " + writer + " / 도서가격 : " + price + " / 출판사 : "
				+ publisher + "]";
	}
	
}
