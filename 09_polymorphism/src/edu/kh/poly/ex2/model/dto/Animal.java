package edu.kh.poly.ex2.model.dto;

public abstract class Animal {

	private String type;
	private String eatType;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	public abstract void eat();
	public abstract void breathe();
	public abstract void move();
	
	public void ex() {
		System.out.println("이 메소드는 평범한 메소드 입니다.");
	}
	
	@Override
	public String toString() {
		return type + " / " + eatType;
	}
}
