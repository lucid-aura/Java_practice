package no_9625_BABBA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		int[] countA = new int[K+1];
		int[] countB = new int[K+1];
		
		countA[0] = 1;
		countB[0] = 0;
		
		countA[1] = 0;
		countB[1] = 1;

		for (int i = 2; i<K+1; i++) {
			countA[i] = countA[i-1] + countA[i-2];
			countB[i] = countB[i-1] + countB[i-2];
		}
		
		bw.write(countA[K] + " " + countB[K]);
		bw.flush();
	}
}