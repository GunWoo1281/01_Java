package edu.kh.oop.abstraction.model.vo;

//vo(value object) : 값 저장용 객체를 만들기 위한 패키지
public class People {

	
	 private String name;
	 private char gender;
	 private String pNo;
	 private  String address;
	 private String phone;
	 private int age;
	 //public double bitcoin; 모든 국민이 가지고 있는것이 아니기에 제거 (추상화)
	 
	 public void tax() {
		 System.out.println("세금을 냅니다...");
	 }
	 
	 public void vote() {
		 System.out.println("투표를 합니다...");
	 }
	 
	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public char getGender() {
		 return gender;
	 }

	 public void setGender(char gender) {
		 this.gender = gender;
	 }

	 public String getpNo() {
		 return pNo;
	 }

	 public void setpNo(String pNo) {
		 this.pNo = pNo;
	 }

	 public String getAddress() {
		 return address;
	 }

	 public void setAddress(String address) {
		 this.address = address;
	 }

	 public String getPhone() {
		 return phone;
	 }

	 public void setPhone(String phone) {
		 this.phone = phone;
	 }

	 public int getAge() {
		 return age;
	 }

	 public void setAge(int age) {
		 this.age = age;
	 }
}
