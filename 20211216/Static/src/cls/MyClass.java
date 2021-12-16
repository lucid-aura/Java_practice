package cls;

public class MyClass {
	/*
	 *	         stack           |   heap      | static   |   sys
	 *  지역변수, 매개변수  |  멤버변수  | 정적변수 |  
	 */
	private int number; // 멤버변수 자동  0
	public static int staticNumber; // 정적 변수, global variable로도 사용하는 경우가 있다. 자동 0
	private static int a;
	
	public void method(int number) { // 매개 변수
		int localnumber; // 지역변수
	}
	
	public void func() {
		int localnumber  = 0; // 초기화
		
		number++;
		staticNumber++;
		localnumber++; // 초기화 필요
		
		System.out.println("local변수:" + localnumber);
		System.out.println("멤버변수:" + number);
		System.out.println("정적변수:" + staticNumber);
		
		YouClass.swap(null, localnumber, localnumber);
	}
}
