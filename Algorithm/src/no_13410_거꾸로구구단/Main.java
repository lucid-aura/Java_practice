package no_13410_거꾸로구구단;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		
		List<Integer> dan = new ArrayList<Integer>();
		for (int i = 1; i<=K; i++) {
			int num = i*N;
			int reversed = 0;
		    while(num != 0) {
		        
		        // get last digit from num
		        int digit = num % 10;
		        reversed = reversed * 10 + digit;

		        // remove the last digit from num
		        num /= 10;
		      }
			dan.add(reversed);
		}
		bw.write(Collections.max(dan) + "");
		bw.flush();
			
	}

}

