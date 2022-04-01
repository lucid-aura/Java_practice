package no_12904_A와B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String S = br.readLine();
		String T = br.readLine();
		
		while(S.length()<T.length()) {
			char C = T.charAt(T.length()-1);
			if (C == 'A') {
				T = T.substring(0, T.length()-1);
			}
			else {
				StringBuffer sb = new StringBuffer(T);
				T = sb.reverse().toString().substring(1);
			}
		}
		
		if (S.equals(T)) {
			bw.write("1");	
		}
		else {
			bw.write("0");
		}
		bw.flush();
	}


}

