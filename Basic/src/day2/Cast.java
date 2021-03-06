package day2;

public class Cast {

	public static void main(String[] args) {
		/*
		 * 	자료형			byte				우선순위
		 * 	boolean		1						낮음
		 * 	byte			1
		 * 	short			2
		 * 	int				4
		 * 	long			8
		 * 	float			4
		 * 	double		8
		 * 	char			2
		 * 	String		"ABC" -> 6	높음	
		 * 
		 * 	(자료)형 볁환
		 * 	자동 (자료)형 변환
		 * 	강제 (자료)형 변환 -> Cast
		 */
		
		// 자동 (자료)형 변환
		short sh = 12345;
		int num;
		
		num = sh;
		System.out.println(num);
		
		// 강제 (자료)형 변환
		num = 234567;
		sh = (short)num;
		System.out.println(sh);
		
		long l = 123456789L;
		float f;
		
		f = l;
		System.out.println(f);
		
		double d = 1.23e3;
		/*
		 * 	1.23e3  e3 == 10의 3제곱 == 1000 -> 1.23 * 1000
		 */
		System.out.println(d);
		
		d = 2.34e-2;
		/*
		 * 	2.34e-2 e-2 == 1/10의 제곱 == 0.01 -> 2.34 * 0.01
		 */
		System.out.println(d);
		
		int number1, number2;
		float fnum;
		
		number1 = 3;
		number2 = 2;
		
		fnum = (float)number1 / number2;
		System.out.println(fnum);
	}

}
