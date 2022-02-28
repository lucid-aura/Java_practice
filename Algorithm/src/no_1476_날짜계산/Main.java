package no_1476_날짜계산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] ESM = br.readLine().split(" ");
		int E = Integer.parseInt(ESM[0]);
		if(E == 15) {E = 0;} 
		int S = Integer.parseInt(ESM[1]);
		if (S == 28) {S = 0;}
		int M = Integer.parseInt(ESM[2]);
		if (M == 19) {M = 0;}
		
		int year = S;
		while(true) {
			if (year%15 == E && year%19 == M && year > 0) {
				bw.write(year + "");
				bw.flush();
				break;
			}
			year += 28;
		}

    }
}