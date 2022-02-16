package programmers_내적;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		int[] numbers = {2, 1, 3, 4, 1};
		
		List<Integer> sum =  new ArrayList<Integer>();
		
		for (int i = 0; i<numbers.length-1; i++) {
			for (int j = i+1; j<numbers.length; j++) {
				if (!sum.contains(numbers[i]+numbers[j])){ // ! : not의 의미 true -> false, false -> true
					sum.add(numbers[i] + numbers[j]);
				}
				//sum.sort(null);
			}
		}
		
		/*
		// ?, !!
		// null
		Integer a = null;
		int b = null;
		*/
		
		
		// 1
		int[] answer = new int[sum.size()];
		for (int i = 0; i<sum.size(); i++) {
			answer[i] = sum.get(i);
		}
		
		// 2
		answer = sum.stream().mapToInt(i -> i).toArray();
		// 3
		answer = sum.stream().mapToInt(Integer::intValue).toArray();

		
		for (int i : answer) {
			System.out.print(i + " ");
		}
		Arrays.sort(answer);
		System.out.println();
		for (int i : answer) {
			System.out.print(i + " ");
		}
		// return answer;
	}
}