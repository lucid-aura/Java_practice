package no_9237_이장님초대;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] tree = br.readLine().split(" ");
		ArrayList<Integer> days = new ArrayList<Integer>();
		for (int i = 0; i<N; i++) {
			days.add(Integer.parseInt(tree[i]));
		}
		
		Collections.sort(days, Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			days.set(i, days.get(i) + i + 1);
		}

		bw.write(Collections.max(days) + 1 + "");
		bw.flush();
	}
}


