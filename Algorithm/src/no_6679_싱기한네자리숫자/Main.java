package no_6679_싱기한네자리숫자;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		for (int i = 1000; i<3000; i++) {
			int div10Sum = 0;
			int div12Sum = 0;
			int div16Sum = 0;
			
			int div10 = i;
			int div12 = i;
			int div16 = i;
			
			while((int)(div10/10) > 0) {
				div10Sum += div10%10;
				div10 = (int)div10/10;
			}
			div10Sum += div10 % 10;
			
			while((int)(div12/12) > 0) {
				div12Sum += div12%12;
				div12 = (int)div12/12;
			}
			div12Sum += div12 % 12;
			
			while((int)(div16/16) > 0) {
				div16Sum += div16%16;
				div16 = (int)div16/16;
			}
			div16Sum += div16 % 16;
			
			if (div10Sum == div12Sum && div12Sum == div16Sum) {
				bw.write(i + "\n");
				bw.flush();
			}	
		}
	}
}

