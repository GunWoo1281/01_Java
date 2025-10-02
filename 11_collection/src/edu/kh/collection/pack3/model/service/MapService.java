package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	
	public void ex1() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
	
		//key가 동일한 경우, 마지막 값을 대입
		map.put(1, "유건우");
		
		//무관함
		map.put(7, "최길동");
		
		System.out.println(map);
	}
	
	public void ex2() {
		Member member = new Member();
		member.setId("user01");
		member.setPw("pass01");
		member.setAge(20);
		
		System.out.println(member);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		System.out.println(map);
		System.out.println(map.get("id"));
		
		Set<String> set = map.keySet();		
		System.out.println(set);
		
		//해당 키의 값들을 출력
		for(String key : set) {
			System.out.print(map.get(key)+" ");
		}
	}
	
	public void ex3() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		for(int i=0; i<10; i++) {
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			map.put("id", "user0"+i);
			map.put("pw", "pass0"+i);
			list.add(map);
		}

		System.out.println(list);
		
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
	}
}
