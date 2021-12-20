package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;

public class MainClass {

	public static void main(String[] args) {

		MyClass mycls = new MyClass();
		YouClass youcls = new YouClass();
		HeClass hecls = new HeClass();
		
//		youcls.setTotal(mycls.getNumber());
//		youcls.setName(mycls.getName());
		
		System.out.println(youcls.toString());
		
		Singleton s = Singleton.getInstance();
		
		s = Singleton.getInstance();
		
		mycls.method();
		hecls.function();
		youcls.func();

		
		System.out.println(youcls.toString());
	}

}
