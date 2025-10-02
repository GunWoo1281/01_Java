package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {

	//Set 은 index가 없음. 고로 중복데이터를 넣을 수 없음.
	//HashSet : 처리속도가 빠름
	//LinkedHashSet : 순서 유지
	//TreeSet : 자동정렬
	
	public void method1() {
		 Set<String> set = new HashSet<>();
		 
		 set.add("네이버");
		 set.add("카카오");
		 set.add("라인");
		 set.add("쿠팡");
		 set.add("배달의민족");
		 set.add("당근마켓");
		 set.add("토스");
		 set.add("직방");
		 set.add("야놀자");

		 System.out.println(set);
		 
		 
		//중복 테스트
		set.add("배달의민족"); 
		set.add("배달의민족"); 
		set.add("배달의민족"); 
		set.add("배달의민족"); 
		set.add("배달의민족"); 
	
		System.out.println(set);
		
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println(set);

		System.out.println("set.size()의 크기 : " + set.size());
		
		System.out.println(set.remove("배달의민족"));
		System.out.println(set);
		System.out.println(set.remove("유플러스"));
		
		System.out.println("쿠팡있는지 검사 : "+set.contains("쿠팡"));
		System.out.println("삼성있는지 검사 : "+set.contains("삼성"));
		
		set.clear();
		System.out.println(set.isEmpty());
		
	}
	
	public void method2() {
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠크다스");
		set.add("빈츠");
		set.add("포카칩");
		
		System.out.println("[Iterator 이용방법");
		Iterator<String> it = set.iterator();
		
		//hasNext : 순차접근할 요소가 있으면 true
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<String> list = new ArrayList<String>(set);

		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-===============-");
		for(String snack : set) {
			System.out.println(snack);
		}
	}
	
	public void method3() {
		/*
		 * hash 포함 컬렉션 사용시,
		 * hashCode(), equals() 오버라이딩이 필요함.
		 */
		
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여');
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
	
		for(Person p : set) {
			System.out.println(p);
		}
	
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		System.out.println(p1.equals(p2));
	}
	
	public void method4() {
		Set<Integer> set = new TreeSet<Integer>();
		Random random = new Random();
		for(int i=0; set.size()<6; i++) {
			set.add((int) (random.nextInt(100)+1));
		}
		
		System.out.println(set);
	}
}
