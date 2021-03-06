package assign7;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double first_number = get_number(scan, false);
		String operator = get_operator(scan);
		double second_number = get_number(scan, true);
		double answer = calculate(first_number, operator, second_number);
	}

	static boolean check_format(String str, boolean deno) {
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
				System.out.print("0을 제외한 두번째 숫자 : ");
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
		System.out.println(first_number + operator + second_number + " = " + answer);
		return answer;
	}
}
