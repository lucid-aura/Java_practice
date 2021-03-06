package day6;

import java.util.Iterator;

public class Overload {

	public static void main(String[] args) {
		/*
		 * Over Load : 함수 명은 같고 매개변수 (parameter)의 자료형이나 갯수가 다른 것을 의미.
		 * 
		 * paint()
		 * paint(int x, int y)
		 * paint(int z)
		 * paint(char c, int i)
		 * void paint(int i, char c)
		 * paint(int n, char ch) x
		 * int paint(int i, char c) x
		 */
		
		method();
		method('a');
		method(2);
		method('a', 2);
		method(2, 'a');
		
		int sum = sumProc(90, 95, 100, 75, 80);
		System.out.println(sum);
		
		sumProc("홍길동", 90, 95, 100, 75, 80);
		
		/*
		 * number -> char
		 * array -> 범위 초과 [5] -> 0~4 :: [5]
		 * class -> 없음
		 * file -> 없음
		 * 
		*/
	}

	static void method() {
		System.out.println("method()");
	}
	
	static void method(char c) {
		System.out.println("method(char c)");
	}
	
	static void method(int i) {
		System.out.println("method(int c)");
	}
	
	static void method(char c, int i) {
		System.out.println("method(char c, int c)");
	}
	
	static void method(int i, char c) {
		System.out.println("method(int i, char c)");
	}
	
//	static void method(int n, char ch) {
//		System.out.println("method(int n, char ch)");
//	}
	
//	static int method(int i, char c) {
//		System.out.println("method(int i, char c)");
//		return 0;
//	}
	
	//가변 인수(파라미터)
	static int sumProc(int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}
	
	static void sumProc(String name, int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(name + "님의 합계는" + sum + "입니다.");
	}
	
	
}
