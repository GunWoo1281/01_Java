package com.hw1.run;

import java.util.ArrayList;
import java.util.Arrays;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> f = new ArrayList<Friend>();
		f.addAll(Arrays.asList(
			    new Friend("짱구"), new Friend("철수"),
			    new Friend("유리"), new Friend("훈이"),
			    new Friend("맹구")
			));
		
		System.out.println((f.get((int) (Math.random()*5)).getName()+"가 떡잎방범대 대장이다!"));
	}

}
