package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;
import inter.MyInterface;

public class MainClass {

	public static void main(String[] args) {
		
		MyClass mycls = new MyClass();
		mycls.method();
		
		MyInterface myi = new MyClass();
		myi.method();
		
		MyInterface myinter = new MyInterface() {
			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
		};
		
		YouClass ycls = new YouClass();
		ycls.func();
		ycls.method();
		
//		MyInterface myinterface = new MyClass();
		MyInterface myinterface = new YouClass();
		
		Object myobj = new MyClass();
		Object youobj = new YouClass();
		Object heobj = new HeClass();
		
		/*		Object o = "오브젝트는 포인터이다.";
				System.out.println(o);*/
	}

}
