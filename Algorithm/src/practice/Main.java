package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int count = 0;
		String letter = br.readLine(); // ABCD
		int N = Integer.parseInt(br.readLine()); // 3
		for (int i = 0; i < N; i++) {
			String ring = br.readLine(); // ABCDXXXXXX
			ring += ring.substring(0, letter.length()-1); // ABCDXXXXXX + ABC
			for(int j = 0; j < ring.length()-letter.length()+1; j++) {
				//System.out.println(ring.substring(j, j + letter.length()));
				if (letter.equals(ring.substring(j, j + letter.length()))){
					count++;
					break;
				}
			} 
			// ABCDXXABC 9
			//  3    4     6 -> 4
			// ABC ABCD   ABCDXX
			// BCD BCDX   BCDXXA
			// CDX CDXX   CDXXAB
			// DXX DXXA   DXXABC
			// XXA XXAB
			// XAB XABC
			// ABC  --
			//  7    6
		}
		System.out.println(count);

	}
}