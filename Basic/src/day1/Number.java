package day1;

public class Number {

	public static void main(String[] args) {

		/*
		 *		숫자(상수) : 지정한 숫자
		 *		2진수 : 0, 1
		 *		8진수 : 0 ~ 7 -  8 -> 10, 011 -> 9(10진수)
		 *		10진수 : 0 ~ 9
		 *		16진수 : 0 ~ 9, A, B, C, D, E, F(15) -  0xE -> 14(10진수)
		 * 	
		 * 	변수(공간) : 그릇(크기는 다양) == variable
		 * 	1. 변수를 선언,  변수명을 작성
		 * 	2. 자료형 지정
		 * 	
		 * 	문자, 숫자, 문자열, 논리값
		 * 	
		 * 	자료형 지정 변수명;		변수의 선언			<- 그릇을 준비
		 * 	변수명 = 값;					변수의 값의 대입	<- 그릇에 내용물을 넣음
		 */
		
		// 정수 == integer
		int number;
		number = 123;
		
		int num;
		num = number;
		
		System.out.println(number); // 출력
		
		/*
		* 변수의 작명 규칙
		* 예약어는 사용할 수 없다. int int; -> 프로그램에서 설정되어 있는 단어
		* 숫자로만 된 변수는 사용할 수 없다 int 123; -> 상수가 됨
		* 연산자는 사용할 수 없다. int +number;, int -number; ...
		* 대신 _(언더바)는 사용할 수 있다. 대신 최근에는 잘 사용하지 않는다.
		*/
		
		int _number;
		int number_position_char;
		int numberpositionchar;
		int numberPositionChar;
		int numPosChar;
		
		// 한글 변수명도 가능하나 권장하지 않는다.
		int 숫자1;
		숫자1 = 333;
		System.out.println(숫자1);
		
		// 흔한 명칭은 사용을 피하는 것이 좋다.
		// ex) length, object, size...
		
		// 변수의 자료형의 종류
		// 숫자 자료형 정수 : byte, short, int, long 
		
		byte by; // 1 byte
		// 1 byte == 8bit 0000 0000 ~ 1111 1111 -> 256개 0 ~ 255
		// 맨 앞에 있는 bit는 부호 0 : +, 1 : -
		by = -128;
		
		short sh; // 2 byte short (int)
		sh = 12345;
		
		int i; // 4 byte
		i = 987654321;
		
		long l; // 8 byte long (int)
		l = 9876543210L; // 뒤에 L을 붙여 long형임을 명시해야 함
		
		// 실수 : float, double
		float f;
		f = 123.45678F; // 뒤에 F를 붙여 float형임을 명시해야 함
		
		double d;
		d = 123.456789;
		
		
		// 문자(열) 자료형
		// 문자
		char c; // 2 byte character (한글 포함) ASCII, UNICODE, MULTIBYTECODE
		c = 'A'; // "A" 는 에러
		c = '+'; // 연산자도 문자로 가능
		c = '한'; // 반드시 한 글자만 가능
		
		//문자열
		String str; // wrapper class
		str = "Hello";
		str = "nice to meet you";
		
		System.out.println(str);
		
		// 논리형 true(1), false(0) 예약어
		boolean b;
		b = true;
		b = false;
		System.out.println(b);
	}

}
