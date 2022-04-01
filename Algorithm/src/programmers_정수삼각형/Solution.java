package programmers_정수삼각형;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Solution {

	public static void main(String[] args) {
		// 한 노드의 최대 경로 값은 그 이전 노드의 최대 경로 값 + 해당 노드의 값
		
		int[][] triangle = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}}; 
		// 초기화 및 초기값 넣어주는 부분 {7}
		ArrayList<ArrayList<Integer>> max_tree = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> init = new ArrayList<Integer>();
		init.add(triangle[0][0]);
		max_tree.add(init);
		for (int i = 0; i<triangle.length-1; i++) { // 7을 넣었으니 length-1만큼만 추가
			max_tree.add(new ArrayList<Integer>());
		}
		System.out.println(max_tree);
		
		// 방문할 수 있는 모든 원소를 접근한다.
		for (int depth = 1; depth < triangle.length; depth++) {
			for (int idx = 0; idx < triangle[depth].length; idx++) {
				int left = 0;
				int right = 0;
				if (idx > 0) { // 가장 왼쪽에 있을 경우 제외
					left = max_tree.get(depth-1).get(idx-1);
				}
				if (idx < triangle[depth].length - 1) { // 가장 오른쪽에 있을 경우 제외
					right = max_tree.get(depth-1).get(idx);
				}
				max_tree.get(depth).add(Math.max(left,  right) + triangle[depth][idx]); // 방문 경로에 값들 + 방문한 곳에 값
			}
		}
		
		int answer = Collections.max(max_tree.get(max_tree.size()-1)); // 마지막 원소들 중 최대값
		
		for (ArrayList<Integer> row : max_tree) {
			System.out.println(row);
		}
		System.out.println(answer);
		//return answer;

	}
}