package main;

import java.util.Scanner;

import dao.AccountDao;

public class MainClass {

	public static void main(String[] args) {
		
		// 메뉴
		Scanner sc = new Scanner(System.in);
		
		AccountDao dao = new AccountDao();
//		dao.fileRead();
		
		// menu
		while(true) {
			System.out.println("1. 가계부 정보 추가");
			System.out.println("2. 가계부 정보 검색");
			System.out.println("3. 가계부 정보 삭제");
			System.out.println("4. 가계부 정보 수정");
			System.out.println("5. 가계부 정보 모두 출력");
			System.out.println("6. 파일로 저장");
			System.out.println("7. 종료");
			
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				dao.create();
				break;
			case 2:
				dao.read();
				break;
			case 3:
				dao.delete();
				break;
			case 4:
				dao.update();
				break;
			case 5:
				dao.alldata();
				break;
			case 6:
				dao.fileWrite();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

}
