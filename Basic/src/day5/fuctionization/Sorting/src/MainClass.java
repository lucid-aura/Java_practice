import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		
		// 정렬 프로그램
		//int count;	// 몇개를 정렬할지의 변수
		int number[] = null;
		int updown[] = new int[1];
		
		// 입력
		// user 몇개의 숫자를 정렬?
		// 갯수를 결정
		number = input( updown );
		/*
		System.out.print("몇개의 숫자를 정렬 = ");
		int count = sc.nextInt();
		
		number = new int[count];
		// 숫자들을 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 오름/내림
		System.out.print("오름(1)/내림(2) = ");
		updown = sc.nextInt();
		*/
		
		// 정렬처리
		sorting(number, updown[0]);	// 1, 2
		/*
		int temp;		
		for (int i = 0; i < number.length - 1; i++) {	// [0][1][2][3][4]
			for (int j = i + 1; j < number.length; j++) {				
				if(updown == 1) {					
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;								
					}
				}
				else {
					
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;								
					}
				}
			}
		}
		*/
		
		// 결과출력
		//System.out.println(Arrays.toString(number));
		result(number, updown[0]);
				
		
		
		/*
		int number[] = { 3, 5, 1, 4, 2 };
					//	 1 ->					Debug : 
					//		2 ->
					//		   3 ->
					//			  4 ->		
		int temp;
		for(int i = 0;i < number.length - 1; i++) {			
			for(int j = i + 1; j < number.length; j++ ) {				
				if(number[i] < number[j]) {		// 교환처리
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}			
		}

		System.out.println(Arrays.toString(number));
		*/
	}
	
	static int[] input(int[] updown) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("몇개의 숫자를 정렬 = ");
		int count = sc.nextInt();
		
		int number[] = new int[count];
		// 숫자들을 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 오름/내림
		System.out.print("오름(1)/내림(2) = ");
		updown[0] = sc.nextInt();
		
		return number;
	}
	
	static void sorting(int number[], int updown) {
			
		for (int i = 0; i < number.length - 1; i++) {	// [0][1][2][3][4]
			for (int j = i + 1; j < number.length; j++) {				
				if(updown == 1) {					
					if(number[i] > number[j]) {
						swap(number, i, j);					
						/*	temp = number[i];
						number[i] = number[j];
						number[j] = temp;	*/							
					}
				}
				else {							
					if(number[i] < number[j]) {
						swap(number, i, j);
					/*	temp = number[i];
						number[i] = number[j];
						number[j] = temp;*/								
					}
				}
			}
		}
	}
	
	static void swap(int number[], int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	
	static void result(int number[], int updown) {
		String msg = "";
		if(updown == 1) msg = "오름차순으로 정렬되었습니다.";
		else			msg = "내림차순으로 정렬되었습니다.";
		System.out.println(msg + " " + Arrays.toString(number));
	}
	
}








