package no_2386_도비의영어공부;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String input = "";
		while(!input.equals("#")) {
			input = br.readLine();
			if (input.equals("#")) {
				break;
			}
			String token = input.substring(0, 1);
			String letter = input.substring(2);
			int count = 0;
			for (int i = 0; i < letter.length(); i++) {
				if (letter.charAt(i) == token.toUpperCase().charAt(0) || letter.charAt(i) == token.toLowerCase().charAt(0)) {
					count++;
				}
			}
			bw.write(token + " " + count + "\n");
			bw.flush();
		}
    }
}