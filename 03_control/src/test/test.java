package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int default_money = 10000;
		int insert_money = 0;
		int delete_money = 0;
		int num = 0;
		
		
		do {
			System.out.println("\n=== ATM 프로그램 시작 ===");
			System.out.println("현재 잔액: " + default_money + "원\n");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">>");
			num=sc.nextInt();
			
			switch(num) {
				case 1 :
					System.out.print("입금할 금액을 입력하세요: ");
					insert_money=sc.nextInt();
					default_money += insert_money;
					System.out.println("입금 완료! 현재 잔액 : " + default_money +"원");
					break;
				case 2 :
					System.out.print("출금할 금액을 입력하세요: ");
					delete_money=sc.nextInt();
					if(default_money < delete_money) {
						System.out.printf("잔액 부족! 현재 잔액은 " + default_money + "원입니다.\n");
					}
					else {
						default_money -= delete_money;
						System.out.println("출금 완료! 현재 잔액 : " + default_money + "원");
					}
					break;
				case 3 :
					System.out.println("현재 잔액은 " + default_money + "원입니다.");
					break;
				case 4 : 
					System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
					break;
				default :
					System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.");
					break;
			}
		}while(num != 4);
	}
}