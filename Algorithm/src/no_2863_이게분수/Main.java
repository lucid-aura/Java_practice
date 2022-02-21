package no_2863_이게분수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] token = br.readLine().split(" ");
		int A = Integer.parseInt(token[0]);
		int B = Integer.parseInt(token[1]);
		token = br.readLine().split(" ");
		int C = Integer.parseInt(token[0]);
		int D = Integer.parseInt(token[1]);
		
		List<Float> rotation = new ArrayList<Float>();
		float rot0 = (float)A/C + (float)B/D; // 몫 : /, 나머지 : %
		float rot1 = (float)C/D + (float)A/B;
		float rot2 = (float)D/B + (float)C/A;
		float rot3 = (float)B/A + (float)D/C;
		rotation.add(rot0);
		rotation.add(rot1);
		rotation.add(rot2);
		rotation.add(rot3);
		
		int answer = rotation.indexOf(Collections.max(rotation));
		bw.write(answer + "");
    	bw.flush();
        
    }
}