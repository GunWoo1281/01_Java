package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private int prisonerCount;
	
	//임시로 배열 크기 10으로 지정
	Prisoner[] prisoners;
	
	public Prison(int size) {
		prisonerCount=0;
		prisoners = new Prisoner[size];
	}
	
	@Override
	public void addPerson(Person person) {
		for(int i=0; i<prisoners.length; i++) {
			if (prisoners[i] == null) {
				prisoners[i]=(Prisoner) person;
                System.out.println("수감자가 추가되었습니다 - "+prisoners[i].getInfo());
                return;
			}
		}

        System.out.println("인원이 모두 충원되었습니다.");
	}

	@Override
	public void removePerson(String id) {
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i].getId().equals(id)) {
				System.out.println("수감자가 삭제되었습니다 - "+prisoners[i].getInfo());
				prisoners[i]=null;
				return;
			}
		}
		
        System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다.");
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단 : ");
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i] == null) {
				continue;
			}
			System.out.println(prisoners[i].getInfo());
		}
	}

}
