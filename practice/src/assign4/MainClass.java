package assign4;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 	사용자가 원하는 학생수로 점수를 입력받는다.
		 * 	총점, 평균 그리고 최고 점수를 구한다.
		 * 	입력 받은 점수 중에서 90점 이상인 학생의 수는 몇명인가?
		 * 	그리고 그 점수들만을 새로운 배열에 저장하도록 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		int count = sc.nextInt();
		int sum = 0;

		int[] scores = new int[count];
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i+1 + "번째 학생의 점수를 입력하세요 : ");
			scores[i] = sc.nextInt();
		}
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총점 : " + sum);
		
		double avg = sum/count;
		System.out.println("평균 : " + avg);
		
		int max_score = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max_score) {
				max_score = scores[i];
			}
		}
		System.out.println("최고점수 : " + max_score);
		
		int over_score = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 90) {
				over_score++;
			}
		}
		int over_count = 0;
		int[] over_scores = new int[over_score];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 90) {
				over_scores[over_count] = scores[i];
				over_count++;
			}
		}
		System.out.println("90점 이상 학생의 수 : " + over_count);
		System.out.print("90점 이상 학생의 점수 : ");
		for (int i = 0; i < over_scores.length; i++) {
			System.out.print(over_scores[i] + " ");
		}
		System.out.println();

		/*
		 * 숫자 입력 5개로 음수가 입력되면 다시 입력한다.
		 */	
		int num = 0;
		int[] numbers = new int[5];
		count = 0;
		do {
			System.out.print(count+1 + "번째 숫자(양수)를 입력해주세요 : ");
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("다시 입력하세요");
			}
			else {
				numbers[count] = num;
				count++;
			}
		}
		while(count < 5);
		System.out.print("입력한 5개의 양수 : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}	
	}

}
