package day1;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문장 주석
		
		/*
		 * 문단 주석
		 */
		
		System.out.println("Hello World");
		
		System.out.print("ln을 빼면 ");
		
		System.out.print("개행이 없다");
		
		System.out.println(); // 개행, ln == line
		
		System.out.printf("%d %s", 123, "문자열, f는 format");
		
		/*
		escape sequence
		\n, \t, \", \', \b, \\
		*/ 
		System.out.print("나는 끝까지 노력할 것이다.\n");
		System.out.print("성공할 \n때까지\n");
		
		System.out.println("홍길동\t24 서울시");
		System.out.println("박훈\t\t21 부산시");
		System.out.println("선우태영\t25 강릉시");
		
		
		System.out.println("\"나는\" \'문제\' \\없어\\");
	}

}
