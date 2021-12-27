package no_1712_손익분기점;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		String line = br.readLine();
		String str_number[] = line.split(" ");
		// A : 고정 비용, B : 가변 비용, C : 제품 가격
		// 대수 n
		//		B*n C*n -> (C-B)*n
		//		1000 / 100 = 10일이 되었을때 이익x 본전(딱 0) + 1
		//		(1-2)*n
		int A = Integer.parseInt(str_number[0]);
		int B = Integer.parseInt(str_number[1]);
		int C = Integer.parseInt(str_number[2]);
		if (B >= C) {
			bw.write("-1");
		}
		else {
			int answer = (int) (Math.floor(A/(C-B))+1);
			bw.write(Integer.toString(answer));
		}

		bw.flush();
		bw.close();
	}

}
