package day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 *		int num1, num2, num3, num4, num5;
		 *		Array : 배열. 같은 자료형 변수들의 묶음 -> 변수 관리 (index number로 구분)
		 * 	형식 : 자료형 배열변수명[] = new 자료형[배열의 총 개수]
		 * 	int arrName[] = new int[5]; -> 정수형 변수 5개 선언 : 동적 할당
		 * 	
		 * 	arrName[0] = 11;
		 * 	arrName[1] = 22;
		 * 	arrName[2] = 33;
		 * 	arrName[3] = 44;
		 * 	arrName[4] = 55;
		 */
		
//		int array[] = new int[5];
//		int []array = new int[5];
		int[] array = new int[5];
		
		System.out.println(array);
		System.out.println(array.length);
		
		int num1;
		num1 = 333;
		System.out.println(num1);
		System.out.println(array[2]);
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		array[3] = 44;
		array[4] = 55;
		
		System.out.println(array[2]);
		
		System.out.println(Arrays.toString(array));
		
		int number = 0;
		number = 1;
		
		int Array[] = { 111, 222, 333, 444, 555 };
		
		System.out.println(Array[1]);
		System.out.println(Arrays.toString(Array));
		
		char chArr[] = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(chArr.length);
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);
		
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c); //ascii code
		
		
		/*
		 * 	String strArr[] = 
		 * 
		 * 		자료형 배열변수명[] = new 자료형[배열의 총 개수]; // 개수가 안정해짐
		 * 		자료형 배열변수명[] = { }; // 개수가 정해짐
		 */
	}

}
