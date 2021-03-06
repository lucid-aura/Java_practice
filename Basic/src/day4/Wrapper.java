package day4;

public class Wrapper {

	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 *	일반 자료형(char, int, double)을 사용하기 편리하도록 구현해 놓은 것.
		 *	문자열 -> '가' '나' '다' 를 합쳐서 "가나다"
		 *	
		 *	일반 자료형			Wrapper Class(Object)
		 *	boolean				Boollean
		 *
		 *	byte					Byte
		 *	short					Short
		 *	int						Integer
		 *	long					Long
		 *	
		 *	float					Float
		 *	double				Double
		 *
		 *	char					Character
		 *	char[]				String
		 */
		
		// Integer == int
		int i = 123;
		Integer iobj = 123;
		
		System.out.println("i = " + i);
		System.out.println("iobj = " + iobj);
		
		// class == 설계, 구성 + 변수 + 함수(메소드) - 기능
		// MyClass cls = new MyClass();
		Integer test_iobj = new Integer(123);
		
		String str = "Hello";
		String strObj = new String("hello");
		
		// 숫자 -> 문자열
		Integer objNumber = 123;
		String numToStr = objNumber.toString() + 1;
		System.out.println(numToStr);
		
		int num = 123;
		String numToStr2 = num + "";
		System.out.println(numToStr2);
		
		double dnum = 123.456;
		String numToStr3 = dnum + "";
		System.out.println(numToStr3);
		
		
		// 문자열 -> 숫자
		String strToNum = "12345";
		int n = Integer.parseInt(strToNum);
		System.out.println(n+1);
		
		String strToDnum = "123.4567";
		double d = Double.parseDouble(strToDnum);
		System.out.println(d);
		
		// 2진수, 8진수, 10진수, 16진수 진법 변환
		int num2 = 010111;
		System.out.println(num2);
		/*
		 * 	1010		1100
		 * 	8421		8421
		 * 	(16*10)+(1*12)
		 * 	160		+	12		-> 172
		 */
		
//		String number2 = "10101100";
//		int number10 = Integer.parseInt(number2, 2);
//		System.out.println(number10);
		
		// 10 -> 2
		int number10to8 = 43;
		String str10to8= Integer.toBinaryString(number10to8);
												// Integer.toOctalString(i)	8진수
												// Integer.toHexString(i) 16진수
		System.out.println(str10to8);
		
		// 8 -> 10
		String number8to10 = "123";
		int number10 = Integer.parseInt(number8to10, 8);
		System.out.println(number10);
		
		// 10 -> 16
		int number10to16 = 43;
		String str10to16= Integer.toHexString(number10to16);
		System.out.println(str10to16);
												// Integer.toOctalString(i)	8진수
												// Integer.toHexString(i) 16진수
		// 16 -> 10
		String number16to10 = "123";
		int number16 = Integer.parseInt(number16to10, 16);
		System.out.println(number16);
	}

}
