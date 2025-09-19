package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//이긴횟수
		int win = 0;
		//진 횟수
		int count = 0;
		//컴퓨터 랜덤값
		int answer = 0;
		
		System.out.println("=== 주사위 맞히기 게임 시작 ===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원하면 \"종료\" 입력)");
		
		while(true) {
			//컴퓨터 랜덤값(1~6) 생성
			answer = (int)(Math.random() * 6) + 1;
			
			while(true) {
				System.out.print("숫자 입력 >> ");
				String input = sc.next();
				
				//게임 종료
			    if (input.equals("종료")) {
		    			System.out.println("\n===== 게임 종료 =====");
		    	        System.out.println("총 시도 횟수 : " + count);
		    	        System.out.println("정답 횟수 : " + win);
		    	        if(count!=0) {
			    	        int accuracy = (win * 100) / count;
			    	        System.out.printf("정답률 : %d%%\n", accuracy);
			    	        //종료
			    	        return;
			    		}
		    	        else {
		    	      	 	System.out.println("게임을 플레이하지 않았습니다.");
		    	      	 	break;
		    	        }
			    }
			    
			    //숫자가 아닌 경우, NumberFormatException 에러 발생으로 예외처리
			    int guess; // 변환된 숫자 저장
			    
			    try {
			        guess = Integer.parseInt(input);
			    } catch (NumberFormatException e) {
			        System.out.println("잘못된 입력입니다.");
			        continue; // 다시 입력받도록 반복
			    } 

			    if(guess>6 || guess<0) {
			    		System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");
			    		continue;
			    }
			    else {
			    	//사용자 입력값이 컴퓨터와 같다면 == 정답
		            if (Integer.parseInt(input) == answer) {
		                System.out.println("정답입니다!");
		                System.out.println("새로운 주사위 숫자가 생성되었습니다.");
		                win++;
		                count++;
		                break;
		            } 
		            //다른 경우 == 오답
		            else {
		                System.out.print("틀렸습니다. ");
		                if (Integer.parseInt(input) < answer) {
		                    System.out.println("더 큰 수를 입력하세요.");
		                } else  {
		                    System.out.println("더 작은 수를 입력하세요.");
		                }
		                count++;
		            }
			    }
			}
		}
	}
}