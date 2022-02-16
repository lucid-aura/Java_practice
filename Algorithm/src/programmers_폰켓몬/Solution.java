package programmers_폰켓몬;

import java.util.HashSet;


public class Solution {

	public static void main(String[] args) {
		int[] num = {3, 1, 2, 3};  // 개수 : N
		int len = num.length;
		HashSet<Integer> noDup = new HashSet<Integer>();
		for (int i = 0; i < len; i++) {
			noDup.add(num[i]);
		}

		System.out.println(Math.min((int)len/2, noDup.size()));
		// return answer;
	}
}