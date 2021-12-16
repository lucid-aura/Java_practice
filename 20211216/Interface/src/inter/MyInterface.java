package inter;

/*
 	추상 메소드만을 포함하는 형태(template)
 	멤버변수를 포함할 수 없다
 	일반 메소드도 포함 할 수 없다.
 	
 	상속받은 후에 메소드를 정의한 후에 사용할 수 있다.
 */

public interface MyInterface {

//	private int number;
//	public void method() { }
	
	public void method();
	default void test() {
	} // 명세된 메소드는 반드시 클래스에서 정의되어야 함.
}
