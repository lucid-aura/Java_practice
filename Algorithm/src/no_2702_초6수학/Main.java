package no_2702_초6수학;

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
		for (int i = 0; i<N; i++) {
			String[] AB = br.readLine().split(" ");
			int A = Integer.parseInt(AB[0]);
			int B = Integer.parseInt(AB[1]);
			int min = Math.min(A, B);
			int max = Math.max(A, B);
			int gcd = min;
			int lcm = max;
			
			for (int j = gcd; j>0; j--) { // 최대공약수
				if (A%j == 0 && B%j == 0) {
					gcd = j;
					break;
				}
			}
			// A*B <= 최소공배수 (서로의 공약수가 없을 경우에 이렇게 된다.)
			for (int j = max; j <= A*B; j++) {
				if (j%A == 0 && j%B == 0) {
					lcm = j;
					break;
				}
			}
			bw.write(lcm + " " + gcd + "\n");
			bw.flush();
		}
				

    }
}