package no_8958_OX퀴즈;

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
		int score = 0;
		int answer = 0;
		for (int i=0; i<N; i++) {	
			str = br.readLine();
			for (int j=0; j<str.length(); j++) {	
				if (str.charAt(j) == 'O') {
					score += 1;
				}
				else {
					score = 0;
				}
				answer += score;
			}
			bw.write(answer + "\n");
			score = 0;
			answer = 0;
		}
		bw.flush();
	}
}

