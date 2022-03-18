package no_10162_전자레인지;

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
		int time = Integer.parseInt(br.readLine());
		
		int[] button = {300, 60, 10};
		int[] pushCount = {0, 0, 0};
		int index = 0;

		
		while(time >= 10) {
			if (time >= button[index]) {
				pushCount[index] += (int)(time / button[index]);
				time -= button[index]*pushCount[index];
			}
			index++;
		}
		
		if (time > 0) {
			bw.write("-1");
		}
		else {
			bw.write(pushCount[0] + " " + pushCount[1] + " " + pushCount[2]);
		}
		
		bw.flush();
	}


}

