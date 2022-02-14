package programmers_음양더하기;

public class Solution {

	public static void main(String[] args) {
		int absolutes[] = {4, 7, 12};
		boolean[] signs = {true, false, true};
		
		int total = 0;
		for (int  i = 0; i<absolutes.length; i++) {
			total += absolutes[i] * (signs[i] ? 1 : -1);
		}
		System.out.println(total);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int absolutes[] = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int answer = 0;
		for (int i = 0; i<absolutes.length; i++) {
			answer += absolutes[i]*(signs[i] ? 1 : -1);
		}
		System.out.println(answer);
		*/
	}

}
