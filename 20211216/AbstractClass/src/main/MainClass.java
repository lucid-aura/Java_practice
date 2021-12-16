package main;

import abstractcls.AbstractClass;
import abstractcls.MyClass;
import abstractcls.YouClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass mycls = new MyClass();
		mycls.method();
		mycls.abstractMethod();
		
		AbstractClass ac = new MyClass();
		ac.method();
		ac.abstractMethod();
		
		((MyClass)ac).func();
		
		MyClass my = (MyClass)ac;
		my.func();
		
		YouClass you = new YouClass();
		you.abstractMethod();
		
		AbstractClass ac1 = new YouClass();
		
		
		// 클래스를 단순히 쓰고 싶을 때 (확장성 고려 x)
		AbstractClass ac2 = new AbstractClass() {
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");
			}
		};
		
		ac2.abstractMethod();
		ac2.method();
	}

}
