package no_2231_분해합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		boolean sw = true; // 생성자를 못했을 시 0을 출력해주기 위한 스위치
		for (int i = 1; i < N; i++) {
			String intToStr = i+""; // int i를 편하게 쪼개기 위해 String으로 변환  52 -> "52" length = 2
			int[] token = new int[intToStr.length()]; // i의 크기를 가지는 배열 선언 token[0] = 5, token[1] = 2
			for (int j = 0 ; j<intToStr.length(); j++) { // 각 자리수를 더해주기 위해 char로 쪼개고 int로 변환 후 더해줌
				token[j] = Integer.parseInt(intToStr.charAt(j)+""); 
				// "" 를 붙이는 이유는 char를 string으로 변환하여 Integer.parseInt를 바로 써주기 위함
			}
			if (Arrays.stream(token).sum() + i == N) { // java 에서 제공하는 sum() 함수 (배열 원소의 전체 합을 구함)
				bw.write(i+""); // ""를 넣는 이유는 int를 String으로 변환하여 buffered 출력
				sw = false; // 생성자를 발견했으므로 for문을 종료 (이후 생성자는 없거나 최소가 아님)
				break;
			}
			int sum = 0;
			for (int j = 0; j < token.length; j++) {
				sum += token[j];
			}
		}
		if (sw) {
			bw.write("0");
		}	
		bw.flush();
		bw.close();
	}
}
