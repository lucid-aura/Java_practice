package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions2 {

	public static void main(String[] args) {
		// NullPointerException : 동적 할당이 안된 경우
		String str = null;
		try {
			System.out.println(str.length());
		}catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println("str은 할당되지 않았습니다.");
		}
		
		// ArrayIndexOutOfBoundsException : 배열범위가 초과한 경우
		int array[] = {1, 2, 3};
		
		try {
			array[2] = 'a';
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// FileNotFoundException : 파일이 없는 경우
		File file = new File("D:\\xxx");
		FileInputStream is;
		
		try {
			is = new FileInputStream(file);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// StringIndexOutOfBoundsException
		String str1 = "java";
		
		try {
			str1.charAt(4);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// NumberFormatException : 숫자가 아닌 경우
		try {
			int number = Integer.parseInt("123a");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
