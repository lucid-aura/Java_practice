package no_23301_스터디시간정하기2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] NT = br.readLine().split(" ");
		int N = Integer.parseInt(NT[0]);
		int T = Integer.parseInt(NT[1]);
		
		
			bw.write(token + " " + count + "\n");
			bw.flush();

    }
}