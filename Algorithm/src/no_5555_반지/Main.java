package no_5555_반지;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String letter = br.readLine();
		int N = Integer.parseInt(br.readLine());
		String[] rings = new String[N];
		int answer = 0;
		for (int i = 0; i<N; i++) {
			rings[i] = br.readLine();
		}
		
		for (int i = 0; i<N; i++) {
			for (int j = 0; j<rings[i].length(); j++) {
				String cmp = "";
				for(int k = 0; k<letter.length(); k++) {
					cmp += rings[i].charAt((j+k)	(rings[i].length()));
				}
				if (letter.equals(cmp)) {
					answer++;
					break;
				}
			}
		}
		bw.write(answer + "");	
		bw.flush();
	}
}