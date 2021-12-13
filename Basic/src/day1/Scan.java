package day1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) throws Exception {
		// 입력(console)
		Scanner scan = new Scanner(System.in);
		
//		int iNumber;
//		System.out.print("정수 = ");
//		iNumber = scan.nextInt();
//		System.out.println("입력받은 정수 : " + iNumber);

//		double dNumber;
//		System.out.print("실수 = ");
//		dNumber = scan.nextDouble();
//		System.out.println("입력받은 실수 : " + dNumber);
		
//		boolean b;
//		System.out.print("true/false = ");
//		b = scan.nextBoolean();
//		System.out.println("논리형 : " + b);
		
//		String str;
//		System.out.print("string = ");
//		str = scan.next();
//		System.out.println("입력받은 문자열 : " + str); // 공백 인식 불가
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.print("string = ");
		str = br.readLine();
		System.out.println("입력받은 문자열 : " + str);
		
	}

}
