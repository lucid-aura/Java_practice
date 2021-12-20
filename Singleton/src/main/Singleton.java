package main;

public class Singleton {

	private static Singleton single = null;
	public int number;
	public String name;
	public int tag;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if (single == null) { 
			single = new Singleton(); // 1번만 실행
		}
		return single; // single ton -> 1개의 instance만을 사용한다.
	}
}