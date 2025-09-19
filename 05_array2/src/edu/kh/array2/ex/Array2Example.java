package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	
	public void ex1() {
		int[][] arr = new int[2][3];
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;

		int num = 10;
		
		System.out.println(Arrays.deepToString(arr));

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col]=num;
				num+=10;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
	}
	
	public void ex2() {
		int total=0;
		int[][] arr = { 
						{1,2,3}, 
						{4,5,6},
						{7,8,9}
		};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				total += arr[i][j];
			}
			System.out.printf("%d행의 합 : %d" , i, total);
			System.out.println();
			total=0;
		}
		
		System.out.println("===========================");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				total += arr[j][i];
			}
			System.out.printf("%d열의 합 : %d" , i, total);
			System.out.println();
			total=0;
		}
	}
	
	public void ex3() {
		char[][] arr = new char[4][];
		arr[0]=new char[3];
		arr[1]=new char[4];
		arr[2]=new char[5];
		arr[3]=new char[2];
		
		char ch = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
			}
		}
		
		System.out.println((Arrays.deepToString(arr)));
	}
}
