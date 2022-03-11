package no_2154_수이어쓰기3;

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
		
		String N_str = "";
		
		for (int i = 1; i<=N; i++) {
			N_str = N_str.substring(N_str.length()+1 - (N+"").length()) + i + "";
			int index = N_str.indexOf(N+"");
			if (index > -1) {
				bw.write(index+1+"");
				break;
			}
		}
		bw.flush();
    }
}