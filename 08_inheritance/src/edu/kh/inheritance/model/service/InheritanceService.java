package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {
	public void ex1() {
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		System.out.println(p.toString());
		
		Student std = new Student();
		std.setName("빡빡이");
		std.setAge(19);
		std.setNationality("대한민국");
		std.setGrade(1);
		std.setClassroom(3);
		System.out.println(std.toString());
		System.out.println();
		
		Student std2 = new Student("홍길순", 20, "미국", 1, 3);
		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		System.out.println(std2.getNationality());
		System.out.println(std2.getGrade());
		System.out.println(std2.getClassroom());
		System.out.println();		
		
		Employee em = new Employee("김노동", 30, "한국", "KH정보교육원");
		System.out.println(em.getName());
		System.out.println(em.getAge());
		System.out.println(em.getNationality());
		System.out.println(em.getCompany());
		
	}
	
	public void ex2() {
		Student std = new Student();
		Employee em = new Employee();
		
		std.move();
		em.move();
	}
	
	public void ex3() {
		Person p = new Person("김철수",17,"한국");
		System.out.println(p);
		
		Student std = new Student("강호동",18,"미국",2,6);
		System.out.println(std);
		
		Employee em = new Employee("김노동", 36, "한국", "샘송");
		System.out.println(em);
	}
}
