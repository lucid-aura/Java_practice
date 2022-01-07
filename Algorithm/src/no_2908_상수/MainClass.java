package no_2908_상수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String str = br.readLine();
		String[] split = new String[2];
		split = str.split(" ");
		/*
		int a = Integer.parseInt(split[0]);
		int new_a = (int)a/100 +  (a- ((int)(a/100))*100 -(a%10)) + (a%10)*100;

		int b = Integer.parseInt(split[1]);
		int new_b = (int)b/100 + (b- ((int)(b/100))*100 - (b%10)) + (b%10)*100;
		
		if (new_a > new_b) {
			bw.write(Integer.toString(new_a));
		}
		else {
			bw.write(Integer.toString(new_b));
		}
		*/

		/*		new_a = new_a + split[0].charAt(0);
				new_a = split[0].charAt(1) + new_a;
				new_a = split[0].charAt(2) + new_a;
				
				new_b = new_b + split[1].charAt(0);
				new_b = split[1].charAt(1) + new_b;
				new_b = split[1].charAt(2) + new_b;*/
		
		StringBuffer sb = new StringBuffer(split[0]); 
		String new_a = sb.reverse().toString();
		
		sb = new StringBuffer(split[1]); 
		String new_b = sb.reverse().toString();		
		
		if (Integer.parseInt(new_a) > Integer.parseInt(new_b))
			bw.write(new_a);
		else {
			bw.write(new_b);
		}
		bw.flush();
		
	}

}
