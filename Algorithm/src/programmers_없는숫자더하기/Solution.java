package programmers_없는숫자더하기;

public class Solution {

	public static void main(String[] args) {
		 // 0 ~ 9 = 45
		int answer = 45;
		int[] numbers = {1,2,3,4,6,7,8,0};
		for (int i = 0; i<numbers.length; i++) {
			answer -= numbers[i];
		}
		System.out.println(answer);
		//return answer;
	}

}
