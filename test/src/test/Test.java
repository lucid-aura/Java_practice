package test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int self_number[] = new int[100];
		for (int i = 1; i < self_number.length; i++) {
			int d_i = d(i);
			if (d_i < 100) {
				self_number[d_i] += 1;	
			}
		}
		for (int i = 1; i < self_number.length; i++) {
			if (self_number[i]  < 1) {
				bw.write(Integer.toString(i) + "\n");
                bw.flush();
			}
		}
        bw.close();
	}
	public static int d(int n) {
		String str = Integer.toString(n);
		for (int i = 0; i < str.length(); i++) {
			n += str.charAt(i)-'0';
		}
		return n;
	}
}
