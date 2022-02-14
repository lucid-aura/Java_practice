package no_11047_동전0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		int coinCount = 0;
		
		int[] coins = new int[N];
		for (int i = N-1; i >=0; i--) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i<N; i++) {
			// 조건에 부합하였을 경우 coinCount 증가
			if (K >= coins[i]) {
				// 몫 구해주면 필요 코인 개수
				coinCount += (int)K/coins[i]; // 사용된 코인의 개수를 더해준다.
				K %= coins[i]; // 코인 사용 후 남은 금액
			}
			
			// 이미 금액을 완성했을 경우 더 작은 가치의 코인을 볼 필요가 없다.
			if (K == 0) {
				break;
			}
		}
		
		bw.write(coinCount + "");
		bw.flush();
	}
	/* 4200 잔액 -> 200원 1. 빼기, 2. 나머지
	1
	5
	10
	50
	100 2개 사용
	500
	1000 4개 사용
	5000
	10000
	50000
	*/
	
	/*
	배열의 크기 = N (10)
	첫번째 for i 9 8 7 6 5 4 3 2 1 0
	*/

	
	/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String[] NK = br.readLine().split(" ");
		int answer = 0;
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		
		ArrayList<Integer> coins = new ArrayList<Integer>();
		for(int i = 0; i<N; i++) {
			coins.add(Integer.parseInt(br.readLine()));
		}
		Collections.reverse(coins);
		
		for (Integer coin : coins) {
		    if (K >= coin) {
		        answer += (int)K/coin;
		        K %= coin;
		    }
		}
		bw.write(answer+"");
		bw.flush();
	}
	 */
}
