package day3;

public class For {

	public static void main(String[] args) {
		
		/*
		 * 	for (초기화; 조건식; 연산식) {
		 * 		처리
		 * 	}
		 */
		int n;
		for (n=0; n<2; n++) {
			System.out.println("for loop" + n);
		}
		
		for (int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i=0; i<20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i=10; i<0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i=0; i<10; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println();

		int sum = 0;
		for (int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		// 학생 5명의 국어 성적의 합계와 평균
		// 90, 85, 95, 100, 85, 75
		int numArr[] = new int[6];
		numArr[0] = 90;
		numArr[1] = 85;
		numArr[2] = 95;
		numArr[3] = 100;
		numArr[4] = 85;
		numArr[5] = 75;
		
		int max_score = numArr[0];
		int max_index = 0;
		for (int i=0; i< numArr.length; i++) {
			if (numArr[i] > max_score) {
				max_score = numArr[i];
				max_index = i;
			}
		}
		System.out.println("최고 점수는 " + max_index + "번 " + max_score +"점 입니다.");
		
		
		sum = 0;
		for (int i = 0; i< numArr.length; i++) {
			sum += numArr[i];
		}
		System.out.println("sum : " + sum);
		
		double avg = (double)sum / numArr.length;
		System.out.println("avg : " + avg);
		
		int number = 0;
		String names[] = { "홍길동", "일지매", "성춘향", "홍두깨" };
		for (int i=0; i< names.length; i++) {
			number++;
			if (names[i].equals("성춘향")) {
				System.out.println("찾았습니다.");
				System.out.println("번호는 " + number + "번 입니다.");
			}
		}
		
		// for each
		for (int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (int num : numArr) {
			System.out.print(num + " ");
		}
		System.out.println();
		for (String str : names) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		for (int i= 0; i<10; i++) {
			
			for (int j= 0; j<5; j++) {
				System.out.print(i + "x" + j + " = " + (i*j) + " ");
			}
			System.out.println();
		}
		
		int array2[][] = {
				{ 11, 12, 13, 14 },
				{ 21, 22, 23, 24 },
				{ 31, 32, 33, 34 },
		};
		
		for (int i= 0; i<array2.length; i++) {
			
			for (int j= 0; j<array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
