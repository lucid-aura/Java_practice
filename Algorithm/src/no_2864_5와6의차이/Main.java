package no_2864_5와6의차이;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String[] token = br.readLine().split(" ");
		int A = Integer.parseInt(token[0]);
		int B = Integer.parseInt(token[1]);
		
		int[] minMaxA = count(A);
		int[] minMaxB = count(B);
		bw.write(minMaxA[0] + minMaxB[0] + " ");
		bw.write(minMaxA[1] + minMaxB[1] + "");
    	bw.flush();   
  
    }
    
	public static int[] count(int number) {
		int[] minMax = new int[2]; // 0 : min, 1 : max 값
		int divCount = 1; // 10 100 1000 ["1", "2", "3", "4"] length = 4
		// 								 [1000, 100, 10, 1]
		// 1234 -> 1 2 3 4 
		//(1234%10) = 4(digit),   (1234/10) = 123 --> 
		//(123%10) = 3(3*10), (123/10) = 12 -->
		//(12%10) = 2(2*100), (12/10) = 1 -->
		//(1%10) = 1(1*1000), (1/10) = 0(number)
	    while(number != 0) {
	        int digit = number % 10; //4, 3, 2, 1
	        if (digit == 5) {
	        	minMax[0] += 5*divCount; // digit : 자릿수와 관련없이 한 숫자만 보기 위한 변수.
	        	minMax[1] += 6*divCount; // div : 자릿수를 나타내주기 위한 변수.
	        }
	        else if (digit == 6) {
	        	minMax[0] += 5*divCount;
	        	minMax[1] += 6*divCount;
	        }
	        else {
	        	minMax[0] += digit*divCount; //4*1, 3*10, 2*100, 1*1000
	        	minMax[1] += digit*divCount; //4*1, 3*10, 2*100, 1*1000
	        }
	        number /= 10; // number(1234 -> 123), (123 -> 12), (12 -> 1) (1 -> 0)
	        divCount *= 10; // divCount(1 -> 10), (10 -> 100), (100 -> 1000) (1000 -> 10000)
	    }
		return minMax;
	}
	
	int add(int a){
		return a+1;
	}
}