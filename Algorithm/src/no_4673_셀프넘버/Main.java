package no_4673_셀프넘버;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int self_number[] = new int[50];
		for (int i = 1; i < self_number.length; i++) {
			int d_i = func(i);
			if (d_i < 50) {
				self_number[d_i] += 1;	
			}
		}
		for (int i = 1; i < self_number.length; i++) {
			bw.write(i + " ");
            bw.flush();
		}
		bw.write("\n");
        bw.flush();
		for (int i = 1; i < self_number.length; i++) {
			bw.write(self_number[i] + " ");
            bw.flush();
		}
//		for (int i = 1; i < self_number.length; i++) {
//			if (self_number[i]  < 1) {
//				bw.write(Integer.toString(i) + "\n");
//                bw.flush();
//			}
//		}
        bw.close();

        
        
	}
	

	public static int func(int n) {
		int ret = 0;
		
		String str = Integer.toString(n);
		for (int i = 0; i < str.length(); i++) {
			ret += str.charAt(i)-'0';
			
		}
		return ret + n;
	}
}