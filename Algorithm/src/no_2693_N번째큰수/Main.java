package no_2693_N번째큰수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for (int i=0; i<N; i++) {
			String arr[] = br.readLine().split(" ");
			int int_arr[] = new int[10];
			for (int j=0; j<10; j++) {
				int_arr[j] = Integer.parseInt(arr[j]);
			}
			Arrays.sort(int_arr);
			bw.write(int_arr[7] + "\n");
			bw.flush();
			
			/*
			length = len이라는 int 변수로 들어왔을 때
			int_arr 배열의 가장 마지막 원소는?
			*/
			// int a = int_arr[-3]; --> java에서는 지원을 하지 않는다.
			

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
/*		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		


		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			int int_arr[] = new int[arr.length];
			for (int j = 0; j<arr.length; j++) {
				int_arr[j] = Integer.parseInt(arr[j]);
			}
			Arrays.sort(int_arr);
			bw.write(int_arr[int_arr.length-3] + "\n");
			bw.flush();
		}

	}*/

}
