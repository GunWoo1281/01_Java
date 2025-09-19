package edu.kh.variable.practice;

public class PlusQuest {

	public static void main(String[] args) {
		
		//문제 1
		int age = 25;
		System.out.printf("나는 %d살입니다. \n", age);

		//문제 2
		int score = 90;
		score += 10;
		System.out.println("최종점수 : " + score);
		
		//문제3
		int a = 10;
		double b = a;
		System.out.println(b);
		
		//문제4
		float pi = 3.14159f; 
	    System.out.printf("소수 둘째 자리 : %.2f, ", pi);
	    System.out.println("변환된 정수 : " + (int)pi);
		 
	    //문제5
	    char ch = 'A';
	    	System.out.println("문자 : " + ch + ", 코드 값 : " + (int)ch);
	    	
	    	//문제6
	    final int price = 5000;
	    	int count = 3;
	    	System.out.printf("물건 가격: %d원, 개수: %d개, 총액: %d원 \n", price,count,price*count);
	    	
	    	//문제7
	    	int kr = 95;
	    	int en = 87;
	    	int math =90;
	    	float avg = (kr+en+math)/3f;
	    	
     	System.out.printf("국어: %d, 영어: %d, 수학: %d \n", kr,en,math);
     	System.out.printf("총점: %d, 평균: %.2f \n", kr+en+math,avg);
     	
     	//응용문제1
     	String name = "영숙";
     	int age2 = 28;
     	float height = 165.7f;
     	
     	//응용문제2
     	System.out.printf("출연자이름: %s \n", name);
     	System.out.printf("나이: %d세 \n", age2);
     	System.out.printf("키: %.1fcm \n", height);
     	
     	//응용문제3
     	double age3 = age2;
     	System.out.println("자동 형변환된 나이(double):" + age3);
     	
     	//응용문제4
     	System.out.println("강제 형변환된 키(int):" + (int)height);
     	
     	//응용문제5
     	int score1=87;
     	int score2=92;
     	double avg2=(score1+score2)/2d;
     	System.out.println("영숙님의 매칭 점수 평균은 " + avg2 + "점 입니다!");
	}

}
