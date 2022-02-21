package no_17173_배수들의합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] token = br.readLine().split(" ");
		int N = Integer.parseInt(token[0]);
		int M = Integer.parseInt(token[1]);
		
		token = br.readLine().split(" ");
		int[] K = new int[M];
		for (int i = 0; i<M; i++) {
			K[i] = Integer.parseInt(token[i]);
		}
		/*
		N = 10 M = 2
		K = [2 3]
		 */
		
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i<K.length; i++) {
			for (int j = 1; j<=(int)N/K[0]; j++) {
				if (!numbers.contains(K[i]*j)) { // 2*(1~5)
					numbers.add(K[i]*j);
				}
			}
		}
		
		int sum = 0;
        for (Integer integer : numbers) {
			sum += integer;
		}
		bw.write(sum + "");
    	bw.flush();
        
        
        
		/*
		HashSet<Integer> numbers = new HashSet<Integer>();
		for (int i = 0; i<K.length; i++) {
			for (int j = 1; j<=(int)N/K[i]; j++) {
				numbers.add(K[i]*j);
			}
		}
		
		int sum = 0;
        for (Integer integer : numbers) {
			sum += integer;
		}
		bw.write(sum + "");
    	bw.flush();
    	*/
    }
}