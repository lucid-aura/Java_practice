package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;

public class MainClass {

	public static void main(String[] args) {

		NameCard namecard = new NameCard("홍길동", "123-4567", "hgd@naver.com");
		
		namecard.setPrintNameCard(new PrintNameCard());
		namecard.print();
		
		namecard.setPrintNamePhoneCard(new PrintNamePhoneCard());
		namecard.printPhone();
	}

}
