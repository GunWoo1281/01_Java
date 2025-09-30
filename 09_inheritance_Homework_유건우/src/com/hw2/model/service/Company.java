package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	private int employeeCount;
	
	Employee[] employees;

	//임시로 배열크기 10으로 지정
	
	public Company(int size) {
		employeeCount=0;
		employees = new Employee[size];
	}
	
	@Override
	public void addPerson(Person person) {
		for(int i=0; i<employees.length; i++) {
			if (employees[i] == null) {
				employees[i]=(Employee) person;
                System.out.println("직원이 추가되었습니다 - "+employees[i].getInfo());
                return;
			}
		}
		
        System.out.println("인원이 모두 충원되었습니다.");
	}

	@Override
	public void removePerson(String id) {
		for(int i=0; i<employees.length; i++) {
			if(employees[i].getId().equals(id)) {
				System.out.println("직원이 삭제되었습니다 - "+employees[i].getInfo());
				employees[i]=null;
				return;
			}
		}
		
        System.out.println("해당 id를 가진 직원을 찾을 수 없습니다.");
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
		for(int i=0; i<employees.length; i++) {
			if(employees[i] == null) {
				continue;
			}
			System.out.println(employees[i].getInfo());
		}
	}

}
