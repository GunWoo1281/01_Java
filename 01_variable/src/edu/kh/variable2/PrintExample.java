package edu.kh.variable2;

public class PrintExample {

	public static void main(String[] args) {
		System.out.println("테스트1");
		System.out.println("테스트2");

		System.out.print("테스트3\n");
		System.out.print("테스트4\n");
		
		int iNum1 = 10;
		int iNum2 = 5;
		int iNum3 = 2;
		
		System.out.printf("%d+%d=%d \n",iNum1,iNum2,iNum1+iNum2);
		
		System.out.printf("%d+%d*%d/%d=%d\n",iNum1,iNum1,iNum2,iNum3,iNum1+iNum1*iNum2/iNum3);
		
		int iNum4 = 3;
		System.out.printf("%d\n", iNum4);
		System.out.printf("%5d\n", iNum4);
		System.out.printf("%10d\n", iNum4);
		System.out.printf("%-5d\n", iNum4);
		System.out.printf("%-10d\n", iNum4);
		
		
		System.out.printf("%f\n", 10/4.0);
		System.out.printf("%.2f\n", 10/4.0);
		
		System.out.println("\\o/");
		System.out.println("a\tb\tc\td");
		System.out.println("\u0041");
	}

}
