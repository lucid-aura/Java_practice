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
		String strN = Integer.toString(N);
		int count = 0;
		String N_str = "";
		
		for (int i = 1; i<=N; i++) {
			N_str += i + "";
			if (N_str.length() > strN.length()*2) {
				N_str = N_str.substring(strN.length());
				count += strN.length();
			}
			
			int index = N_str.indexOf(N+"");
			if (index > -1) {
				bw.write(index+count+1+"");
				break;
			}
		}
		bw.flush();
    }
}