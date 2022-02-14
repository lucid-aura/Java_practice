package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TokenizerTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				bw.write(st.nextToken() + " ");
			}
			bw.write("\n");
			bw.flush();
		}
	

	}

}
