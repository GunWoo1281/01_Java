package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService /* extends Student */{
	public void ex1() {
		Student std = new Student();
		
		/*
		 * System.out.println(std.v1); 
		 * System.out.println(std.v2);
		 * System.out.println(std.v3); 
		 * System.out.println(std.v4);
		 */

		
		System.out.println(std.v1); 
		/*
		 * System.out.println(std.v2); 
		 * System.out.println(std.v3);
		 * System.out.println(std.v4);
		 */
		
	}
	
	public void ex2() {
		Student std1= new Student();
		Student std2= new Student();
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		System.out.println(Student.schoolName);
	}
	
	public void ex3() {
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
	
		User u2 = new User();
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
	
		User u3 = new User("test3","password1234");
	
		System.out.println("===============");
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
	
	}
	
	public void ex4() {
		User u1 = new User();
		User u2 = new User("user02","pass02");
		User u3 = new User("user03","pass03","김길동",22,'남');
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge(), u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge(), u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge(), u3.getUserGender());
	}
}
