package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		int[] a = new int[9];
		int total = 0;
		
		for(int i=0; i<9; i++)
		{	
			a[i] = i+1;
			System.out.print(a[i] + " ");
			if(i%2==0) {
				total+=i+1;
			}
		}
		System.out.println();
		System.out.print("짝수 번째 인덱스 합 : " + total);
	}
	
	public void practice2() {
		int[] a = new int[9];
		int total = 0;
		
		for(int i=8; i>=0; i--)
		{	
			a[i] = i+1;
			System.out.print(a[i] + " ");
			if(i%2==1) {
				total+=i+1;
			}
		}
		System.out.println();
		System.out.print("홀수 번째 인덱스 합 : " + total);
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i=0; i<b.length; i++) {
			b[i]=i+1;
			System.out.print(b[i]+" ");
		}
	}
	
	public void practice4() {
		int search;
		int[] b = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print("입력 "+i+" : ");
			b[i] = sc.nextInt();
		}
		System.out.print("검색할 값 :");
		search=sc.nextInt();
		
		for(int i=0; i<5; i++) {
			if (search==b[i]) {
				System.out.println("인덱스 : " + i);
			}
		}
	}
	
	public void practice5() {
		String a="";
		char b;
		int count=0;
		String d="";
		boolean found = false;

		System.out.print("문자열 : ");
		a=sc.next();

		String c[] = a.split("");
		
		System.out.print("문자 : ");
		b=sc.next().charAt(0);

		for(int i=0; i<c.length; i++) {
			if(c[i].charAt(0)==(b)) {
				if (found) {
                    d += ", ";
                }
                d += i;
                found = true;
				count++;
			}
		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ",a, b);
		System.out.print(d);
		System.out.println();
		System.out.println("i 개수 : " + count);
	}
	
	public void practice6(){
		System.out.print("정수 : ");
		int a = sc.nextInt();
		int[] b = new int[a];
		int total = 0;
		
		for(int i=0; i<a; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : " , i);
			b[i] = sc.nextInt();
			total += b[i];
		}

	    for(int i=0; i<a; i++) {
	        System.out.print( b[i] + " ");
	    }
	    System.out.println();
		System.out.println("총 합 : " + total);
	}
	
	public void practice7(){
		System.out.print("주민등록번호(-포함) : ");
		String a = sc.next();
		String b[] = a.split("");
		
		
		for(int i=0; i<14; i++) {
			if(i>7) {
				b[i]="*";
			}
		}

	    for(int i=0; i<14; i++) {
	        System.out.print( b[i] );
	    }
	}
	
	public void practice8(){
		int a=0;
		while (true){
			System.out.print("정수 : ");
			a=sc.nextInt();
			if(a%2==1 && a > 3) {
				break;
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		int arr[] = new int[a];
		int mid = a/2;
		
		for(int i=0; i<mid+1; i++) {
			arr[i] = i+1;
		}
		for(int i=mid+1; i<a; i++) {
			arr[i] = a-i;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice9(){
		int[] a = new int[10];
		int ran_num =0;
		for(int i=0; i<10; i++) {
			ran_num=(int)(Math.random()*10);
			a[i] = ran_num;
			}
		System.out.println(Arrays.toString(a));
	}
	
	public void practice10() {
		int[] arr = new int[10]; 

	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = (int)(Math.random()*10);
	    }

	    int max = arr[0];
	    int min = arr[0];

	    System.out.print("발생한 난수 : ");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	        if (arr[i] > max) max = arr[i];
	        if (arr[i] < min) min = arr[i];
	    }

	    System.out.println();
	    System.out.println("최대값 : " + max);
	    System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		 int[] arr = new int[10];
		    for (int i = 0; i < arr.length; i++) {
		        while (true) {
		            int num = (int)(Math.random()*10);
		            boolean isDuplicate = false;

		            for (int j = 0; j < i; j++) {
		                if (arr[j] == num) {
		                    isDuplicate = true;
		                    break;
		                }
		            }

		            if (!isDuplicate) {
		                arr[i] = num;
		                break;
		            }
		        }
		    }

		    for (int i = 0; i < arr.length; i++) {
		        System.out.print(arr[i] + " ");
		    }
	}
	
	public void practice12() {
		 int[] arr = new int[100];
		    
		    // 1~100 배열 초기화
		    for (int i = 0; i < 100; i++) {
		        arr[i] = i + 1;
		    }
		    
		    // 배열 섞기 (Fisher–Yates Shuffle)
		    Random rand = new Random();
		    for (int i = 99; i > 0; i--) {
		        int j = rand.nextInt(i + 1);
		        // 값 교환
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }
		    
		    // 예시처럼 몇 개만 출력하고 싶으면 선택 (예: 처음 6개)
		    int outputCount = 6;
		    int[] result = Arrays.copyOfRange(arr, 0, outputCount);
		    
		    // 오름차순 정렬
		    Arrays.sort(result);
		    
		    // 출력
		    for (int i = 0; i < result.length; i++) {
		        System.out.print(result[i] + " ");
		    }
		}
	
	public void practice13() {
		System.out.print("문자열 : ");
        String input = sc.nextLine();

        char[] uniqueChars = new char[input.length()];
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean exists = false;

            for (int j = 0; j < count; j++) {
                if (uniqueChars[j] == ch) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                uniqueChars[count] = ch;
                count++;
            }
        }

        System.out.print("문자열에 있는 문자 : ");
        for (int i = 0; i < count; i++) {
            System.out.print(uniqueChars[i]);
            if (i != count - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n문자 개수 : " + count);
	}
	
}
