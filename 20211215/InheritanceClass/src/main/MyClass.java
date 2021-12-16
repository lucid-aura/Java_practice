package main;

public class MyClass {

	private int number;
	private String name;
	
	public MyClass() {
		this(0, "빈칸"); // 항상 맨 윗칸에 있어야함		
		System.out.println("MyClass MyClass()");
	}

	public MyClass(int number, String name) {
//		this(); // 항상 맨 윗칸에 있어야함		
		
		this.number = number;
		this.name = name;
		System.out.println("MyClass MyClass(int number, String name)");

	}
	
	
}
