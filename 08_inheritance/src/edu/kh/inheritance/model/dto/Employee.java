package edu.kh.inheritance.model.dto;

public class Employee extends Person{
	
	private String company;
	
	public Employee() {
		
	}

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public void move() {
		System.out.println("난 일한다");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
	}

	@Override
	public String toString() {
		return super.toString() + " / " + company;
	}
	
	public final void onlyEmployee() {
		System.out.println("final 메소드 입니다.");
	}
	
}
