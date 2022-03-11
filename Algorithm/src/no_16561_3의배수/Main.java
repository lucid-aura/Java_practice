package no_16561_3의배수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		
		for (int i = 3; i<=n-6; i+=3) {
			for (int j = 3; j<=n-i-3; j+=3) {
				System.out.println(i + " " + j + " " + (n-i-j));
				count++;
			}
		}
		
		if (n == 3 || n == 6) {
			bw.write("0");
		}
		else {
			bw.write(count + "");
		}
		bw.flush();
    }
}