package no_4641_Doubles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] token = br.readLine().split(" ");
		List<Integer> doubles = new ArrayList<Integer>();
		int answer = 0;
		for (String string : token) {
			doubles.add(Integer.parseInt(string));
		}
		
        while(doubles.get(0) != -1) {
        	for(int i = 0; i<doubles.size()-1; i++) {
        		for (int j = i+1; j < doubles.size(); j++) {
        			if (doubles.get(i)*2 == doubles.get(j) || doubles.get(i) == doubles.get(j)*2) {
        				answer++;
        			}
        		}
        	}
        	
        	bw.write(answer + "\n");
    		bw.flush();
    		
    		token = br.readLine().split(" ");
        	doubles.clear();
    		for (String string : token) {
    			doubles.add(Integer.parseInt(string));
    		}
        	answer = 0;
        }

    }
}