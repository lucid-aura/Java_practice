package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class homework1_현상현 {

	public static void main(String[] args) {
		/*
		 	학생들의 정보를 2차원배열에 입력을 받는다
			(이름, 생년월일, 국어, 영어, 수학)
			
			각 학생들의 국어, 영어, 수학을 합친 총점은? 개개인의 총점 
			
			학생들의 국어점수의 총점은?
			
			영어 점수의 최고점수는 몇 점인가?
			
			수학점수의 최저점수는 몇 점인가?
			
			학급에서 1등은 누구인가? 이름을 출력하라.
		 */
		Scanner sc = new Scanner(System.in);
		
		/* 학생들의 정보를 2차원배열에 입력을 받는다 (이름, 생년월일, 국어, 영어, 수학)*/
		String student_info[][] = set_student_info(sc);
		for (int i = 0; i < student_info.length; i++) {
			System.out.println(Arrays.toString(student_info[i]));
		}
		
		
		int number_of_student = student_info.length;
		
		/* 각 학생들의 국어, 영어, 수학을 합친 총점은? 개개인의 총점 */
		int sum_scores[] = get_sum_scores(student_info, number_of_student);
		System.out.println("개개인의 총점 : " + Arrays.toString(sum_scores));
		
		/* 학생들의 국어점수의 총점은? */
		int total_korean_score = get_total_korean_score(student_info);
		System.out.println("국어점수의 총점 : " +total_korean_score);
		
		/* 영어 점수의 최고점수는 몇 점인가?*/
		int max_english_score = max_english_score(student_info);
		System.out.println("영어 최고점수 : " + max_english_score);
		
		/* 수학점수의 최저점수는 몇 점인가? */
		int min_math_score = min_math_score(student_info);
		System.out.println("수학 최저점수 : " +min_math_score);

		/* 학급에서 1등은 누구인가? 이름을 출력하라. */
		String first_place_name = get_first_place_name(student_info);
		System.out.println("1등 : " +first_place_name);
		/*
		 	이름	날짜	국어	영어	수학
		 	{"홍길동", "2001/03/25", "85", "90", "95" }
		 */
	}

	public static  String[][] set_student_info(Scanner sc){
		System.out.print("학생 수를 입력해주세요.");		
		int number_of_student = sc.nextInt();
		
		String student_info[][] = new String[number_of_student][5];
		
		String template[] = {"이름",	 "생일", "국어점수", "영어점수", "수학점수"};
		for (int i = 0; i < student_info.length; i++) {
			for (int j = 0; j < student_info[i].length; j++) {
				System.out.print(i+1 + "번째 학생의 " + template[j] + "(을)를 입력해주세요.");
				student_info[i][j] = sc.next();
			}
		}
		return student_info;
	}
	
	public static int[] get_sum_scores(String[][] student_info, int number_of_student) {
		int sum_scores[] = new int[number_of_student];
		for (int i = 0; i < student_info.length; i++) {
			for (int j = 2; j < student_info[i].length; j++) {
				sum_scores[i] += Integer.parseInt(student_info[i][j]);
			}
		}
		return sum_scores;
	}
	
	public static int get_total_korean_score(String[][] student_info) {
		int total_korean_score = 0;
		for (int i = 0; i < student_info.length; i++) {
			total_korean_score += Integer.parseInt(student_info[i][2]);
		}	
		return total_korean_score;
	}
	
	public static int max_english_score(String[][] student_info) {
		// 최저 점수는 0점이라 가정
		int max_english_score = 0;
		for (int i = 0; i < student_info.length; i++) {
			if (max_english_score < Integer.parseInt(student_info[i][3])) {
				max_english_score = Integer.parseInt(student_info[i][3]);
			}
		}	
		return max_english_score;
	}
	
	public static int min_math_score(String[][] student_info) {
		// 최대 점수는 100점이라 가정
		int min_math_score = 100;
		for (int i = 0; i < student_info.length; i++) {
			if (min_math_score > Integer.parseInt(student_info[i][4])) {
				min_math_score = Integer.parseInt(student_info[i][4]);
			}
		}	
		return min_math_score;
	}
	
	public static String get_first_place_name(String[][] student_info) {
		// 공동 우승 없다고 가정
		String first_place_name = "";
		int[] total_scores = get_sum_scores(student_info, student_info.length);
		int max_index = 0;
		int max_score = 0;
		for (int i = 0; i<total_scores.length; i++) {
			if (total_scores[i] > max_score) {
				max_score = total_scores[i];
				max_index = i;
			}
		}
		return student_info[max_index][0];
	}
}
