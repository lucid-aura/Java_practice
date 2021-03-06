package day4;
import java.util.Scanner;

public class Number281016 {
	
	public int b;
	public int get(int a) {
		return a;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu >>>");
		System.out.println("1. 10진수 -> 2진수로 변환");
		System.out.println("2. 10진수 -> 8진수로 변환");
		System.out.println("3. 10진수 -> 16진수로 변환");
		System.out.println("4. 2진수 -> 10진수로 변환");
		System.out.println("5. 8진수 -> 10진수로 변환");
		System.out.println("6. 16진수 -> 10진수로 변환");
		System.out.print("원하시는 처리 번호를 입력해 주세요 >> ");
		
		int work = sc.nextInt();
		
		System.out.print("변경하고 싶은 숫자를 입력해 주십시오 >> ");
		String numStr = sc.next();
		
		switch(work) {
			case 1:
//				int num10to2 = Integer.parseInt(numStr);
//				String num2 = Integer.toBinaryString(num10to2);
				String num2 = decToBin(numStr);
				System.out.println("10진수 " + numStr + " 의 2진수는" + num2 + "입니다.");
				break;
			case 2:
//				int num10to8 = Integer.parseInt(numStr);
//				String num8 = Integer.toOctalString(num10to8);
				String num8 = decToOct(numStr);
				System.out.println("10진수 " + numStr + " 의 8진수는" + num8 + "입니다.");
				break;
			case 3:
//				int num10to16 = Integer.parseInt(numStr);
//				String num16 = Integer.toHexString(num10to16);
				String num16 = decToHex(numStr);
				System.out.println("10진수 " + numStr + " 의 16진수는" + num16 + "입니다.");
				break;
			case 4:
//				int num2to10 = Integer.parseInt(numStr, 2);
				int num2to10 = binToDec(numStr);
				System.out.println("2진수 " + numStr + " 의 10진수는" + num2to10 + "입니다.");
				break;
			case 5:
//				int num8to10 = Integer.parseInt(numStr, 8);
				int num8to10 = octToDec(numStr);
				System.out.println("8진수 " + numStr + " 의 10진수는" + num8to10 + "입니다.");
				break;
			case 6:
//				int num16to10 = Integer.parseInt(numStr, 16);
				int num16to10 = hexToDec(numStr);
				System.out.println("16진수 " + numStr + " 의 10진수는" + num16to10 + "입니다.");
				break;
		}

	}
	
	static String decToBin(String numStr) {
		int num10to2 = Integer.parseInt(numStr);
		String num2 = Integer.toBinaryString(num10to2);
		return num2;
	}
	
	static String decToOct(String numStr) {
		int num10to8 = Integer.parseInt(numStr);
		String num8 = Integer.toOctalString(num10to8);
		return num8;
	}
	
	static String decToHex(String numStr) {
		int num10to16 = Integer.parseInt(numStr);
		String num16 = Integer.toHexString(num10to16);
		return num16;
	}
	
	static int binToDec(String numStr) {
		int num2to10 = Integer.parseInt(numStr, 2);
		return num2to10;
	}
	
	static int octToDec(String numStr) {
		int num8to10 = Integer.parseInt(numStr, 8);
		return num8to10;
	}

	static int hexToDec(String numStr) {
		int num16to10 = Integer.parseInt(numStr, 16);
		return num16to10;
	}
}
