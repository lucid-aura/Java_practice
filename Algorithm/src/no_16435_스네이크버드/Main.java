package no_16435_스네이크버드;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String[] NL = br.readLine().split(" ");
		int N = Integer.parseInt(NL[0]);
		int L = Integer.parseInt(NL[1]);
		
		String[] Hs = br.readLine().split(" ");
		
		ArrayList<Integer> h = new ArrayList<Integer>();
		for (int i = 0; i<N; i++) {
			h.add(Integer.parseInt(Hs[i]));
		}
		
		
		Collections.sort(h);
		
		for (Integer l : h) {
			if (l <= L) {
				L++;
			}
			else {
				break;
			}
		}
		bw.write(L + "");
		bw.flush();
	}
}