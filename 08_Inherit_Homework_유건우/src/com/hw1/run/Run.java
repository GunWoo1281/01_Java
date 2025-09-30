package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		Student[] s = new Student[3];

	    s[0] =new Student("홍길동",20, 178.2, 70, 1, "정보시스템공학과");
	    s[1] =new Student("김말똥",21, 187.3, 80, 2, "경영학과");
	    s[2] =new Student("강개순",23, 167, 45, 4, "정보통신공학과");
	    
	    for(Student a : s)
	    {
		    	System.out.println(a.information());
		    	System.out.println("------------------------");
	    }
	    

	    Employee[] e = new Employee[10];
	    int index = 0;
	    String answer = "Y";
	    while(true) {
	    		e[index] = new Employee();
	    		System.out.println("사원정보를 입력하세요.");
	    		System.out.print("이름 : ");
	    		e[index].setName(sc.next());
	    		System.out.print("나이 : ");
	    		e[index].setAge(sc.nextInt());
	    		System.out.print("신장 : ");
	    		e[index].setHeight(sc.nextDouble());
	    		System.out.print("몸무게 : ");
	    		e[index].setWeight(sc.nextDouble());
	    		System.out.print("급여 : ");
	    		e[index].setSalary(sc.nextInt());
	    		System.out.print("부서 : ");
	    		e[index].setDept(sc.next());
	    		
	    		index++;
	    		
	    		System.out.print("사원 정보를 더 입력하시겠습니까? (Y/N)");
	    		answer = sc.next();
	    		
	    		if(answer.equals("N") || answer.equals("n")) {
	    			for(int i=0; i<index; i++) {
		    			System.out.println("------------------------");
		    			System.out.println(e[i].information());
	    			}
	    			break;
	    		}
	    }
	}

}
