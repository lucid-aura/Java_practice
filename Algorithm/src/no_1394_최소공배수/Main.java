package no_1394_최소공배수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i<T; i++) {
			String numbers[] = br.readLine().split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			BigInteger big_a = BigInteger.valueOf(a);
			BigInteger big_b = BigInteger.valueOf(b);
			int gcd = big_a.gcd(big_b).intValue();
			bw.write(gcd*(int)(a/gcd)*(int)(b/gcd) + "\n");
		}
		bw.flush();
			
	}

}
