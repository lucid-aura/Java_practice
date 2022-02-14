package no_1037_약수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] str_num = br.readLine().split(" ");
		int[] int_num = new int[N];
		for (int i = 0; i<N; i++) {
			int_num[i] = Integer.parseInt(str_num[i]);
		}
		Arrays.sort(int_num);
		bw.write(int_num[0]*int_num[N-1] + ""); 
		bw.flush();
	}

}
