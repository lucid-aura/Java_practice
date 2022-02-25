package no_17614_369;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long answer = 0;
		for (int i = 1; i<=N; i++) {
			/*
			String s = Integer.toString(i); // 1234 1 2 3 4  (%10, /10)
			
			answer += s.chars().filter(ch -> ch == '3').count();
			answer += s.chars().filter(ch -> ch == '6').count();
			answer += s.chars().filter(ch -> ch == '9').count();
			*/
			int number = i;
			while(number != 0) {
				int digit = number % 10;
				if (digit == 3 || digit == 6 || digit == 9) {
					answer++;
				}
				number /= 10; // number = number/10;  
			}
		}
		bw.write(answer + "");
    	bw.flush();
    }

}