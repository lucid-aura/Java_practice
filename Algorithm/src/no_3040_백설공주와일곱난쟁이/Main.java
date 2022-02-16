package no_3040_백설공주와일곱난쟁이;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		List<Integer> numbers = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i<9; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
			sum += numbers.get(i);
		}
		
		int exceptIndex1 = -1;
		int exceptIndex2 = -1;
		for (int i = 0; i<8; i++) {
			for (int j = i+1; j<9; j++) {
				
				if (sum - numbers.get(i) - numbers.get(j) == 100) {
					exceptIndex1 = i;
					exceptIndex2 = j;
					break;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			if (i != exceptIndex1 && i != exceptIndex2) {
				bw.write(numbers.get(i) + "\n");
			}
		}
    	bw.flush();
    }
}