package test;

public class Question {

	/*
	 * 1. 배열을 이용한 함수의 호출 및 값 변경
	 */
	public static void main(String[] args) {
		int[] question1 = {10, 20};
		int q0 = 10;
		int q1 = 20;
		System.out.println(question1[0] + " "+ question1[1]); // 출력 : 10 20
		//swap1(question1[0], question[1]); //10, 20 -> int
		swap1(question1); //-> 100 -> int[] 주소값이 들어간다. 
		// 주소값을 활용하는 변수는 참조형 변수라고 한다
		// 현재 코드에서 사용하고있는 타입의 종류 
		// 1.int 2.String 3.int[]
		
		//
		// 참조형 변수의 종류: 1. 배열, 2. class(객체)
		/*
			class Horse{}
			Horse horse = new Horse();
			int[] a = {10, 20};
			int b = 0;
		*/
		System.out.println(question1[0] + " "+ question1[1]); // 출력 : 20 10
	}

	public static void swap1(int[] quest) {
		
		int temp = quest[0];
		quest[0] = quest[1];
		quest[1] = temp;
		
		// 10번째 line과 12번째 line의 출력이 다르도록 함수를 구현해보세요

	}

}
