package edu.kh.oop.cls.model.vo;

public class User {

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	public User() {
		System.out.println("기본 생성자로 초기화");

		userId="test2";
		userPw="password123";
		userName="홍길동";
		userAge=20;
		userGender='남';
	}
	
	
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	
	public User(String userId, String userPw, String userName, int userAge, char userGender) {
		this(userId, userPw);
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}

	public User(int userAge) {
		
	}
	
	public User(String userId) {
		
	}
	
	public User(int userAge, String userId) {
		
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
}
