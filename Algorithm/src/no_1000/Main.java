package no_1000;
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
		String[] split = new String[2];
		split = str.split(" ");
		String str3 = split[0] + split[1];
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int answer = a+b;
		bw.write(Integer.toString(answer));

		bw.flush();
		bw.close();
		br.close();
	}
}
