package edu.kh.inheritance.model.dto;

public class Student extends Person{
	
	private int grade;
	private int classroom;

	public Student() {
		
	}

	//name age nationality는 기본값으로 받겠다 ㅇㅇ;
	public Student(int grade, int classroom) {
		super();
		this.grade = grade;
		this.classroom = classroom;
	}
	
	public Student(String name, int age, String nationality, int grade, int classroom) {
		super(name, age, nationality);
		this.grade = grade;
		this.classroom = classroom;
	}
	
	/*
	 * public Student(String name, int age, String nationality, int grade, int
	 * classroom) { super(); this.grade = grade; this.classroom = classroom; }
	 * 부모 필드가 초기화되지 않을 수 있음. (기본 생성자가 따로 로직이 있으면 그걸 따름)
	 */

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classroom;
	}
	
	
}
