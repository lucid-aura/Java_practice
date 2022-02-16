package programmers_두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4}; 	
		int[] b = {-3, -1, 0, 2};
		int answer = 0;
		for (int i = 0; i<a.length; i++) {
			answer += a[i]*b[i];
		}
		System.out.println(answer);
		// return answer;
	}
}