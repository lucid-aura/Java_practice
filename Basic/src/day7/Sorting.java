package day7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	int number[];
	int updown;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개 정렬 = ");
		int count = sc.nextInt();
		number = new int[count];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		System.out.print("오름(1)/내림(2) = ");
		updown = sc.nextInt();
	}
	
	void sorting() {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (updown == 1) {
					if (number[i] < number[j]) {
						swap(number[i], number[j]);
					}
				}
				else {
					if (number[i] > number[j]) {
						swap(number[i], number[j]);
					}
				}
			}
		}
	}
	
	void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
			
		//		int temp = number[i];
//		number[i] = number[j];
//		number[j] = temp;
	}
	
	void result() {
		System.out.println(Arrays.toString(number));
	}

}
