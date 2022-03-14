package no_6603_로또;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		ArrayList<Integer> number;
		ArrayList<ArrayList<Integer>> answer;
		String[] n = br.readLine().split(" ");
		
		while(!n[0].equals("0")) {
			int K = Integer.parseInt(n[0]);
			number = new ArrayList<Integer>();
			for (int i = 1; i < n.length; i++) {
				number.add(Integer.parseInt(n[i]));
			}
			
			answer = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> now_number = new ArrayList<Integer>();
			DFS(answer, number, now_number);
			
			for (ArrayList<Integer> arr : answer) {
				for (Integer i : arr) {
					bw.write(i + " ");
				}
				bw.write("\n");
			}
			bw.write("\n");
			bw.flush();
			
			n = br.readLine().split(" ");
		}
	}

	private static void DFS(ArrayList<ArrayList<Integer>> answer, ArrayList<Integer> number, ArrayList<Integer> now_number) {
		if (now_number.size() == 6) {
			if (!answer.contains(now_number)) {
				answer.add(now_number);
			}
			return;
		}
		
		int idx = 0;
		if (now_number.size() > 0) {
			idx = number.indexOf(Collections.max(now_number));
		}
		
		for (int i = idx; i<number.size(); i++) {
			if (!now_number.contains(number.get(i))) {
				ArrayList<Integer> new_now_number = (ArrayList<Integer>) now_number.clone();
				new_now_number.add(number.get(i));
				DFS(answer, number, new_now_number);
			}
		}
		return;
	}
}
