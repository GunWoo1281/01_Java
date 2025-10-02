package com.hw3.model.run;

import com.hw3.model.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		BookService bs = new BookService();
		bs.main_menu();
	}

}
