package assign5;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 변수에 입력된 문자가 숫자로만 되어있는지 아니면 다른 문자인지
		System.out.print("숫자나 문자를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int cNum = c - '0';
		System.out.println((cNum >= 0 && cNum < 10) ? c + "는 숫자입니다." : c + "는 숫자가 아닙니다.");
		
		// 변수에 입력된 문자열이 숫자로만 되어있는지 아니면 다른 문자인지
		System.out.print("숫자나 문자를 입력하세요. : ");
		String str = sc.next();
		boolean isNum = true;
		for (int i = 0; i < str.length(); i++) {
			cNum = str.charAt(i) - '0';
			if (cNum < 0 || cNum >= 10) {
				isNum = false;
				break;
			}
		}
		System.out.println(isNum ? str + "는 숫자입니다." : str + "는 숫자가 아닙니다.");
		
		// 영단어를 입력 -> toUpperCase나 toLowerCase 사용하지 않고 모두 대문자로
		String word = sc.next();
		String new_word = "";
		for (int i = 0; i < word.length(); i++) {
			int cNum2 = word.charAt(i) - 'a';
			if (cNum2 >= 0 && cNum <= 26) {
				new_word += (char)((int)word.charAt(i)-32);
			}
			else {
				new_word += word.charAt(i);
			}
		}
		System.out.println(new_word);
	}

}
