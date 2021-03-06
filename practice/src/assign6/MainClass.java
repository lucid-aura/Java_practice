package assign6;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 넣어주세요 :");
		int quest1 = sc.nextInt();
		char answer1 = ascToChar(quest1);
		System.out.println("넣은 수 : " + quest1 + "답 : " + answer1);
		
		int quest2[] = new int[2];
		int answer2_div[] = new int[2];
		System.out.print("피제수를 넣어주세요 :");
		quest2[0] = sc.nextInt();
		do {
			System.out.print("0을 제외한 제수를 넣어주세요 :");
			quest2[1] = sc.nextInt();
		}while(quest2[1] == 0);
		
		System.out.print("넣은 수 : " + quest2[0] + ", " + quest2[1]);
		int answer2 = divide(quest2, answer2_div);
		System.out.println(" 답 : 몫=" + answer2 + ", 나머지=" + quest2[1]);
		
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		System.out.print("x1? :");
		x1 = sc.nextDouble();
		System.out.print("x2? :");
		x2 = sc.nextDouble();
		System.out.print("y1? :");
		y1 = sc.nextDouble();
		System.out.print("y2? :");
		y2 = sc.nextDouble();
		double answer3 = distance(x1, y1, x2, y2);
		System.out.println("넣은 수 :  "+ x1 + ", " + x2 + ", " + y1 + ", " + y2);
		System.out.println(" 답 : " + answer3);


		System.out.print("숫자를 넣어주세요 :");
		String quest4 = sc.next();
		boolean answer4 = isDouble(quest4);
		System.out.print("입력한 숫자 " + quest4 + "는");
		System.out.println(answer4 ? "실수입니다!" : "정수입니다!");
		
		int twoDarray[][] = {
			{ 11, 12, 13 },
			{ 21, 22, 23 }	,
			{ 31, 32, 33 }	,
			{ 41, 42, 43 },
		};
		int answer5[] =  array2ToArray1(twoDarray);
		System.out.println(Arrays.toString(answer5));
	}

	// 아스키 코드 값을 입력하면 문자를 확인할 수 있는 함수를 작성하라.
	static char ascToChar(int asc) {
		return (char)asc;
	}
	
	
	// 두수의 나눗셈을 하는 함수를 작성하라. 하나의 함수에서 몫과 나머지를 구한다.
	static int divide(int[] quest, int answer2_div[]) {
		int a = quest[0];
		int b = quest[1];
		answer2_div[0] = (int)a/b;
		answer2_div[1] = a%b;
		return answer2_div[0];
	}
	
	// 두점 사이의 거리를 구하는 함수를 작성하라. 
	// static double distance(double x1, double y1, double x2, double y2)
	// 	root (y2 - y1)2승 + (x2 - x1)2승
	static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2));
	}
	

	// 입력된 숫자가 정수인지 실수인지 확인할 수 있는 함수를 작성하라.
	static boolean isDouble(String snumber) {
		if (snumber.contains(".")){
			return true;
		}
		else {
			return false;
		}
	}
	
	// 2차원 배열을 1차원 배열로 변경해서 리턴하는 함수를 작성하라.
	static int[] array2ToArray1(int array[][]) {
		int length = array.length*array[0].length;
		int answer[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				answer[i*array[i].length + j] = array[i][j];
			}
		}
		return answer;
	}
}
