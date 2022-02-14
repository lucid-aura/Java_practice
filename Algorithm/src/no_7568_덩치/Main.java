package no_7568_덩치;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		// 선언 부분
		int N = Integer.parseInt(br.readLine());
		int[][] table = new int[N][2];
		int[] rank = new int[N];
		
		// 입력 부분
		for(int i = 0; i<N; i++) {
			String[] xy = br.readLine().split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			table[i][0] = x;
			table[i][1] = y;
			rank[i] = 1;
		}
		
		// 구현 부분 : 브루트 포스 알고리즘 적용 : 가능한 모든 조합을 확인하고 비교할 수 있도록 짜는 알고리즘이다.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j && table[i][0] > table[j][0] && table[i][1] > table[j][1]) {
					rank[j]++;
				}
			}
		}
		
		
		// 출력 부분
		for (int i : rank) {
			bw.write(i + " ");
		}
		bw.flush();
	}

}