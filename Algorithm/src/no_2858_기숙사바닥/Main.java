package no_2858_기숙사바닥;

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

		String[] RB = br.readLine().split(" ");
		
		int R = Integer.parseInt(RB[0]);
		int B = Integer.parseInt(RB[1]);
		ArrayList<Integer> poss = new ArrayList<Integer>();
		int area = R+B;
		// 크기가 12인 경우 [2,6,3,4] 직사각형의 넓이 : 가로*세로 3*4 4*3
		// 크기 9인 경우 i의 범위 2~3
		// 크기 25인 경우 i의 범위 2~5
		for (int i = 2; i<(int)Math.sqrt(area)+1; i++) {
			if (area % i == 0) {
				poss.add((int)(area/i)); // L 후보
				poss.add((int)(i)); // W 후보
			}
		}
		
		for (int i = 0; i<poss.size(); i+=2) {
			int diff = poss.get(i)*poss.get(i+1)/*사각형의 넓이*/ - (poss.get(i)-2)*(poss.get(i+1)-2)/*속 범위*/;
			if (diff == R) {
				bw.write(poss.get(i) + " " + poss.get(i+1));
				bw.flush();
				break;
			}
		}
	}
}
