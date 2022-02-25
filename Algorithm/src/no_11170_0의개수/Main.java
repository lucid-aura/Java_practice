package no_11170_0의개수;

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
		for(int i = 0; i<T; i++) {
			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			bw.write(count(N, M) + "\n");
			bw.flush();
		}	
	}
	
	public static int count(int N, int M) {
		int count = 0;
		for (int i = N; i <= M; i++) {
			int number = i;
			if (number == 0) {
				count++;
			}
		    while(number != 0) {
		        int digit = number % 10;
		        if (digit == 0) {
		        	count++;
		        }
		        number /= 10;
		    }
		}
		return count;
	}
}