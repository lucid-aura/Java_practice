package no_5585_거스름돈;

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
		int money = 1000 - Integer.parseInt(br.readLine());
		
		int[] coin = {500, 100, 50, 10, 5, 1};
		int index = 0;
		int count = 0;
		
		while(money != 0) {
			if (money >= coin[index]) {
				count += (int)(money / coin[index]);
				money %= coin[index];
			}
			index++;
		}
		bw.write(count + "");
		bw.flush();
	}


}

