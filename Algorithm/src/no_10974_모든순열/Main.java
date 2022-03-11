package no_10974_모든순열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/*
 * 1. main에서 호출 된 후 현재 함수 호출의 스택 상태, 재귀 정도(몇 계단까지 들어갔는지) - 강력 권장
 * 2. 50번째 줄을 실행할 때 result, sub, new_sub의 값이 들어가 있는 상태를 반드시 확인해보세요!
 * 3. 메모장을 이용하셔도 좋고 직접 필기구로 적으면서 하셔도 좋습니다. (표 형식도 좋고 원하는 방식대로 해주세요)
 */
public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();		
		ArrayList<Integer> sub = new ArrayList<Integer>(); // 빈배열 []
		DFS(result, sub, N);
		for (int i = 0; i<result.size(); i++) {
			for (Integer num : result.get(i)) {
				bw.write(num + " ");
			}
			bw.write("\n");
			bw.flush();
		}
    }
    
    public static void DFS(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> sub, int N) {
    	if (sub.size() == N-1) { // 예외처리 (탈출 조건) 한 배열의 개수가 N개일 때 [1, 2] [1,3], [2,3]...
    		for (int i = 1; i<=N; i++) { //  [1, 2] [1,3], [2,3]...
    			if (!sub.contains(i)) {
    				ArrayList<Integer> new_arr = new ArrayList<Integer>();
    				new_arr.add(i); // [1,2,3], [1,3,2] 213, 231
    				result.add(sub); // 최종 결과 2차원 배열에 완성시킨 1차원 배열을 담는다.
    	    		break;
    			}
    		}
    		return; // 결과 2차원 배열 반환
    	}
    	for (int i = 1; i<=N; i++) { // 1~N까지 숫자를 넣어주기 위해 for문
    		if (!sub.contains(i)) { // 포함이 안된 숫자이면 넣어줘야 한다.(포함되면 제외 - 백트래킹)
    			ArrayList<Integer> new_sub = (ArrayList<Integer>) sub.clone();
    			new_sub.add(i); // 추가할 숫자를 새로운 배열에 추가한다. [1] -> [1, 2], [1,3] , [2] 2 1 ,2 3
    			/* 여기 부분에서의 상태를 적어주세요 */
    			DFS(result, new_sub, N); // [1] -> [2]
    		}
    	}
		return;
    }
}