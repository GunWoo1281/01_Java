package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

public class AbstractionService {

	public void ex1() {
		People p1 = new People();
		People ygw = new People();
		/*
		 * p1.name="홍길동"; p1.gender='남'; p1.pNo="123456-1234567";
		 * p1.address="서울시 중구 남대문로 120"; p1.phone="010-1234-1234"; p1.age=20;
		 * 
		 * p1.tax(); p1.vote();
		 * 
		 * System.out.println("p1의 name : "+p1.name);
		 * System.out.println("p1의 gender : "+p1.gender);
		 * System.out.println("p1의 pNo : "+p1.pNo);
		 * System.out.println("p1의 address : "+p1.address);
		 * System.out.println("p1의 phone : "+p1.phone);
		 * System.out.println("p1의 age : "+p1.age);
		 */
		
		p1.setName("홍길동");
		System.out.println(p1.getName());
		p1.setGender('남');
		System.out.println(p1.getGender());
		p1.setpNo("123456-1234567");
		System.out.println(p1.getpNo());
		p1.setPhone("010-1234-1234");
		System.out.println(p1.getPhone());
		p1.setAddress("서울시 중구 남대문로 120");
		System.out.println(p1.getAddress());
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		System.out.println("=================");
		ygw.setName("유건우");
		System.out.println(ygw.getName());
	}
	
}
