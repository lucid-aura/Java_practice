package no_10947_모든순열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int  N = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> dfs = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i<N; i++) {
			ArrayList<Integer> sub = new ArrayList<Integer>();
			sub.add(i+1);
			dfs.add(sub);
		}
		
		for (int i = 0; i<N; i++) {
			DFS(dfs.get(i), N);
		}	
		
		for (int i = 0; i<N; i++) {
			System.out.println(dfs.get(i));
		}
    }
    
    public static void DFS(List<Integer> dfs, int N) {
    	if (dfs.size() == N) return;
    	for (int i = 1; i<=N; i++) {
    		if (!dfs.contains(i)) {
    			dfs.add(i);
    		}
    	}
		return;
    	
    }
}