package no_6131_완전제곱수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int A = 1; A<= 500;A++) {
			for (int B = A; B<= 500; B++) {
				if (A*A+N == B*B) {
					count++;
				}
			}
		}
		
		bw.write(count + "");
		bw.flush();
    }
}