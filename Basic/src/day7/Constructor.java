package day7;

public class Constructor {

	public static void main(String[] args) {
		/*
		 	constructor : 생성자
		 								객체 생성시에 호출
		 								메소드
		 								클래스명과 같다
		 								return 값이 없다.
		 								overload가 가능하다.
		 								생략이 가능하다.
		 	
		 	destructor : 소멸자 <- X
		 */
		
		int array[] = { 11, 22, 33 };
		
		// MyClass cls = { 11, "홍길동" };
		MyClass cls = new MyClass();
		MyClass cls2 = new MyClass(1);
		MyClass cls3 = new MyClass(2, "hello");
		
		System.out.println(cls);
		MyClass t = cls.getThis();
		System.out.println(t);
	}
	
	

}
