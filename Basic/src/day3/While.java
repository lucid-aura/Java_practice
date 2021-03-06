package day3;

import java.util.Iterator;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * 초기화
		 * while(조건식) {
		 * 	처리
		 * 	연산식
		 * }
		 * 
		 * 초기화
		 * do {
		 * 	처리
		 * 	연산식
		 * }while(조건식);
		 */
		
		int w;
		w = 0;
		while( w < 10 ) {
			System.out.println("while loop" + w);
			w++;
		}
		
		int dw;
		dw = 0;
		do {
			System.out.println("do while loop" + dw);
			dw++;
		}while( dw < 10 );
		
//		int i = 1;
//		int j = 1;
//		while(i < 10) {
//			while (j < 10) {
//				System.out.print(i + "x" + j + "=" + i*j + " ");
//				j++;
//			}
//			j = 1;
//			i++;
//			System.out.println();
//		}
		
		for(int i=0; i< 10; i++) {
			System.out.println("for loop " + i);
			if (i == 5) {
				break;
			}
		}
		
		int array[] = { 4, 6, -7, 9, 5, 7 };
		for(int i=0; i< array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
			if (array[i] < 0) {
				break;
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		int number;
//		
//		while(true){
//			System.out.print("숫자를 입력해주세요(양수)");
//			number = sc.nextInt();
//			if (number > 0) {
//				break;
//			}
//			System.out.println("양수를 입력해 주세요.");
//		}

		// 2중 for문 탈출
		
		boolean b = false;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 8; j++) {
				System.out.println("\tj = " + j);
				
				if (i == 5 && j == 3) {
					b = true;
				}
				if (b==true) {
					break;
				}
			}
			if (b==true) {
				break;
			}
		}
		
		// 2. break를 셋팅
		out:for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 8; j++) {
				System.out.println("\tj = " + j);
				
				if (i == 4 && j == 5) {
					break out;
				}
			}
		}
	}

}
