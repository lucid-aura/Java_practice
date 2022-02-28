package no_14912_숫자빈도수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] ND = br.readLine().split(" ");
		int N = Integer.parseInt(ND[0]);
		char digit = ND[1].charAt(0);
		int count = 0;
		for (int i = 1; i<=N; i++) {
			String number = Integer.toString(i);
			for (int j = 0; j < number.length(); j++) {
				if (number.charAt(j) == digit) {
					count++;
				}
			}
		}
		bw.write(count + "");
		bw.flush();	

    }
}