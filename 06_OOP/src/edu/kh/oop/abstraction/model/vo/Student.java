package edu.kh.oop.abstraction.model.vo;

public class Student {
	//TestVO test = new TestVO();
	//default class must use be in the same package
	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	public static String schoolName = "KH고등학교";
	private final int TEMP1 = 100;
	public int getTEMP1() {
		return TEMP1;
	}
}
