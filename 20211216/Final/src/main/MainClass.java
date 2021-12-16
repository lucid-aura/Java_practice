package main;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * final == const define
		 *	variable
		 *	class
		 *	method
		 */
		
		final int number = 10;  // 변수 -> 상수(지정된 수, 변할 수 없는 수)
												// 대입 용도 
												// KOTLIN val(value), var(variable)
//		number = 20;
		
		final int NUMBER = 20;
		
		final int MEMBERMAX = 20;
		
		int num = number;
		int num1 = NUMBER;
		
		if (num > 0 && num < MEMBERMAX) {
			
		}
	}
}

/*final*/ class Parent{ // final class : 상속 금지(최후의 자식 클래스)
	public /*final*/ void method() { // final method : 오버라이드 금지
		
	}
}

class Child extends Parent{
	public void method() { // Override 안됨
		
	}
}
