package no_10974_모든순열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 1; i<=N; i++) { // 1, 2, 3
			ArrayList<Integer> sub = new ArrayList<Integer>(); 
			sub.add(i); // N = 3 [1], [2], [3] sub = [1], [2], [3]
			DFS(result, sub, N); 
			// 첫번째 for문 result [ [1,2,3], [1,3,2] ] 
			// 두번째 for문 result [ [1,2,3], [1,3,2], [2,1,3], [2,3,1] ]
			// 세번째 for문 result [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
		}

		for (int i = 0; i<result.size(); i++) {
			for (Integer num : result.get(i)) {
				bw.write(num + " ");
			}
			bw.write("\n");
			bw.flush();
		}
    }
    
    // ArrayList<ArrayList<Integer>>
    /*
    public static void DFS(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> sub, int N) {
    	if (sub.size() == N) { // 예외처리 (탈출 조건) 한 배열의 개수가 N개일 때
    		result.add(sub); // 최종 결과 2차원 배열에 완성시킨 1차원 배열을 담는다.
    		return; // 결과 2차원 배열 반환
    	}
    	for (int i = 1; i<=N; i++) { // 1~N까지 숫자를 넣어주기 위해 for문
    		if (!sub.contains(i)) { // 포함이 안된 숫자이면 넣어줘야 한다.(포함되면 제외 - 백트래킹)
    			ArrayList<Integer> new_sub = new ArrayList<Integer>(); // 새로운 배열을 선언(deep vs shallow copy...)
    			for (Integer num : sub) { // 새로운 배열에 값을 복사하여 똑같이 저장한다.
					new_sub.add(num);
				}
    			new_sub.add(i); // 추가할 숫자를 새로운 배열에 추가한다.
    			DFS(result, new_sub, N); //
    		}
    	}
		return;
    }
    */
    
    // 참조형 변수
    
    public static ArrayList<ArrayList<Integer>> DFS(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> sub, int N) {
    	if (/*1층 : [3] 2층 : [3, 2] 3층 : [3, 2, 1]*/sub.size() == N) { // 예외처리 (탈출 조건) 한 배열의 개수가 N개일 때
    		result.add(sub); // 3층 에서의 result : [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
    		return result; 
    	}
    	// [3]
    	for (int i = 1; i<=N; i++) { // 1~N까지 숫자를 넣어주기 위해 for문 i = 3
    		if (!sub.contains(i)) {

    			ArrayList<Integer> new_sub = new ArrayList<Integer>(); // [] 새로운 배열을 선언(deep vs shallow copy...)
    			for (Integer num : sub) { // 새로운 배열에 값을 복사하여 똑같이 저장한다.
					new_sub.add(num); // 1층(sub [3] , new sub =[3]) 2층(sub [3, 2]) 
				} // sub 리스트에 있는 값들을 복사해서 new_sub에 옮겨준다.
    			
    			new_sub.add(i); // 추가할 숫자를 새로운 배열에 추가한다. new sub = 1층 : [3, 2] 2층 : [3, 2, 1]

    			/* 윗층에서의 result로 갱신한다.*/ 
    			result = DFS(result, new_sub, N); // 결과(1, 2층)를 갱신해준다. DFS([ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ], [], 3)
    		}
    	}
		return result;
    }
}