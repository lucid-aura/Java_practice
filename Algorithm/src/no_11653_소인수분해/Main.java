package no_11653_소인수분해;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		int div = 2;
		// N     72 36 18 9        3
		// div  2   2    2  2->3  3
		// ret  2   2   2  3         3
		if (N != 1) {
			while(div < N) {
				if (N % div == 0) {
					N = (int)(N/div);
					bw.write(div + "\n");
				}
				else {
					div = div + 1;
				}
			}
			bw.write(N + "\n");
		
		}
		bw.flush();
	}
}

