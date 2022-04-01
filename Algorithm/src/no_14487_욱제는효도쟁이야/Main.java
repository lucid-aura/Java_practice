package no_14487_욱제는효도쟁이야;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		String[] Vs = br.readLine().split(" ");
		
		ArrayList<Integer> v = new ArrayList<Integer>();
		for (int i = 0; i<N; i++) {
			v.add(Integer.parseInt(Vs[i]));
		}
		
		int sum = v.stream().mapToInt(Integer::intValue).sum();
		
		int min_sum = sum;
		for (int i = 0; i<N; i++) {
			if (min_sum > sum - v.get(i)) {
				min_sum = sum - v.get(i);
			}

		}
		bw.write(min_sum + "");
		bw.flush();
	}
}