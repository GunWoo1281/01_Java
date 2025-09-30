package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {

		Book[] bkarr = new Book[3];
		bkarr[0]=new Novel("해리 포터","J.K. 롤링", "판타지");
		bkarr[1]=new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		bkarr[2]=new Poetry("우리들의 사랑시", "김소월", 30);
		
		bkarr[0].displayInfo();
		bkarr[1].displayInfo();
		bkarr[2].displayInfo();
		
	}

}
