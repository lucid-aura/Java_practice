package no_16198_에너지모으기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int[] energyArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> energyList = new ArrayList<>(energyArray.length);

        for (int i : energyArray) {
        	energyList.add(i);
        }
		
        
		int answer = 0;
//		for (int i = 1; i<energyList.size()-1; i++) {
//			answer = Math.max(answer, calc(answer, 0, energyList));
//		}
		answer = calc(answer, 0, energyList);
		
		bw.write(answer+"");
		bw.flush();
    }

    public static int calc(int answer, int beforeSum, ArrayList<Integer>energy) {
    	if (energy.size() == 2) {
    		return Math.max(answer, beforeSum + energy.get(0)*energy.get(1));
    	}
    	for (int i = 1; i<energy.size()-1; i++) {
    		ArrayList<Integer> newEnergyList = new ArrayList<>(energy.size()-1);
    		for (int j = 0; j < newEnergyList.size(); j++) {
    			if (i != j) {
    				newEnergyList.add(energy.get(j));
    			}
    		}
    		
    		answer = Math.max(answer,  calc(answer, beforeSum + energy.get(i-1)*energy.get(i+1), newEnergyList));
    		System.out.println(answer);
    		
    	}
    	return answer;
    }
}