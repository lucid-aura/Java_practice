package day2;

public class Operator {

	public static void main(String[] args) {
		/*
		 * 	Operator : 연산자
		 * 	+ - * / %
		 * 	++ increment
		 * 	-- decrement
		 */
		
		int number1, number2;
		int result;
		
		number1 = 25;
		number2 = 7;
		
		result = number1 + number2;
		System.out.println(result);
		
		result = number1 - number2;
		System.out.println(result);
		
		result = number1 * number2;
		System.out.println(result);
		
		result = number1 / number2; // divide by zero 조심
		System.out.println(result);
		
		// ++ --
		number1 = 0;
		number1 = number1 + 1;
		System.out.println(number1);
		number1 += 1;
		System.out.println(number1);
		number1++;
		System.out.println(number1);
		
		
		int num1, num2;
		num1 = 0;
		num2 = 0;
		
		num2 = (num1++); // 괄호도 소용 없다.
		// num2 = ++num1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
				
	}

}
