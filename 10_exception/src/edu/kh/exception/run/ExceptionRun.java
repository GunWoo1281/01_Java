package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;
import edu.kh.exception.model.service.UserException;

public class ExceptionRun {

	public static void main(String[] args) {
		ExceptionService es = new ExceptionService();
		//es.ex1();
		//es.ex2();
		//es.ex3();
		//es.ex4();
		try {
			es.ex5();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
