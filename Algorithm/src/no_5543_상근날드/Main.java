package no_5543_상근날드;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int[] ham = new int[3];
		int[] col = new int[2];
		
		ham[0] = Integer.parseInt(br.readLine());
		ham[1] = Integer.parseInt(br.readLine());
		ham[2] = Integer.parseInt(br.readLine());
		col[0] = Integer.parseInt(br.readLine());
		col[1] = Integer.parseInt(br.readLine());
		
		int price = Math.min(ham[0], ham[1]);
		price = Math.min(price, ham[2]);
		
		price += Math.min(col[0], col[1]) - 50;
		bw.write(price+"");
		bw.flush();
	}
}