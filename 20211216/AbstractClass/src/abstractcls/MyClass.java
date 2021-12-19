package abstractcls;

public class MyClass extends AbstractClass {
	public int test;
	@Override
	public void abstractMethod() {
		System.out.println("MyClass abstractMethod()");
		
	}

	public void func() {
		System.out.println("MyClass func()");
	}
}
