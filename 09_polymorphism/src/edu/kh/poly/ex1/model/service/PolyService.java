package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {

	public void ex1() {
		Car car = new Car();
		
		Tesla tesla = new Tesla();
	
		Car car2 = new Tesla();
		
		Car car3 = new Spark();
	
		car.setEngine("V6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatterCapacity(1000000);
		
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		//에러발생
		//car2.setBatterCapacity(100);
		
		car3.setEngine("경차엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		//에러발생
		//car3.setDiscountOffer(0.5);
		
		/*car2, car3는 부모타입 참조변수(Car)이기 때문에
		 * 자식객체의 고유 필드, 메소드 사용불가
		 * 컴파일러가 Car로 인식하고있기 때문
		 */
		
		Car[] arr = new Car[3];
		arr[0] = car;
		arr[1] = car2;
		arr[2] = car3;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+"번째 인덱스의 엔진 : " + arr[i].getEngine());
		}
	}
	
	public void printCar(Car temp) {
		System.out.println();
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 갯수 : " + temp.getWheel());
	}
	
	public Car createCar(int num) {
		Car result = null;
		switch(num)
		{
			case 1 : 
				result = new Car();
				break;
			case 2 : 
				result = new Tesla();
				break;
			case 3 : 
				result = new Spark();
				break;
		}

		return result;
	}
	public void ex2() {
		Tesla t = new Tesla("전기모터", "전기", 4, 100000);
	
		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);
		
		Car c = new Car("경유엔진", "경우", 12);
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		Car[] arr = {createCar(1),createCar(2),createCar(3)};
		
		System.out.println();
		System.out.println(arr[1] instanceof  Tesla);
		System.out.println(arr[1] instanceof  Spark);
		System.out.println(arr[1] instanceof  Car);
	}
	
	public void ex3() {
		Car c1 = new Tesla("전기모터", "전기", 4,50000);

		//. 연산자가 더 빠르기 때문에 소괄호를 먼저 묶어줌.
		System.out.println(((Tesla)c1).getBatterCapacity());
	}
	
	public void ex4() {
		Car c1 = new Tesla();
		
		//런타임 에러 발생 - 관계없음.
		//java.lang.ClassCastException - 형변환 에러 - cannot be cast to class~
		
		if(c1 instanceof Spark) {
			Spark s1 = (Spark)c1;
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
	}
	
	public void ex5() {
		Car c1 = new Car("경유엔진","경유",8);
		System.out.println(c1.toString());
		
		
		//컴파일시에는 부모와 바인딩 - 정적 바인딩
		Car c2 = new Spark("경차엔진","휘발유",4,0.5);
		System.out.println(c2.toString());
		//프로그램 실행 시에는 Spark에 오버라이딩된 toString이 우선시 되어 바인딩. - 동적 바인딩
	}
}
