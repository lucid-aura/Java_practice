package programmers_모의고사;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
			int[] answers = { 1,3,2,4,2 };
	        int[] score = {0, 0, 0};
	        ArrayList<Integer> ans = new ArrayList<Integer>();
	        int[] one = { 1, 2, 3, 4, 5 };
	        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
	        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	        
	        for(int i = 0; i<answers.length; i++) {
	        	System.out.println(answers[i] + " " + three[i%10]);
	        	if(answers[i] == one[i%5]) {
	        		score[0]++;
	        	}
	        	if(answers[i] == two[i%8]) {
	        		score[1]++;
	        	}
	        	if(answers[i] == three[i%10]){
	        		score[2]++;
	        	}
	        }

	        int max_value = Arrays.stream(score).max().getAsInt();
	        for (int i = 0; i<3; i++) {
	        	if (max_value == score[i]){
	        		ans.add(i+1);
	        	}
	        }
	        
	        int[] answer = ans.stream().mapToInt(i -> i).toArray();
	        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] one = {1, 2, 3, 4, 5};
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] count = {0,0,0};
		for ( int i = 0; i<answer.size(); i++) {
			if (one[i%one.length] == answer.get(i%answer.size())) {
				count[0] += 1;
			}
			if (two[i%two.length] == answer.get(i%answer.size())) {
				count[1] += 1;
			}
			if (three[i%three.length] == answer.get(i%answer.size())) {
				count[2] += 1;
			}
		}*/
		
	}

}

/*
def solution(answers):
    answer = []
    one = [1,2,3,4,5]
    two = [2,1,2,3,2,4,2,5]
    three = [3,3,1,1,2,2,4,4,5,5]
    count = [0,0,0]
    for i in range(len(answers)):
        if one[i%len(one)] == answers[i%len(answers)]:
            count[0] += 1
        if two[i%len(two)] == answers[i%len(answers)]:
            count[1] += 1
        if three[i%len(three)] == answers[i%len(answers)]:
            count[2] += 1
    score = max(count)
    for i, v in enumerate(count):
        if v == score:
            answer.append(i+1)
    return answer
*/