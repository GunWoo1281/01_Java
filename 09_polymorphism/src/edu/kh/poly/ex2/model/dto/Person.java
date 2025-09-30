package edu.kh.poly.ex2.model.dto;

public class Person extends Animal{
	
	private String name;
	
	public Person() {
		
	}
	
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("숟가락, 젓가락 등 도구로 밥을 먹는다.");
		
	}

	@Override
	public void breathe() {
		System.out.println("코와 입으로 숨쉰다.");
	}

	@Override
	public void move() {
		System.out.println("두발로 걷는다.");
	}

	@Override
	public String toString() {
		return super.toString() + " / " + name;
	}
}
