package no_1026_보물;

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
		/*
		int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		*/
		String[] strA = br.readLine().split(" ");
		String[] strB = br.readLine().split(" ");
		
		int answer = 0;
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for (String str : strA) {
			A.add(Integer.parseInt(str));
		}
		
		for (String str : strB) {
			B.add(Integer.parseInt(str));
		}
		
		
		
		while(A.size() > 0) {
			int indexA = A.indexOf(Collections.max(A));
			int indexB = B.indexOf(Collections.min(B));
			
			answer += A.get(indexA)*B.get(indexB);
			A.remove(indexA);
			B.remove(indexB);
		}
		
		bw.write(answer + "");
		bw.flush();
	}


}

