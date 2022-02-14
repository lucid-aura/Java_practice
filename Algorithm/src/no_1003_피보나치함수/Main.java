package no_1003_피보나치함수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			
			if (N == 0 || N == 1) {
				bw.write("1\n");
				bw.flush();
			}else {
				int[] fibo = new int[N+1];
				fibo[0] = 1;
				fibo[1] = 1;
				for (int j = 2; j<N+1; j++) {
					fibo[j] = fibo[j-1] + fibo[j-2];
				}
				bw.write(fibo[N] + "\n");
				bw.flush();
			}
			
		}
		
	}

}
