package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;
import edu.kh.oop.method.model.vo.Member;

public class MethodRun {

	public static void main(String[] args) {
		MethodExample me = new MethodExample();
		//me.method1();

		MemberService ms = new MemberService();
		//ms.displayMenu();
		
		Member mb = new Member("id","pw","yoo",22);
		System.out.println(mb);
	}

}

