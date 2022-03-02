package no_19532_수학은비대면강의입니다;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] ABCDEF = br.readLine().split(" ");
		int A = Integer.parseInt(ABCDEF[0]);
		int B = Integer.parseInt(ABCDEF[1]);
		int C = Integer.parseInt(ABCDEF[2]);
		int D = Integer.parseInt(ABCDEF[3]);
		int E = Integer.parseInt(ABCDEF[4]);
		int F = Integer.parseInt(ABCDEF[5]);
		
		for (int x = -999; x <= 999; x++) {
			for (int y = -999; y <= 999; y++) {
				if (A*x + B*y == C && D*x + E*y == F) {
					bw.write(x + " " + y);
					bw.flush();
				}
			}
		}

    }
}