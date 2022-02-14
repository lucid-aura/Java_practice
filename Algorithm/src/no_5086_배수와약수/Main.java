package no_5086_배수와약수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] str_num = br.readLine().split(" ");
		int a = Integer.parseInt(str_num[0]);
		int b = Integer.parseInt(str_num[1]);
		while (a != 0 && b != 0) {

		    if (b % a == 0) bw.write("factor\n");
		    else if (a % b == 0) bw.write("multiple\n");
		    else bw.write("neither\n");
		    
		    str_num = br.readLine().split(" ");
			a = Integer.parseInt(str_num[0]);
			b = Integer.parseInt(str_num[1]);
		}
		bw.flush();
	}

}
