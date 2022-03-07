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
		ArrayList<Integer> energyList = new ArrayList<>();

        for (int i : energyArray) {
        	energyList.add(i);
        }
        
		int answer = 0;

		answer = calc(answer, 0, energyList);
		
		bw.write(answer+"");
		bw.flush();
    }

    public static int calc(int answer, int beforeSum, ArrayList<Integer>energy) {
    	if (energy.size() == 2) {
    		// 남은 에너지가 2개이면 기존의 더해져서 넘어온 값과 기존의 최대값 중 더 큰 값을 바로 리턴
    		// (i-1*i+1)
    		return Math.max(answer, beforeSum);
    	}
    	for (int i = 1; i<energy.size()-1; i++) { // 양 끝의 에너지는 제외한다. (1~size-1)
    		
    		ArrayList<Integer> newEnergyList = new ArrayList<>(); // 새로운 배열 생성 및 값 복사(뺄 구슬인 i만 제외해서)
    		//newEnergyList = energy; X
    		for (int j = 0; j < energy.size(); j++) { 
    			if (i != j) { // newEnergyList에는 선택한 구슬을 뺀 나머지 구슬만 넣어준다.
    				newEnergyList.add(energy.get(j));
    			}
    		}
    		
    		System.out.println(newEnergyList.toString() + " " + beforeSum + " " + energy.get(i-1)*energy.get(i+1));
    		answer = Math.max(answer,  calc(answer, beforeSum + energy.get(i-1)*energy.get(i+1), newEnergyList)); 
    		// 재귀로 호출할 함수에서는 기존의 최대값, 구슬을 제외시킨 후의 합을 구한 값, 구슬을 뺀 후의 에너지 리스트가 들어간다.	
    	}
    	return answer;
    }
}