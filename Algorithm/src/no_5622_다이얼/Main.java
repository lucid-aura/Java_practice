package no_5622_다이얼;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String str = br.readLine();
		/*		int answer=0;
				for (int i = 0; i<str.length(); i++) {
					if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C') {
						answer += 3;
					}
					else if (str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F'){
						answer += 4;
					}
					else if (str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I'){
						answer += 5;
					}
					else if (str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L'){
						answer += 6;
					}
					else if (str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O'){
						answer += 7;
					}
					else if (str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S'){
						answer += 8;
					}
					else if ( str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V'){
						answer += 9;
					}
					else if (str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z'){
						answer += 10;
					}
				}
				System.out.println(answer);
				*/
		
				int answer = 0;
				String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
				//                              2           3           4           5          6               7            8             9
				for (int i=0; i<str.length(); i++) {	// 입력받은 String의 길이
					for (int j=0; j<dial.length; j++) { // dial 배열의 길이(8)
						if (dial[j].contains(str.charAt(i) + "")) {
							// contains는 String에 어떤 String이 포함되어있는지 확인하는 함수
							// character + "" 하면 Char 형에서 String형으로 변환이 된다.
							answer += j+3;
							// 글자가 포함되어있는 dial배열의 index값(j)를 활용하여 바로 시간을 추가한다. 
							// -> index + 2가 곧 시간  
							break;
							// 맞는 위치(시간)을 찾았으면 바로 다음 문자로 넘어가기 위해 break
						}
						
					}
				}
				bw.write(answer+"");
				bw.flush();
	}
}

