package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	
	private Scanner sc = new Scanner(System.in);
	
	private Member[] memberArr = new Member[5];
	
	private Member loginMember = null;
	
	
	public MemberService() {
		memberArr[0] = new Member("user01","pass01","홍길동",30,"서울");
		memberArr[1] = new Member("user02","pass02","계보린",25,"경기");
		memberArr[2] = new Member("user03","pass03","고길동",45,"강원");
	}

	public void displayMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("\n======회원 관리 프로그램 v2======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
				case 1 : System.out.println(signUp()); break;
				case 2: System.out.println(login()); break;
				case 3: System.out.println(selectMember()); break;
				case 4: 
						int rusult = updateMember();
						if(rusult==-1) {
							System.out.println("로그인 후 이용바람");
						}
						else if(rusult==1) {
							System.out.println("회원 정보가 수정되었습니다! :)");
						}
						else {
							System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
						}
					break;
				case 5: searchRegion(); break;
				case 0 : System.out.println("프로그램 종료.."); break;
				default : System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호만 입력해주세요."); break;
			}
		}while(menuNum!=0);
	}
	
	public int emptyIndex() {
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i]==null) {
				return i;
			}
		}
		return -1;
	}
	
	public String signUp() {
		System.out.println("\n=========회원 가입=========");

		int index = emptyIndex();
		if(index==-1) {
			return "회원가입 불가. 사유 : 인원수 초과";
		}
		else {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("패스워드 : ");
			String pw = sc.next();
			System.out.print("패스워드 확인 : ");
			String pwCheck = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("지역 : ");
			String region = sc.next();
	
			if(pw!=pwCheck) {
				return "비밀번호가 일치 하지 않습니다";
			}
			
			memberArr[index] = new Member(id, pw, name, age, region);	

			return "회원가입 완료";
		}
	}
	
	public String login() {
		System.out.println("\n=========로그인=========");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String pw = sc.next();
		
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] != null) {
				if(memberArr[i].getMemberId().equals(id) && memberArr[i].getMemberPw().equals(pw)) {
					loginMember=memberArr[i];
					break;
				}
			}
		}
		
		if(loginMember==null) {
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
		}
		
		return "로그인 성공";	
	}
	
	public String selectMember() {
		System.out.println("\n=========회원 정보 조회=========");

		if(loginMember==null) {
			return "로그인 후 이용바람";
		}
		return loginMember.toString();
	}
	
	public int updateMember() {
		System.out.println("\n=========회원 정보 수정=========");
		
		if(loginMember==null) {
			return -1;
		}
		
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		System.out.print("수정할 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("수정할 지역 입력 : ");
		String region = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		
		if (!loginMember.getMemberPw().equals(pw)) {
			return 0;
		}
		else {
			loginMember.setMemberName(name);
			loginMember.setMemberAge(age);
			loginMember.setRegion(region);
			return 1;
		}
	}
	
	public void searchRegion(){
		System.out.println("\n=========회원 검색(지역)=========");
		System.out.println("검색할지역을 입력하세요 : ");
		String inputRegion = sc.next();
	
		boolean flag = true;
		
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] == null) {
				break;
			}
			else {
				if(memberArr[i].getRegion().equals(inputRegion)) {
					System.out.printf("아이디 : %s, 이름 : %s\n", memberArr[i].getMemberId(), memberArr[i].getMemberName());
					flag = false;
				}
			}
		}
		
		if(flag) {
			System.out.println("입력하신 지역과 일치하는 회원이 없습니다.");
		}
	}
}
