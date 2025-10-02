package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Book> book = new ArrayList<Book>();
	ArrayList<Book> bookmark = new ArrayList<Book>();
	
	
	public void main_menu() {
		book.add(new Book(1111,"세이노의 가르침", "세이노",6480,"데이원"));
		book.add(new Book(2222,"문과남자의 과학공부", "유시민",15750,"돌베게"));
		book.add(new Book(3333,"역행자", "자청",17550,"웅진지식하우스"));
		book.add(new Book(4444,"꿀벌의 예언", "베르나르 베르베르",15120,"열린책들"));
		book.add(new Book(5555,"도둑맞은 집중력", "요한하리",16920,"어크로스"));
		
		int answer = 0;
		
		do {
			System.out.println("\n===도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");

				try {
				answer = sc.nextInt();
				sc.nextLine();
					switch(answer) {
						case 1 : addBook(); break;
						case 2 : selectBook(); break;
						case 3 : updateBook(); break;
						case 4 : deleteBook(); break;
						case 5 : addBookmark(); break;
						case 6 : deleteBookmark(); break;
						case 7 : selectBookmark(); break;
						case 8 : recommend_Book(); break;
						case 0 : System.out.println("프로그램을 종료합니다."); break;
						default : System.out.println("메뉴안에 있는 숫자로만 입력해주세요.");
						}
				} catch (InputMismatchException e) {
					System.out.println("숫자로 입력해주세요. \n");
					sc.nextLine();
			}
		}while(answer!=0);
	}

	public void addBook() {
		System.out.println("\n=========도서 등록=========");
		System.out.print("도서 번호 : ");
		int book_num = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 제목 : ");
		String book_title = sc.nextLine();
		System.out.print("도서 저자 : ");
		String book_writer = sc.nextLine();
		System.out.print("도서 가격 : ");
		int book_price = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 출판사 : ");
		String book_publisher = sc.nextLine();
		
		try {
			book.add(new Book(book_num,book_title,book_writer,book_price,book_publisher));
			System.out.println("등록 완료");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("실패 (잘못된 인덱스)");
		}
		
	}
	
	public void selectBook() {
		for(int i=0; i<book.size(); i++)
		{
			System.out.println(book.get(i));
		}
	}
	
	public void updateBook() {
		System.out.println("\n=========도서 수정=========");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int book_num = sc.nextInt();
		sc.nextLine();
		int update_idx = -1;
		
		for(int i=0; i<book.size(); i++) {
			if(book_num==book.get(i).getNum()) {
				 update_idx = i;
			}
		}
		
		if(update_idx == -1) {
			System.out.println("일치하는 도서번호가 없습니다.");
		}
		else {
			int answer = 0;
			
			do {
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까?");
				int select_num = sc.nextInt();
				sc.nextLine();
				
				switch(select_num) {
					case 1: 
						System.out.println("=========도서명 수정=========");
						System.out.print("수정할 도서명을 입력하세요 : ");
						String book_title = sc.nextLine();
						book.get(update_idx).setName(book_title);
						answer=select_num;
						break;
					case 2: 
						System.out.println("=========도서 저자 수정=========");
						System.out.print("수정할 저자를 입력하세요 : ");
						String book_writer = sc.nextLine();
						book.get(update_idx).setWriter(book_writer);
						answer=select_num;
						break;
					case 3: 
						System.out.println("=========도서 가격 수정=========");
						System.out.print("수정할 가격을 입력하세요 : ");
						int book_price = sc.nextInt();
						book.get(update_idx).setPrice(book_price);
						sc.nextLine();
						answer=select_num;
						break;
					case 4: 
						System.out.println("=========도서 출판사 수정=========");
						System.out.print("수정할 출판사를 입력하세요 : ");
						String book_publisher = sc.nextLine();
						book.get(update_idx).setPublisher(book_publisher);
						answer=select_num;
						break;
					case 0 : 
						answer=0;
						break;
					default :
						System.out.println("메뉴안에 있는 숫자로만 입력해주세요.");
					}
				System.out.println("수정 완료");
			
			}while(answer!=0);
		}
	}
	
	public void deleteBook() {
		System.out.println("\n=========도서 삭제=========");
		System.out.print("삭제할 도서 번호를 입력하세요 : ");
		int book_num = sc.nextInt();
		sc.nextLine();
		int delete_idx = -1;
		
		for(int i=0; i<book.size(); i++) {
			if(book_num==book.get(i).getNum()) {
				delete_idx = i;
			}
		}
		
		if(delete_idx == -1) {
			System.out.println("일치하는 도서번호가 없습니다.");
		}
		else {
			System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
			char answer = sc.next().toUpperCase().charAt(0);	
			
			if(answer=='Y') {
				book.remove(delete_idx);
				System.out.println("삭제 완료");
			}
			else {
				System.out.println("삭제를 진행하지 않습니다.");
			}
		}
	}
	
	public void addBookmark() {
		//즐겨찾기 할 도서 번호 : 없으면 없다고 해야함.
		System.out.println("\n=========즐겨찾기 추가=========");
		System.out.print("즐겨찾기할 도서 번호를 입력하세요 : ");
		int book_num = sc.nextInt();
		sc.nextLine();
		int bookmark_idx = -1;
		
		for(int i=0; i<book.size(); i++) {
			if(book_num==book.get(i).getNum()) {
				bookmark_idx = i;
			}
		}
		
		if(bookmark_idx == -1) {
			System.out.println("해당 번호의 도서가 존재하지 않습니다.");
		}
		else {
			try {
				bookmark.add(new Book(book_num,
									 book.get(bookmark_idx).getName(),
									 book.get(bookmark_idx).getWriter(),
									 book.get(bookmark_idx).getPrice(),
							         book.get(bookmark_idx).getPublisher()));
				System.out.println("등록 완료");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("실패 (잘못된 인덱스)");
			}
		}
	}
	
	public void deleteBookmark() {
		System.out.println("\n=========즐겨찾기 제거=========");
		System.out.print("삭제할 즐겨찾기 도서 번호를 입력하세요 : ");
		int book_num = sc.nextInt();
		sc.nextLine();
		int delete_bookmark_idx = -1;
		
		if(bookmark.size()==0) {
			System.out.println("즐겨찾기가 없습니다.");
		}
		else {
			for(int i=0; i<bookmark.size(); i++) {
				if(book_num==bookmark.get(i).getNum()) {
					delete_bookmark_idx = i;
				}
			}
			
			if(delete_bookmark_idx == -1) {
				System.out.println("해당 번호의 도서가 존재하지 않습니다.");
			}
			else {
				bookmark.remove(delete_bookmark_idx);
				System.out.println("즐겨찾기가 삭제되었습니다.");
			}
		}
	}
	
	public void selectBookmark() {
		if(bookmark.size() == 0 ) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!");
		}
		else {
			for(int i=0; i<bookmark.size(); i++)
			{
				System.out.println(bookmark.get(i));
			}
		}
	}
	
	public void recommend_Book() {
		System.out.println(book.get((int)(Math.random()*book.size())).getName());
	}
	
}
