package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		// 정렬 프로그램
		
		// user 몇개의 숫자를 정렬?
		// 갯수를 결정
		// 숫자들을 입력
		// 오름/내림
		Scanner sc = new Scanner(System.in);
		int number[] = inputNumber(sc);
		System.out.print("몇개의 숫자를 정렬하나요? : ");
		
//		int length = sc.nextInt();
//		int number[] = new int[length];
//		for (int i = 0; i < number.length; i++) {
//			System.out.print(i +1 + "번째 숫자를 입력해주세요");
//			number[i] = sc.nextInt();
//		}
		
//		String sort = ascDsc(sc);
//		System.out.print("오름/내림을 입력해주세요");
//		String sort = "";
//		do {
//			sort = sc.next();
//		}while(!sort.equals("오름") && !sort.equals("내림"));
		
		boolean asc = ascDsc(sc);
		swap_number(number, asc);
		
//		boolean swap = false;
//		int temp;
//		for (int i = 0; i < number.length-1; i++) {
//			for (int j = i+1; j < number.length; j++) {
//				swap = (asc ?  number[i] > number[j] :  number[i] < number[j]);
//				if (swap) {
//					swap_num(number, i, j);
//					temp = number[i];
//					number[i] = number[j];
//					number[j] = temp;
//				}
//			}
//		}

		// 결과 출력
		System.out.println(Arrays.toString(number));
		
//		System.out.print("몇개의 숫자를 정렬하나요? : ");
//		int number[] = { 5, 8, 3, 6, 1, 4	};
//		int temp;
//		for (int i = 0; i < number.length-1; i++) {
//			for (int j = i+1; j < number.length; j++) {
//				if (number[i] > number[j]) {
//					temp = number[i];
//					number[i] = number[j];
//					number[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(number));
	}
	
	public static int[] inputNumber(Scanner sc) {
		System.out.print("몇개의 숫자를 정렬하나요? : ");
		int length = sc.nextInt();
		int number[] = new int[length];
		for (int i = 0; i < number.length; i++) {
			System.out.print(i +1 + "번째 숫자를 입력해주세요");
			number[i] = sc.nextInt();
		}
		return number;
	}
	
	public static boolean ascDsc(Scanner sc) {
		String sort = "";
		System.out.print("오름/내림을 입력해주세요");
		do {
			sort = sc.next();
		}while(!sort.equals("오름") && !sort.equals("내림"));
		boolean asc = (sort.equals("오름") ? true : false);
		return asc;
	}
	
	public static void swap_number(int[] number, boolean asc) {
		boolean swap = false;
		for (int i = 0; i < number.length-1; i++) {
			for (int j = i+1; j < number.length; j++) {
				swap = (asc ?  number[i] > number[j] :  number[i] < number[j]);
				if (swap) {
					swap_num(number, i, j);
				}
			}
		}
		return;
	}
	
	public static void swap_num(int[] number, int i, int j) {
		int temp;
		temp = number[i];
		number[i] = number[j];
		number[j] = temp;
		return;
	}
}
