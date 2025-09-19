package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		for(int i = 1; i<11; i++) {
			System.out.print(i+" ");
			if(i==5) {
				break;
			}
		}
	}
	
	public void ex2() {
		String text="";
		String total="";
		while(!text.equals("exit@")) {
			System.out.print("문자열 입력(exit@) 입력 시 종료 : ");
			text=sc.nextLine();
			if(!text.equals("exit@")) {
				total+=text+"\n";
			}
		}
		System.out.print(total);
	}
	
	public void ex3() {
		for(int i = 1; i<11; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
	public void ex4() {
		for(int i = 1; i<101; i++) {
			if(i%5==0) {
				continue;
			}
			else if(i==41) {
				 break;
			}
			System.out.println(i);
		}
	}
	
	public void RSPGame() {
		int pan=0;
		String my_rsp=null;
		int com_rsp=0;
		int win=0;
		int lose=0;
		int draw=0;
		
		System.out.println("[가위 바위 보 게임~!!!]");
		System.out.print("몇 판? : ");
		pan = sc.nextInt();
		
		for(int i = 1; i<pan+1; i++) {
			System.out.printf("\n%d번째 게임\n", i);
			System.out.print("가위/바위/보 중 하나 입력 : ");
			my_rsp = sc.next();
			
			com_rsp = (int)(Math.random()*3+1);
			
			if(com_rsp==1) System.out.println("컴퓨터는 [가위]를 선택했습니다.");
			else if(com_rsp==2) System.out.println("컴퓨터는 [바위]를 선택했습니다.");
			else System.out.println("컴퓨터는 [보]를 선택했습니다.");
			
			if(my_rsp.equals("가위")) {
				//com_rsp=1 가위
				if(com_rsp==1) {
					System.out.println("무승부");
					draw++;
				}
				//com_rsp=2 바위
				else if(com_rsp==2) {
					System.out.println("컴퓨터 승!");
					lose++;
				}
				//com_rsp=3 보
				else {
					System.out.println("플레이어 승!");
					win++;
				}
			}
			else if(my_rsp.equals("바위")) {
				//com_rsp=1 가위
				if(com_rsp==1) {
					System.out.println("플레이어 승!");
					win++;
				}
				//com_rsp=2 바위
				else if(com_rsp==2) {
					System.out.println("무승부");
					draw++;
				}
				//com_rsp=3 보
				else {
					System.out.println("컴퓨터 승!");
					win++;
				}
			}
			else if(my_rsp.equals("보")){
				//com_rsp=1 가위
				if(com_rsp==1) {
					System.out.println("컴퓨터 승!");
					win++;
				}
				//com_rsp=2 바위
				else if(com_rsp==2) {
					System.out.println("플레이어 승!");
					win++;
				}
				//com_rsp=3 보
				else {
					System.out.println("무승부");
					draw++;
				}
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", win, draw, lose);
		}
	}
}
