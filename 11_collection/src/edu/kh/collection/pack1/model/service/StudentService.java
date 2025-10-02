package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {

	//<E> 제네릭
	//타입을 제한함
	//private List <int> list = new ArrayList<>();
	//ArrayList testlist = new ArrayList();
	private List<Object> testlist = new ArrayList<Object>();
	
	private List<Student> studentList = new ArrayList<Student>();
	
	private Scanner sc = new Scanner(System.in);
	
	public StudentService() {
		studentList.add(new Student("홍길동",23,"서울시 중구",'M',100));
		studentList.add(new Student("이수지",20,"경기도 안산",'F',100));
		studentList.add(new Student("강하늘",25,"서울시 강남",'M',80));
		studentList.add(new Student("오미나",24,"충북 청주시",'F',90));
		studentList.add(new Student("박주희",24,"서울시 서대문구",'F',70));
	}
	
	public void ex1() {
		testlist.add("문자열");
		testlist.add(new Scanner(System.in));
		testlist.add(100);
		testlist.add(new Object());
		
		System.out.println(testlist.get(0));
		System.out.println(testlist.get(1));
		System.out.println(testlist.get(2));
		System.out.println(testlist.get(3));
		
		for(Object e : testlist) {
			System.out.println(e);
		}
	}

	/**
	 * 메뉴 출력용 메소드
	 */
	public void displayMenu() {
		int menuNum=0;
		do {
			try {
				System.out.println("\n===================학생 관리 프로그램===================");
				System.out.println("1. 학생 정보 추가");
				System.out.println("2. 학생 정보 전체 조회");
				System.out.println("3. 학생 정보 수정");
				System.out.println("4. 학생 정보 제거");
				System.out.println("5. 이름으로 검색(완전일치)");
				System.out.println("6. 이름으로 검색(포함)");
				System.out.println("7. 나이순으로 정렬");
				System.out.println("8. 이름순으로 정렬");
				System.out.println("0. 프로그램 종료");
				menuNum = sc.nextInt();
				sc.nextLine();
				
				switch(menuNum) {
					case 1 : System.out.print(addStudent()); break;
					case 2 : selectAll(); break;
					case 3 : System.out.print(updateStudent()); break;
					case 4 : System.out.print(removeStudent()); break;
					case 5 : searchName1(); break;
					case 6 : searchName2(); break;
					case 7 : sortByAge(); break;
					case 8 : sortByName(); break;
					case 0 : System.out.println("프로그램을 종료합니다.."); return;
					default : System.out.println("메뉴에 작성된 번호만 입력하세요.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다.");
				sc.nextLine();
				menuNum=-1;
			}
		}
		while(menuNum!=0);
		
	}

	public void sortByName() {
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Student std : studentList) {
			System.out.println(std);
		}
		
	}

	public void sortByAge () {
		/* List를 정렬하는 방법
		*
		* 방법 1: Comparable 인터페이스 상속받아 compareTo() 메서드 재정의
		* Student에 Comparable 인터페이스를 상속받아
		* 오버라이딩한 compareTo()에 정의한 대로 정렬됨 (나이 오름차순, 내림차순..)
		*
		* 방법 2: Comparator 클래스에 의한 정렬 compare() 사용 (익명 내부 클래스 이용)
		*
		* 익명 내부 클래스란?
		* 이름이 없는 클래스를 즉석에서 선언해서 한 번만 사용할 목적으로
		* 작성 객체를 생성하면서 바로 구현 내용을 정의할 수 있음
		*
		* <익명 내부클래스 장점>
		* 코드 간결화(별도로 클래스를 만들지 않아도 될 때 사용)
		* 즉시 사용(한 번만 사용할 Comparator 등을 정의할 때 유용함)
		* 지역화(특정 메서드 안에서만 필요할 때)
		*/
		Collections.sort(studentList);
		for(Student std : studentList) {

			System.out.println(std);
			
		}
	}

	public String addStudent() {
		//Checked Exception (빨간줄 생기는 예외) 는 throw를 해야함 ㅇㅇ;
		
		System.out.println("\n===================학생 정보 추가===================");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사는 곳 : ");
		String region = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(studentList.add(new Student(name,age,region,gender,score))) {
			return "성공";
		}
		else {
			return "실패";
		}
		
	}

	public void selectAll() {
		System.out.println("\n===================학생 전체 조회===================");
		
		if(studentList.size()==0) {
			System.out.println("학생 정보가 없습니다.");
		}
		else {
			for(int i=0; i<studentList.size(); i++) {
				System.out.print(i+"번 : ");
				System.out.println(studentList.get(i));
			}
		}
		
	}

	public String updateStudent() {
		System.out.println("\n===================학생 정보 수정===================");
		System.out.print("수정할 인덱스 번호 입력 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다.";
		}
		if(index < 0) {
			return "음수는 입력할 수 없습니다.";
		}
	    if(index >= studentList.size()){
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		}
		else {
			System.out.print(index+"번 : ");
			System.out.println(studentList.get(index));
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("사는 곳 : ");
			String region = sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			try {
			    studentList.set(index, new Student(name, age, region, gender, score));
			    
			    return name + "의 정보가 변경되었습니다.";
			} catch (IndexOutOfBoundsException e) {
			    return "실패 (잘못된 인덱스)";
			}
		}
	}

	public String removeStudent() {
		System.out.println("\n===================학생 정보 제거===================");
		
		System.out.print("정말 삭제 하시겠습니까? (Y/N) : ");
		char answer = sc.next().toUpperCase().charAt(0);		
		
		System.out.print("삭제할 인덱스 번호 입력 : ");
		int index = sc.nextInt();
		
		if(answer=='Y') {
			if(studentList.isEmpty()) {
				return "입력된 학생정보가 없습니다.";
			}
			if(index < 0) {
				return "음수는 입력할 수 없습니다.";
			}
			if(index >= studentList.size()){
				return "범위를 넘어선 값을 입력할 수 없습니다.";
			}
			else {
				try {
					System.out.println(studentList.remove(index));

					return index+"번 데이터가 삭제되었습니다.";
				} catch (IndexOutOfBoundsException e) {
				    return "실패 (잘못된 인덱스)";
				}
			}
		}
		
		return "초기화면으로 돌아갑니다.";
	}

	public void searchName1() {
		System.out.println("\n===================이름으로 검색(완전일치)===================");
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();
		String result = "";
		
		if(studentList.isEmpty()) {
			System.out.println("입력된 학생정보가 없습니다.");
		}
		
		for(int i = 0; i<studentList.size(); i++) {
			if(studentList.get(i).getName().equals(name)) {
				System.out.println(studentList.get(i));
			}	
		}
	}

	public void searchName2() {
		System.out.println("\n===================이름으로 검색(포함)===================");
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();
		
		if(studentList.isEmpty()) {
			System.out.println("입력된 학생정보가 없습니다.");
		}
		
		for(int i = 0; i<studentList.size(); i++) {
			if(studentList.get(i).getName().contains(name)) {
				System.out.println(studentList.get(i));
			}	
		}
	}
}
