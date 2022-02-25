package no_1526_가장큰금민수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		int answer = 0;
		for (int i = Integer.parseInt(N); i>=4; i--) {
			String str = Integer.toString(i);
			
			boolean sw = false;
			for (int j = 0; j<10; j++) {
				if (j != 4 && j != 7) {
					if (str.contains(Integer.toString(j))){
						sw = true;
						break;
					}
				}
			}
			if (!sw) {
				answer = i;
				break;
			}
		}

		bw.write(answer + "");
    	bw.flush();   
  
    }

}