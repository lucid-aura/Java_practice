package no_11052_카드구매하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
	
	/*
		카드를 1개 구매한다.
		- 카드 1개짜리 1 (P1 값) // 예외처리(초기화)
	
		카드를 2개 구매한다. 최대값은 (아래 2개중 1개)
		- 카드 1개짜리 *2 (P1 값)*2
		- 카드 2개짜리 1 (P2 값)
	
		카드를 3개 구매한다.
		- 카드 1개팩 *3
		- 카드 2개팩 1, 카드 1개팩 1
		- 카드 3개팩 1
	
		카드를 4개 구매한다.
		- 카드 1개팩, 카드 3개팩
		- 카드 2개팩 *2
		- 카드 4개팩
	
		카드를 N개 구매한다.
		N개보다 작은 카드팩을 나누어서 구매하는 방법들 or N개짜리 팩 하나 구매 중 최대값
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		int[] P = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int[] card = new int[N]; // 메모이제이션
		for (int i = 0; i<card.length; i++) {
			card[i] = 0;
		}

		card[0] = P[0];
		
		for (int i = 1; i<N; i++) {
			int comp = 0; // 카드 총 구매 비용
			for(int j = 0; j<=i/2; j++) { // comp 10
				if (comp < card[j] + card[(i-j-1)]) {
					System.out.println("i, j, c[j], c[i-j-1]: "+i + " " + j + " " + card[j] +" " + card[(i-j-1)]);
					
					comp = card[j] + card[(i-j-1)];
				}
			}
			if (comp < P[i]) {
				comp = P[i];
			}
			
			card[i] = comp;
			System.out.println("card: "+card[0] + " " + card[1] + " " + card[2] +" " + card[3]);
			System.out.println(card[i]);
		}
		
		bw.write(card[N-1] + "");
		bw.flush();
	}
}