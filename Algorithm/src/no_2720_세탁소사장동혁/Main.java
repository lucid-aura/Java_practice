package no_2720_세탁소사장동혁;

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
		
		int[] coin = {25, 10, 5, 1};

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int cent = Integer.parseInt(br.readLine());
			int[] need = {0, 0, 0, 0};

			int index = 0;
			while(cent != 0) {
				if (cent >= need[index]) {
					need[index] += (int)(cent / coin[index]);
					cent -= coin[index]*need[index];
				}
				index++;
			}
			bw.write(need[0] + " " + need[1] + " " + need[2] + " " + need[3] + "\n");
			bw.flush();
		}

	}


}

