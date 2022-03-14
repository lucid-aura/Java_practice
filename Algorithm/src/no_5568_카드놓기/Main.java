package no_5568_카드놓기;

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

		ArrayList<Integer> number = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();;
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			number.add(Integer.parseInt(br.readLine()));	
		}
		
		
		//DFS(answer, number, number, K);

		bw.write(answer.size() + "");
		bw.flush();
	}
	
	private static void DFS(ArrayList<Integer> answer, ArrayList<Integer> number, ArrayList<Integer> now_number, int k) {
		if (now_number.size() == k) {
			String temp = "";
			for (Integer integer : now_number) {
				temp += integer;
			}
			if (!answer.contains(Integer.parseInt(temp))) {
				answer.add(Integer.parseInt(temp));
			}
			return;
		}
		
		for(int i = 0; i < number.size(); i++) {
			DFS(answer, number, number, k+1);
		}
		return ;
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
