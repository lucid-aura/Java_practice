package assign3;

import java.util.Scanner;

public class MyCalc {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 계산기 */
		
		// 1. 입력
		// 첫번째 숫자

//		String first_value = "";
//		do {
//			System.out.print("첫번째 숫자 : ");
//			first_value = scan.next();
//		}while(!check_format(first_value));
		
//		double first_number = Double.parseDouble(first_value);
		
		double first_number = get_number(scan, false);
		
		// 연산자
//		String operator;
//		do {
//			System.out.print("연산자 : ");
//			operator = scan.next();
//		}while(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") &&  !operator.equals("/"));
		
		String operator = get_operator(scan);

		// 두번째 숫자
		
//		String second_value = "";
//		do {
//			System.out.print("두번째 숫자 : ");
//			second_value = scan.next();
//		}while(!check_format(second_value));
//		double second_number = Double.parseDouble(second_value);
		double second_number = get_number(scan, true);
			
		double answer = calculate(first_number, operator, second_number);
		// 2. 연산
//		double answer = 0;
//		switch (operator) {
//		case "+":
//			answer = first_number + second_number;
//			break;
//		case "-":
//			answer = first_number - second_number;
//			break;
//		case "*":
//			answer = first_number * second_number;
//			break;
//		case "/":
//			answer = first_number / second_number;
//			break;
//		}
//		
//		// 3. 결과 출력
//		System.out.println(first_number + operator + second_number + " = " + answer);
//		
	}

	static boolean check_format(String str, boolean deno) {
		// 변수에 입력된 문자가 숫자로만 되어있는지 아니면 다른 문자인지
		int cNum = 0;
		boolean isNum = true;
		for (int i = 0; i < str.length(); i++) {
			cNum = str.charAt(i) - '0';
			if (cNum < 0 || cNum > 9 || (deno && cNum == 0)) {
				isNum = false;
				break;
			}
		}
		return isNum;
	}
	
	static double get_number(Scanner sc, boolean deno) {
		String value = "";
		do {
			if (!deno) {
				System.out.print("첫번째 숫자 : ");
			}
			else {
				System.out.print("두번째 숫자 : ");
			}
			
			
			value = sc.next();
		}while(!check_format(value, deno));
		
		double number = Double.parseDouble(value);
		return number;
	}
	
	static String get_operator(Scanner sc) {
		String operator;
		do {
			System.out.print("연산자 : ");
			operator = sc.next();
		}while(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") &&  !operator.equals("/"));
		return operator;
	}
	
	static double calculate(double first_number, String operator, double second_number) {
		double answer = 0;
		switch (operator) {
		case "+":
			answer = first_number + second_number;
			break;
		case "-":
			answer = first_number - second_number;
			break;
		case "*":
			answer = first_number * second_number;
			break;
		case "/":
			answer = first_number / second_number;
			break;
		}
		
		// 3. 결과 출력
		System.out.println(first_number + operator + second_number + " = " + answer);
		return answer;
	}
}
