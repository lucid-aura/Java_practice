package no_2839_설탕배달;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		int i = 0;
		int result = -1;
		// 18kg -> 5kg 3 + 3kg 1 , 5kg 0 + 3kg 6
		for (i = (int)N/5; i>=0; i--) {
			if ((N - i*5) % 3 == 0){
				result = i + (int)((N - i*5) / 3);
				break;
			}
		}
		if (result == -1) {
			bw.write("-1");
		}
		else {
			bw.write(result + "");
		}
		bw.flush();
	}

}
