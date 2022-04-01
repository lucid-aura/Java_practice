package programmers_H_Index;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int answer = 0;
		
		// 내림차순 정렬을 위해 Integer형 변수로 변환 후 sort 함수 호출
		Integer[] integerCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
		Arrays.sort(integerCitations, Collections.reverseOrder()); 
		
		for (int i = 0; i<integerCitations[0]; i++) {
			int cnt = 0;
			for (int citation : integerCitations) { // i번 이상 인용된 논문 개수를 구한다.
				if (i <= citation) {
					cnt++;
				}
			}
			if (cnt >= i && i > answer) { // 인용된 논문의 개수가 i개 이상이면
				answer = i;
			}
		}
		//return answer;
		System.out.println(answer);
	}
}