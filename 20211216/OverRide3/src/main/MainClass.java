package main;

import cls.ChildOne;
import cls.ChildTwo;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// childone 하고 childtwo 클래스의 몇개를 쓸지를 모른다.
		
		// 자식 클래스의 객체를 총 10개의 객체를 생성
		
		// 각각이 몇개씩 들어갈지 모르기 때문에 최대값 10개씩 선언
		ChildOne arrOne[] = new ChildOne[10];
		ChildTwo arrTwo[] = new ChildTwo[10];
		
		arrOne[0] = new ChildOne();
		arrTwo[0] = new ChildTwo();
		arrOne[1] = new ChildOne();
		arrTwo[1] = new ChildTwo();
		arrOne[2] = new ChildOne();
		arrOne[3] = new ChildOne();
		arrTwo[2] = new ChildTwo();
		arrTwo[3] = new ChildTwo();
		
		
		// 자식 클래스의 객체를 총 10개의 객체를 생성
		// 부모 클래스의 배열로 만들어 들어갈 자식 클래스의 타입으로 형변환 후 할당
		ParentClass arrParent[] = new ParentClass[10];
		
		arrParent[0] = new ChildOne();
		arrParent[1] = new ChildOne();
		arrParent[2] = new ChildTwo();
		arrParent[3] = new ChildOne();
		arrParent[4] = new ChildTwo();
		arrParent[5] = new ChildOne();
		arrParent[6] = new ChildOne();
		arrParent[7] = new ChildTwo();
		arrParent[8] = new ChildOne();
		arrParent[9] = new ChildTwo();
		
//		System.out.println((ChildTwo)arrParent[2].two); // 괄호를 전체로 안감싸면 two까지 접근하고 이후 캐스팅 시도
		System.out.println(((ChildTwo)arrParent[2]).two); // 캐스팅 전체를 감사야 함
		for (int i = 0; i < arrParent.length; i++) {
			arrParent[i].method();
			
			if (arrParent[i] instanceof ChildOne) {
				ChildOne one = (ChildOne)arrParent[i];
				System.out.println();
				one.func();
			}
			else if (arrParent[i] instanceof ChildTwo) {
				ChildTwo two = (ChildTwo)arrParent[i];
				two.proc();
			}
			
		}
		
		ChildOne o = (ChildOne)arrParent[0];
		o.func();
		
		// instanceof : 생성된 class를 찾아 준다
		if (arrParent[0] instanceof ChildOne) {
			ChildOne one = (ChildOne)arrParent[0];
			
		}
		// 하나의 배열로 처리할 수 있어서 유연한 관리가 가능하다.
	}

}

