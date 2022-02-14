package no_2522_별찍기12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String line = "";
		for (int i =0; i<N-1; i++) {
		
				for (int j = 0; j<N-i-1; j++) {
					line += " ";
				}
				
				for (int j = 0; j<i+1; j++) {
					line += "*";
				}
				
				line += "\n";
				bw.write(line);
				bw.flush();
				line = "";
				
			}
		
		
		
				
		for (int i =0; i<N; i++) {
			line += "*";
		}
		line += "\n";
		bw.write(line);
		bw.flush();
		line = "";
		
		for (int i =0; i<N-1; i++) {
			
			for (int j = 0; j<i+1; j++) {
				line += " ";
			}
			
			for (int j = 0; j<N-i-1; j++) {
				line += "*";
			}
			
			line += "\n";
			bw.write(line);
			bw.flush();
			line = "";
		
		}
	}
}
