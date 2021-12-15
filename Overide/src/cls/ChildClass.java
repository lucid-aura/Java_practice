package cls;

public class ChildClass extends ParentClass{

	/*
	 	Over Ride : 부모 클래스에서 상속받은 메소드를 고쳐 기입
	 	
	 	1. 상속받은 함수를 고쳐서 기입 
	 	2. class 관리
	 */
	
	@Override // == namespace? (annotation ?)
	public void pMethod() {
//		super.pMethod();
		System.out.println("ChildClass pMethod");
	}
	
	public void func() {
		super.pMethod();
		method();
	}
}
