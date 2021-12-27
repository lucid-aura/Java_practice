package no_10818_최소최대;
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
		String N = br.readLine();
		int n = Integer.parseInt(N);
		
		String line = br.readLine();
		String str_number[] = line.split(" ");

		
		int number[] = new int[n];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(str_number[i]);
		}
		
		// for문 이용 min, max 값 정하기
		int max = -1000001;
		int min = 1000001;
		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
			if (number[i] > max) {
				max = number[i];
			}
		}
		bw.write(min + " " + max + "\n");

		// 확인
		/*
		for (int i = 0; i < number.length; i++) {
			bw.write(number[i] + "\n");
		}
		bw.flush();	
		bw.write(min + " " + max + "\n");
		*/
		
		// Arrays 클래스의 sort메서드 이용 배열의 첫값과 끝값을 최소, 최대값으로 정하기
		Arrays.sort(number);

		// 확인
//		for (int i = 0; i < number.length; i++) {
//			bw.write(number[i] + "\n");
//		}
		
		bw.write(Integer.toString(number[0]) + " " + Integer.toString(number[n-1]));
		bw.flush();
		bw.close();
	}
	
	
}
