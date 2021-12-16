package main;

import cls.MyClass;
import cls.YouClass;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * static : 정적 <=> 동적 : dynamic
		 * 
		 * variable
		 * method
		 */
			MyClass cls = new MyClass();
			
			cls.func();
			cls.func();
			cls.func();
			
			MyClass mycls = new MyClass();
			mycls.func();
			mycls.func();
			
//			mycls.staticNumber = 12; // 가능는 하지만 틀린 문법
			MyClass.staticNumber = 14; // 클래스명.스태틱변수명
			
			// 메소드
			YouClass yc = new YouClass();
			yc.memberMethod(); // 멤버 메소드, 인스턴스 메소드
			
			YouClass.staticMethod(); // 정적 메소드, class 메소드
		}
	
		static int func() {
			return 1;
		}
}
