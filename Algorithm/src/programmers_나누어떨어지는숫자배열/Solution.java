package programmers_나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		
		int[] arr = {5,9,7,10};
		int divisor = 5;
		int answer[];
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				arrayList.add(arr[i]);
			}
		}
		if (arrayList.size() == 0) {
			int[] noAnswer = {-1};
			// return noAnswer;
		}
		Collections.sort(arrayList);
		answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		// return answer;
	}
}