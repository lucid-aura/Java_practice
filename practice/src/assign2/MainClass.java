package assign2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 *	편의점
		 * 지불 금액 :	3,210원
		 * 본인 금액 :	10,000원
		 * 거스름돈 -> ?
		 * 5000원 -> ?장
		 * 1000원 -> ?장
		 *  500원 -> ?개
		 *  100원 -> ?개
		 *  50원 -> ?개
		 *  10원 -> ?개
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가격을 입력하세요 : ");
		int price = scan.nextInt();
		System.out.print("가진돈을 입력하세요 : ");
		int money = scan.nextInt();
//		int price = 3210;
//		int money = 10000;
		int pay_back = money - price;
		
		int []count = { 0, 0, 0, 0, 0, 0 };
		
		System.out.println("거스름돈 : " + pay_back + "원");
		
		int count_5000 = pay_back/5000;
		pay_back -= 5000*count_5000;
		System.out.println("5000원 : " +count_5000 + "장");
		
		int count_1000 = pay_back/1000;
		pay_back -= 1000*count_1000;
		System.out.println("1000원 : " +count_1000 + "장");
		
		int count_500 = pay_back/500;
		pay_back -= 500*count_500;
		System.out.println("500원 : " +count_500 + "개");
		
		int count_100 = pay_back/100;
		pay_back -= 100*count_100;
		System.out.println("100원 : " +count_100 + "개");
		
		int count_50 = pay_back/50;
		pay_back -= 50*count_50;
		System.out.println("50원 : " +count_50 + "개");
		
		int count_10 = pay_back/10;
		pay_back -= 10*count_10;
		System.out.println("10원 : " +count_10 + "개");
	}

}
