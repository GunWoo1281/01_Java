package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	Scanner sc = new Scanner(System.in);

	//변수선언
	private Member memberInfo = null;
	private Member loginMember = null;
    
	public void displayMenu(){
		int menuNum=0;
		
		do {
			System.out.println("\n=====회원 정보 관리 프로그램=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");			
			System.out.print("메뉴입력 : ");
			menuNum=sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
				case 1 : System.out.println(signUp()); break;
				case 2 : System.out.println(login());break;
				case 3 : System.out.println(selectMember()); break;
				case 4 : 
					int result = updateMember();

					if(result == -1) {
						System.out.println("로그인 후 이용해주세요");
					}
					else if(result==1) {
						System.out.println("회원 정보가 수정 되었습니다.");
					}
					else {
						System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
					}
					break;
				case 0 : System.out.println("프로그램 종료..."); break;
				default : System.out.println("메뉴에 있는 번호만 입력하세요."); break;
			}
		} while(menuNum!=0);
	}
	
	public String signUp() {
		System.out.println("\n*********회원가입*********");

		System.out.print("아이디 : ");
		String memberid=sc.next();
		System.out.print("패스워드 : ");
		String memberPw=sc.next();
		System.out.print("패스워드 확인 : ");
		String memberPwCheck=sc.next();
		
		
		if(memberPw.equals(memberPwCheck)) {
			System.out.print("이름 : ");
			String memberName=sc.next();
			System.out.print("나이 : ");
			int age=sc.nextInt();
			
			memberInfo = new Member(memberid, memberPw, memberName, age);
			
			return "가입 완료";
		}
		return "회원 가입 실패 (비밀번호 불일치)";
	}
	
	public String login() {
		System.out.println("\n*********로그인*********");
		if(memberInfo==null) {
			return "회원 가입부터 진행해주세요.";
		}
		System.out.print("아이디 : ");
		String memberid=sc.next();
		System.out.print("패스워드 : ");
		String memberPw=sc.next();
		
		if(memberInfo.getMemberId().equals(memberid) && memberInfo.getMemberPw().equals(memberPw)) {
			loginMember = memberInfo;
			
			return memberInfo.getMemberName()+"님 환영합니다.";
		}
		return "아이디 또는 비밀번호 불일치";
	}
		
	public String selectMember() {
		System.out.println("\n*********회원 정보 조회*********");
		if(loginMember==null) {
			return "로그인 후 이용해주세요.";
		}
		
		String str = "이름 : " + memberInfo.getMemberName();
		str += "\n아이디 : " + memberInfo.getMemberId();
		str += "\n나이 : " + memberInfo.getMemberAge();
		return str;
	}
	
	public int updateMember() {
		System.out.println("\n*********회원 정보 수정*********");
		
		if(loginMember==null) {
			return -1;
		}
		

		System.out.print("수정할 이름 : ");
		String memberName=sc.next();
		System.out.print("수정할 나이 : ");
		int age=sc.nextInt();
		System.out.print("패스워드 확인 : ");
		String memberPw=sc.next();
		
		if(memberPw.equals(memberInfo.getMemberPw())) {
			memberInfo.setMemberName(memberName);
			memberInfo.setMemberAge(age);
			
			return 1;
		}
		return 0;
	}
}
