package no_2576_홀수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		int[] numbers = new int[7];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		int min = 100;
		for (int i = 0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				sum += numbers[i];
				if (min > numbers[i]) {
					min = numbers[i];
				}
			}
		}
		if (sum == 0) {
			bw.write("-1");
		}
		else {
			bw.write(sum+"\n");
			bw.write(min+"");
		}
		bw.flush();
	}
}
