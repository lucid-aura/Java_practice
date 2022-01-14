package no_3009_네번째점;

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
		
		String []point = br.readLine().split(" ");
    	String x = point[0];
    	String y = point[1];
    	
    	String []x_points = new String[3];
    	String []y_points = new String[3];
    	x_points[0] = x;
    	y_points[0] = y;
    	
    	point = br.readLine().split(" ");
    	x_points[1] = point[0];
    	y_points[1] = point[1];
    	
    	point = br.readLine().split(" ");
    	x_points[2] = point[0];
    	y_points[2] = point[1];
    	
    	String answer = "";
    	if (x_points[0].equals(x_points[1]) == true) {
    		answer += x_points[2];
    	}
    	else if (x_points[0].equals(x_points[2]) == true){
    		answer += x_points[1];
    	}
    	else {
    		answer += x_points[0];
    	}

    	answer += " ";
    	
    	if (y_points[0].equals(y_points[1]) == true) {
    		answer += y_points[2];
    	}
    	else if (y_points[0].equals(y_points[2]) == true){
    		answer += y_points[1];
    	}
    	else {
    		answer += y_points[0];
    	}  	
    	
    	bw.write(answer);
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