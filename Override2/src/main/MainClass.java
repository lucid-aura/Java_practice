package main;

import cls.ChildOneClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		
//		ChildOneClass child = new ChildOneClass();
//		child.method();
		
		ParentClass pc = new ChildOneClass(); // 묵시적 업캐스팅
		pc.method();
		pc.func();
		
//		ParentClass pc2 = new ParentClass();
//		ChildOneClass coc = (ChildOneClass)pc2;
//		coc.function();
		
		ChildOneClass co1 = new ChildOneClass();
		
	}

}
