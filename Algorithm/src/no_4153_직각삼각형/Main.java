package no_4153_직각삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String string_lines = br.readLine();
		int[] lines = new int[3];
		while(true) {
			if (string_lines.equals("0 0 0")) {
				break;
			}
			String []point = string_lines.split(" ");
			for (int i=0; i<3; i++) {
				lines[i] = Integer.parseInt(point[i]);
			}
			if(lines[0]*lines[0] + lines[1]*lines[1] == lines[2]*lines[2]) {
				bw.write("right\n");
			}
			else if (lines[0]*lines[0] + lines[2]*lines[2] == lines[1]*lines[1]) {
				bw.write("right\n");
			}
			else if (lines[1]*lines[1] + lines[2]*lines[2] == lines[0]*lines[0]) {
				bw.write("right\n");
			}
			else {
				bw.write("wrong\n");
			}
			string_lines = br.readLine();
		}
    	bw.flush();
    	
    	
    	
    	
    	
    	
    	
		/*
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String x[] = new String[3];
		String y[] = new String[3];
		String []str = br.readLine().split(" ");
		x[0] = str[0];
		y[0] = str[1];
		
		str = br.readLine().split(" ");
		x[1] = str[0];
		y[1] = str[1];
		
		str = br.readLine().split(" ");
		x[2] = str[0];
		y[2] = str[1];
		
		String answer = "";
		if (x[0].equals(x[1])) {
			answer += x[2];
		}
		else if (x[0].equals(x[2])){
			answer += x[1];
		}
		else {
			answer += x[0];
		}
		
		answer += " ";
		
		if (y[0].equals(y[1])) {
			answer += y[2];
		}
		else if (y[0].equals(y[2])){
			answer += y[1];
		}
		else {
			answer += y[0];
		}
		
		bw.write(answer);
		bw.flush();
		
		
		
		*/
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		/*        ArrayList<String> x = new ArrayList<String>();
		ArrayList<String> y = new ArrayList<String>();
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
				String []str = br.readLine().split(" ");
		x.add(str[0]);
		y.add(str[1]);
		
		str = br.readLine().split(" ");
		x.add(str[0]);
		y.add(str[1]);
		
		str = br.readLine().split(" ");
		x.add(str[0]);
		y.add(str[1]);
		int x_count = Collections.frequency(x, x.get(0));
		int y_count = Collections.frequency(x, x.get(0));
		
		      System.out.println(x_count);*/
    }
}