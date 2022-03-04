package no_1145_적어도대부분의배수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int min = Arrays.stream(numbers).min().getAsInt();

		while(true) {
			int count = 0;
			for (int i = 0; i<numbers.length; i++) {
				if (min % numbers[i] == 0) {
					count++;
				}
			}
			if (count >= 3) {
				break;
			}
			else {
				min++;
			}
			
		}

		bw.write(min + "");
		bw.flush();
    }

}