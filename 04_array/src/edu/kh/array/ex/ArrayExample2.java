package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	public void shallowCopy() {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] Copyarr = arr;
		
		System.out.println(arr);
		System.out.println(Copyarr);
		
		System.out.println("변경전");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Copyarr));
		
		Copyarr[2]=999;
		System.out.println("변경후");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Copyarr));
	}
	
	public void deepCopy() {			
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		
		System.out.println(arr);
		System.out.println(arr2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = new int[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOf(arr, arr.length);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr4));
	}
	
	public void crateLottoNumber() {
		int ran_num = 0;
		
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			ran_num = (int)(Math.random()*45+1);
			lotto[i]=ran_num;
			for(int j=0; j<i; j++) {
				if(lotto[j]==ran_num) {
					ran_num=(int)(Math.random()*45+1);
				}
			}
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
}
