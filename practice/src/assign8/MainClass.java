package assign8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String stringIn[] = get3strings(sc);
//		String stringIn[] = {"안녕하세요" ,"nice to meet you", "건강하세요"};
		String stringOut1[] = new String[3];
		
		File file1 = new File("c:\\myfile\\hello.txt");
		
		// String data 3개 쓰기 (hello.txt)
		write3strings(file1, stringIn);
		
		// String data 3개 읽기 (hello.txt)
		read3strings(file1, stringOut1);
		
		String stringOut2[] = new String[3];
		String human[] = {"홍길동", "24", "서울시" };
		File file2 = new File("c:\\myfile\\person.txt");
		
		// 위 String을 파일에 저장 -> println을 한번만 사용해서 저장 (person.txt)
		writeonce(file2, human);
		
		// String data 3개 읽기 (person.txt)
		read3strings(file2, stringOut2);


	}
	// + 함수화	
	static String[] get3strings(Scanner sc) {
		String stringIn[] = new String[3];
		System.out.println("문자열 3개를 입력하세요.");
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1 + "번째 문자열 : ");
			stringIn[i] = sc.next();
		}
		return stringIn;
	}
	
	static void write3strings(File file, String[] strArr) {
		try {
			FileWriter fw;
			BufferedWriter bw;
			PrintWriter pw;
			fw = new FileWriter(file, true);
			bw= new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			for (int i = 0; i < 3; i++) {
				pw.println(strArr[i]);
			}
//			pw.println(stringIn1);
//			pw.println(stringIn2);
//			pw.println(stringIn3);
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return;
	}
	
	static String[] read3strings(File file, String[] stringOut) {
		try {
			BufferedReader br;
			br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < stringOut.length; i++) {
				stringOut[i] = br.readLine();
			}
			br.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		for (int i = 0; i < stringOut.length; i++) {
			System.out.println(stringOut[i]);
		}
		return stringOut;
	}
	
	static void writeonce(File file, String[] strArr) {
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(strArr[0] + "\n" + strArr[1] + "\n" +strArr[2]);
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
