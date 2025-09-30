package edu.kh.inheritance.model.dto;

public class Person {
	
	private String name;
	private int age;
	private String nationality;
	
	public Person() {
		
	}

	public Person(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void breathe() {
		System.out.println("사람은 코나 입으로 숨을 쉴 수 있다.");
	}

	public void move() {
		System.out.println("사람은 움직일 수 있다.");
	}

	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality ;
	}
	
	
}
