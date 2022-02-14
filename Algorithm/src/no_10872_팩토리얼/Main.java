package no_10872_팩토리얼;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	/*
	N - 0 가장 먼저 생각해보자!
	N - 1
	N - 2
	....
	규칙이 생긴다.
	규칙을 찾아서 구현하는 것이 대부분 알고리즘의 풀이이다.

	N , func(N-1)
	0! - 1 -> 예외이기 때문에 if문으로 처리해줘야 합니다.
	-------
	1! - 1 -> 같은 알고리즘으로 처리할 수 있습니다.
	2! - 2
	3! - 6 = 3*func(2)
	4! - 24 = 4*func(3)

	func(N) { return N! } -> 결과값을 출력하는 함수를 만들자 return N!
	원하는 알고리즘으로 해당 함수를 구현하시면 됩니다.
	-> 재귀적인 방법으로 해결해보자

	func(0) { return 1 }
	func(1) { return 1 }
	func(2) { return 2*func(1) }
	func(3) { return 3*func(2) }
	func(4) { return 4*func(3) }
	.......
	func(N) { return N*func(N-1) }


	슈도 코드 (의사 코드)
	func(N) { 
		return N*func(N-1);
	}
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		bw.write(func(N) + "");
		bw.flush();
	}

	// N = 2

	public static int func(int N) {
		if(N == 0) {
			return 1;
		}
		return N*func(N-1);
	}
	
	
}
