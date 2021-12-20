package cls;

import main.Singleton;

public class MyClass {

	private int number;
	private String name;
	
	public MyClass() {
		this.number = 333;
		this.name = "홍길동";
	}

	public void method() {
		Singleton s = Singleton.getInstance();
		s.number = number;
		s.name = name;
	}
	/*
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
*/
	
}
