package no_9094_수학적호기심;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i<T; i++) {
			String[] NM = br.readLine().split(" ");
			int count = 0;
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			
			for (int a = 1; a <= N-2; a++) { 
				for (int b = a+1; b <= N-1; b++) {
					if ( (a*a + b*b + M) % (a*b) == 0 ) {
						count++;
					}
				}
			}
			bw.write(count + "\n");
			bw.flush();
		}
		


    }
}